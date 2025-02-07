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
public class ReporteTrafosDepartamentos {
    private Number CODIGO;
    private String DEPARTAMENTO;
    private Number CANTIDAD;
    private Date FECHA;
    
    public ReporteTrafosDepartamentos(){
    }

    public ReporteTrafosDepartamentos(Number CODIGO, String DEPARTAMENTO, Number CANTIDAD,Date FECHA) {
        this.setCODIGO(CODIGO);
        this.setDEPARTAMENTO(DEPARTAMENTO);
        this.setCANTIDAD(CANTIDAD);
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

    public void setCANTIDAD(Number CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public Number getCODIGO() {
        return CODIGO;
    }

    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public Number getCANTIDAD() {
        return CANTIDAD;
    }
      
}
