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
public class ReporteClientesProvinciaDC {
    private Number DPREP_CODIGO;
    private String DRCPC_COD_PROV;
    private Number DRCPC_CANTIDAD;
    private Date DRCPC_FECHA;
    
    public ReporteClientesProvinciaDC(){
    }

    public ReporteClientesProvinciaDC(Number DPREP_CODIGO, String DRCPC_COD_PROV, Number DRCPC_CANTIDAD, Date DRCPC_FECHA) {
        this.setDPREP_CODIGO(DPREP_CODIGO);
        this.setDRCPC_COD_PROV(DRCPC_COD_PROV);
        this.setDRCPC_CANTIDAD(DRCPC_CANTIDAD);
        this.setDRCPC_FECHA(DRCPC_FECHA);
    }

    public Number getDPREP_CODIGO() {
        return DPREP_CODIGO;
    }

    public String getDRCPC_COD_PROV() {
        return DRCPC_COD_PROV;
    }

    public Number getDRCPC_CANTIDAD() {
        return DRCPC_CANTIDAD;
    }

    public Date getDRCPC_FECHA() {
        return DRCPC_FECHA;
    }

    public void setDPREP_CODIGO(Number DPREP_CODIGO) {
        this.DPREP_CODIGO = DPREP_CODIGO;
    }

    public void setDRCPC_COD_PROV(String DRCPC_COD_PROV) {
        this.DRCPC_COD_PROV = DRCPC_COD_PROV;
    }

    public void setDRCPC_CANTIDAD(Number DRCPC_CANTIDAD) {
        this.DRCPC_CANTIDAD = DRCPC_CANTIDAD;
    }

    public void setDRCPC_FECHA(Date DRCPC_FECHA) {
        this.DRCPC_FECHA = DRCPC_FECHA;
    }
    
    
    
}
