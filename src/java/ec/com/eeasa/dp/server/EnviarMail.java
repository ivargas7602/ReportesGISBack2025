package ec.com.eeasa.dp.server;

import java.io.Serializable;
import java.util.Properties;
import java.net.URL;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.util.ByteArrayDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class EnviarMail implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- CREDENCIALES ---
    private final String usuario = "sisde@eeasa.com.ec";
    private final String password = "UPDDis2024#";
    private final String host = "smtp.office365.com"; // Servidor
    private final String puerto = "587";             // Puerto

    public EnviarMail() {
    }

    public String enviarMailConAdjunto(String destinatario, String asunto, String mensajeHtml, byte[] contenidoAdjunto, String nombreArchivo) {
        String respuesta = "false";

        try {
            // 1. Configuración de Propiedades para Microsoft
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", puerto);
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");
            props.put("mail.smtp.ssl.trust", "*"); // Se agrego para tenga permisos de envio SSL

            // 2. Sesión con Autenticación Obligatoria
            Session sesion = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, password);
                }
            });

            MimeMessage mensaje = new MimeMessage(sesion);
            mensaje.setFrom(new InternetAddress(usuario)); // El remitente debe ser el mismo usuario autenticado
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mensaje.setSubject(asunto);

            Multipart contenidoMultitipo = new MimeMultipart("related");

            // --- Parte HTML ---
            BodyPart cuerpoTexto = new MimeBodyPart();
            cuerpoTexto.setContent(mensajeHtml, "text/html; charset=utf-8");
            contenidoMultitipo.addBodyPart(cuerpoTexto);

            // --- Parte Logo ---
            try {
                URL logoUrl = getClass().getResource("/ec/com/eeasa/dp/resources/LogoEEASA.jpeg");
                if (logoUrl != null) {
                    MimeBodyPart imagenPart = new MimeBodyPart();
                    imagenPart.setDataHandler(new DataHandler(new FileDataSource(logoUrl.getPath())));
                    imagenPart.setHeader("Content-ID", "<logo_eeasa>");
                    imagenPart.setDisposition(MimeBodyPart.INLINE);
                    contenidoMultitipo.addBodyPart(imagenPart);
                }
            } catch (Exception e) {
                System.out.println("Logo no cargado: " + e.getMessage());
            }

            // --- Parte Adjunto (Detecta PDF o Excel) ---
            if (contenidoAdjunto != null) {
                MimeBodyPart parteAdjunto = new MimeBodyPart();
                String mimeType = nombreArchivo.toLowerCase().endsWith(".pdf") ? "application/pdf" : "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                DataSource fuenteDatos = new ByteArrayDataSource(contenidoAdjunto, mimeType);
                parteAdjunto.setDataHandler(new DataHandler(fuenteDatos));
                parteAdjunto.setFileName(nombreArchivo);
                contenidoMultitipo.addBodyPart(parteAdjunto);
            }

            mensaje.setContent(contenidoMultitipo);

            // 3. Envío
            Transport.send(mensaje);
            respuesta = "true";

        } catch (Exception e) {
            respuesta = "Error: " + e.getMessage();
            e.printStackTrace();
        }
        return respuesta;
    }

    public String enviarSimpleMail(String inCorreoRecibe, String inAsunto, String inMensaje) {
        return enviarMailConAdjunto(inCorreoRecibe, inAsunto, inMensaje, null, "");
    }
}
