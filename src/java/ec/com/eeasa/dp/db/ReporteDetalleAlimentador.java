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
public class ReporteDetalleAlimentador {
        private Number DPREP_CODIGO;
        private String DRALI_COD_ALIMENTADOR;
        private Number DRALI_NUM_CLIENTE;
        
    public ReporteDetalleAlimentador(){}

    public ReporteDetalleAlimentador(Number DPREP_CODIGO, String DRALI_COD_ALIMENTADOR, Number DRALI_NUM_CLIENTE) {
        this.setDPREP_CODIGO(DPREP_CODIGO);
        this.setDRALI_COD_ALIMENTADOR(DRALI_COD_ALIMENTADOR);
        this.setDRALI_NUM_CLIENTE(DRALI_NUM_CLIENTE);
    }

    
    public Number getDPREP_CODIGO() {
        return DPREP_CODIGO;
    }

    public String getDRALI_COD_ALIMENTADOR() {
        return DRALI_COD_ALIMENTADOR;
    }

    public Number getDRALI_NUM_CLIENTE() {
        return DRALI_NUM_CLIENTE;
    }

    public void setDPREP_CODIGO(Number DPREP_CODIGO) {
        this.DPREP_CODIGO = DPREP_CODIGO;
    }

    public void setDRALI_COD_ALIMENTADOR(String DRALI_COD_ALIMENTADOR) {
        this.DRALI_COD_ALIMENTADOR = DRALI_COD_ALIMENTADOR;
    }

    public void setDRALI_NUM_CLIENTE(Number DRALI_NUM_CLIENTE) {
        this.DRALI_NUM_CLIENTE = DRALI_NUM_CLIENTE;
    }
    
    
}
