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
public class ReporteTrafos {
    private String CUENTA_USUARIO;
    private Date FECHA;
    
    public ReporteTrafos(){
	}

    public ReporteTrafos(String CUENTA_USUARIO, Date FECHA) {
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
