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
public class ReporteEquiposDepartamentos {
    private Number CODIGO;
    private String DEPARTAMENTO;
    private Number DIFERENCIA;
    private Date FECHA;
    
    public ReporteEquiposDepartamentos(){}
    
    public ReporteEquiposDepartamentos(Number CODIGO, String DEPARTAMENTO, Number DIFERENCIA,Date FECHA) {
        this.setCODIGO(CODIGO);
        this.setDEPARTAMENTO(DEPARTAMENTO);
        this.setDIFERENCIA(DIFERENCIA);
        this.setFECHA(FECHA);
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public Date getFECHA() {
        return FECHA;
    }



    public void setCODIGO(Number CODIGO) {
        this.CODIGO = CODIGO;
    }

    public void setDEPARTAMENTO(String DEPARTAMENTO) {
        this.DEPARTAMENTO = DEPARTAMENTO;
    }

    public void setDIFERENCIA(Number DIFERENCIA) {
        this.DIFERENCIA = DIFERENCIA;
    }

    public Number getCODIGO() {
        return CODIGO;
    }

    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public Number getDIFERENCIA() {
        return DIFERENCIA;
    }
}
