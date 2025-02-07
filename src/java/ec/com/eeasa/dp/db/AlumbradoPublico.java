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
public class AlumbradoPublico {
    private Number DPRAP_CODIGO;
    private String DRPAD_ANIO;
    private String DRPAD_MES;
    private String DRPAD_NOM_A;
    private String DRPAD_ALIM_ID;
    private String DRPAD_TIPO_P;
    private String DRPAD_TIPO_L;
    private Number DRPAD_NUM_LUM;
    private Number DRPAD_POT_L1;
    private Number DRPAD_HORAS_F1;
    private Number DRPAD_CA;    
    private Number DRPAD_POT_L2;    
    private Number DRPAD_HORAS_F2;    
    private Number DRPAD_FU;    
    private Number DRPAD_FU2; 
    private Number DRPAD_CAI;    
    private Number DRPAD_CAI2;    
    private Number DRPAD_T_MES; 
    private Number DRPAD_CONSUMO;
    private String DRPAD_CANTON;
    private String DRPAD_BM;
    
    public AlumbradoPublico(){
    }

    public AlumbradoPublico(Number DPRAP_CODIGO, String DRPAD_ANIO, String DRPAD_MES, String DRPAD_NOM_A, String DRPAD_ALIM_ID, String DRPAD_TIPO_P, String DRPAD_TIPO_L, Number DRPAD_NUM_LUM, Number DRPAD_POT_L1, Number DRPAD_HORAS_F1, Number DRPAD_CA, Number DRPAD_POT_L2, Number DRPAD_HORAS_F2, Number DRPAD_FU, Number DRPAD_FU2, Number DRPAD_CAI, Number DRPAD_CAI2, Number DRPAD_T_MES, Number DRPAD_CONSUMO,String DRPAD_CANTON,String DRPAD_BM) {
        this.setDPRAP_CODIGO(DPRAP_CODIGO);
        this.setDRPAD_ANIO(DRPAD_ANIO);
        this.setDRPAD_MES(DRPAD_MES);
        this.setDRPAD_NOM_A(DRPAD_NOM_A);
        this.setDRPAD_ALIM_ID(DRPAD_ALIM_ID);
        this.setDRPAD_TIPO_P(DRPAD_TIPO_P);
        this.setDRPAD_TIPO_L(DRPAD_TIPO_L);
        this.setDRPAD_NUM_LUM(DRPAD_NUM_LUM);
        this.setDRPAD_POT_L1(DRPAD_POT_L1);
        this.setDRPAD_HORAS_F1(DRPAD_HORAS_F1);
        this.setDRPAD_CA(DRPAD_CA);
        this.setDRPAD_POT_L2(DRPAD_POT_L2);
        this.setDRPAD_HORAS_F2(DRPAD_HORAS_F2);
        this.setDRPAD_FU(DRPAD_FU);
        this.setDRPAD_FU2(DRPAD_FU2);
        this.setDRPAD_CAI(DRPAD_CAI);
        this.setDRPAD_CAI2(DRPAD_CAI2);
        this.setDRPAD_T_MES(DRPAD_T_MES);
        this.setDRPAD_CONSUMO(DRPAD_CONSUMO);
        this.setDRPAD_CANTON(DRPAD_CANTON);
        this.setDRPAD_BM(DRPAD_BM);
    }

    public void setDRPAD_BM(String DRPAD_BM) {
        this.DRPAD_BM = DRPAD_BM;
    }

    public String getDRPAD_BM() {
        return DRPAD_BM;
    }

    public void setDRPAD_CANTON(String DRPAD_CANTON) {
        this.DRPAD_CANTON = DRPAD_CANTON;
    }

    /*public AlumbradoPublico(Number DPRAP_CODIGO, String DRPAD_ANIO, String DRPAD_MES, String DRPAD_NOM_A, String DRPAD_ALIM_ID, String DRPAD_TIPO_P, String DRPAD_TIPO_L, Number DRPAD_NUM_LUM, Number DRPAD_POT_L1, Number DRPAD_HORAS_F1, Number DRPAD_CA, Number DRPAD_POT_L2, Number DRPAD_HORAS_F2, Number DRPAD_FU, Number DRPAD_FU2, Number DRPAD_CAI, Number DRPAD_CAI2, Number DRPAD_T_MES, Number DRPAD_CONSUMO) {
        this.DPRAP_CODIGO = DPRAP_CODIGO;
        this.DRPAD_ANIO = DRPAD_ANIO;
        this.DRPAD_MES = DRPAD_MES;
        this.DRPAD_NOM_A = DRPAD_NOM_A;
        this.DRPAD_ALIM_ID = DRPAD_ALIM_ID;
        this.DRPAD_TIPO_P = DRPAD_TIPO_P;
        this.DRPAD_TIPO_L = DRPAD_TIPO_L;
        this.DRPAD_NUM_LUM = DRPAD_NUM_LUM;
        this.DRPAD_POT_L1 = DRPAD_POT_L1;
        this.DRPAD_HORAS_F1 = DRPAD_HORAS_F1;
        this.DRPAD_CA = DRPAD_CA;
        this.DRPAD_POT_L2 = DRPAD_POT_L2;
        this.DRPAD_HORAS_F2 = DRPAD_HORAS_F2;
        this.DRPAD_FU = DRPAD_FU;
        this.DRPAD_FU2 = DRPAD_FU2;
        this.DRPAD_CAI = DRPAD_CAI;
        this.DRPAD_CAI2 = DRPAD_CAI2;
        this.DRPAD_T_MES = DRPAD_T_MES;
        this.DRPAD_CONSUMO = DRPAD_CONSUMO;
    }*/

    public String getDRPAD_CANTON() {
        return DRPAD_CANTON;
    }
    
    

    public Number getDPRAP_CODIGO() {
        return DPRAP_CODIGO;
    }

    public String getDRPAD_ANIO() {
        return DRPAD_ANIO;
    }

    public String getDRPAD_MES() {
        return DRPAD_MES;
    }

    public String getDRPAD_NOM_A() {
        return DRPAD_NOM_A;
    }

    public String getDRPAD_ALIM_ID() {
        return DRPAD_ALIM_ID;
    }

    public String getDRPAD_TIPO_P() {
        return DRPAD_TIPO_P;
    }

    public String getDRPAD_TIPO_L() {
        return DRPAD_TIPO_L;
    }

    public Number getDRPAD_NUM_LUM() {
        return DRPAD_NUM_LUM;
    }

    public Number getDRPAD_POT_L1() {
        return DRPAD_POT_L1;
    }

    public Number getDRPAD_HORAS_F1() {
        return DRPAD_HORAS_F1;
    }

    public Number getDRPAD_CA() {
        return DRPAD_CA;
    }

    public Number getDRPAD_POT_L2() {
        return DRPAD_POT_L2;
    }

    public Number getDRPAD_HORAS_F2() {
        return DRPAD_HORAS_F2;
    }

    public Number getDRPAD_FU() {
        return DRPAD_FU;
    }

    public Number getDRPAD_FU2() {
        return DRPAD_FU2;
    }

    public Number getDRPAD_CAI() {
        return DRPAD_CAI;
    }

    public Number getDRPAD_CAI2() {
        return DRPAD_CAI2;
    }

    public Number getDRPAD_T_MES() {
        return DRPAD_T_MES;
    }

    public Number getDRPAD_CONSUMO() {
        return DRPAD_CONSUMO;
    }

    public void setDPRAP_CODIGO(Number DPRAP_CODIGO) {
        this.DPRAP_CODIGO = DPRAP_CODIGO;
    }

    public void setDRPAD_ANIO(String DRPAD_ANIO) {
        this.DRPAD_ANIO = DRPAD_ANIO;
    }

    public void setDRPAD_MES(String DRPAD_MES) {
        this.DRPAD_MES = DRPAD_MES;
    }

    public void setDRPAD_NOM_A(String DRPAD_NOM_A) {
        this.DRPAD_NOM_A = DRPAD_NOM_A;
    }

    public void setDRPAD_ALIM_ID(String DRPAD_ALIM_ID) {
        this.DRPAD_ALIM_ID = DRPAD_ALIM_ID;
    }

    public void setDRPAD_TIPO_P(String DRPAD_TIPO_P) {
        this.DRPAD_TIPO_P = DRPAD_TIPO_P;
    }

    public void setDRPAD_TIPO_L(String DRPAD_TIPO_L) {
        this.DRPAD_TIPO_L = DRPAD_TIPO_L;
    }

    public void setDRPAD_NUM_LUM(Number DRPAD_NUM_LUM) {
        this.DRPAD_NUM_LUM = DRPAD_NUM_LUM;
    }

    public void setDRPAD_POT_L1(Number DRPAD_POT_L1) {
        this.DRPAD_POT_L1 = DRPAD_POT_L1;
    }

    public void setDRPAD_HORAS_F1(Number DRPAD_HORAS_F1) {
        this.DRPAD_HORAS_F1 = DRPAD_HORAS_F1;
    }

    public void setDRPAD_CA(Number DRPAD_CA) {
        this.DRPAD_CA = DRPAD_CA;
    }

    public void setDRPAD_POT_L2(Number DRPAD_POT_L2) {
        this.DRPAD_POT_L2 = DRPAD_POT_L2;
    }

    public void setDRPAD_HORAS_F2(Number DRPAD_HORAS_F2) {
        this.DRPAD_HORAS_F2 = DRPAD_HORAS_F2;
    }

    public void setDRPAD_FU(Number DRPAD_FU) {
        this.DRPAD_FU = DRPAD_FU;
    }

    public void setDRPAD_FU2(Number DRPAD_FU2) {
        this.DRPAD_FU2 = DRPAD_FU2;
    }

    public void setDRPAD_CAI(Number DRPAD_CAI) {
        this.DRPAD_CAI = DRPAD_CAI;
    }

    public void setDRPAD_CAI2(Number DRPAD_CAI2) {
        this.DRPAD_CAI2 = DRPAD_CAI2;
    }

    public void setDRPAD_T_MES(Number DRPAD_T_MES) {
        this.DRPAD_T_MES = DRPAD_T_MES;
    }

    public void setDRPAD_CONSUMO(Number DRPAD_CONSUMO) {
        this.DRPAD_CONSUMO = DRPAD_CONSUMO;
    }
    
    
}
