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
public class Usuarios {
     private String DPRUS_CUENTA;
     private String DPROL_CODIGO;
     private String DPRUS_DMPER_CODIGO;
     private String DPRUS_NOM_EMP;
     private String DPRUS_BLOQUEADO;

       public Usuarios(){
         
     }

     
    public Usuarios(String DPRUS_CUENTA, String DPROL_CODIGO, String DPRUS_DMPER_CODIGO, String DPRUS_NOM_EMP, String DPRUS_BLOQUEADO) {
        this.setDPRUS_CUENTA(DPRUS_CUENTA);
        this.setDPROL_CODIGO(DPROL_CODIGO);
        this.setDPRUS_DMPER_CODIGO(DPRUS_DMPER_CODIGO);
        this.setDPRUS_NOM_EMP(DPRUS_NOM_EMP);
        this.setDPRUS_BLOQUEADO(DPRUS_BLOQUEADO);
    }

    public void setDPRUS_CUENTA(String DPRUS_CUENTA) {
        this.DPRUS_CUENTA = DPRUS_CUENTA;
    }

    public void setDPROL_CODIGO(String DPROL_CODIGO) {
        this.DPROL_CODIGO = DPROL_CODIGO;
    }

    public void setDPRUS_DMPER_CODIGO(String DPRUS_DMPER_CODIGO) {
        this.DPRUS_DMPER_CODIGO = DPRUS_DMPER_CODIGO;
    }

    public void setDPRUS_NOM_EMP(String DPRUS_NOM_EMP) {
        this.DPRUS_NOM_EMP = DPRUS_NOM_EMP;
    }

    public void setDPRUS_BLOQUEADO(String DPRUS_BLOQUEADO) {
        this.DPRUS_BLOQUEADO = DPRUS_BLOQUEADO;
    }

    public String getDPRUS_CUENTA() {
        return DPRUS_CUENTA;
    }

    public String getDPROL_CODIGO() {
        return DPROL_CODIGO;
    }

    public String getDPRUS_DMPER_CODIGO() {
        return DPRUS_DMPER_CODIGO;
    }

    public String getDPRUS_NOM_EMP() {
        return DPRUS_NOM_EMP;
    }

    public String getDPRUS_BLOQUEADO() {
        return DPRUS_BLOQUEADO;
    }
     
     
}
