package ec.com.eeasa.dp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class EnviarMail implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- CONFIGURACIÓN DEL SERVICIO CENTRALIZADO DE CORREOS EEASA ---
    private static final String ENDPOINT_URL = "https://app.eeasa.com.ec/ws_correo/eeasa/mail/send";
    private static final String API_KEY_SYS = "5ab48f9b-eb66-4e1f-b0c1-4913a021d649";
    private static final String API_KEY_TEMP = "9920c212-ce55-4b08-8b93-09e89e382309";
    private static final String SISTEMA_EMISOR = "Reportes GIS";
    private static final String DEPARTAMENTO = "Departamento de Planificación";

    public EnviarMail() {
    }

    public String enviarMailConAdjunto(String destinatario, String asunto, String mensajeHtml, byte[] contenidoAdjunto, String nombreArchivo) {
        return enviarNotificacion(destinatario, null, asunto, SISTEMA_EMISOR, mensajeHtml, contenidoAdjunto, nombreArchivo);
    }

    public String enviarSimpleMail(String inCorreoRecibe, String inAsunto, String inMensaje) {
        return enviarMailConAdjunto(inCorreoRecibe, inAsunto, inMensaje, null, "");
    }

    public String enviarNotificacion(String destinatario, String cc, String asunto, String usuarioNombre, String cuerpo, byte[] contenidoAdjunto, String nombreArchivo) {
        String boundary = "===Boundary_" + System.currentTimeMillis() + "===";
        String LINE_FEED = "\r\n";

        try {
            // Configurar Bypass SSL y Hostname Verification para WebLogic y Java global
            setupSSLAndHostnameVerification();

            URL url = new URL(ENDPOINT_URL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            httpConn.setUseCaches(false);
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setRequestMethod("POST");
            httpConn.setConnectTimeout(15000);
            httpConn.setReadTimeout(15000);

            // Intentar aplicar HostnameVerifier en la conexión de WebLogic via reflexión
            applyWebLogicHostnameVerifier(httpConn);

            // Cabeceras exigidas por la API REST
            httpConn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            httpConn.setRequestProperty("apiKey_sys", API_KEY_SYS);
            httpConn.setRequestProperty("apiKey_temp", API_KEY_TEMP);
            httpConn.setRequestProperty("destinatario", sanitizeHeader(destinatario));
            if (cc != null && !cc.trim().isEmpty()) {
                httpConn.setRequestProperty("cc", sanitizeHeader(cc));
            }
            httpConn.setRequestProperty("usuarioNombre", sanitizeHeader(usuarioNombre != null ? usuarioNombre : SISTEMA_EMISOR));
            httpConn.setRequestProperty("asunto", sanitizeHeader(asunto));

            OutputStream outputStream = httpConn.getOutputStream();
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Construcción del objeto JSON de parámetros para la plantilla HTML
            String jsonParametros = construirJsonParametros(asunto, cuerpo);

            // Parte 1: Parámetros (JSON)
            writer.append("--").append(boundary).append(LINE_FEED);
            writer.append("Content-Disposition: form-data; name=\"parametros\"").append(LINE_FEED);
            writer.append("Content-Type: text/plain; charset=UTF-8").append(LINE_FEED);
            writer.append(LINE_FEED);
            writer.append(jsonParametros).append(LINE_FEED);
            writer.flush();

            // Parte 2: Adjunto (Binary) - Opcional
            if (contenidoAdjunto != null && contenidoAdjunto.length > 0 && nombreArchivo != null && !nombreArchivo.trim().isEmpty()) {
                writer.append("--").append(boundary).append(LINE_FEED);
                writer.append("Content-Disposition: form-data; name=\"adjuntos\"; filename=\"").append(nombreArchivo).append("\"").append(LINE_FEED);
                writer.append("Content-Type: application/octet-stream").append(LINE_FEED);
                writer.append("Content-Transfer-Encoding: binary").append(LINE_FEED);
                writer.append(LINE_FEED);
                writer.flush();

                outputStream.write(contenidoAdjunto);
                outputStream.flush();

                writer.append(LINE_FEED);
                writer.flush();
            }

            writer.append("--").append(boundary).append("--").append(LINE_FEED);
            writer.close();

            int status = httpConn.getResponseCode();
            InputStream is = (status >= 200 && status < 300) ? httpConn.getInputStream() : httpConn.getErrorStream();
            String respuesta = leerStream(is);

            if (status == 200 || status == 201) {
                return "true";
            } else {
                System.err.println("Error al enviar correo. HTTP Status: " + status + " Respuesta: " + respuesta);
                return "Error (" + status + "): " + respuesta;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    private String construirJsonParametros(String asunto, String cuerpo) {
        String asuntoEscapado = escapeJson(cuerpoSinHtml(asunto));
        String cuerpoEscapado = escapeJson(cuerpo);

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"ASUNTO\":\"").append(asuntoEscapado).append("\",");
        sb.append("\"CUERPO\":\"").append(cuerpoEscapado).append("\",");
        sb.append("\"SISTEMA_EMISOR\":\"").append(escapeJson(SISTEMA_EMISOR)).append("\",");
        sb.append("\"DEPARTAMENTO\":\"").append(escapeJson(DEPARTAMENTO)).append("\",");
        sb.append("\"FALLBACK_CUERPO\":\"").append(cuerpoEscapado).append("\"");
        sb.append("}");
        return sb.toString();
    }

    private String cuerpoSinHtml(String html) {
        if (html == null) return "";
        return html.replaceAll("<[^>]*>", "").trim();
    }

    private String escapeJson(String texto) {
        if (texto == null) return "";
        return texto.replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\b", "\\b")
                    .replace("\f", "\\f")
                    .replace("\n", "\\n")
                    .replace("\r", "\\r")
                    .replace("\t", "\\t");
    }

    private String sanitizeHeader(String headerValue) {
        if (headerValue == null) return "";
        return headerValue.replaceAll("[\r\n]", " ").trim();
    }

    private String leerStream(InputStream stream) throws IOException {
        if (stream == null) return "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        reader.close();
        return builder.toString();
    }

    private void setupSSLAndHostnameVerification() {
        try {
            // Propiedad de WebLogic para ignorar verificación estricta de Hostname en certificados wildcard (*.eeasa.com.ec)
            System.setProperty("weblogic.security.SSL.ignoreHostnameVerification", "true");

            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };
            SSLContext sc = SSLContext.getInstance("TLSv1.2");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            SSLContext.setDefault(sc);
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            HostnameVerifier trustAllHostnames = (hostname, session) -> true;
            HttpsURLConnection.setDefaultHostnameVerifier(trustAllHostnames);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void applyWebLogicHostnameVerifier(HttpURLConnection conn) {
        try {
            // Asignar el verificador en la conexión de WebLogic via reflexión
            java.lang.reflect.Method[] methods = conn.getClass().getMethods();
            for (java.lang.reflect.Method method : methods) {
                if (method.getName().equals("setHostnameVerifier")) {
                    Class<?>[] paramTypes = method.getParameterTypes();
                    if (paramTypes.length == 1) {
                        try {
                            Object verifierProxy = java.lang.reflect.Proxy.newProxyInstance(
                                conn.getClass().getClassLoader(),
                                new Class<?>[]{ paramTypes[0] },
                                (proxy, m, args) -> true
                            );
                            method.invoke(conn, verifierProxy);
                            break;
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            // Si no se encuentra el método o no es WebLogic, continúa
        }
    }
}
