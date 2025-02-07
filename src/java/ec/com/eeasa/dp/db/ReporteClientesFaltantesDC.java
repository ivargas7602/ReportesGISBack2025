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
public class ReporteClientesFaltantesDC {
     private Number DPREP_CODIGO;
     private String DREDC_ZONA;
     private Number DREDC_CANTIDAD;
     private Date DREDC_FECHA;
     
public ReporteClientesFaltantesDC(){
    
}

    public ReporteClientesFaltantesDC(Number DPREP_CODIGO, String DREDC_ZONA, Number DREDC_CANTIDAD, Date DREDC_FECHA) {
        this.setDPREP_CODIGO(DPREP_CODIGO);
        this.setDREDC_ZONA(DREDC_ZONA);
        this.setDREDC_CANTIDAD(DREDC_CANTIDAD);
        this.setDREDC_FECHA(DREDC_FECHA);
    }

    public void setDPREP_CODIGO(Number DPREP_CODIGO) {
        this.DPREP_CODIGO = DPREP_CODIGO;
    }

    public void setDREDC_ZONA(String DREDC_ZONA) {
        this.DREDC_ZONA = DREDC_ZONA;
    }

    public void setDREDC_CANTIDAD(Number DREDC_CANTIDAD) {
        this.DREDC_CANTIDAD = DREDC_CANTIDAD;
    }

    public void setDREDC_FECHA(Date DREDC_FECHA) {
        this.DREDC_FECHA = DREDC_FECHA;
    }

    public Number getDPREP_CODIGO() {
        return DPREP_CODIGO;
    }

    public String getDREDC_ZONA() {
        return DREDC_ZONA;
    }

    public Number getDREDC_CANTIDAD() {
        return DREDC_CANTIDAD;
    }

    public Date getDREDC_FECHA() {
        return DREDC_FECHA;
    }


}
