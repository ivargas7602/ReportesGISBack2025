/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp.server.factory;

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
import ec.com.eeasa.dp.db.ReporteUsuario;
import ec.com.eeasa.dp.db.Usuarios;
import ec.com.eeasa.dp.server.DataBaseObject;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author emanzano
 */
public class ReporteBrechasFactory {

    DataBaseObject dbo;

    public ReporteBrechasFactory(DataBaseObject dbo) {
        super();
        this.dbo = dbo;
    }

    public ReporteBrechasFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<HashMap<String, Object>> selectAllComercial() throws Exception {
        ArrayList<HashMap<String, Object>> listComercial = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_COMERCIAL(?)";
        listComercial = dbo.SQL_CALL_PROCEDURE(sql);
        return listComercial;
    }

    public ArrayList<HashMap<String, Object>> selectAllGiss() throws Exception {
        ArrayList<HashMap<String, Object>> listComercial = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS(?)";
        listComercial = dbo.SQL_CALL_PROCEDURE(sql);
        return listComercial;
    }

    public ArrayList<HashMap<String, Object>> selectComercial() throws Exception {
        ArrayList<HashMap<String, Object>> listComercial = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_COMERCIAL_TOTAL(?)";
        listComercial = dbo.SQL_CALL_PROCEDURE(sql);
        return listComercial;
    }

    public ArrayList<HashMap<String, Object>> selectGis() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_TOTAL(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisDesconectados() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_DESCONECTADOS(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisSinCarga() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_SIN_CARGA(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisCuentaNula() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_CUENTA_NULA(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisCuentaBaja() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_CUENTA_BAJA(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisRepetidos() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_REPETIDOS(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisAlimentador() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_ALIMENTADOR(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisFotovotaico() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_FOTOVOLTAICOS(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectGisMediaTension() throws Exception {
        ArrayList<HashMap<String, Object>> listGis = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_GIS_MEDIA_TENSION(?)";
        listGis = dbo.SQL_CALL_PROCEDURE(sql);
        return listGis;
    }

    public ArrayList<HashMap<String, Object>> selectComercialFaltantes() throws Exception {
        ArrayList<HashMap<String, Object>> listComerical = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_COMERCIAL_FALTANTES(?)";
        listComerical = dbo.SQL_CALL_PROCEDURE(sql);
        return listComerical;
    }

    public ArrayList<HashMap<String, Object>> selectComercialFaltantesCuenta() throws Exception {
        ArrayList<HashMap<String, Object>> listComerical = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_COMERCIAL_FALTANTESC(?)";
        listComerical = dbo.SQL_CALL_PROCEDURE(sql);
        return listComerical;
    }

    public ArrayList<HashMap<String, Object>> selectNumeroReporte() throws Exception {
        ArrayList<HashMap<String, Object>> numReporte = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_NUM_REPORTE(?)";
        numReporte = dbo.SQL_CALL_PROCEDURE(sql);
        return numReporte;
    }

    public ArrayList<HashMap<String, Object>> selectUsuario() throws Exception {
        ArrayList<HashMap<String, Object>> usuario = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_USUARIO(?)";
        usuario = dbo.SQL_CALL_PROCEDURE(sql);
        return usuario;
    }

    public ArrayList<HashMap<String, Object>> selectDetalleClientesFaltantes() throws Exception {
        ArrayList<HashMap<String, Object>> reporte = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_DET_CLI_FAL(?)";
        reporte = dbo.SQL_CALL_PROCEDURE(sql);
        return reporte;
    }

    public ArrayList<HashMap<String, Object>> selectNombreAlimentador() throws Exception {
        ArrayList<HashMap<String, Object>> listAlimentador = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_NOM_ALIMENTADOR(?)";
        listAlimentador = dbo.SQL_CALL_PROCEDURE(sql);
        return listAlimentador;
    }

    public ArrayList<HashMap<String, Object>> selectReporteUsuario(String codigoU) throws Exception {
        ArrayList<HashMap<String, Object>> reporteUsuario = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_USER(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoU);
        reporteUsuario = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteUsuario;
    }

    /*    Reporte Seleccionado */
    public ArrayList<HashMap<String, Object>> selectReporteSeleccionado(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_SELEC(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteDetalleGis(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_DET_GIS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteDetalleAlimentador(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_DET_ALIMENT(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteFaltantesDC(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_CLI_FAL_DC(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaGis(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_PROVINCIA_G(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaGisFecha(String cod) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_PROV_GIS_FEC(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cod);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectHistorialReportes(Date fecha, Date fecha2, String usuario) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HISTORIAL_REPORTES(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(usuario);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaDC(Number codigoR) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaDC = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_PROVINCIA_DC(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoR);
        reporteProvinciaDC = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaDC;
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaDCFecha(String cod) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaDC = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_PROV_DC_FEC(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cod);
        reporteProvinciaDC = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaDC;
    }

    public String insertUsuario(double codigoROL, String codigoUsuario, String cuentaUsuario, String nombreUsuario, String estadoUsuario) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_USUARIO_REPORTE(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuentaUsuario);
        parametros.add(codigoROL);
        parametros.add(codigoUsuario);
        parametros.add(nombreUsuario);
        parametros.add(estadoUsuario);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    /* Insercion de datos del Reporte */
    public String insertReporteBrechas(
            ReporteBrechas obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_BRECHAS(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getCUENTA_USUARIO());
        parametros.add(obj_rep_brechas.getCLIENTES_GIS_ENERGIZADOS());
        parametros.add(obj_rep_brechas.getCLIENTES_COMERCIAL());
        parametros.add(obj_rep_brechas.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertReporteClientesFaltantesDC(
            ReporteClientesFaltantesDC obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_CLI_FAL_DC(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getDPREP_CODIGO());
        parametros.add(obj_rep_brechas.getDREDC_ZONA());
        parametros.add(obj_rep_brechas.getDREDC_CANTIDAD());
        parametros.add(obj_rep_brechas.getDREDC_FECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertReporteClientesProvinciaDC(
            ReporteClientesProvinciaDC obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_CLI_PROV_DC(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getDPREP_CODIGO());
        parametros.add(obj_rep_brechas.getDRCPC_COD_PROV());
        parametros.add(obj_rep_brechas.getDRCPC_CANTIDAD());
        parametros.add(obj_rep_brechas.getDRCPC_FECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertReporteClientesProvinciaGIS(
            ReporteClientesProvinciaGIS obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_CLI_PROV_GIS(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getDPREP_CODIGO());
        parametros.add(obj_rep_brechas.getDRCPG_COD_PROV());
        parametros.add(obj_rep_brechas.getDRCPG_CANTIDAD());
        parametros.add(obj_rep_brechas.getDRCPG_FECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertReporteDetalleAlimentador(
            ReporteDetalleAlimentador obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_DET_ALI(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getDPREP_CODIGO());
        parametros.add(obj_rep_brechas.getDRALI_COD_ALIMENTADOR());
        parametros.add(obj_rep_brechas.getDRALI_NUM_CLIENTE());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertReporteDetalleGIS(
            ReporteDetalleGIS obj_rep_brechas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_DET_GIS(?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_brechas.getDPREP_CODIGO());
        parametros.add(obj_rep_brechas.getDREDG_CLI_GIS_CONEXION());
        parametros.add(obj_rep_brechas.getDREDG_CLI_SIN_CARGA());
        parametros.add(obj_rep_brechas.getDREDG_CUE_NULA());
        parametros.add(obj_rep_brechas.getDREDG_CUE_BAJA());
        parametros.add(obj_rep_brechas.getDREDG_CLI_REPETIDO());
        parametros.add(obj_rep_brechas.getDREDG_CLI_DESCONECTADOS());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    /*public String insertUsuario(ReporteUsuario objUsuario)throws Exception{
		String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_USUARIO_REPORTE(?,?,?,?,?)";
		ArrayList<Object> parametros = new ArrayList<Object>();
		parametros.add(objUsuario.getCuentaUsuario());
		parametros.add(objUsuario.getCodigoROL());
		parametros.add(objUsuario.getCodigoUsuario());
                parametros.add(objUsuario.getNombreUsuario());
                parametros.add(objUsuario.getEstadoUsuario());
		Object msg = dbo.SQL_CALL_FUNCTION(sql_fun,parametros);
		return msg.toString();
     }*/
    public ArrayList<HashMap<String, Object>> selectUsuarioReporte(String cuentaUsuario) throws Exception {
        ArrayList<HashMap<String, Object>> usuario = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_USUARIO_REPORTE(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuentaUsuario);
        usuario = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return usuario;
    }

    /* TRAFOS REPETIDOS */
    public ArrayList<HashMap<String, Object>> selecttTrafosRepetidos() throws Exception {
        ArrayList<HashMap<String, Object>> listTrafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_REPETIDOS(?)";
        listTrafos = dbo.SQL_CALL_PROCEDURE(sql);
        return listTrafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosDepartamento(String codigoUnidad) throws Exception {
        ArrayList<HashMap<String, Object>> trafosD = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_DEPARTAMENTO(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoUnidad);
        trafosD = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return trafosD;
    }

    public ArrayList<HashMap<String, Object>> selectDetTrafosDepartamento(String codigoUnidad) throws Exception {
        ArrayList<HashMap<String, Object>> trafosD = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_DET_TRAFOS_DEPAR(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoUnidad);
        trafosD = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return trafosD;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSinCarga() throws Exception {
        ArrayList<HashMap<String, Object>> listTrafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_SIN_CARGA(?)";
        listTrafos = dbo.SQL_CALL_PROCEDURE(sql);
        return listTrafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosDesconectados() throws Exception {
        ArrayList<HashMap<String, Object>> listTrafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_DESCONECTADOS(?)";
        listTrafos = dbo.SQL_CALL_PROCEDURE(sql);
        return listTrafos;
    }

    public ArrayList<HashMap<String, Object>> selecttTrafosSobrecargados(Number may, Number men) throws Exception {
        ArrayList<HashMap<String, Object>> listTrafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_SOBRECARGADOS(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(may);
        parametros.add(men);
        listTrafos = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return listTrafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSobrecargadosDepartamento(String objectID) throws Exception {
        ArrayList<HashMap<String, Object>> trafosD = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_SOBRECAR_DEP(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(objectID);
        trafosD = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return trafosD;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosUsuario(String codigoU) throws Exception {
        ArrayList<HashMap<String, Object>> reporteUsuario = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_TRAFOS_USER(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoU);
        reporteUsuario = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteUsuario;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaSinCarga(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_FECHA_SCA(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaSobrecargados(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_FECHA_SOB(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaRepetidos(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_FECHA_REP(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectHistorialReportesTrafos(Date fecha, Date fecha2, String usuario) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HISTORIAL_REPOR_TRAF(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(usuario);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoSinCarga(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_SELE_SCA(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoSobrecargados(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_SELE_SOB(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoRepetidos(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPOR_TRAF_SELE_REP(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public String insertarReporteTrafos(
            ReporteTrafos obj_rep_trafos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REPORTE_TRAFOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos.getCUENTA_USUARIO());
        parametros.add(obj_rep_trafos.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarReporteTrafosRepetidos(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REP_TRAF_REPETIDOS(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    /*public void insertarReporteTrafosRepetidos2(
            ReporteTrafosDepartamentos obj_rep_trafos_d
	)throws Exception{
		String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_INSERT_REP_TRAF_REPETIDOS(?,?,?)";
		ArrayList<Object> parametros = new ArrayList<Object>();
		parametros.add(obj_rep_trafos_d.getCODIGO());
                parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
                parametros.add(obj_rep_trafos_d.getCANTIDAD());
		dbo.SQL_CALL_FUNCTION(sql_fun,parametros);
    }*/
    public String insertarReporteTrafosSinCarga(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REP_TRAF_SIN_CARGA(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarReporteTrafosSobrecargados(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_REP_TRAF_SOBRECARGA(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectContratistas() throws Exception {
        ArrayList<HashMap<String, Object>> listTrafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_CONTRATISTAS(?)";
        listTrafos = dbo.SQL_CALL_PROCEDURE(sql);
        return listTrafos;
    }

    public String insertarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_CONTRATISTAS(?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_contratistas.getDPNUM_CONTRA_CEDULA());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_NOMBRE());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_APELLIDO());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_DIRECCION());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_CELULAR());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_EMAIL());
        parametros.add(obj_contratistas.getDPRUS_CUENTA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String actualizarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_UPDATE_CONTRATISTAS(?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_contratistas.getDPNUM_CONTRA_COD());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_CEDULA());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_NOMBRE());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_APELLIDO());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_DIRECCION());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_CELULAR());
        parametros.add(obj_contratistas.getDPNUM_CONTRA_EMAIL());
        parametros.add(obj_contratistas.getDPRUS_CUENTA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String eliminarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_DELETE_CONTRATISTAS(?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_contratistas.getDPNUM_CONTRA_COD());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectClaseEquipo() throws Exception {
        ArrayList<HashMap<String, Object>> listclases = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_CLASES_EQUIPO(?)";
        listclases = dbo.SQL_CALL_PROCEDURE(sql);
        return listclases;
    }

    public ArrayList<HashMap<String, Object>> selectTipoEquipos(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> reporteProvinciaGis = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TIPO_EQUIPO(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        reporteProvinciaGis = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteProvinciaGis;
    }

    public ArrayList<HashMap<String, Object>> selectNumeracionFinal(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> numeracionFinal = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_NUMERACION_FINAL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        numeracionFinal = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return numeracionFinal;
    }

    public String insertarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_ASIGNACION(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_enumEquipos.getDPNUM_CONTRA_COD());
        parametros.add(obj_enumEquipos.getDPNUM_TIPO_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMINFER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_FECHA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_SECTOR());
        parametros.add(obj_enumEquipos.getDPRUS_CUENTA());
        parametros.add(obj_enumEquipos.getDPNUM_CLAS_COD());
        parametros.add(obj_enumEquipos.getDPNUM_CERTIFICADO());
        parametros.add(obj_enumEquipos.getDPNUM_NUM_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_ANIO_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_GRUPOS());
        parametros.add(obj_enumEquipos.getOPCION());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }
    public ArrayList<HashMap<String, Object>> selectAsignacionFinal(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> numeracionFinal = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_ASIGNACION_FINAL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        numeracionFinal = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return numeracionFinal;
    }

    public String actualizarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_UPDATE_ENUMERACION_FINAL(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_COD());
        parametros.add(obj_enumEquipos.getDPNUM_CONTRA_COD());
        parametros.add(obj_enumEquipos.getDPNUM_TIPO_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMINFER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_FECHA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_SECTOR());
        parametros.add(obj_enumEquipos.getDPRUS_CUENTA());
        parametros.add(obj_enumEquipos.getDPNUM_CLAS_COD());
        //agregado
        parametros.add(obj_enumEquipos.getDPNUM_NUM_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_ANIO_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_GRUPOS());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String eliminarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_DELETE_ENUMERACION_FINAL(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_FECHA());
        parametros.add(obj_enumEquipos.getDPRUS_CUENTA());
        parametros.add(obj_enumEquipos.getDPNUM_CLAS_COD());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectNumeracion() throws Exception {
        ArrayList<HashMap<String, Object>> listclases = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_NUMERACION(?)";
        listclases = dbo.SQL_CALL_PROCEDURE(sql);
        return listclases;
    }

    public String insertarNumeracionDevuelta(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_NUMERACION_DEV(?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_enumEquipos.getDPNUM_CONTRA_COD());
        parametros.add(obj_enumEquipos.getDPNUM_TIPO_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMINFER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_FECHA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_SECTOR());
        parametros.add(obj_enumEquipos.getDPRUS_CUENTA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD_ACTULIZADA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER_ACTUALIZADA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER_ACTUAL()); // nuevo parámetro esperado

        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        if (msg instanceof byte[]) {
            return new String((byte[]) msg, StandardCharsets.UTF_8);
        }
        return msg.toString();

    }

    public ArrayList<HashMap<String, Object>> selectNumeracionDev() throws Exception {
        ArrayList<HashMap<String, Object>> listclases = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_NUMERACION_DEV(?)";
        listclases = dbo.SQL_CALL_PROCEDURE(sql);
        return listclases;
    }

    public String insertarNumeracionEquipoDev(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_ASIGNACION_DEVUELTA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_enumEquipos.getDPNUM_CONTRA_COD());
        parametros.add(obj_enumEquipos.getDPNUM_TIPO_COD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_CANTIDAD());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMINFER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_NUMSUPER());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_FECHA());
        parametros.add(obj_enumEquipos.getDPNUM_EQUIP_SECTOR());
        parametros.add(obj_enumEquipos.getDPRUS_CUENTA());
        parametros.add(obj_enumEquipos.getDPNUM_CLAS_COD());
        //Agregado
        parametros.add(obj_enumEquipos.getDPNUM_NUM_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_ANIO_CONT());
        parametros.add(obj_enumEquipos.getDPNUM_GRUPOS());
        parametros.add(obj_enumEquipos.getDPNUM_NUMSUPER());

        parametros.add(obj_enumEquipos.getExpectedNUMINFER());
        parametros.add(obj_enumEquipos.getExpectedCANTIDAD());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        //Agregados
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectContratistaCedula(String cedula) throws Exception {
        ArrayList<HashMap<String, Object>> contratista = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_CONTRATISTA_CEDULA(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cedula);
        contratista = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return contratista;
    }

    public ArrayList<HashMap<String, Object>> selectReporteNumeracion(Date fecha, Date fecha2, Number contra, Number clase, String opcion) throws Exception {
        ArrayList<HashMap<String, Object>> contratista = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_REPORTE_NUMERACION(?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(contra);
        parametros.add(clase);
        parametros.add(opcion);
        contratista = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return contratista;
    }

    //Agregado por ANavas 16/12/2024
    public ArrayList<HashMap<String, Object>> selectReporteNumeracionByNumberEquip(Number numEquip, Number numEquipInferior,
            Number numEquipSuperior, Number clase) throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_NUM_ESTRUCTURAS(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(numEquip);
        parametros.add(numEquipInferior);
        parametros.add(numEquipSuperior);
        parametros.add(clase);
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteResultado;
    }

    public ArrayList<HashMap<String, Object>> selectSectores() throws Exception {
        ArrayList<HashMap<String, Object>> listSectores = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_SECTORES(?)";
        listSectores = dbo.SQL_CALL_PROCEDURE(sql);
        return listSectores;
    }

    public ArrayList<HashMap<String, Object>> selectReporteNumeracionSectores(String sector, Number clase, Date fechaInicial,
            Date fechaFinal, String anio) throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_NUM_SECTORES(?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(sector);
        parametros.add(clase);
        parametros.add(fechaInicial);
        parametros.add(fechaFinal);
        parametros.add(anio);
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteResultado;
    }

    public ArrayList<HashMap<String, Object>> selectPermisosNumeracion(String usuarioNombre) throws Exception {
        ArrayList<HashMap<String, Object>> listPermisos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_PERMISSION_TEQ(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(usuarioNombre);
        listPermisos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listPermisos;
    }

    public ArrayList<HashMap<String, Object>> selectClaseEquiposNumeracion(String usuarioNombre) throws Exception {
        ArrayList<HashMap<String, Object>> listclases = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_NUM_CLAS_EQUIPOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(usuarioNombre);
        listclases = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return listclases;
    }

    public ArrayList<HashMap<String, Object>> debeGenerarTicketEquipo(int equipo) throws Exception {
        ArrayList<HashMap<String, Object>> numeracionFinal = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SEL_GENERA_TICKET(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(equipo);
        numeracionFinal = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return numeracionFinal;
    }

    public String gestionarPermisosNumeracion(String usuarioNombre, Number codModulo, Number codClase, String operacion) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_ROLES_NUM(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(usuarioNombre);
        parametros.add(codModulo);
        parametros.add(codClase);
        parametros.add(operacion);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectReporteEquiposUsuarioFechas(String codigoU) throws Exception {
        ArrayList<HashMap<String, Object>> reporteUsuario = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_EQ_USER(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigoU);
        reporteUsuario = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteUsuario;
    }

    public ArrayList<HashMap<String, Object>> selectEqPostesRepetidos(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_POSTES_REPETIDOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public ArrayList<HashMap<String, Object>> selectEqCuchillaRepetidos(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_CUCHILLA_REPETIDOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public ArrayList<HashMap<String, Object>> selectEqFusibleRepetidos(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_FUSIBLE_REPETIDOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public ArrayList<HashMap<String, Object>> selectEqLuminariasRepetidos(Date fecha) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_LUMINARIAS_REPETIDOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    /*
    
    public ArrayList<HashMap<String, Object>> selectActualRepetidosProvincias(int opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "";
        if(opcion == 1){
            sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_ACTUAL_POSTES_PROV(?)";
        }else if(opcion ==2){
            sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_ACTUAL_CUCHILLAS_PROV(?)";
        }else if (opcion ==3){
            sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_ACTUAL_FUSIBLES_PROV(?)";
        }else{
            sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_ACTUAL_LUMINARIAS_PROV(?)";
        }

        ArrayList<Object> parametros = new ArrayList<Object>();

        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }
     */
    public ArrayList<HashMap<String, Object>> selectActualRepetidosProvincias(int opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_HISTORICO_PROV(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(opcion);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public ArrayList<HashMap<String, Object>> selectActualRepetidosDepartamentos(int opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_HISTORICO_DEP(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(opcion);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public String insertarReporteEquiposRepetidos(ReporteEquipos obj_rep_trafos) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_EQUIPOS_REPETIDOS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos.getCUENTA_USUARIO());
        parametros.add(obj_rep_trafos.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarReportePostesRepetidos(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_POSTES_REP(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarCuchillasRepetidos(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_CUCHILLAS_REP(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarFusiblesRepetidos(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_FUSIBLES_REP(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarLuminariasRepetidos(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_LUMINARIAS_REP(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectGlobalRepetidos(Date fecha, int opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listaRepetidos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_GLOB_CANT_REPETIDOS(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(opcion);
        listaRepetidos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listaRepetidos;
    }

    public int selectExistenDevoluciones(int tipo) throws Exception {
        ArrayList<HashMap<String, Object>> respuesta = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_EXISTEN_DEVOLUCIONES(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(tipo);
        respuesta = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        if (!respuesta.isEmpty()) {
            HashMap<String, Object> primeraFila = respuesta.get(0);
            Object valor = primeraFila.get("EXISTE");
            if (valor instanceof Integer) {
                return (int) valor;
            } else if (valor instanceof Number) {
                return ((Number) valor).intValue();
            } else if (valor instanceof String) {
                return Integer.parseInt((String) valor);
            }
        }
        return 0;
    }

    public ArrayList<HashMap<String, Object>> selectPermisosGestionContratistas(String usuarioNombre) throws Exception {
        ArrayList<HashMap<String, Object>> listPermisos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SEL_PERMISOS_CONTRATISTAS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(usuarioNombre);
        listPermisos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listPermisos;
    }

    public String gestionarRolesContratistas(String usuarioNombre, Number permiso) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_GEST_PERMISOS_CONTRATISTAS(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(usuarioNombre);
        parametros.add(permiso);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectRepetidosEstructurasDepartamento(Date fecha, Date fecha2, Number opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listPermisos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_EST_DEP(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(opcion);
        listPermisos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listPermisos;
    }

    public ArrayList<HashMap<String, Object>> selectRepetidosEstructurasProvincias(Date fecha, Date fecha2, Number opcion) throws Exception {
        ArrayList<HashMap<String, Object>> listPermisos = new ArrayList<HashMap<String, Object>>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_EST_PROV(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(opcion);
        listPermisos = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return listPermisos;
    }

    public String insertarPostesRepetidosProv(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_POSTES_REP_PROV(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarCuchillasRepetidosProv(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_CUCHILLAS_REP_PROV(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarFusiblesRepetidosProv(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_FUSIBLES_REP_PROV(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarLuminariasRepetidosProv(
            ReporteEquiposDepartamentos obj_rep_trafos_d
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_INSERT_LUMINARIAS_REP_PROV(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_rep_trafos_d.getCODIGO());
        parametros.add(obj_rep_trafos_d.getDEPARTAMENTO());
        parametros.add(obj_rep_trafos_d.getCANTIDAD());
        parametros.add(obj_rep_trafos_d.getFECHA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectCertificacionesBusquedaControl(Number codigo, Number nmin, Number nmax) throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_NUM_CERTIF(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        parametros.add(nmin);
        parametros.add(nmax);
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteResultado;
    }

    //Sirve para encontrar los datos de una enumeracion en concreto.
    public ArrayList<HashMap<String, Object>> selectCertificacionPorNumeracion(Number codigo, Number valor) throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_CERTIF(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        parametros.add(valor);
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteResultado;
    }

    /*
    public ArrayList<HashMap<String, Object>> selectContrato() throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_CONTRATOS(?)";
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun);
        return reporteResultado;
    }*/
    public ArrayList<HashMap<String, Object>> selectSeccionesNumeracion() throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_SECCIONES_NUM(?)";
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun);
        return reporteResultado;
    }

    public ArrayList<HashMap<String, Object>> selectObjExcluidosPorTipo(String tipo) throws Exception {
        ArrayList<HashMap<String, Object>> reporteResultado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_OBJ_EXCLUIDOS(?, ?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(tipo);
        reporteResultado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteResultado;
    }

    //Fin Agregado por ANavas 16/12/2024
    // Perdidas
    public ArrayList<HashMap<String, Object>> selectLumAlimCanton() throws Exception {
        ArrayList<HashMap<String, Object>> luminarias = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_LUM_ALI_CANTON(?)";
        luminarias = dbo.SQL_CALL_PROCEDURE(sql);
        return luminarias;
    }

    public ArrayList<HashMap<String, Object>> selectSemCanton() throws Exception {
        ArrayList<HashMap<String, Object>> semaforo = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_SEM_CANTON(?)";
        semaforo = dbo.SQL_CALL_PROCEDURE(sql);
        return semaforo;
    }

    public String insertarPE(String cuenta, String fecha, String coment, String opcion) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_PERDIDAS_E(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        parametros.add(fecha);
        parametros.add(coment);
        parametros.add(opcion);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarDetPerCLi(String codigo, String alim, Number num_abo, Number total) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_PERDIDAS_DET_CLI(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        parametros.add(alim);
        parametros.add(num_abo);
        parametros.add(total);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarDetalleAP(
            AlumbradoPublico obj_AP
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_DET_ALUMBRADO_PUBLICO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_AP.getDPRAP_CODIGO());
        parametros.add(obj_AP.getDRPAD_ANIO());
        parametros.add(obj_AP.getDRPAD_MES());
        parametros.add(obj_AP.getDRPAD_NOM_A());
        parametros.add(obj_AP.getDRPAD_ALIM_ID());
        parametros.add(obj_AP.getDRPAD_TIPO_P());
        parametros.add(obj_AP.getDRPAD_TIPO_L());
        parametros.add(obj_AP.getDRPAD_NUM_LUM());
        parametros.add(obj_AP.getDRPAD_POT_L1());
        parametros.add(obj_AP.getDRPAD_HORAS_F1());
        parametros.add(obj_AP.getDRPAD_CA());
        parametros.add(obj_AP.getDRPAD_POT_L2());
        parametros.add(obj_AP.getDRPAD_HORAS_F2());
        parametros.add(obj_AP.getDRPAD_FU());
        parametros.add(obj_AP.getDRPAD_FU2());
        parametros.add(obj_AP.getDRPAD_CAI());
        parametros.add(obj_AP.getDRPAD_CAI2());
        parametros.add(obj_AP.getDRPAD_T_MES());
        parametros.add(obj_AP.getDRPAD_CONSUMO());
        parametros.add(obj_AP.getDRPAD_CANTON());
        parametros.add(obj_AP.getDRPAD_BM());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectHistorialPE(Date fecha, Date fecha2, String usuario, String opcion) throws Exception {
        ArrayList<HashMap<String, Object>> reporteAlumP = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HISTORIA_PERDIDAS(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(usuario);
        parametros.add(opcion);
        reporteAlumP = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteAlumP;
    }

    public ArrayList<HashMap<String, Object>> selectHistAlumSel(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> alumbrado = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HIST_ALUM_SEL (?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        alumbrado = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return alumbrado;
    }

    public ArrayList<HashMap<String, Object>> selectHistCliECSel(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> cliEC = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HIST_CLIEC_SEL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        cliEC = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return cliEC;
    }

    //Proyectos Liquidados
    public ArrayList<HashMap<String, Object>> selectInventarioFinalPL(String valor, String opcion) throws Exception {
        ArrayList<HashMap<String, Object>> InvFinal = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_INVENTARIO_FINALPL(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(valor);
        parametros.add(opcion);
        InvFinal = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return InvFinal;
    }

    public ArrayList<HashMap<String, Object>> selectInventarioInicialPL(String valor, String opcion) throws Exception {
        ArrayList<HashMap<String, Object>> InvFinal = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_INVENTARIO_INICIALPL(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(valor);
        parametros.add(opcion);
        InvFinal = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return InvFinal;
    }

    public ArrayList<HashMap<String, Object>> selectInventarioFinalPLCOD(String cod, String anio) throws Exception {
        ArrayList<HashMap<String, Object>> InvFinal = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_INVENTARIO_FINALPL_C(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cod);
        parametros.add(anio);
        InvFinal = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return InvFinal;
    }

    public ArrayList<HashMap<String, Object>> selectInventarioInicialPLCOD(String cod, String anio) throws Exception {
        ArrayList<HashMap<String, Object>> InvFinal = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_INVENTARIO_INIPL_C(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cod);
        parametros.add(anio);
        InvFinal = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return InvFinal;
    }

    //Gestion Usuarios
    public ArrayList<HashMap<String, Object>> selectRoles() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_ROLES(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectUsuarios() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_USUARIOS(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public String bloquearUsuario(
            Usuarios obj_usuario
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_BLOQUEAR_USUARIO(?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_usuario.getDPRUS_CUENTA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectUsuarioCuenta(String cuenta) throws Exception {
        ArrayList<HashMap<String, Object>> contratista = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_USUARIO_CUENTA(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        contratista = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return contratista;
    }

    public String insertarUsuario(
            Usuarios obj_usuarios
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_USUARIO(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_usuarios.getDPRUS_CUENTA());
        parametros.add(obj_usuarios.getDPROL_CODIGO());
        parametros.add(obj_usuarios.getDPRUS_DMPER_CODIGO());
        parametros.add(obj_usuarios.getDPRUS_NOM_EMP());
        parametros.add(obj_usuarios.getDPRUS_BLOQUEADO());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String actualizarUsuario(
            Usuarios obj_usuarios
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_UPDATE_USUARIO(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_usuarios.getDPRUS_CUENTA());
        parametros.add(obj_usuarios.getDPROL_CODIGO());
        parametros.add(obj_usuarios.getDPRUS_DMPER_CODIGO());
        parametros.add(obj_usuarios.getDPRUS_NOM_EMP());
        parametros.add(obj_usuarios.getDPRUS_BLOQUEADO());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectModulos() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_MODULOS(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectModuloUsuario(String cuenta) throws Exception {
        ArrayList<HashMap<String, Object>> contratista = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_MODULO_USUARIO(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        contratista = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return contratista;
    }

    public ArrayList<HashMap<String, Object>> selectModuloAsignado(String cuenta, String codM) throws Exception {
        ArrayList<HashMap<String, Object>> contratista = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_MODULO_ASIGNADO(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        parametros.add(codM);
        contratista = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return contratista;
    }

    public String insertarModuloAsignado(String cuenta, String codM) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_ASIGNACION_M(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        parametros.add(codM);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String deleteModuloAsignado(String cuenta, String codM) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_DELETE_ASIGNACION_M(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        parametros.add(codM);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectModulosUsuario(String cuenta) throws Exception {
        ArrayList<HashMap<String, Object>> modulos = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_USUARIO_MOD(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        modulos = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return modulos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosAereos() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_AEREOS(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosPreesamblados() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_PREESAMBLADOS(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSubterraneos() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_SUBTERRANEOS(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosPreesambladosSub() throws Exception {
        ArrayList<HashMap<String, Object>> usuarios = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_PRESUBTE(?)";
        usuarios = dbo.SQL_CALL_PROCEDURE(sql);
        return usuarios;
    }

    public ArrayList<HashMap<String, Object>> selectMaterialesPL(String cod) throws Exception {
        ArrayList<HashMap<String, Object>> materiales = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_MATERIALESPL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cod);
        materiales = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return materiales;
    }

    public ArrayList<HashMap<String, Object>> selectPotencia(String valor) throws Exception {
        ArrayList<HashMap<String, Object>> materiales = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_POTENCIA(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(valor);
        materiales = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return materiales;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaLongA() throws Exception {
        ArrayList<HashMap<String, Object>> trafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_MED_LONGA(?)";
        trafos = dbo.SQL_CALL_PROCEDURE(sql);
        return trafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaLongS() throws Exception {
        ArrayList<HashMap<String, Object>> trafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_MED_LONGS(?)";
        trafos = dbo.SQL_CALL_PROCEDURE(sql);
        return trafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaMono() throws Exception {
        ArrayList<HashMap<String, Object>> trafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_MED_MONO(?)";
        trafos = dbo.SQL_CALL_PROCEDURE(sql);
        return trafos;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaTrifa() throws Exception {
        ArrayList<HashMap<String, Object>> trafos = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_TRAFOS_MED_TRIFA(?)";
        trafos = dbo.SQL_CALL_PROCEDURE(sql);
        return trafos;
    }

    public String insertarInfraestructura(String cuenta, String fecha, String opcion) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_INFRAESTRUCTURA(?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(cuenta);
        parametros.add(fecha);
        parametros.add(opcion);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarDetalleInfRS(
            RedesSecundarias obj_INF
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_DET_INF_REDES_S(?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_INF.getDPIRS_CODIGO());
        parametros.add(obj_INF.getDPIRS_TIPO_RED());
        parametros.add(obj_INF.getDPIRS_INSTALACION());
        parametros.add(obj_INF.getDPIRS_MONO_CANT());
        parametros.add(obj_INF.getDPIRS_BIFA_CANT());
        parametros.add(obj_INF.getDPIRS_TRIFA_CANT());
        parametros.add(obj_INF.getDPIRS_MONO_LONG());
        parametros.add(obj_INF.getDPIRS_BIFA_LONG());
        parametros.add(obj_INF.getDPIRS_TRIFA_LONG());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public String insertarDetalleInfMT(
            RedesMT obj_INF
    ) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_INSERT_DET_INF_REDES_MT(?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(obj_INF.getDPRMT_CODIGO());
        parametros.add(obj_INF.getDIDMT_NOM_ALI());
        parametros.add(obj_INF.getDIDMT_ALIM_ID());
        parametros.add(obj_INF.getDIDMT_LONG_MONO());
        parametros.add(obj_INF.getDIDMT_LONG_BIFA());
        parametros.add(obj_INF.getDIDMT_LONG_TRIFA());
        parametros.add(obj_INF.getDIDMT_TRAM_MONO());
        parametros.add(obj_INF.getDIDMT_TRAM_TRIFA());
        parametros.add(obj_INF.getDIDMT_POTE_MONO());
        parametros.add(obj_INF.getDIDMT_POTE_TRIFA());
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectHistInfraestructura(Date fecha, Date fecha2, String usuario, String opcion) throws Exception {
        ArrayList<HashMap<String, Object>> infraestructura = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HISTORIA_INFRAESTRUC(?,?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(usuario);
        parametros.add(opcion);
        infraestructura = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return infraestructura;
    }

    public ArrayList<HashMap<String, Object>> selectHistInfMT(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> infraestructura = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HIST_INFRMT_SEL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        infraestructura = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return infraestructura;
    }

    public ArrayList<HashMap<String, Object>> selectHistInfRS(String codigo) throws Exception {
        ArrayList<HashMap<String, Object>> infraestructura = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_HIST_INFRS_SEL(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(codigo);
        infraestructura = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return infraestructura;
    }

    public String updateClienteA(String fecha) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE.F_UPDATE_CLI_ALI(?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        Object msg = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return msg.toString();
    }

    public ArrayList<HashMap<String, Object>> selectECA(String fecha) throws Exception {
        ArrayList<HashMap<String, Object>> clientes = new ArrayList<HashMap<String, Object>>();
        String sql = "REPORTES_GIS.PKG_DBS_REPORTE.SP_SELECT_EC_CLI_ALI(?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        clientes = dbo.SQL_CALL_PROCEDURE(sql, parametros);
        return clientes;
    }

    //verificacion concurrencia
    public String verificarNumeracionDisponible(Number tipoCod, Number numInferior, Number numSuperior, Number equipCod) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.F_VERIFICAR_NUMERACION(?, ?, ?, ?)"; // <- 4 parámetros
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(tipoCod);
        parametros.add(numInferior);
        parametros.add(numSuperior);
        parametros.add(equipCod); // <- nuevo parámetro
        Object resultado = dbo.SQL_CALL_FUNCTION(sql_fun, parametros);
        return resultado.toString();
    }

    //Años de los contratos:
    public ArrayList<HashMap<String, Object>> selectAniosContratos() throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_ANIOS_CONTRATOS(?)";
        return dbo.SQL_CALL_PROCEDURE(sql_fun);
    }
    //Contratos por años

    public ArrayList<HashMap<String, Object>> selectContratosPorAnio(String anio) throws Exception {
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_CONTRATOS_ANIO(?, ?)";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(anio); // este es el parámetro IN_ANIO
        return dbo.SQL_CALL_PROCEDURE(sql_fun, params);
    }
    //reporte estructuras repetidas

    public ArrayList<HashMap<String, Object>> selectHistorialReportesRepetidos(Date fecha, Date fecha2, String usuario) throws Exception {
        ArrayList<HashMap<String, Object>> reporteRepetidos = new ArrayList<HashMap<String, Object>>();
        String sql_fun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_HIST_REPETIDOS(?,?,?,?)";
        ArrayList<Object> parametros = new ArrayList<Object>();
        parametros.add(fecha);
        parametros.add(fecha2);
        parametros.add(usuario);
        reporteRepetidos = dbo.SQL_CALL_PROCEDURE(sql_fun, parametros);
        return reporteRepetidos;
    }
    // SOLO UNA FECHA

    public ArrayList<HashMap<String, Object>> selectRepetidosEstructurasUnaFecha(Date fecha, int opcion) throws Exception {
        ArrayList<HashMap<String, Object>> resultados = new ArrayList<>();
        String sqlFun = "REPORTES_GIS.PKG_DBS_REPORTE_2024.SP_SELECT_REP_EST_PROV_UF(?, ?, ?)";
        ArrayList<Object> parametros = new ArrayList<>();
        parametros.add(fecha);
        parametros.add(opcion);
        resultados = dbo.SQL_CALL_PROCEDURE(sqlFun, parametros);
        return resultados;
    }

}
