/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.eeasa.dp.db;

import java.util.Date;

/**
 *
 * @author anavas
 */
public class ReporteEquipos {
    private String CUENTA_USUARIO;
    private Date FECHA;
    
    public ReporteEquipos(){}
    
    public ReporteEquipos(String CUENTA_USUARIO, Date FECHA) {
        this.setCUENTA_USUARIO(CUENTA_USUARIO);
        this.setFECHA(FECHA);
    }

    public String getCUENTA_USUARIO() {
        return CUENTA_USUARIO;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setCUENTA_USUARIO(String CUENTA_USUARIO) {
        this.CUENTA_USUARIO = CUENTA_USUARIO;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }
}
