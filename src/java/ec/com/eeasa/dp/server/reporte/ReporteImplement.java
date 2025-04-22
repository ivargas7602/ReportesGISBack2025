/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp.server.reporte;

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
import ec.com.eeasa.dp.server.ReportesRemoteServiceServlet;
import ec.com.eeasa.dp.server.factory.ReporteBrechasFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.ws.rs.QueryParam;

/**
 *
 * @author emanzano
 */
public class ReporteImplement extends ReportesRemoteServiceServlet {

    public ArrayList<HashMap<String, Object>> selectAllReportesC() throws Exception {
        ReporteBrechasFactory objReportesC = new ReporteBrechasFactory(getDB());
        return objReportesC.selectAllComercial();
    }

    public ArrayList<HashMap<String, Object>> selectAllReportesG() throws Exception {
        ReporteBrechasFactory objReportesC = new ReporteBrechasFactory(getDB());
        return objReportesC.selectAllGiss();
    }

    public ArrayList<HashMap<String, Object>> selectComercial() throws Exception {
        ReporteBrechasFactory objComericial = new ReporteBrechasFactory(getDB());
        return objComericial.selectComercial();
    }

    public ArrayList<HashMap<String, Object>> selectGis() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGis();
    }

    public ArrayList<HashMap<String, Object>> selectGisDesconectados() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisDesconectados();
    }

    public ArrayList<HashMap<String, Object>> selectGisSinCarga() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisSinCarga();
    }

    public ArrayList<HashMap<String, Object>> selectGisCuentaNula() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisCuentaNula();
    }

    public ArrayList<HashMap<String, Object>> selectGisCuentaBaja() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisCuentaBaja();
    }

    public ArrayList<HashMap<String, Object>> selectGisRepetidos() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisRepetidos();
    }

    public ArrayList<HashMap<String, Object>> selectGisAlimentador() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisAlimentador();
    }

    public ArrayList<HashMap<String, Object>> selectGisFotovotaico() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisFotovotaico();
    }

    public ArrayList<HashMap<String, Object>> selectGisMediaTension() throws Exception {
        ReporteBrechasFactory objGis = new ReporteBrechasFactory(getDB());
        return objGis.selectGisMediaTension();
    }

    public ArrayList<HashMap<String, Object>> selectComercialFaltantes() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectComercialFaltantes();
    }

    public ArrayList<HashMap<String, Object>> selectComercialFaltantesCuenta() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectComercialFaltantesCuenta();
    }

    public ArrayList<HashMap<String, Object>> selectNumeroReporte() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectNumeroReporte();
    }

    public ArrayList<HashMap<String, Object>> selectUsuario() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectUsuario();
    }

    public ArrayList<HashMap<String, Object>> selectDetalleClientesFaltantes() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectDetalleClientesFaltantes();
    }

    public ArrayList<HashMap<String, Object>> selectNombreAlimentador() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectNombreAlimentador();
    }

    public ArrayList<HashMap<String, Object>> selectReporteSeleccionado(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteSeleccionado(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteUsuario(String codigoU) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteUsuario(codigoU);
    }

    public ArrayList<HashMap<String, Object>> selectReporteDetalleGis(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteDetalleGis(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteDetalleAlimentador(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteDetalleAlimentador(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteFaltantesDC(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteFaltantesDC(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaDC(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteProvinciaDC(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaGis(Number codigoR) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteProvinciaGis(codigoR);
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaDCFecha(String cod) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteProvinciaDCFecha(cod);
    }

    public ArrayList<HashMap<String, Object>> selectReporteProvinciaGisFecha(String cod) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteProvinciaGisFecha(cod);
    }

    public ArrayList<HashMap<String, Object>> selectHistorialReportes(Date fecha, Date fecha2, String usuario) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistorialReportes(fecha, fecha2, usuario);
    }

    public ArrayList<HashMap<String, Object>> selectUsuarioReporte(String cuentaUsuario) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectUsuarioReporte(cuentaUsuario);
    }

    public String insertUsuario(double codigoROL, String codigoUsuario, String cuentaUsuario, String nombreUsuario, String estadoUsuario) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertUsuario(codigoROL, codigoUsuario, cuentaUsuario, nombreUsuario, estadoUsuario);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "El registro no fue almacenado";
        }
    }

    public String insertReporteBrechas(
            ReporteBrechas obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteBrechas(obj_rep_brechas);
        return result;
    }

    public String insertReporteClientesFaltantesDC(
            ReporteClientesFaltantesDC obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteClientesFaltantesDC(obj_rep_brechas);
        return result;
    }

    public String insertReporteClientesProvinciaDC(
            ReporteClientesProvinciaDC obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteClientesProvinciaDC(obj_rep_brechas);
        return result;
    }

    public String insertReporteClientesProvinciaGIS(
            ReporteClientesProvinciaGIS obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteClientesProvinciaGIS(obj_rep_brechas);
        return result;
    }

    public String insertReporteDetalleAlimentador(
            ReporteDetalleAlimentador obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteDetalleAlimentador(obj_rep_brechas);
        return result;
    }

    public String insertReporteDetalleGIS(
            ReporteDetalleGIS obj_rep_brechas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertReporteDetalleGIS(obj_rep_brechas);
        return result;
    }

    /* Trafos */
    public ArrayList<HashMap<String, Object>> selecttTrafosRepetidos() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selecttTrafosRepetidos();
    }

    public ArrayList<HashMap<String, Object>> selecTrafosDepartamento(String codigoUnidad) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosDepartamento(codigoUnidad);
    }

    public ArrayList<HashMap<String, Object>> selectDetTrafosDepartamento(String codigoUnidad) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectDetTrafosDepartamento(codigoUnidad);
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSinCarga() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosSinCarga();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosDesconectados() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosDesconectados();
    }

    public ArrayList<HashMap<String, Object>> selecttTrafosSobrecargados(Number may, Number men) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selecttTrafosSobrecargados(may, men);
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSobrecargadosDepartamento(String objectID) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosSobrecargadosDepartamento(objectID);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosUsuario(String codigoU) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosUsuario(codigoU);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaSinCarga(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosFechaSinCarga(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaSobrecargados(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosFechaSobrecargados(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosFechaRepetidos(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosFechaRepetidos(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectHistorialReportesTrafos(Date fecha, Date fecha2, String usuario) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistorialReportesTrafos(fecha, fecha2, usuario);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoSinCarga(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosSeleccionadoSinCarga(codigo);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoSobrecargados(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosSeleccionadoSobrecargados(codigo);
    }

    public ArrayList<HashMap<String, Object>> selectReporteTrafosSeleccionadoRepetidos(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteTrafosSeleccionadoRepetidos(codigo);
    }

    public String insertarReporteTrafos(
            ReporteTrafos obj_rep_trafos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReporteTrafos(obj_rep_trafos);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarReporteTrafosRepetidos(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReporteTrafosRepetidos(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    /*public void insertarReporteTrafosRepetidos2(
	    ReporteTrafosDepartamentos obj_rep_trafos_d
	)throws Exception{
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        objReporteBrechas.insertarReporteTrafosRepetidos(obj_rep_trafos_d);
        objReporteBrechas.insertarReporteTrafosRepetidos(obj_rep_trafos_d);
    }*/
    public String insertarReporteTrafosSinCarga(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReporteTrafosSinCarga(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarReporteTrafosSobrecargados(
            ReporteTrafosDepartamentos obj_rep_trafos_d
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReporteTrafosSobrecargados(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public ArrayList<HashMap<String, Object>> selectContratistas() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectContratistas();
    }

    public String insertarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarContratistas(obj_contratistas);
        return result;
    }

    public String actualizarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.actualizarContratistas(obj_contratistas);
        return result;
    }

    public String eliminarContratistas(
            Contratistas obj_contratistas
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.eliminarContratistas(obj_contratistas);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectClaseEquipo() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectClaseEquipo();
    }

    public ArrayList<HashMap<String, Object>> selectTipoEquipos(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTipoEquipos(codigo);
    }

    public ArrayList<HashMap<String, Object>> selectNumeracionFinal(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectNumeracionFinal(codigo);
    }

    public String insertarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarNumeracionEquipo(obj_enumEquipos);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectAsignacionFinal(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectAsignacionFinal(codigo);
    }

    public String actualizarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.actualizarNumeracionEquipo(obj_enumEquipos);
        return result;
    }

    public String eliminarNumeracionEquipo(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.eliminarNumeracionEquipo(obj_enumEquipos);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectNumeracion() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectNumeracion();
    }

    public String insertarNumeracionDevuelta(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarNumeracionDevuelta(obj_enumEquipos);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectNumeracionDev() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectNumeracionDev();
    }

    public String insertarNumeracionEquipoDev(
            EnumeracionEquipos obj_enumEquipos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarNumeracionEquipoDev(obj_enumEquipos);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectContratistaCedula(String cedula) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectContratistaCedula(cedula);
    }

    public ArrayList<HashMap<String, Object>> selectReporteNumeracion(Date fecha, Date fecha2, Number contra, Number clase, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteNumeracion(fecha, fecha2, contra, clase, opcion);
    }

    //Agregado por ANavas 16/12/2024
    public ArrayList<HashMap<String, Object>> selectReporteNumeracionByNumberEquip(Number numEquip, Number numEquipInferior,
            Number numEquipSuperior, Number clase) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteNumeracionByNumberEquip(numEquip, numEquipInferior, numEquipSuperior, clase);
    }

    public ArrayList<HashMap<String, Object>> selectSectores() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectSectores();
    }

    public ArrayList<HashMap<String, Object>> selectReporteNumeracionSectores(String sector, Number clase, Date fechaInicial,
            Date fechaFinal, String anio) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteNumeracionSectores(sector, clase, fechaInicial, fechaFinal, anio);
    }

    public ArrayList<HashMap<String, Object>> selectPermisosNumeracion(String usuarioNombre) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectPermisosNumeracion(usuarioNombre);
    }

    public ArrayList<HashMap<String, Object>> selectClaseEquiposNumeracion(String usuarioNombre) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectClaseEquiposNumeracion(usuarioNombre);
    }

    public String gestionarPermisosNumeracion(String usuarioNombre, Number codModulo, Number codClase, String operacion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.gestionarPermisosNumeracion(usuarioNombre, codModulo, codClase, operacion);
    }

    public ArrayList<HashMap<String, Object>> debeGenerarTicketEquipo(int equipo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.debeGenerarTicketEquipo(equipo);
    }
    
    public ArrayList<HashMap<String, Object>> selectReporteEquiposUsuarioFechas(String codigoU) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectReporteEquiposUsuarioFechas(codigoU);
    }

    public ArrayList<HashMap<String, Object>> selectEqPostesRepetidos(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectEqPostesRepetidos(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectEqCuchillaRepetidos(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectEqCuchillaRepetidos(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectEqFusibleRepetidos(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectEqFusibleRepetidos(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectEqLuminariasRepetidos(Date fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectEqLuminariasRepetidos(fecha);
    }

    public ArrayList<HashMap<String, Object>> selectActualRepetidosProvincias(int opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectActualRepetidosProvincias(opcion);
    }

    public ArrayList<HashMap<String, Object>> selectActualRepetidosDepartamentos(int opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectActualRepetidosDepartamentos(opcion);
    }

    public String insertarReporteEquiposRepetidos(
            ReporteEquipos obj_rep_trafos
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReporteEquiposRepetidos(obj_rep_trafos);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarReportePostesRepetidos(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarReportePostesRepetidos(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarCuchillasRepetidos(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarCuchillasRepetidos(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarFusiblesRepetidos(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarFusiblesRepetidos(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarLuminariasRepetidos(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarLuminariasRepetidos(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public ArrayList<HashMap<String, Object>> selectGlobalRepetidos(Date fecha, int opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectGlobalRepetidos(fecha, opcion);
    }
    
    public int selectExistenDevoluciones(int tipo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectExistenDevoluciones(tipo);
    }
    
    public ArrayList<HashMap<String, Object>> selectPermisosGestionContratistas(String usuarioNombre) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectPermisosGestionContratistas(usuarioNombre);
    }
    
    public String gestionarRolesContratistas(String usuarioNombre, Number permiso) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.gestionarRolesContratistas(usuarioNombre, permiso);
    }
    
    public ArrayList<HashMap<String, Object>> selectRepetidosEstructurasDepartamento(Date fecha, Date fecha2, Number opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectRepetidosEstructurasDepartamento(fecha, fecha2, opcion);
    }
    public ArrayList<HashMap<String, Object>> selectRepetidosEstructurasProvincias(Date fecha, Date fecha2, Number opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectRepetidosEstructurasProvincias(fecha, fecha2, opcion);
    }
    
    public String insertarReportePostesRepetidosProv(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarPostesRepetidosProv(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarCuchillasRepetidosProv(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarCuchillasRepetidosProv(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarFusiblesRepetidosProv(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarFusiblesRepetidosProv(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }

    public String insertarLuminariasRepetidosProv(ReporteEquiposDepartamentos obj_rep_trafos_d) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarLuminariasRepetidosProv(obj_rep_trafos_d);
        if (!result.isEmpty()) {
            return result;
        } else {
            return "0";
        }
    }
    
    public ArrayList<HashMap<String, Object>> selectCertificacionesBusquedaControl(Number codigo, Number nmin, Number nmax) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectCertificacionesBusquedaControl(codigo, nmin, nmax);
    }

    public ArrayList<HashMap<String, Object>> selectCertificacionPorNumeracion(Number codigo, Number valor) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectCertificacionPorNumeracion(codigo, valor);
    }
    
    public ArrayList<HashMap<String, Object>> selectContrato() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectContrato();
    }
    
    public ArrayList<HashMap<String, Object>> selectSeccionesNumeracion() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectSeccionesNumeracion();
    }
    
    public ArrayList<HashMap<String, Object>> selectObjExcluidosSobrecargados() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectObjExcluidosSobrecargados();
    }
    //Fin Agregado por ANavas 16/12/2024
    public String insertarPE(String cuenta, String fecha, String coment, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarPE(cuenta, fecha, coment, opcion);
        return result;
    }

    public String insertarDetPerCLi(String codigo, String alim, Number num_abo, Number total) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarDetPerCLi(codigo, alim, num_abo, total);
        return result;
    }

    public String insertarDetalleAP(
            AlumbradoPublico obj_AP
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarDetalleAP(obj_AP);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectHistorialPE(Date fecha, Date fecha2, String usuario, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistorialPE(fecha, fecha2, usuario, opcion);
    }

    public ArrayList<HashMap<String, Object>> selectHistAlumSel(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistAlumSel(codigo);
    }

    public ArrayList<HashMap<String, Object>> selectHistCliECSel(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistCliECSel(codigo);
    }

    // Perdidas
    public ArrayList<HashMap<String, Object>> selectLumAlimCanton() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectLumAlimCanton();
    }

    public ArrayList<HashMap<String, Object>> selectSemCanton() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectSemCanton();
    }

    // Proyectos Liquidados
    public ArrayList<HashMap<String, Object>> selectInventarioFinalPL(String valor, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectInventarioFinalPL(valor, opcion);
    }

    public ArrayList<HashMap<String, Object>> selectInventarioInicialPL(String valor, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectInventarioInicialPL(valor, opcion);
    }

    public ArrayList<HashMap<String, Object>> selectInventarioFinalPLCOD(String cod, String anio) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectInventarioFinalPLCOD(cod, anio);
    }

    public ArrayList<HashMap<String, Object>> selectInventarioInicialPLCOD(String cod, String anio) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectInventarioInicialPLCOD(cod, anio);
    }

    // Gestion Usuarios
    public ArrayList<HashMap<String, Object>> selectRoles() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectRoles();
    }

    public ArrayList<HashMap<String, Object>> selectUsuarios() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectUsuarios();
    }

    public String bloquearUsuario(
            Usuarios obj_usuario
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.bloquearUsuario(obj_usuario);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectUsuarioCuenta(String cuenta) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectUsuarioCuenta(cuenta);
    }

    public String insertarUsuario(
            Usuarios obj_usuarios
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarUsuario(obj_usuarios);
        return result;
    }

    public String actualizarUsuario(
            Usuarios obj_usuarios
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.actualizarUsuario(obj_usuarios);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectModulos() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectModulos();
    }

    public ArrayList<HashMap<String, Object>> selectModuloUsuario(String cuenta) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectModuloUsuario(cuenta);
    }

    public ArrayList<HashMap<String, Object>> selectModuloAsignado(String cuenta, String codM) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectModuloAsignado(cuenta, codM);
    }

    public ArrayList<HashMap<String, Object>> selectModulosUsuario(String cuenta) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectModulosUsuario(cuenta);
    }

    public String insertarModuloAsignado(String cuenta, String codM) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarModuloAsignado(cuenta, codM);
        return result;
    }

    public String deleteModuloAsignado(String cuenta, String codM) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.deleteModuloAsignado(cuenta, codM);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectTrafosAereos() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosAereos();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosPreesamblados() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosPreesamblados();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosSubterraneos() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosSubterraneos();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosPreesambladosSub() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosPreesambladosSub();
    }

    public ArrayList<HashMap<String, Object>> selectMaterialesPL(String cod) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectMaterialesPL(cod);
    }

    public ArrayList<HashMap<String, Object>> selectPotencia(String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectPotencia(opcion);
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaLongA() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosMediaLongA();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaLongS() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosMediaLongS();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaMono() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosMediaMono();
    }

    public ArrayList<HashMap<String, Object>> selectTrafosMediaTrifa() throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectTrafosMediaTrifa();
    }

    public String insertarInfraestructura(String cuenta, String fecha, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarInfraestructura(cuenta, fecha, opcion);
        return result;
    }

    public String insertarDetalleInfRS(
            RedesSecundarias obj_INF
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarDetalleInfRS(obj_INF);
        return result;
    }

    public String insertarDetalleInfMT(
            RedesMT obj_INF
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.insertarDetalleInfMT(obj_INF);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectHistInfraestructura(Date fecha, Date fecha2, String usuario, String opcion) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistInfraestructura(fecha, fecha2, usuario, opcion);
    }

    public ArrayList<HashMap<String, Object>> selectHistInfMT(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistInfMT(codigo);
    }

    public ArrayList<HashMap<String, Object>> selectHistInfRS(String codigo) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectHistInfRS(codigo);
    }

    /**/
    public String updateClienteA(
            String fecha
    ) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        String result = objReporteBrechas.updateClienteA(fecha);
        return result;
    }

    public ArrayList<HashMap<String, Object>> selectECA(String fecha) throws Exception {
        ReporteBrechasFactory objReporteBrechas = new ReporteBrechasFactory(getDB());
        return objReporteBrechas.selectECA(fecha);
    }

}
