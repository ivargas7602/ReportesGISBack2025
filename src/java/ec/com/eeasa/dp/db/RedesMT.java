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
public class RedesMT {
     private Number DPRMT_CODIGO;
     private String DIDMT_NOM_ALI;
     private String DIDMT_ALIM_ID;
     private Number DIDMT_LONG_MONO;
     private Number DIDMT_LONG_BIFA;
     private Number DIDMT_LONG_TRIFA;
     private Number DIDMT_TRAM_MONO;
     private Number DIDMT_TRAM_TRIFA;
     private Number DIDMT_POTE_MONO;
     private Number DIDMT_POTE_TRIFA;
     
      public RedesMT(){
    }

    public RedesMT(Number DPRMT_CODIGO, String DIDMT_NOM_ALI, String DIDMT_ALIM_ID, Number DIDMT_LONG_MONO, Number DIDMT_LONG_BIFA, Number DIDMT_LONG_TRIFA, Number DIDMT_TRAM_MONO, Number DIDMT_TRAM_TRIFA, Number DIDMT_POTE_MONO, Number DIDMT_POTE_TRIFA) {
        this.DPRMT_CODIGO = DPRMT_CODIGO;
        this.DIDMT_NOM_ALI = DIDMT_NOM_ALI;
        this.DIDMT_ALIM_ID = DIDMT_ALIM_ID;
        this.DIDMT_LONG_MONO = DIDMT_LONG_MONO;
        this.DIDMT_LONG_BIFA = DIDMT_LONG_BIFA;
        this.DIDMT_LONG_TRIFA = DIDMT_LONG_TRIFA;
        this.DIDMT_TRAM_MONO = DIDMT_TRAM_MONO;
        this.DIDMT_TRAM_TRIFA = DIDMT_TRAM_TRIFA;
        this.DIDMT_POTE_MONO = DIDMT_POTE_MONO;
        this.DIDMT_POTE_TRIFA = DIDMT_POTE_TRIFA;
    }

    public Number getDPRMT_CODIGO() {
        return DPRMT_CODIGO;
    }

    public String getDIDMT_NOM_ALI() {
        return DIDMT_NOM_ALI;
    }

    public String getDIDMT_ALIM_ID() {
        return DIDMT_ALIM_ID;
    }

    public Number getDIDMT_LONG_MONO() {
        return DIDMT_LONG_MONO;
    }

    public Number getDIDMT_LONG_BIFA() {
        return DIDMT_LONG_BIFA;
    }

    public Number getDIDMT_LONG_TRIFA() {
        return DIDMT_LONG_TRIFA;
    }

    public Number getDIDMT_TRAM_MONO() {
        return DIDMT_TRAM_MONO;
    }

    public Number getDIDMT_TRAM_TRIFA() {
        return DIDMT_TRAM_TRIFA;
    }

    public Number getDIDMT_POTE_MONO() {
        return DIDMT_POTE_MONO;
    }

    public Number getDIDMT_POTE_TRIFA() {
        return DIDMT_POTE_TRIFA;
    }

    public void setDPRMT_CODIGO(Number DPRMT_CODIGO) {
        this.DPRMT_CODIGO = DPRMT_CODIGO;
    }

    public void setDIDMT_NOM_ALI(String DIDMT_NOM_ALI) {
        this.DIDMT_NOM_ALI = DIDMT_NOM_ALI;
    }

    public void setDIDMT_ALIM_ID(String DIDMT_ALIM_ID) {
        this.DIDMT_ALIM_ID = DIDMT_ALIM_ID;
    }

    public void setDIDMT_LONG_MONO(Number DIDMT_LONG_MONO) {
        this.DIDMT_LONG_MONO = DIDMT_LONG_MONO;
    }

    public void setDIDMT_LONG_BIFA(Number DIDMT_LONG_BIFA) {
        this.DIDMT_LONG_BIFA = DIDMT_LONG_BIFA;
    }

    public void setDIDMT_LONG_TRIFA(Number DIDMT_LONG_TRIFA) {
        this.DIDMT_LONG_TRIFA = DIDMT_LONG_TRIFA;
    }

    public void setDIDMT_TRAM_MONO(Number DIDMT_TRAM_MONO) {
        this.DIDMT_TRAM_MONO = DIDMT_TRAM_MONO;
    }

    public void setDIDMT_TRAM_TRIFA(Number DIDMT_TRAM_TRIFA) {
        this.DIDMT_TRAM_TRIFA = DIDMT_TRAM_TRIFA;
    }

    public void setDIDMT_POTE_MONO(Number DIDMT_POTE_MONO) {
        this.DIDMT_POTE_MONO = DIDMT_POTE_MONO;
    }

    public void setDIDMT_POTE_TRIFA(Number DIDMT_POTE_TRIFA) {
        this.DIDMT_POTE_TRIFA = DIDMT_POTE_TRIFA;
    }
      
    
}
