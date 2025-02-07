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
public class ReporteBrechas {
    private String CUENTA_USUARIO;
    private Number CLIENTES_GIS_ENERGIZADOS;
    private Number CLIENTES_COMERCIAL;
    private Date FECHA;
    
    
    public ReporteBrechas(){
	}
    public ReporteBrechas(String CUENTA_USUARIO, Number CLIENTES_GIS_ENERGIZADOS, Number CLIENTES_COMERCIAL, Date FECHA) {
        this.setCUENTA_USUARIO(CUENTA_USUARIO);
        this.setCLIENTES_GIS_ENERGIZADOS(CLIENTES_GIS_ENERGIZADOS);
        this.setCLIENTES_COMERCIAL(CLIENTES_COMERCIAL);
        this.setFECHA(FECHA);
    }

    public String getCUENTA_USUARIO() {
        return CUENTA_USUARIO;
    }

    public Number getCLIENTES_GIS_ENERGIZADOS() {
        return CLIENTES_GIS_ENERGIZADOS;
    }

    public Number getCLIENTES_COMERCIAL() {
        return CLIENTES_COMERCIAL;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setCUENTA_USUARIO(String CUENTA_USUARIO) {
        this.CUENTA_USUARIO = CUENTA_USUARIO;
    }

    public void setCLIENTES_GIS_ENERGIZADOS(Number CLIENTES_GIS_ENERGIZADOS) {
        this.CLIENTES_GIS_ENERGIZADOS = CLIENTES_GIS_ENERGIZADOS;
    }

    public void setCLIENTES_COMERCIAL(Number CLIENTES_COMERCIAL) {
        this.CLIENTES_COMERCIAL = CLIENTES_COMERCIAL;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }
    
    
}
