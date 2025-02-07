/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp;

//import ec.com.eeasa.dp.db.ReporteUsuario;
import ec.com.eeasa.dp.db.AlumbradoPublico;
import ec.com.eeasa.dp.db.Contratistas;
import ec.com.eeasa.dp.db.EnumeracionEquipos;
import ec.com.eeasa.dp.db.RedesMT;
import ec.com.eeasa.dp.db.RedesSecundarias;
import ec.com.eeasa.dp.db.ReporteBrechas;
import ec.com.eeasa.dp.db.ReporteClientesFaltantesDC;
import ec.com.eeasa.dp.db.ReporteClientesProvinciaDC;
import ec.com.eeasa.dp.db.ReporteClientesProvinciaGIS;
import ec.com.eeasa.dp.db.ReporteDetalleAlimentador;
import ec.com.eeasa.dp.db.ReporteDetalleGIS;
import ec.com.eeasa.dp.db.ReporteEquipos;
import ec.com.eeasa.dp.db.ReporteEquiposDepartamentos;
import ec.com.eeasa.dp.db.ReporteTrafos;
import ec.com.eeasa.dp.db.ReporteTrafosDepartamentos;
import ec.com.eeasa.dp.db.Usuarios;
import ec.com.eeasa.dp.server.Formatter;
import ec.com.eeasa.dp.server.reporte.ReporteImplement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author emanzano
 */
@Path("/reportes")

public class WSReporte {

    @GET
    @Path("/obtenerReporteC")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerReporteC() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectAllReportesC();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/obtenerReporteG")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerReporteG() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectAllReportesG();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/totalComercial")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerTotalComercail() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectComercial();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/totalGis")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerTotalGis() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGis();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisDesconectados")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisDesconectados() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisDesconectados();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisSinCarga")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisSinCarga() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisSinCarga();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("gisCuentaNula")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisCuentaNula() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisCuentaNula();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisCuentaBaja")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisCuentaBaja() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisCuentaBaja();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisRepetidos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisRepetidos();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisAlimentador() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisAlimentador();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisFotovoltaicos")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisFotovoltaicos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisFotovotaico();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisMediaTension")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerGisMediaTension() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectGisMediaTension();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/comercialFaltantes")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerComercialFaltantes() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectComercialFaltantes();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/comercialFaltantesCuenta")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerComercialFaltantesCuenta() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectComercialFaltantesCuenta();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/numeroReporte")
    @Produces({MediaType.APPLICATION_JSON})
    public String numeroReporte() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectNumeroReporte();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/usuarioGIS")
    @Produces({MediaType.APPLICATION_JSON})
    public String usuarioGIS() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectUsuario();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/detalleClientesFaltantes")
    @Produces({MediaType.APPLICATION_JSON})
    public String detalleClientesFaltantes() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectDetalleClientesFaltantes();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/nombreAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    public String nombreAlimentador() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectNombreAlimentador();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/gisUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerUsuarioReporte(@QueryParam("cuentaUsuario") String cuentaUsuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectUsuarioReporte(cuentaUsuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteSeleccionado")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteSeleccionado(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteSeleccionado(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteUsuario(@QueryParam("codigoU") String codigoU) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteUsuario(codigoU);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteDetalleGis")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteDetalleGis(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteDetalleGis(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteDetalleAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteDetalleAlimentador(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteDetalleAlimentador(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteFaltantesDC")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteFaltantesDC(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteFaltantesDC(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteProvinciaGis")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerReporteProvinciaGis(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesG = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesG = objReporte.selectReporteProvinciaGis(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesG);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteProvinciaDCFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteProvinciaDCFecha(@QueryParam("cod") String text) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fecha = formato.parse(text);*/
            hmReportesC = objReporte.selectReporteProvinciaDCFecha(text);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteProvinciaGISFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteProvinciaGISFecha(@QueryParam("cod") String text) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fecha = formato.parse(text);*/
            hmReportesC = objReporte.selectReporteProvinciaGisFecha(text);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteProvinciaDC")
    @Produces({MediaType.APPLICATION_JSON})
    public String obtenerReporteProvinciaDC(@QueryParam("codigoR") double codigoR) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteProvinciaDC(codigoR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/historialReporte")
    @Produces({MediaType.APPLICATION_JSON})
    public String historialReporte(@QueryParam("fecha") String text, @QueryParam("fecha2") String text2, @QueryParam("usuario") String usuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(text);
            Date fecha2 = formato.parse(text2);
            hmReportesC = objReporte.selectHistorialReportes(fecha, fecha2, usuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/gisIngresoUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String ingresarUsuario(@QueryParam("codigoROL") double codigoROL,
            @QueryParam("codigoUsuario") String codigoUsuario, @QueryParam("cuentaUsuario") String cuentaUsuario,
            @QueryParam("nombreUsuario") String nombreUsuario, @QueryParam("estadoUsuario") String estadoUsuario) {
        ReporteImplement objReporte = new ReporteImplement();
        String outDataC = "";
        try {
            outDataC = objReporte.insertUsuario(codigoROL, codigoUsuario, cuentaUsuario, nombreUsuario, estadoUsuario);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC;
    }

    @POST
    @Path("/guardarReporteBrechas")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteBrechas(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteBrechas objreporte_b = new ReporteBrechas();

            objreporte_b.setCUENTA_USUARIO(objrep_brechasObject.isNull("DPRUS_CUENTA") ? null : objrep_brechasObject.getString("DPRUS_CUENTA"));
            objreporte_b.setCLIENTES_GIS_ENERGIZADOS(objrep_brechasObject.isNull("DPREP_CLIENTES_GIS_ENERGIZADOS") ? null : objrep_brechasObject.getDouble("DPREP_CLIENTES_GIS_ENERGIZADOS"));
            objreporte_b.setCLIENTES_COMERCIAL(objrep_brechasObject.isNull("DPREP_CLIENTE_COMERCIAL") ? null : objrep_brechasObject.getDouble("DPREP_CLIENTE_COMERCIAL"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("DPREP_FECHA") ? null : formato.parse(objrep_brechasObject.get("DPREP_FECHA").toString()));

            String result = reultReporteImpl.insertReporteBrechas(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();

        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/guardarClientesFaltantesDC")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteClientesFaltantesDC(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteClientesFaltantesDC objreporte_b = new ReporteClientesFaltantesDC();

            objreporte_b.setDPREP_CODIGO(objrep_brechasObject.isNull("DPREP_CODIGO") ? null : objrep_brechasObject.getInt("DPREP_CODIGO"));
            objreporte_b.setDREDC_ZONA(objrep_brechasObject.isNull("DREDC_ZONA") ? null : objrep_brechasObject.getString("DREDC_ZONA"));
            objreporte_b.setDREDC_CANTIDAD(objrep_brechasObject.isNull("DREDC_CANTIDAD") ? null : objrep_brechasObject.getInt("DREDC_CANTIDAD"));

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setDREDC_FECHA(objrep_brechasObject.isNull("DREDC_FECHA") ? null : formato.parse(objrep_brechasObject.get("DREDC_FECHA").toString()));

            String result = reultReporteImpl.insertReporteClientesFaltantesDC(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();

        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/guardarClientesProvinciaDC")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteClientesProvinciaDC(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteClientesProvinciaDC objreporte_b = new ReporteClientesProvinciaDC();

            objreporte_b.setDPREP_CODIGO(objrep_brechasObject.isNull("DPREP_CODIGO") ? null : objrep_brechasObject.getInt("DPREP_CODIGO"));
            objreporte_b.setDRCPC_COD_PROV(objrep_brechasObject.isNull("DRCPC_COD_PROV") ? null : objrep_brechasObject.getString("DRCPC_COD_PROV"));
            objreporte_b.setDRCPC_CANTIDAD(objrep_brechasObject.isNull("DRCPC_CANTIDAD") ? null : objrep_brechasObject.getDouble("DRCPC_CANTIDAD"));

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setDRCPC_FECHA(objrep_brechasObject.isNull("DRCPC_FECHA") ? null : formato.parse(objrep_brechasObject.get("DRCPC_FECHA").toString()));

            String result = reultReporteImpl.insertReporteClientesProvinciaDC(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/guardarClientesProvinciaGIS")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteClientesProvinciaGIS(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteClientesProvinciaGIS objreporte_b = new ReporteClientesProvinciaGIS();

            objreporte_b.setDPREP_CODIGO(objrep_brechasObject.isNull("DPREP_CODIGO") ? null : objrep_brechasObject.getInt("DPREP_CODIGO"));
            objreporte_b.setDRCPG_COD_PROV(objrep_brechasObject.isNull("DRCPG_COD_PROV") ? null : objrep_brechasObject.getString("DRCPG_COD_PROV"));
            objreporte_b.setDRCPG_CANTIDAD(objrep_brechasObject.isNull("DRCPG_CANTIDAD") ? null : objrep_brechasObject.getDouble("DRCPG_CANTIDAD"));

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setDRCPG_FECHA(objrep_brechasObject.isNull("DRCPG_FECHA") ? null : formato.parse(objrep_brechasObject.get("DRCPG_FECHA").toString()));

            String result = reultReporteImpl.insertReporteClientesProvinciaGIS(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/guardarDetalleAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteDetalleAlimentador(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteDetalleAlimentador objreporte_b = new ReporteDetalleAlimentador();

            objreporte_b.setDPREP_CODIGO(objrep_brechasObject.isNull("DPREP_CODIGO") ? null : objrep_brechasObject.getInt("DPREP_CODIGO"));
            objreporte_b.setDRALI_COD_ALIMENTADOR(objrep_brechasObject.isNull("DRALI_COD_ALIMENTADOR") ? null : objrep_brechasObject.getString("DRALI_COD_ALIMENTADOR"));
            objreporte_b.setDRALI_NUM_CLIENTE(objrep_brechasObject.isNull("DRALI_NUM_CLIENTE") ? null : objrep_brechasObject.getInt("DRALI_NUM_CLIENTE"));

            String result = reultReporteImpl.insertReporteDetalleAlimentador(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/guardarDetalleGIS")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String guardarReporteDetalleGIS(String save_rep_brechas) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_brechas);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteDetalleGIS objreporte_b = new ReporteDetalleGIS();

            objreporte_b.setDPREP_CODIGO(objrep_brechasObject.isNull("DPREP_CODIGO") ? null : objrep_brechasObject.getInt("DPREP_CODIGO"));
            objreporte_b.setDREDG_CLI_GIS_CONEXION(objrep_brechasObject.isNull("DREDG_CLI_GIS_CONEXION") ? null : objrep_brechasObject.getDouble("DREDG_CLI_GIS_CONEXION"));
            objreporte_b.setDREDG_CLI_SIN_CARGA(objrep_brechasObject.isNull("DREDG_CLI_SIN_CARGA") ? null : objrep_brechasObject.getInt("DREDG_CLI_SIN_CARGA"));
            objreporte_b.setDREDG_CUE_NULA(objrep_brechasObject.isNull("DREDG_CUE_NULA") ? null : objrep_brechasObject.getInt("DREDG_CUE_NULA"));
            objreporte_b.setDREDG_CUE_BAJA(objrep_brechasObject.isNull("DREDG_CUE_BAJA") ? null : objrep_brechasObject.getInt("DREDG_CUE_BAJA"));
            objreporte_b.setDREDG_CLI_REPETIDO(objrep_brechasObject.isNull("DREDG_CLI_REPETIDO") ? null : objrep_brechasObject.getInt("DREDG_CLI_REPETIDO"));
            objreporte_b.setDREDG_CLI_DESCONECTADOS(objrep_brechasObject.isNull("DREDG_CLI_DESCONECTADOS") ? null : objrep_brechasObject.getInt("DREDG_CLI_DESCONECTADOS"));
            String result = reultReporteImpl.insertReporteDetalleGIS(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("MENSAJE", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/trafosRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosRepetidos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selecttTrafosRepetidos();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosDepartamento")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosDepartamento(@QueryParam("codigoUnidad") String codigoUnidad) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selecTrafosDepartamento(codigoUnidad);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosDetalleDepartamento")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosDetalleDepartamento(@QueryParam("codigoUnidad") String codigoUnidad) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectDetTrafosDepartamento(codigoUnidad);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSinCarga")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSinCarga() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosSinCarga();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosDesconectados")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosDesconectados() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosDesconectados();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSobrecargados")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSobrecargados(@QueryParam("mayor") String may, @QueryParam("menor") String men) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            int mayor = Integer.parseInt(may);
            int menor = Integer.parseInt(men);
            hmReportesC = objReporte.selecttTrafosSobrecargados(mayor, menor);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSobrecargadosDepartamento")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSobrecargadosDepartamento(@QueryParam("objectID") String objectID) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosSobrecargadosDepartamento(objectID);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteTrafosUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteTrafosUsuario(@QueryParam("codigoU") String codigoU) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteTrafosUsuario(codigoU);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSobrecargadosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSobrecargadosFecha(@QueryParam("fecha") String text) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fecha = formato.parse(text);
            hmReportesC = objReporte.selectReporteTrafosFechaSobrecargados(fecha);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSinCargaFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSinCargaFecha(@QueryParam("fecha") String text) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fecha = formato.parse(text);
            hmReportesC = objReporte.selectReporteTrafosFechaSinCarga(fecha);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosRepetidosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosRepetidosFecha(@QueryParam("fecha") String text) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fecha = formato.parse(text);
            hmReportesC = objReporte.selectReporteTrafosFechaRepetidos(fecha);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSobrecargadosSeleccionado")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSobrecargadosSeleccionado(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteTrafosSeleccionadoSobrecargados(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosSinCargaSeleccionado")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSinCargaSeleccionado(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteTrafosSeleccionadoSinCarga(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosRepetidosSeleccionado")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosRepetidosSeleccionado(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteTrafosSeleccionadoRepetidos(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/historialReporteTrafos")
    @Produces({MediaType.APPLICATION_JSON})
    public String historialReporteTrafos(@QueryParam("fecha") String text, @QueryParam("fecha2") String text2, @QueryParam("usuario") String usuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(text);
            Date fecha2 = formato.parse(text2);
            hmReportesC = objReporte.selectHistorialReportesTrafos(fecha, fecha2, usuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarReporteTrafos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReporteTrafos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteTrafos objreporte_b = new ReporteTrafos();

            objreporte_b.setCUENTA_USUARIO(objrep_brechasObject.isNull("DPRUS_CUENTA") ? null : objrep_brechasObject.getString("DPRUS_CUENTA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("DPRTR_FECHA") ? null : formato.parse(objrep_brechasObject.get("DPRTR_FECHA").toString()));

            String result = reultReporteImpl.insertarReporteTrafos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarReporteTrafosRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReporteTrafosRepetidos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteTrafosDepartamentos objreporte_b = new ReporteTrafosDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setCANTIDAD(objrep_brechasObject.isNull("CANTIDAD") ? null : objrep_brechasObject.getInt("CANTIDAD"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarReporteTrafosRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarReporteTrafosSinCarga")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReporteTrafosSinCarga(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteTrafosDepartamentos objreporte_b = new ReporteTrafosDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setCANTIDAD(objrep_brechasObject.isNull("CANTIDAD") ? null : objrep_brechasObject.getInt("CANTIDAD"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarReporteTrafosSinCarga(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarReporteTrafoSobrecargado")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReporteTrafoSobrecargado(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteTrafosDepartamentos objreporte_b = new ReporteTrafosDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setCANTIDAD(objrep_brechasObject.isNull("CANTIDAD") ? null : objrep_brechasObject.getInt("CANTIDAD"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarReporteTrafosSobrecargados(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/contratistas")
    @Produces({MediaType.APPLICATION_JSON})
    public String contratistas() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectContratistas();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarContratistas")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarContratistas(String save_contratista) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_contratista);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            Contratistas objcontratista = new Contratistas();

            objcontratista.setDPNUM_CONTRA_CEDULA(objrep_brechasObject.isNull("DPNUM_CONTRA_CEDULA") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_CEDULA"));
            objcontratista.setDPNUM_CONTRA_NOMBRE(objrep_brechasObject.isNull("DPNUM_CONTRA_NOMBRE") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_NOMBRE"));
            objcontratista.setDPNUM_CONTRA_APELLIDO(objrep_brechasObject.isNull("DPNUM_CONTRA_APELLIDO") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_APELLIDO"));
            objcontratista.setDPNUM_CONTRA_DIRECCION(objrep_brechasObject.isNull("DPNUM_CONTRA_DIRECCION") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_DIRECCION"));
            objcontratista.setDPNUM_CONTRA_CELULAR(objrep_brechasObject.isNull("DPNUM_CONTRA_CELULAR") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_CELULAR"));
            objcontratista.setDPNUM_CONTRA_EMAIL(objrep_brechasObject.isNull("DPNUM_CONTRA_EMAIL") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_EMAIL"));
            objcontratista.setDPRUS_CUENTA(objrep_brechasObject.isNull("DPRUS_CUENTA") ? null : objrep_brechasObject.getString("DPRUS_CUENTA"));
            String result = reultReporteImpl.insertarContratistas(objcontratista);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @PUT
    @Path("/actualizarContratistas")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String actualizarContratistas(String save_contratista) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_contratista);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            Contratistas objcontratista = new Contratistas();
            objcontratista.setDPNUM_CONTRA_COD(objrep_brechasObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_COD"));
            objcontratista.setDPNUM_CONTRA_CEDULA(objrep_brechasObject.isNull("DPNUM_CONTRA_CEDULA") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_CEDULA"));
            objcontratista.setDPNUM_CONTRA_NOMBRE(objrep_brechasObject.isNull("DPNUM_CONTRA_NOMBRE") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_NOMBRE"));
            objcontratista.setDPNUM_CONTRA_APELLIDO(objrep_brechasObject.isNull("DPNUM_CONTRA_APELLIDO") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_APELLIDO"));
            objcontratista.setDPNUM_CONTRA_DIRECCION(objrep_brechasObject.isNull("DPNUM_CONTRA_DIRECCION") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_DIRECCION"));
            objcontratista.setDPNUM_CONTRA_CELULAR(objrep_brechasObject.isNull("DPNUM_CONTRA_CELULAR") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_CELULAR"));
            objcontratista.setDPNUM_CONTRA_EMAIL(objrep_brechasObject.isNull("DPNUM_CONTRA_EMAIL") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_EMAIL"));
            objcontratista.setDPRUS_CUENTA(objrep_brechasObject.isNull("DPRUS_CUENTA") ? null : objrep_brechasObject.getString("DPRUS_CUENTA"));
            String result = reultReporteImpl.actualizarContratistas(objcontratista);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @PUT
    @Path("/eliminarContratistas")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String eliminarContratistas(String save_contratista) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_contratista);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            Contratistas objcontratista = new Contratistas();
            objcontratista.setDPNUM_CONTRA_COD(objrep_brechasObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_brechasObject.getString("DPNUM_CONTRA_COD"));
            String result = reultReporteImpl.eliminarContratistas(objcontratista);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/claseEquipos")
    @Produces({MediaType.APPLICATION_JSON})
    public String claseEquipos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectClaseEquipo();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/tipoEquipos")
    @Produces({MediaType.APPLICATION_JSON})
    public String tipoEquipos(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTipoEquipos(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/numeracionFinal")
    @Produces({MediaType.APPLICATION_JSON})
    public String numeracionFinal(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectNumeracionFinal(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarNumeracionEquipo")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarNumeracionEquipo(String save_enumEquipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_enumEquipos);
            JSONObject objrep_EnumeracionObject = jsonArray.getJSONObject(0);

            EnumeracionEquipos objEnumeracion = new EnumeracionEquipos();
            objEnumeracion.setDPNUM_CONTRA_COD(objrep_EnumeracionObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CONTRA_COD"));
            objEnumeracion.setDPNUM_TIPO_COD(objrep_EnumeracionObject.isNull("DPNUM_TIPO_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_TIPO_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD"));
            objEnumeracion.setDPNUM_EQUIP_NUMINFER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMINFER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMINFER"));
            objEnumeracion.setDPNUM_EQUIP_NUMSUPER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMSUPER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMSUPER"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objEnumeracion.setDPNUM_EQUIP_FECHA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_FECHA") ? null : formato.parse(objrep_EnumeracionObject.get("DPNUM_EQUIP_FECHA").toString()));
            objEnumeracion.setDPNUM_EQUIP_SECTOR(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_SECTOR") ? null : objrep_EnumeracionObject.getString("DPNUM_EQUIP_SECTOR"));
            objEnumeracion.setDPRUS_CUENTA(objrep_EnumeracionObject.isNull("DPRUS_CUENTA") ? null : objrep_EnumeracionObject.getString("DPRUS_CUENTA"));
            objEnumeracion.setDPNUM_CLAS_COD(objrep_EnumeracionObject.isNull("DPNUM_CLAS_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CLAS_COD"));
            objEnumeracion.setOPCION(objrep_EnumeracionObject.isNull("OPCION") ? null : objrep_EnumeracionObject.getString("OPCION"));
            String result = reultReporteImpl.insertarNumeracionEquipo(objEnumeracion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/asignacionFinal")
    @Produces({MediaType.APPLICATION_JSON})
    public String asignacionFinal(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectAsignacionFinal(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @PUT
    @Path("/actualizarNumeracionEquipo")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String actualizarNumeracionEquipo(String save_enumEquipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_enumEquipos);
            JSONObject objrep_EnumeracionObject = jsonArray.getJSONObject(0);

            EnumeracionEquipos objEnumeracion = new EnumeracionEquipos();
            objEnumeracion.setDPNUM_EQUIP_COD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_EQUIP_COD"));
            objEnumeracion.setDPNUM_CONTRA_COD(objrep_EnumeracionObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CONTRA_COD"));
            objEnumeracion.setDPNUM_TIPO_COD(objrep_EnumeracionObject.isNull("DPNUM_TIPO_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_TIPO_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD"));
            objEnumeracion.setDPNUM_EQUIP_NUMINFER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMINFER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMINFER"));
            objEnumeracion.setDPNUM_EQUIP_NUMSUPER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMSUPER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMSUPER"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objEnumeracion.setDPNUM_EQUIP_FECHA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_FECHA") ? null : formato.parse(objrep_EnumeracionObject.get("DPNUM_EQUIP_FECHA").toString()));
            objEnumeracion.setDPNUM_EQUIP_SECTOR(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_SECTOR") ? null : objrep_EnumeracionObject.getString("DPNUM_EQUIP_SECTOR"));
            objEnumeracion.setDPRUS_CUENTA(objrep_EnumeracionObject.isNull("DPRUS_CUENTA") ? null : objrep_EnumeracionObject.getString("DPRUS_CUENTA"));
            objEnumeracion.setDPNUM_CLAS_COD(objrep_EnumeracionObject.isNull("DPNUM_CLAS_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CLAS_COD"));
            String result = reultReporteImpl.actualizarNumeracionEquipo(objEnumeracion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @PUT
    @Path("/eliminarNumeracionEquipo")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String eliminarNumeracionEquipo(String save_enumEquipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_enumEquipos);
            JSONObject objrep_EnumeracionObject = jsonArray.getJSONObject(0);

            EnumeracionEquipos objEnumeracion = new EnumeracionEquipos();
            objEnumeracion.setDPNUM_EQUIP_COD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_EQUIP_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objEnumeracion.setDPNUM_EQUIP_FECHA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_FECHA") ? null : formato.parse(objrep_EnumeracionObject.get("DPNUM_EQUIP_FECHA").toString()));
            objEnumeracion.setDPRUS_CUENTA(objrep_EnumeracionObject.isNull("DPRUS_CUENTA") ? null : objrep_EnumeracionObject.getString("DPRUS_CUENTA"));
            objEnumeracion.setDPNUM_CLAS_COD(objrep_EnumeracionObject.isNull("DPNUM_CLAS_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CLAS_COD"));
            String result = reultReporteImpl.eliminarNumeracionEquipo(objEnumeracion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/numeracion")
    @Produces({MediaType.APPLICATION_JSON})
    public String numeracion() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectNumeracion();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarNumeracionDevuelta")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarNumeracionDevuelta(String save_enumEquipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_enumEquipos);
            JSONObject objrep_EnumeracionObject = jsonArray.getJSONObject(0);

            EnumeracionEquipos objEnumeracion = new EnumeracionEquipos();
            objEnumeracion.setDPNUM_CONTRA_COD(objrep_EnumeracionObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CONTRA_COD"));
            objEnumeracion.setDPNUM_TIPO_COD(objrep_EnumeracionObject.isNull("DPNUM_TIPO_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_TIPO_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD"));
            objEnumeracion.setDPNUM_EQUIP_NUMINFER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMINFER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMINFER"));
            objEnumeracion.setDPNUM_EQUIP_NUMSUPER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMSUPER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMSUPER"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objEnumeracion.setDPNUM_EQUIP_FECHA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_FECHA") ? null : formato.parse(objrep_EnumeracionObject.get("DPNUM_EQUIP_FECHA").toString()));
            objEnumeracion.setDPNUM_EQUIP_SECTOR(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_SECTOR") ? null : objrep_EnumeracionObject.getString("DPNUM_EQUIP_SECTOR"));
            objEnumeracion.setDPRUS_CUENTA(objrep_EnumeracionObject.isNull("DPRUS_CUENTA") ? null : objrep_EnumeracionObject.getString("DPRUS_CUENTA"));
            objEnumeracion.setDPNUM_EQUIP_COD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_EQUIP_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD_ACTULIZADA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD_ACTULIZADA") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD_ACTULIZADA"));
            objEnumeracion.setDPNUM_EQUIP_NUMSUPER_ACTUALIZADA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMSUPER_ACTUALIZADA") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMSUPER_ACTUALIZADA"));

            String result = reultReporteImpl.insertarNumeracionDevuelta(objEnumeracion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/numeracionDev")
    @Produces({MediaType.APPLICATION_JSON})
    public String numeracionDev() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectNumeracionDev();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarNumeracionEquipoDev")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarNumeracionEquipoDev(String save_enumEquipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_enumEquipos);
            JSONObject objrep_EnumeracionObject = jsonArray.getJSONObject(0);

            EnumeracionEquipos objEnumeracion = new EnumeracionEquipos();
            objEnumeracion.setDPNUM_CONTRA_COD(objrep_EnumeracionObject.isNull("DPNUM_CONTRA_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CONTRA_COD"));
            objEnumeracion.setDPNUM_TIPO_COD(objrep_EnumeracionObject.isNull("DPNUM_TIPO_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_TIPO_COD"));
            objEnumeracion.setDPNUM_EQUIP_CANTIDAD(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_CANTIDAD") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_CANTIDAD"));
            objEnumeracion.setDPNUM_EQUIP_NUMINFER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMINFER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMINFER"));
            objEnumeracion.setDPNUM_EQUIP_NUMSUPER(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_NUMSUPER") ? null : objrep_EnumeracionObject.getDouble("DPNUM_EQUIP_NUMSUPER"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objEnumeracion.setDPNUM_EQUIP_FECHA(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_FECHA") ? null : formato.parse(objrep_EnumeracionObject.get("DPNUM_EQUIP_FECHA").toString()));
            objEnumeracion.setDPNUM_EQUIP_SECTOR(objrep_EnumeracionObject.isNull("DPNUM_EQUIP_SECTOR") ? null : objrep_EnumeracionObject.getString("DPNUM_EQUIP_SECTOR"));
            objEnumeracion.setDPRUS_CUENTA(objrep_EnumeracionObject.isNull("DPRUS_CUENTA") ? null : objrep_EnumeracionObject.getString("DPRUS_CUENTA"));
            objEnumeracion.setDPNUM_CLAS_COD(objrep_EnumeracionObject.isNull("DPNUM_CLAS_COD") ? null : objrep_EnumeracionObject.getInt("DPNUM_CLAS_COD"));
            String result = reultReporteImpl.insertarNumeracionEquipoDev(objEnumeracion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/contratistaCedula")
    @Produces({MediaType.APPLICATION_JSON})
    public String contratistaCedula(@QueryParam("cedula") String cedula) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectContratistaCedula(cedula);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/reporteNumeracion")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteNumeracion(@QueryParam("fecha") String fecha, @QueryParam("fecha2") String fecha2, @QueryParam("contratista") String contratista, @QueryParam("clase") String clase, @QueryParam("opcion") String opcion) {
        Date fechaM1;
        Date fechaM2;
        Number codCOn;
        Number codCla;
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fechaM1 = formato.parse(fecha);
            fechaM2 = formato.parse(fecha2);
            //codCOn = Integer.parseInt(contratista);
            if (contratista != null && !contratista.isEmpty() && !"undefined".equals(contratista)) {
                codCOn = Integer.parseInt(contratista);
            } else {
                codCOn = 0;
            }
            codCla = Integer.parseInt(clase);
            hmReportesC = objReporte.selectReporteNumeracion(fechaM1, fechaM2, codCOn, codCla, opcion);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    //Agregado por ANavas 16/12/2024
    @GET
    @Path("/reporteNumeracionByEq")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteNumeracionByNumberEquip(@QueryParam("numEquip") String numEquip, @QueryParam("numEquipInferior") String numEquipInferior,
            @QueryParam("numEquipSuperior") String numEquipSuperior, @QueryParam("clase") String clase) {
        Number numberEquip;
        Number numberEquipInferior;
        Number numberEquipSuperior;
        Number codClase;
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            numberEquip = Integer.parseInt(numEquip);
            numberEquipInferior = Integer.parseInt(numEquipInferior);
            numberEquipSuperior = Integer.parseInt(numEquipSuperior);
            codClase = Integer.parseInt(clase);
            hmReportesC = objReporte.selectReporteNumeracionByNumberEquip(numberEquip, numberEquipInferior, numberEquipSuperior, codClase);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/sectores")
    @Produces({MediaType.APPLICATION_JSON})
    public String sectores() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectSectores();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println(outDataC.toString());
        return outDataC.toString();
    }

    @GET
    @Path("/listaPermisos")
    @Produces({MediaType.APPLICATION_JSON})
    public String permisosNumeracion(@QueryParam("usuario") String usuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectPermisosNumeracion(usuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println(outDataC.toString());
        return outDataC.toString();
    }

    @GET
    @Path("/claseEquiposNumeracion")
    @Produces({MediaType.APPLICATION_JSON})
    public String claseEquiposNumeracion(@QueryParam("usuario") String usuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectClaseEquiposNumeracion(usuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println(outDataC.toString());
        return outDataC.toString();
    }

    @POST
    @Path("/gestionRoles")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String gestionarRoles(String requestData) {
        String outDataC = "";
        try {
            // Instancia del implementador del reporte
            ReporteImplement objReporte = new ReporteImplement();
            // Parsear la entrada JSON
            JSONArray jsonArray = new JSONArray(requestData);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            // Extraer parámetros del JSON
            String usuario = jsonObject.isNull("usuario") ? null : jsonObject.getString("usuario");
            String modulo = jsonObject.isNull("codModulo") ? null : jsonObject.getString("codModulo");
            String clase = jsonObject.isNull("codClase") ? null : jsonObject.getString("codClase");
            String operacion = jsonObject.isNull("operacion") ? null : jsonObject.getString("operacion");
            //Convierto los datos que necesito
            Number codModulo = modulo != null ? Integer.parseInt(modulo) : null;
            Number codClase = clase != null ? Integer.parseInt(clase) : null;
            // Obtener los resultados del reporte
            String hmReportesC = objReporte.gestionarPermisosNumeracion(usuario, codModulo, codClase, operacion);
            // Formatear el resultado como JSON
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            outDataC = fm.getData().toString();
        }

        return outDataC; // Retorna el resultado en formato JSON
    }

    @POST
    @Path("/reporteNumeracionSectores")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String reporteNumeracionSectores(String requestData) {
        String outDataC = "";
        try {

            ReporteImplement objReporte = new ReporteImplement();

            JSONArray jsonArray = new JSONArray(requestData);
            JSONObject jsonObject = jsonArray.getJSONObject(0);

            String sector = jsonObject.isNull("sector") ? null : jsonObject.getString("sector");
            String clase = jsonObject.isNull("clase") ? null : jsonObject.getString("clase");
            String fechaInicial = jsonObject.isNull("fechaInicial") ? null : jsonObject.getString("fechaInicial");
            String fechaFinal = jsonObject.isNull("fechaFinal") ? null : jsonObject.getString("fechaFinal");
            String anio = jsonObject.isNull("anio") ? null : jsonObject.getString("anio");

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicialR = null;
            Date fechaFinalR = null;
            if ((fechaInicial != "" && !fechaInicial.trim().isEmpty()) && (fechaFinal != "" && !fechaFinal.trim().isEmpty())) {
                fechaInicialR = fechaInicial != null ? formato.parse(fechaInicial) : null;
                fechaFinalR = fechaFinal != null ? formato.parse(fechaFinal) : null;
            }
            Number codClase = clase != null ? Integer.parseInt(clase) : null;

            ArrayList<HashMap<String, Object>> hmReportesC = objReporte.selectReporteNumeracionSectores(sector, codClase, fechaInicialR, fechaFinalR, anio);
            //Formatear el resultado como JSON
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            outDataC = fm.getData().toString();
        }
        return outDataC; // Retorna el resultado en formato JSON
    }

    //Obtener las fechas de reportes generados segun el usuario.
    @GET
    @Path("/reporteEquiposFechaUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteEquiposUsuarioFechas(@QueryParam("codigoU") String codigoU) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectReporteEquiposUsuarioFechas(codigoU);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }

    @GET
    @Path("/postesRepetidosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteEqPostesRepetidos(@QueryParam("fecha") String fecha) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            if (fecha != "" && !fecha.trim().isEmpty()) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
            }
            hmReportesC = objReporte.selectEqPostesRepetidos(fechaR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/cuchillasRepetidosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteEqCuchillaRepetidos(@QueryParam("fecha") String fecha) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            if (fecha != "" && !fecha.trim().isEmpty()) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
            }
            hmReportesC = objReporte.selectEqCuchillaRepetidos(fechaR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/fusiblesRepetidosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteEqFusibleRepetidos(@QueryParam("fecha") String fecha) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            if (fecha != "" && !fecha.trim().isEmpty()) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
            }
            hmReportesC = objReporte.selectEqFusibleRepetidos(fechaR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/luminariasRepetidosFecha")
    @Produces({MediaType.APPLICATION_JSON})
    public String reporteEqLuminariasRepetidos(@QueryParam("fecha") String fecha) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            if (fecha != "" && !fecha.trim().isEmpty()) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
            }
            hmReportesC = objReporte.selectEqLuminariasRepetidos(fechaR);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/historicoRepetidosProvincias")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectHistoricoRepetidosProvincias(@QueryParam("fecha") String fecha, @QueryParam("fecha2") String fecha2, 
            @QueryParam("fecha3") String fecha3, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            Date fechaR2 = null;
            Date fechaR3 = null;
            if ((fecha != "" && !fecha.trim().isEmpty()) && (fecha2 != "" && !fecha2.trim().isEmpty()) && (fecha3 != "" && !fecha3.trim().isEmpty())) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
                fechaR2 = fecha2 != null ? formato.parse(fecha2) : null;
                fechaR3 = fecha3 != null ? formato.parse(fecha3) : null;
            }
            int opcionNumber = Integer.parseInt(opcion);
            hmReportesC = objReporte.selectHistoricoRepetidosProvincias(fechaR, fechaR2, fechaR3, opcionNumber);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/historicoRepetidosDepartamentos")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectHistoricoRepetidosDepartamentos(@QueryParam("fecha") String fecha, @QueryParam("fecha2") String fecha2, 
            @QueryParam("fecha3") String fecha3, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            Date fechaR2 = null;
            Date fechaR3 = null;
            if ((fecha != "" && !fecha.trim().isEmpty()) && (fecha2 != "" && !fecha2.trim().isEmpty()) && (fecha3 != "" && !fecha3.trim().isEmpty())) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
                fechaR2 = fecha2 != null ? formato.parse(fecha2) : null;
                fechaR3 = fecha3 != null ? formato.parse(fecha3) : null;
            }
            int opcionNumber = Integer.parseInt(opcion);
            hmReportesC = objReporte.selectHistoricoRepetidosDepartamentos(fechaR, fechaR2, fechaR3, opcionNumber);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @POST
    @Path("/crearReporteEquiposRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReporteEquiposRepetidos(String save_rep_equipos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_equipos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteEquipos objreporte_b = new ReporteEquipos();

            objreporte_b.setCUENTA_USUARIO(objrep_brechasObject.isNull("DPRUS_CUENTA") ? null : objrep_brechasObject.getString("DPRUS_CUENTA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("DPRTR_FECHA") ? null : formato.parse(objrep_brechasObject.get("DPRTR_FECHA").toString()));

            String result = reultReporteImpl.insertarReporteEquiposRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }
    
    @POST
    @Path("/insertarReportePostesRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarReportePostesRepetidos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteEquiposDepartamentos objreporte_b = new ReporteEquiposDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setDIFERENCIA(objrep_brechasObject.isNull("DIFERENCIA") ? null : objrep_brechasObject.getInt("DIFERENCIA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarReportePostesRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }
    
    @POST
    @Path("/insertarReporteCuchillasRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarCuchillasRepetidos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteEquiposDepartamentos objreporte_b = new ReporteEquiposDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setDIFERENCIA(objrep_brechasObject.isNull("DIFERENCIA") ? null : objrep_brechasObject.getInt("DIFERENCIA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarCuchillasRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }
    
    @POST
    @Path("/insertarReporteFusiblesRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarFusiblesRepetidos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteEquiposDepartamentos objreporte_b = new ReporteEquiposDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setDIFERENCIA(objrep_brechasObject.isNull("DIFERENCIA") ? null : objrep_brechasObject.getInt("DIFERENCIA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarFusiblesRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }
    
    @POST
    @Path("/insertarReporteLuminariasRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarLuminariasRepetidos(String save_rep_trafos) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_rep_trafos);
            JSONObject objrep_brechasObject = jsonArray.getJSONObject(0);

            ReporteEquiposDepartamentos objreporte_b = new ReporteEquiposDepartamentos();

            objreporte_b.setCODIGO(objrep_brechasObject.isNull("CODIGO") ? null : objrep_brechasObject.getInt("CODIGO"));
            objreporte_b.setDEPARTAMENTO(objrep_brechasObject.isNull("DEPARTAMENTO") ? null : objrep_brechasObject.getString("DEPARTAMENTO"));
            objreporte_b.setDIFERENCIA(objrep_brechasObject.isNull("DIFERENCIA") ? null : objrep_brechasObject.getInt("DIFERENCIA"));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            objreporte_b.setFECHA(objrep_brechasObject.isNull("FECHA") ? null : formato.parse(objrep_brechasObject.get("FECHA").toString()));
            String result = reultReporteImpl.insertarLuminariasRepetidos(objreporte_b);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("Codigo", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }
    
    @GET
    @Path("/cantidadGlobalRepetidos")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectGlobalRepetidos(@QueryParam("fecha") String fecha, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaR = null;
            if (fecha != "" && !fecha.trim().isEmpty()) {
                fechaR = fecha != null ? formato.parse(fecha) : null;
            }
            int opcionNumber = Integer.parseInt(opcion);
            hmReportesC = objReporte.selectGlobalRepetidos(fechaR, opcionNumber);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    @GET
    @Path("/existenDevoluciones")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectExistenDevoluciones(@QueryParam("tipo") String tipo) {
        ReporteImplement objReporte = new ReporteImplement();
        int hmReportesC;
        String outDataC = "";
        try {
            int tipoNumber = Integer.parseInt(tipo);
            hmReportesC = objReporte.selectExistenDevoluciones(tipoNumber);
            outDataC = "{ \"resultado\": " + hmReportesC + " }";
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }
    
    
    @GET
    @Path("/GestionContratistaPermiso")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectPermisosGestionContratistas(@QueryParam("usuario") String usuario) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectPermisosGestionContratistas(usuario);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println(outDataC.toString());
        return outDataC.toString();
    }
    
    @POST
    @Path("/gestionRolesContratistas")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String gestionarRolesContratistas(String requestData) {
        String outDataC = "";
        try {
            // Instancia del implementador del reporte
            ReporteImplement objReporte = new ReporteImplement();
            // Parsear la entrada JSON
            JSONArray jsonArray = new JSONArray(requestData);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            // Extraer parámetros del JSON
            String usuario = jsonObject.isNull("usuario") ? null : jsonObject.getString("usuario");
            String permiso = jsonObject.isNull("permiso") ? null : jsonObject.getString("permiso");
            //Convierto los datos que necesito
            Number permisoS = permiso != null ? Integer.parseInt(permiso) : null;
            // Obtener los resultados del reporte
            String hmReportesC = objReporte.gestionarRolesContratistas(usuario, permisoS);
            // Formatear el resultado como JSON
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            outDataC = fm.getData().toString();
        }

        return outDataC; // Retorna el resultado en formato JSON
    }
    
    //Fin Agregado por ANavas 16/12/2024
    // Perdidas
    @GET
    @Path("/lumAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    public String lumAlimentador() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectLumAlimCanton();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/semAlimentador")
    @Produces({MediaType.APPLICATION_JSON})
    public String semAlimentador() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectSemCanton();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarPEL")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarPEL(String save_AP) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_AP);
            JSONObject objrep_AP = jsonArray.getJSONObject(0);

            String cuenta = objrep_AP.isNull("CUENTA") ? null : objrep_AP.getString("CUENTA");
            String fecha = objrep_AP.isNull("FECHA") ? null : objrep_AP.getString("FECHA");
            String comentario = objrep_AP.isNull("COMENTARIO") ? null : objrep_AP.getString("COMENTARIO");
            String opcion = objrep_AP.isNull("OPCION") ? null : objrep_AP.getString("OPCION");

            String result = reultReporteImpl.insertarPE(cuenta, fecha, comentario, opcion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarDetPCli")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarDetPCli(String save_detallePE) {
        try {
            String result = "";
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_detallePE);
            JSONArray prueba = jsonArray.getJSONArray(0);

            for (int i = 0; i < jsonArray.getJSONArray(0).length(); i++) {

                JSONObject objrep_AP = jsonArray.getJSONArray(0).getJSONObject(i);
                String cod = (objrep_AP.isNull("CODIGO") ? null : objrep_AP.getString("CODIGO"));
                String alim = (objrep_AP.isNull("ALIMENTADOR") ? null : objrep_AP.getString("ALIMENTADOR"));
                Number cant_abo = (objrep_AP.isNull("CANT_ABONADOS") ? null : objrep_AP.getDouble("CANT_ABONADOS"));
                Number total = (objrep_AP.isNull("TOTAL_EC") ? null : objrep_AP.getDouble("TOTAL_EC"));
                result = reultReporteImpl.insertarDetPerCLi(cod, alim, cant_abo, total);
                if (result == "FALSE") {
                    i = prueba.length();
                }

            }
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarDetAP")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarDetAP(String save_detalleAP) {
        try {
            String result = "";
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_detalleAP);
            JSONArray prueba = jsonArray.getJSONArray(0);

            for (int i = 0; i < jsonArray.getJSONArray(0).length(); i++) {

                JSONObject objrep_AP = jsonArray.getJSONArray(0).getJSONObject(i);
                AlumbradoPublico objAP = new AlumbradoPublico();
                objAP.setDPRAP_CODIGO(objrep_AP.isNull("CODIGO") ? null : objrep_AP.getDouble("CODIGO"));
                objAP.setDRPAD_ANIO(objrep_AP.isNull("ANIO") ? null : objrep_AP.getString("ANIO"));
                objAP.setDRPAD_MES(objrep_AP.isNull("MES") ? null : objrep_AP.getString("MES"));
                objAP.setDRPAD_NOM_A(objrep_AP.isNull("NOMBRE") ? null : objrep_AP.getString("NOMBRE"));
                objAP.setDRPAD_CANTON(objrep_AP.isNull("CANTON") ? null : objrep_AP.getString("CANTON"));
                objAP.setDRPAD_BM(objrep_AP.isNull("BM") ? null : objrep_AP.getString("BM"));
                objAP.setDRPAD_ALIM_ID(objrep_AP.isNull("ALIMENTADORID") ? null : objrep_AP.getString("ALIMENTADORID"));
                objAP.setDRPAD_TIPO_P(objrep_AP.isNull("TIPO_NIVEL_POTENCIA") ? null : objrep_AP.getString("TIPO_NIVEL_POTENCIA"));
                objAP.setDRPAD_TIPO_L(objrep_AP.isNull("TIPO_LUMINARIA") ? null : objrep_AP.getString("TIPO_LUMINARIA"));
                objAP.setDRPAD_NUM_LUM(objrep_AP.isNull("CANTIDAD") ? null : objrep_AP.getDouble("CANTIDAD"));
                objAP.setDRPAD_POT_L1(objrep_AP.isNull("POTENCIA") ? null : objrep_AP.getDouble("POTENCIA"));
                objAP.setDRPAD_HORAS_F1(objrep_AP.isNull("H_FUNCIONAMIENTO") ? null : objrep_AP.getDouble("H_FUNCIONAMIENTO"));
                objAP.setDRPAD_CA(objrep_AP.isNull("CA") ? null : objrep_AP.getDouble("CA"));
                objAP.setDRPAD_POT_L2(objrep_AP.isNull("POTENCIA2") ? null : objrep_AP.getDouble("POTENCIA2"));
                objAP.setDRPAD_HORAS_F2(objrep_AP.isNull("H_FUNCIONAMIENTO2") ? null : objrep_AP.getDouble("H_FUNCIONAMIENTO2"));
                objAP.setDRPAD_FU(objrep_AP.isNull("FU") ? null : objrep_AP.getDouble("FU"));
                objAP.setDRPAD_FU2(objrep_AP.isNull("FU2") ? null : objrep_AP.getDouble("FU2"));
                objAP.setDRPAD_CAI(objrep_AP.isNull("CAI") ? null : objrep_AP.getDouble("CAI"));
                objAP.setDRPAD_CAI2(objrep_AP.isNull("CAI2") ? null : objrep_AP.getDouble("CAI2"));
                objAP.setDRPAD_T_MES(objrep_AP.isNull("T_MES") ? null : objrep_AP.getDouble("T_MES"));
                objAP.setDRPAD_CONSUMO(objrep_AP.isNull("CONSUMO_SAPG") ? null : objrep_AP.getDouble("CONSUMO_SAPG"));
                result = reultReporteImpl.insertarDetalleAP(objAP);
                if (result == "FALSE") {
                    i = prueba.length();
                }

            }
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/historialPE")
    @Produces({MediaType.APPLICATION_JSON})
    public String historialPE(@QueryParam("fecha") String text, @QueryParam("fecha2") String text2, @QueryParam("usuario") String usuario, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(text);
            Date fecha2 = formato.parse(text2);
            hmReportesC = objReporte.selectHistorialPE(fecha, fecha2, usuario, opcion);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/histAlumSel")
    @Produces({MediaType.APPLICATION_JSON})
    public String histAlumSel(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectHistAlumSel(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/histCliECSel")
    @Produces({MediaType.APPLICATION_JSON})
    public String histCliECSel(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectHistCliECSel(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    // Proyectos Liquidados
    @GET
    @Path("/inventarioFinalPL")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectInventarioFinalPL(@QueryParam("valor") String valor, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectInventarioFinalPL(valor, opcion);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/inventarioInicicalPL")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectInventarioInicialPL(@QueryParam("valor") String valor, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectInventarioInicialPL(valor, opcion);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/inventarioInicicalPLCOD")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectInventarioInicialPLCOD(@QueryParam("valor") String valor) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            String[] parts = valor.split("/");
            String codigo = parts[0];
            String anio = parts[1];
            hmReportesC = objReporte.selectInventarioInicialPLCOD(codigo, anio);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/inventarioFinalPLCOD")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectInventarioFinalPLCOD(@QueryParam("valor") String valor) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            String[] parts = valor.split("/");
            String codigo = parts[0];
            String anio = parts[1];
            hmReportesC = objReporte.selectInventarioFinalPLCOD(codigo, anio);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    // Gestion Usuarios
    @GET
    @Path("/listaRoles")
    @Produces({MediaType.APPLICATION_JSON})
    public String listaRoles() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectRoles();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/listaUsuarios")
    @Produces({MediaType.APPLICATION_JSON})
    public String listaUsuarios() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectUsuarios();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @PUT
    @Path("/bloquearUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String bloquearUsuario(String usuario) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(usuario);
            JSONObject objrep_UsuarioObject = jsonArray.getJSONObject(0);

            Usuarios objUsuario = new Usuarios();
            objUsuario.setDPRUS_CUENTA(objrep_UsuarioObject.isNull("DPRUS_CUENTA") ? null : objrep_UsuarioObject.getString("DPRUS_CUENTA"));

            String result = reultReporteImpl.bloquearUsuario(objUsuario);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/usuarioCuenta")
    @Produces({MediaType.APPLICATION_JSON})
    public String usuarioCuenta(@QueryParam("cuenta") String cuenta) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectContratistaCedula(cuenta);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarUsuario(String save_usuario) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_usuario);
            JSONObject objrep_Usuario = jsonArray.getJSONObject(0);

            Usuarios objUsuario = new Usuarios();

            objUsuario.setDPRUS_CUENTA(objrep_Usuario.isNull("DPRUS_CUENTA") ? null : objrep_Usuario.getString("DPRUS_CUENTA"));
            objUsuario.setDPROL_CODIGO(objrep_Usuario.isNull("DPROL_CODIGO") ? null : objrep_Usuario.getString("DPROL_CODIGO"));
            objUsuario.setDPRUS_DMPER_CODIGO(objrep_Usuario.isNull("DPRUS_DMPER_CODIGO") ? null : objrep_Usuario.getString("DPRUS_DMPER_CODIGO"));
            objUsuario.setDPRUS_NOM_EMP(objrep_Usuario.isNull("DPRUS_NOM_EMP") ? null : objrep_Usuario.getString("DPRUS_NOM_EMP"));
            objUsuario.setDPRUS_BLOQUEADO(objrep_Usuario.isNull("DPRUS_BLOQUEADO") ? null : objrep_Usuario.getString("DPRUS_BLOQUEADO"));
            String result = reultReporteImpl.insertarUsuario(objUsuario);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @PUT
    @Path("/actualizarUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String actualizarUsuario(String save_usuario) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_usuario);
            JSONObject objrep_Usuario = jsonArray.getJSONObject(0);

            Usuarios objUsuario = new Usuarios();

            objUsuario.setDPRUS_CUENTA(objrep_Usuario.isNull("DPRUS_CUENTA") ? null : objrep_Usuario.getString("DPRUS_CUENTA"));
            objUsuario.setDPROL_CODIGO(objrep_Usuario.isNull("DPROL_CODIGO") ? null : objrep_Usuario.getString("DPROL_CODIGO"));
            objUsuario.setDPRUS_DMPER_CODIGO(objrep_Usuario.isNull("DPRUS_DMPER_CODIGO") ? null : objrep_Usuario.getString("DPRUS_DMPER_CODIGO"));
            objUsuario.setDPRUS_NOM_EMP(objrep_Usuario.isNull("DPRUS_NOM_EMP") ? null : objrep_Usuario.getString("DPRUS_NOM_EMP"));
            objUsuario.setDPRUS_BLOQUEADO(objrep_Usuario.isNull("DPRUS_BLOQUEADO") ? null : objrep_Usuario.getString("DPRUS_BLOQUEADO"));
            String result = reultReporteImpl.actualizarUsuario(objUsuario);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/listaModulos")
    @Produces({MediaType.APPLICATION_JSON})
    public String listaModulos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectModulos();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/modulosUsuario")
    @Produces({MediaType.APPLICATION_JSON})
    public String modulosUsuario(@QueryParam("cuenta") String cuenta) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectModuloUsuario(cuenta);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/moduloAsignado")
    @Produces({MediaType.APPLICATION_JSON})
    public String moduloAsignado(@QueryParam("cuenta") String cuenta, @QueryParam("codM") String codM) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectModuloAsignado(cuenta, codM);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/modulosU")
    @Produces({MediaType.APPLICATION_JSON})
    public String modulosU(@QueryParam("cuenta") String cuenta) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectModulosUsuario(cuenta);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarAsignacionM")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarAsignacionM(String save_asigM) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_asigM);
            JSONObject objrep_Asignacion = jsonArray.getJSONObject(0);

            String cuenta = objrep_Asignacion.isNull("DPRUS_CUENTA") ? null : objrep_Asignacion.getString("DPRUS_CUENTA");
            String codM = objrep_Asignacion.isNull("DPRMO_COD") ? null : objrep_Asignacion.getString("DPRMO_COD");
            String result = reultReporteImpl.insertarModuloAsignado(cuenta, codM);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @DELETE
    @Path("/eliminarAsignacionM")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String eliminarAsignacionM(@QueryParam("cuenta") String cuenta, @QueryParam("codM") String codM) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            String result = reultReporteImpl.deleteModuloAsignado(cuenta, codM);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/trafosAereos")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosAereos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosAereos();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return outDataC.toString();
    }

    @GET
    @Path("/trafosSubterraneos")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosSubterraneos() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosSubterraneos();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosPreesamblados")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosPreesamblados() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosPreesamblados();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosPreesambladosSub")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosPreesambladosSub() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosPreesambladosSub();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarDetINFRS")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarDetINFRS(String save_detalleINFRS) {
        try {
            String result = "";
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_detalleINFRS);

            for (int i = 0; i < jsonArray.getJSONArray(0).length(); i++) {

                JSONObject objrep_INFRS = jsonArray.getJSONArray(0).getJSONObject(i);
                RedesSecundarias objINFRS = new RedesSecundarias();
                objINFRS.setDPIRS_CODIGO(objrep_INFRS.isNull("CODIGO") ? null : objrep_INFRS.getDouble("CODIGO"));
                objINFRS.setDPIRS_TIPO_RED(objrep_INFRS.isNull("TIPO_RED") ? null : objrep_INFRS.getString("TIPO_RED"));
                objINFRS.setDPIRS_INSTALACION(objrep_INFRS.isNull("INSTALACION") ? null : objrep_INFRS.getString("INSTALACION"));
                objINFRS.setDPIRS_MONO_CANT(objrep_INFRS.isNull("MONOFASICOSCAN") ? null : objrep_INFRS.getDouble("MONOFASICOSCAN"));
                objINFRS.setDPIRS_BIFA_CANT(objrep_INFRS.isNull("BIFASICASCAN") ? null : objrep_INFRS.getDouble("BIFASICASCAN"));
                objINFRS.setDPIRS_TRIFA_CANT(objrep_INFRS.isNull("TRIFASICASCAN") ? null : objrep_INFRS.getDouble("TRIFASICASCAN"));
                objINFRS.setDPIRS_MONO_LONG(objrep_INFRS.isNull("MONOFASICOSKM") ? null : objrep_INFRS.getDouble("MONOFASICOSKM"));
                objINFRS.setDPIRS_BIFA_LONG(objrep_INFRS.isNull("BIFASICASKM") ? null : objrep_INFRS.getDouble("BIFASICASKM"));
                objINFRS.setDPIRS_TRIFA_LONG(objrep_INFRS.isNull("TRIFASICASKM") ? null : objrep_INFRS.getDouble("TRIFASICASKM"));
                result = reultReporteImpl.insertarDetalleInfRS(objINFRS);
                if (result == "FALSE") {
                    i = jsonArray.getJSONArray(0).length();
                }

            }
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @POST
    @Path("/insertarDetINFRMT")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarDetINFRMT(String save_detalleINFRMT) {
        try {
            String result = "";
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_detalleINFRMT);

            for (int i = 0; i < jsonArray.getJSONArray(0).length(); i++) {

                JSONObject objrep_INFRS = jsonArray.getJSONArray(0).getJSONObject(i);
                RedesMT objINFRS = new RedesMT();
                objINFRS.setDPRMT_CODIGO(objrep_INFRS.isNull("CODIGO") ? null : objrep_INFRS.getDouble("CODIGO"));
                objINFRS.setDIDMT_NOM_ALI(objrep_INFRS.isNull("NOMBRE_ALIMENTADOR") ? null : objrep_INFRS.getString("NOMBRE_ALIMENTADOR"));
                objINFRS.setDIDMT_ALIM_ID(objrep_INFRS.isNull("ALIMENTADOR") ? null : objrep_INFRS.getString("ALIMENTADOR"));
                objINFRS.setDIDMT_LONG_MONO(objrep_INFRS.isNull("LONGUITUD_MONOFASICA") ? null : objrep_INFRS.getDouble("LONGUITUD_MONOFASICA"));
                objINFRS.setDIDMT_LONG_BIFA(objrep_INFRS.isNull("LONGUITUD_BIFASICA") ? null : objrep_INFRS.getDouble("LONGUITUD_BIFASICA"));
                objINFRS.setDIDMT_LONG_TRIFA(objrep_INFRS.isNull("LONGUITUD_TRIFASICA") ? null : objrep_INFRS.getDouble("LONGUITUD_TRIFASICA"));
                objINFRS.setDIDMT_TRAM_MONO(objrep_INFRS.isNull("TRAFOS_MONOFASICA") ? null : objrep_INFRS.getDouble("TRAFOS_MONOFASICA"));
                objINFRS.setDIDMT_TRAM_TRIFA(objrep_INFRS.isNull("TRAFOS_TRIFASICA") ? null : objrep_INFRS.getDouble("TRAFOS_TRIFASICA"));
                objINFRS.setDIDMT_POTE_MONO(objrep_INFRS.isNull("POTENCIA_MONOFASICA") ? null : objrep_INFRS.getDouble("POTENCIA_MONOFASICA"));
                objINFRS.setDIDMT_POTE_TRIFA(objrep_INFRS.isNull("POTENCIA_TRIFASICA") ? null : objrep_INFRS.getDouble("POTENCIA_TRIFASICA"));
                result = reultReporteImpl.insertarDetalleInfMT(objINFRS);
                if (result == "FALSE") {
                    i = jsonArray.getJSONArray(0).length();
                }

            }
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/materialesPL")
    @Produces({MediaType.APPLICATION_JSON})
    public String materialesPL(@QueryParam("cod") String cod) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectMaterialesPL(cod);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/potencia")
    @Produces({MediaType.APPLICATION_JSON})
    public String potencia(@QueryParam("valor") String valor) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectPotencia(valor);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosMediaA")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosMediaA() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosMediaLongA();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosMediaS")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosMediaS() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosMediaLongS();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/TrafosMO")
    @Produces({MediaType.APPLICATION_JSON})
    public String selectTrafosMediaMono() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosMediaMono();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/trafosTR")
    @Produces({MediaType.APPLICATION_JSON})
    public String trafosTR() {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectTrafosMediaTrifa();
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @POST
    @Path("/insertarInf")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String insertarInf(String save_INF) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            JSONArray jsonArray = new JSONArray(save_INF);
            JSONObject objrep_AP = jsonArray.getJSONObject(0);

            String cuenta = objrep_AP.isNull("CUENTA") ? null : objrep_AP.getString("CUENTA");
            String fecha = objrep_AP.isNull("FECHA") ? null : objrep_AP.getString("FECHA");
            String opcion = objrep_AP.isNull("OPCION") ? null : objrep_AP.getString("OPCION");
            String result = reultReporteImpl.insertarInfraestructura(cuenta, fecha, opcion);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/historialINF")
    @Produces({MediaType.APPLICATION_JSON})
    public String historialINF(@QueryParam("fecha") String text, @QueryParam("fecha2") String text2, @QueryParam("usuario") String usuario, @QueryParam("opcion") String opcion) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(text);
            Date fecha2 = formato.parse(text2);
            hmReportesC = objReporte.selectHistInfraestructura(fecha, fecha2, usuario, opcion);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/histInfRS")
    @Produces({MediaType.APPLICATION_JSON})
    public String histInfRS(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectHistInfRS(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @GET
    @Path("/histInfMT")
    @Produces({MediaType.APPLICATION_JSON})
    public String histInfMT(@QueryParam("codigo") String codigo) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectHistInfMT(codigo);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

    @DELETE
    @Path("/clienteA")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public String clienteA(@QueryParam("fecha") String fecha) {
        try {
            ReporteImplement reultReporteImpl = new ReporteImplement();
            String result = reultReporteImpl.updateClienteA(fecha);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("RESULTADO", result);
            Formatter fm = new Formatter("JSON", hm);
            return fm.getData().toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            Formatter fm = new Formatter("JSON", ex.getMessage());
            return fm.getData().toString();
            //return e.getMessage();
        }
    }

    @GET
    @Path("/eneriaCA")
    @Produces({MediaType.APPLICATION_JSON})
    public String eneriaCA(@QueryParam("fecha") String fecha) {
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String, Object>> hmReportesC = new ArrayList<HashMap<String, Object>>();
        String outDataC = "";
        try {
            hmReportesC = objReporte.selectECA(fecha);
            Formatter fm = new Formatter("JSON", hmReportesC);
            outDataC = fm.getData().toString();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return outDataC.toString();
    }

}
