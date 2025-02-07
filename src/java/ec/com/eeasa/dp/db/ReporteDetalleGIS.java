/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp.db;

/**
 *
 * @author emanzano
 */
public class ReporteDetalleGIS {
    private Number DPREP_CODIGO;
    private Number DREDG_CLI_GIS_CONEXION;
    private Number DREDG_CLI_SIN_CARGA;
    private Number DREDG_CUE_NULA;
    private Number DREDG_CUE_BAJA;
    private Number DREDG_CLI_REPETIDO;
    private Number DREDG_CLI_DESCONECTADOS;
            
    public ReporteDetalleGIS(){}

    public ReporteDetalleGIS(Number DPREP_CODIGO, Number DREDG_CLI_GIS_CONEXION, Number DREDG_CLI_SIN_CARGA, Number DREDG_CUE_NULA, Number DREDG_CUE_BAJA, Number DREDG_CLI_REPETIDO,Number DREDG_CLI_DESCONECTADOS) {
        this.setDPREP_CODIGO(DPREP_CODIGO);
        this.setDREDG_CLI_GIS_CONEXION(DREDG_CLI_GIS_CONEXION);
        this.setDREDG_CLI_SIN_CARGA(DREDG_CLI_SIN_CARGA);
        this.setDREDG_CUE_NULA(DREDG_CUE_NULA);
        this.setDREDG_CUE_BAJA(DREDG_CUE_BAJA);
        this.setDREDG_CLI_REPETIDO(DREDG_CLI_REPETIDO);
        this.setDREDG_CLI_DESCONECTADOS(DREDG_CLI_DESCONECTADOS);
    }

    
    public Number getDPREP_CODIGO() {
        return DPREP_CODIGO;
    }

    public Number getDREDG_CLI_GIS_CONEXION() {
        return DREDG_CLI_GIS_CONEXION;
    }

    public Number getDREDG_CLI_SIN_CARGA() {
        return DREDG_CLI_SIN_CARGA;
    }

    public Number getDREDG_CUE_NULA() {
        return DREDG_CUE_NULA;
    }

    public Number getDREDG_CUE_BAJA() {
        return DREDG_CUE_BAJA;
    }

    public Number getDREDG_CLI_DESCONECTADOS() {
        return DREDG_CLI_DESCONECTADOS;
    }

    public void setDREDG_CLI_DESCONECTADOS(Number DREDG_CLI_DESCONECTADOS) {
        this.DREDG_CLI_DESCONECTADOS = DREDG_CLI_DESCONECTADOS;
    }
    

    public Number getDREDG_CLI_REPETIDO() {
        return DREDG_CLI_REPETIDO;
    }

    public void setDPREP_CODIGO(Number DPREP_CODIGO) {
        this.DPREP_CODIGO = DPREP_CODIGO;
    }

    public void setDREDG_CLI_GIS_CONEXION(Number DREDG_CLI_GIS_CONEXION) {
        this.DREDG_CLI_GIS_CONEXION = DREDG_CLI_GIS_CONEXION;
    }

    public void setDREDG_CLI_SIN_CARGA(Number DREDG_CLI_SIN_CARGA) {
        this.DREDG_CLI_SIN_CARGA = DREDG_CLI_SIN_CARGA;
    }

    public void setDREDG_CUE_NULA(Number DREDG_CUE_NULA) {
        this.DREDG_CUE_NULA = DREDG_CUE_NULA;
    }

    public void setDREDG_CUE_BAJA(Number DREDG_CUE_BAJA) {
        this.DREDG_CUE_BAJA = DREDG_CUE_BAJA;
    }

    public void setDREDG_CLI_REPETIDO(Number DREDG_CLI_REPETIDO) {
        this.DREDG_CLI_REPETIDO = DREDG_CLI_REPETIDO;
    }
    
    
}
