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
public class Contratistas {
     private String DPNUM_CONTRA_COD;
     private String DPNUM_CONTRA_CEDULA;
     private String DPNUM_CONTRA_NOMBRE;
     private String DPNUM_CONTRA_APELLIDO;
     private String DPNUM_CONTRA_DIRECCION;
     private String DPNUM_CONTRA_CELULAR;
     private String DPNUM_CONTRA_EMAIL;
     private String DPNUM_ELIMINADO;
     private Date DPNUM_FECHA_ELIM;
     private String DPRUS_CUENTA;
  
     public Contratistas(){
         
     }

    public Contratistas(String DPNUM_CONTRA_COD,String DPNUM_CONTRA_CEDULA, String DPNUM_CONTRA_NOMBRE, String DPNUM_CONTRA_APELLIDO, String DPNUM_CONTRA_DIRECCION, String DPNUM_CONTRA_CELULAR, String DPNUM_CONTRA_EMAIL, String DPNUM_ELIMINADO, Date DPNUM_FECHA_ELIM, String DPRUS_CUENTA) {
        this.setDPNUM_CONTRA_COD(DPNUM_CONTRA_COD);
        this.setDPNUM_CONTRA_CEDULA(DPNUM_CONTRA_CEDULA);
        this.setDPNUM_CONTRA_NOMBRE(DPNUM_CONTRA_NOMBRE);
        this.setDPNUM_CONTRA_APELLIDO(DPNUM_CONTRA_APELLIDO);
        this.setDPNUM_CONTRA_DIRECCION(DPNUM_CONTRA_DIRECCION);
        this.setDPNUM_CONTRA_CELULAR(DPNUM_CONTRA_CELULAR);
        this.setDPNUM_CONTRA_EMAIL(DPNUM_CONTRA_EMAIL);
        this.setDPNUM_ELIMINADO(DPNUM_ELIMINADO);
        this.setDPNUM_FECHA_ELIM(DPNUM_FECHA_ELIM);
        this.setDPRUS_CUENTA(DPRUS_CUENTA);
    }

    public void setDPNUM_CONTRA_COD(String DPNUM_CONTRA_COD) {
        this.DPNUM_CONTRA_COD = DPNUM_CONTRA_COD;
    }

    public String getDPNUM_CONTRA_COD() {
        return DPNUM_CONTRA_COD;
    }

    public void setDPNUM_CONTRA_CEDULA(String DPNUM_CONTRA_CEDULA) {
        this.DPNUM_CONTRA_CEDULA = DPNUM_CONTRA_CEDULA;
    }

    public void setDPNUM_CONTRA_NOMBRE(String DPNUM_CONTRA_NOMBRE) {
        this.DPNUM_CONTRA_NOMBRE = DPNUM_CONTRA_NOMBRE;
    }

    public void setDPNUM_CONTRA_APELLIDO(String DPNUM_CONTRA_APELLIDO) {
        this.DPNUM_CONTRA_APELLIDO = DPNUM_CONTRA_APELLIDO;
    }

    public void setDPNUM_CONTRA_DIRECCION(String DPNUM_CONTRA_DIRECCION) {
        this.DPNUM_CONTRA_DIRECCION = DPNUM_CONTRA_DIRECCION;
    }

    public void setDPNUM_CONTRA_CELULAR(String DPNUM_CONTRA_CELULAR) {
        this.DPNUM_CONTRA_CELULAR = DPNUM_CONTRA_CELULAR;
    }

    public void setDPNUM_CONTRA_EMAIL(String DPNUM_CONTRA_EMAIL) {
        this.DPNUM_CONTRA_EMAIL = DPNUM_CONTRA_EMAIL;
    }

    public void setDPNUM_ELIMINADO(String DPNUM_ELIMINADO) {
        this.DPNUM_ELIMINADO = DPNUM_ELIMINADO;
    }

    public void setDPNUM_FECHA_ELIM(Date DPNUM_FECHA_ELIM) {
        this.DPNUM_FECHA_ELIM = DPNUM_FECHA_ELIM;
    }

    public void setDPRUS_CUENTA(String DPRUS_CUENTA) {
        this.DPRUS_CUENTA = DPRUS_CUENTA;
    }

    public String getDPNUM_CONTRA_CEDULA() {
        return DPNUM_CONTRA_CEDULA;
    }

    public String getDPNUM_CONTRA_NOMBRE() {
        return DPNUM_CONTRA_NOMBRE;
    }

    public String getDPNUM_CONTRA_APELLIDO() {
        return DPNUM_CONTRA_APELLIDO;
    }

    public String getDPNUM_CONTRA_DIRECCION() {
        return DPNUM_CONTRA_DIRECCION;
    }

    public String getDPNUM_CONTRA_CELULAR() {
        return DPNUM_CONTRA_CELULAR;
    }

    public String getDPNUM_CONTRA_EMAIL() {
        return DPNUM_CONTRA_EMAIL;
    }

    public String getDPNUM_ELIMINADO() {
        return DPNUM_ELIMINADO;
    }

    public Date getDPNUM_FECHA_ELIM() {
        return DPNUM_FECHA_ELIM;
    }

    public String getDPRUS_CUENTA() {
        return DPRUS_CUENTA;
    }
     
}
