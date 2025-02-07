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
public class ReporteUsuario {
    private double codigoROL;
    private String codigoUsuario;
    private String cuentaUsuario;
    private String nombreUsuario;
    private String estadoUsuario;

    
    
    public ReporteUsuario() {
    }

    public ReporteUsuario(double codigoROL, String codigoUsuario, String cuentaUsuario, String nombreUsuario, String estadoUsuario) {
        this.codigoROL = codigoROL;
        this.codigoUsuario = codigoUsuario;
        this.cuentaUsuario = cuentaUsuario;
        this.nombreUsuario = nombreUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public double getCodigoROL() {
        return codigoROL;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getCuentaUsuario() {
        return cuentaUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setCodigoROL(double codigoROL) {
        this.codigoROL = codigoROL;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setCuentaUsuario(String cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    
    
    
}
