/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.eeasa.dp.db;

/**
 *
 * @author gmedina
 */
public class BloquePostes {

    private Number DPNUM_EQUIP_COD;    
    private String DPNUM_EQUIP_SECTOR; 
    private String DPNUM_RANGO_TOTAL; 
    private String DPNUM_CONTRATO_G; 
    private String DPNUM_CONTRATISTA;
    private Number DPNUM_CANTIDAD;  
    // --- NUEVOS CAMPOS ---
    private String DPNUM_NUM_CONT;
    private String DPNUM_ANIO_CONT;

    public BloquePostes() {
    }

    public String getDPNUM_NUM_CONT() {
        return DPNUM_NUM_CONT;
    }

    public void setDPNUM_NUM_CONT(String DPNUM_NUM_CONT) {
        this.DPNUM_NUM_CONT = DPNUM_NUM_CONT;
    }

    public String getDPNUM_ANIO_CONT() {
        return DPNUM_ANIO_CONT;
    }

    public void setDPNUM_ANIO_CONT(String DPNUM_ANIO_CONT) {
        this.DPNUM_ANIO_CONT = DPNUM_ANIO_CONT;
    }
    
    

    public Number getDPNUM_EQUIP_COD() {
        return DPNUM_EQUIP_COD;
    }

    public void setDPNUM_EQUIP_COD(Number DPNUM_EQUIP_COD) {
        this.DPNUM_EQUIP_COD = DPNUM_EQUIP_COD;
    }

    public String getDPNUM_EQUIP_SECTOR() {
        return DPNUM_EQUIP_SECTOR;
    }

    public void setDPNUM_EQUIP_SECTOR(String DPNUM_EQUIP_SECTOR) {
        this.DPNUM_EQUIP_SECTOR = DPNUM_EQUIP_SECTOR;
    }

    public String getDPNUM_RANGO_TOTAL() {
        return DPNUM_RANGO_TOTAL;
    }

    public void setDPNUM_RANGO_TOTAL(String DPNUM_RANGO_TOTAL) {
        this.DPNUM_RANGO_TOTAL = DPNUM_RANGO_TOTAL;
    }

    public String getDPNUM_CONTRATO_G() {
        return DPNUM_CONTRATO_G;
    }

    public void setDPNUM_CONTRATO_G(String DPNUM_CONTRATO_G) {
        this.DPNUM_CONTRATO_G = DPNUM_CONTRATO_G;
    }

    public String getDPNUM_CONTRATISTA() {
        return DPNUM_CONTRATISTA;
    }

    public void setDPNUM_CONTRATISTA(String DPNUM_CONTRATISTA) {
        this.DPNUM_CONTRATISTA = DPNUM_CONTRATISTA;
    }

    public Number getDPNUM_CANTIDAD() {
        return DPNUM_CANTIDAD;
    }

    public void setDPNUM_CANTIDAD(Number DPNUM_CANTIDAD) {
        this.DPNUM_CANTIDAD = DPNUM_CANTIDAD;
    }
    
    

}
