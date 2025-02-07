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
public class ReporteGis {
     private double totalAbonado;
    private String departamento;
    
    
    public ReporteGis() {
    }

    public ReporteGis(double totalAbonado, String departamento) {
        this.totalAbonado = totalAbonado;
        this.departamento = departamento;
    }

    public double getTotalAbonado() {
        return totalAbonado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setTotalAbonado(double totalAbonado) {
        this.totalAbonado = totalAbonado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
}
