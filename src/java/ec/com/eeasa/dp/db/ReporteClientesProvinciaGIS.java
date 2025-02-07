/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp.db;

import java.util.Date;

/**
 *
 * @author emanzano
 */
public class ReporteClientesProvinciaGIS {
    private Number DPREP_CODIGO;
    private String DRCPG_COD_PROV;
    private Number DRCPG_CANTIDAD;
    private Date DRCPG_FECHA;
    
    public ReporteClientesProvinciaGIS(){}

    public ReporteClientesProvinciaGIS(Number DPREP_CODIGO, String DRCPG_COD_PROV, Number DRCPG_CANTIDAD, Date DRCPG_FECHA) {
        this.setDPREP_CODIGO(DPREP_CODIGO);
        this.setDRCPG_COD_PROV(DRCPG_COD_PROV);
        this.setDRCPG_CANTIDAD(DRCPG_CANTIDAD);
        this.setDRCPG_FECHA(DRCPG_FECHA);
    }

    
    
    public Number getDPREP_CODIGO() {
        return DPREP_CODIGO;
    }

    public String getDRCPG_COD_PROV() {
        return DRCPG_COD_PROV;
    }

    public Number getDRCPG_CANTIDAD() {
        return DRCPG_CANTIDAD;
    }

    public Date getDRCPG_FECHA() {
        return DRCPG_FECHA;
    }

    public void setDPREP_CODIGO(Number DPREP_CODIGO) {
        this.DPREP_CODIGO = DPREP_CODIGO;
    }

    public void setDRCPG_COD_PROV(String DRCPG_COD_PROV) {
        this.DRCPG_COD_PROV = DRCPG_COD_PROV;
    }

    public void setDRCPG_CANTIDAD(Number DRCPG_CANTIDAD) {
        this.DRCPG_CANTIDAD = DRCPG_CANTIDAD;
    }

    public void setDRCPG_FECHA(Date DRCPG_FECHA) {
        this.DRCPG_FECHA = DRCPG_FECHA;
    }
    
    
}
