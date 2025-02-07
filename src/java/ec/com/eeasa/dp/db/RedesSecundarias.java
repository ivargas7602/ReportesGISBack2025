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
public class RedesSecundarias {
    private Number DPIRS_CODIGO; 
    private String DPIRS_TIPO_RED; 
    private String DPIRS_INSTALACION; 
    private Number DPIRS_MONO_CANT; 
    private Number DPIRS_BIFA_CANT; 
    private Number DPIRS_TRIFA_CANT; 
    private Number DPIRS_MONO_LONG; 
    private Number DPIRS_BIFA_LONG; 
    private Number DPIRS_TRIFA_LONG;
    
    public RedesSecundarias(){
    }

    public RedesSecundarias(Number DPIRS_CODIGO, String DPIRS_TIPO_RED, String DPIRS_INSTALACION, Number DPIRS_MONO_CANT, Number DPIRS_BIFA_CANT, Number DPIRS_TRIFA_CANT, Number DPIRS_MONO_LONG, Number DPIRS_BIFA_LONG, Number DPIRS_TRIFA_LONG) {
        this.DPIRS_CODIGO = DPIRS_CODIGO;
        this.DPIRS_TIPO_RED = DPIRS_TIPO_RED;
        this.DPIRS_INSTALACION = DPIRS_INSTALACION;
        this.DPIRS_MONO_CANT = DPIRS_MONO_CANT;
        this.DPIRS_BIFA_CANT = DPIRS_BIFA_CANT;
        this.DPIRS_TRIFA_CANT = DPIRS_TRIFA_CANT;
        this.DPIRS_MONO_LONG = DPIRS_MONO_LONG;
        this.DPIRS_BIFA_LONG = DPIRS_BIFA_LONG;
        this.DPIRS_TRIFA_LONG = DPIRS_TRIFA_LONG;
    }

    public Number getDPIRS_CODIGO() {
        return DPIRS_CODIGO;
    }

    public String getDPIRS_TIPO_RED() {
        return DPIRS_TIPO_RED;
    }

    public String getDPIRS_INSTALACION() {
        return DPIRS_INSTALACION;
    }

    public Number getDPIRS_MONO_CANT() {
        return DPIRS_MONO_CANT;
    }

    public Number getDPIRS_BIFA_CANT() {
        return DPIRS_BIFA_CANT;
    }

    public Number getDPIRS_TRIFA_CANT() {
        return DPIRS_TRIFA_CANT;
    }

    public Number getDPIRS_MONO_LONG() {
        return DPIRS_MONO_LONG;
    }

    public Number getDPIRS_BIFA_LONG() {
        return DPIRS_BIFA_LONG;
    }

    public Number getDPIRS_TRIFA_LONG() {
        return DPIRS_TRIFA_LONG;
    }

    public void setDPIRS_CODIGO(Number DPIRS_CODIGO) {
        this.DPIRS_CODIGO = DPIRS_CODIGO;
    }

    public void setDPIRS_TIPO_RED(String DPIRS_TIPO_RED) {
        this.DPIRS_TIPO_RED = DPIRS_TIPO_RED;
    }

    public void setDPIRS_INSTALACION(String DPIRS_INSTALACION) {
        this.DPIRS_INSTALACION = DPIRS_INSTALACION;
    }

    public void setDPIRS_MONO_CANT(Number DPIRS_MONO_CANT) {
        this.DPIRS_MONO_CANT = DPIRS_MONO_CANT;
    }

    public void setDPIRS_BIFA_CANT(Number DPIRS_BIFA_CANT) {
        this.DPIRS_BIFA_CANT = DPIRS_BIFA_CANT;
    }

    public void setDPIRS_TRIFA_CANT(Number DPIRS_TRIFA_CANT) {
        this.DPIRS_TRIFA_CANT = DPIRS_TRIFA_CANT;
    }

    public void setDPIRS_MONO_LONG(Number DPIRS_MONO_LONG) {
        this.DPIRS_MONO_LONG = DPIRS_MONO_LONG;
    }

    public void setDPIRS_BIFA_LONG(Number DPIRS_BIFA_LONG) {
        this.DPIRS_BIFA_LONG = DPIRS_BIFA_LONG;
    }

    public void setDPIRS_TRIFA_LONG(Number DPIRS_TRIFA_LONG) {
        this.DPIRS_TRIFA_LONG = DPIRS_TRIFA_LONG;
    }
    
    
}
