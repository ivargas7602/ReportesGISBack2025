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
public class EnumeracionEquipos {
    private Number DPNUM_EQUIP_COD;
    private Number DPNUM_CONTRA_COD;
    private Number DPNUM_TIPO_COD;
    private Number DPNUM_EQUIP_CANTIDAD;
    private Number DPNUM_EQUIP_NUMINFER;
    private Number DPNUM_EQUIP_NUMSUPER;
    private Date DPNUM_EQUIP_FECHA;
    private String DPNUM_EQUIP_SECTOR;
    private String DPRUS_CUENTA;
    private Number DPNUM_CLAS_COD;
    private String OPCION;
    private Number DPNUM_EQUIP_CANTIDAD_ACTULIZADA;
    private Number DPNUM_EQUIP_NUMSUPER_ACTUALIZADA;
    
    public EnumeracionEquipos(){
	}

    public EnumeracionEquipos(Number DPNUM_EQUIP_COD,Number DPNUM_CONTRA_COD, Number DPNUM_TIPO_COD, Number DPNUM_EQUIP_CANTIDAD, Number DPNUM_EQUIP_NUMINFER, Number DPNUM_EQUIP_NUMSUPER, Date DPNUM_EQUIP_FECHA, String DPNUM_EQUIP_SECTOR, String DPRUS_CUENTA, Number DPNUM_CLAS_COD, String OPCION,Number DPNUM_EQUIP_CANTIDAD_ACTULIZADA,Number DPNUM_EQUIP_NUMSUPER_ACTUALIZADA) {
        this.setDPNUM_EQUIP_COD(DPNUM_EQUIP_COD);
        this.setDPNUM_CONTRA_COD(DPNUM_CONTRA_COD);
        this.setDPNUM_TIPO_COD(DPNUM_TIPO_COD);
        this.setDPNUM_EQUIP_CANTIDAD(DPNUM_EQUIP_CANTIDAD);
        this.setDPNUM_EQUIP_NUMINFER(DPNUM_EQUIP_NUMINFER);
        this.setDPNUM_EQUIP_NUMSUPER(DPNUM_EQUIP_NUMSUPER);
        this.setDPNUM_EQUIP_FECHA(DPNUM_EQUIP_FECHA);
        this.setDPNUM_EQUIP_SECTOR(DPNUM_EQUIP_SECTOR);
        this.setDPRUS_CUENTA(DPRUS_CUENTA);
        this.setDPNUM_CLAS_COD(DPNUM_CLAS_COD);
        this.setOPCION(OPCION);
        this.setDPNUM_EQUIP_CANTIDAD_ACTULIZADA(DPNUM_EQUIP_CANTIDAD_ACTULIZADA);
        this.setDPNUM_EQUIP_NUMSUPER_ACTUALIZADA(DPNUM_EQUIP_NUMSUPER_ACTUALIZADA);
    }

    public void setDPNUM_EQUIP_CANTIDAD_ACTULIZADA(Number DPNUM_EQUIP_CANTIDAD_ACTULIZADA) {
        this.DPNUM_EQUIP_CANTIDAD_ACTULIZADA = DPNUM_EQUIP_CANTIDAD_ACTULIZADA;
    }

    public void setDPNUM_EQUIP_NUMSUPER_ACTUALIZADA(Number DPNUM_EQUIP_NUMSUPER_ACTUALIZADA) {
        this.DPNUM_EQUIP_NUMSUPER_ACTUALIZADA = DPNUM_EQUIP_NUMSUPER_ACTUALIZADA;
    }

    public Number getDPNUM_EQUIP_CANTIDAD_ACTULIZADA() {
        return DPNUM_EQUIP_CANTIDAD_ACTULIZADA;
    }

    public Number getDPNUM_EQUIP_NUMSUPER_ACTUALIZADA() {
        return DPNUM_EQUIP_NUMSUPER_ACTUALIZADA;
    }

    
    public void setDPNUM_EQUIP_COD(Number DPNUM_EQUIP_COD) {
        this.DPNUM_EQUIP_COD = DPNUM_EQUIP_COD;
    }

    
    public Number getDPNUM_EQUIP_COD() {
        return DPNUM_EQUIP_COD;
    }

    public void setDPNUM_CONTRA_COD(Number DPNUM_CONTRA_COD) {
        this.DPNUM_CONTRA_COD = DPNUM_CONTRA_COD;
    }

    public void setDPNUM_TIPO_COD(Number DPNUM_TIPO_COD) {
        this.DPNUM_TIPO_COD = DPNUM_TIPO_COD;
    }

    public void setDPNUM_EQUIP_CANTIDAD(Number DPNUM_EQUIP_CANTIDAD) {
        this.DPNUM_EQUIP_CANTIDAD = DPNUM_EQUIP_CANTIDAD;
    }

    public void setDPNUM_EQUIP_NUMINFER(Number DPNUM_EQUIP_NUMINFER) {
        this.DPNUM_EQUIP_NUMINFER = DPNUM_EQUIP_NUMINFER;
    }

    public void setDPNUM_EQUIP_NUMSUPER(Number DPNUM_EQUIP_NUMSUPER) {
        this.DPNUM_EQUIP_NUMSUPER = DPNUM_EQUIP_NUMSUPER;
    }

    public void setDPNUM_EQUIP_FECHA(Date DPNUM_EQUIP_FECHA) {
        this.DPNUM_EQUIP_FECHA = DPNUM_EQUIP_FECHA;
    }

    public void setDPNUM_EQUIP_SECTOR(String DPNUM_EQUIP_SECTOR) {
        this.DPNUM_EQUIP_SECTOR = DPNUM_EQUIP_SECTOR;
    }

    public void setDPRUS_CUENTA(String DPRUS_CUENTA) {
        this.DPRUS_CUENTA = DPRUS_CUENTA;
    }

    public void setDPNUM_CLAS_COD(Number DPNUM_CLAS_COD) {
        this.DPNUM_CLAS_COD = DPNUM_CLAS_COD;
    }

    public void setOPCION(String OPCION) {
        this.OPCION = OPCION;
    }

    public Number getDPNUM_CONTRA_COD() {
        return DPNUM_CONTRA_COD;
    }

    public Number getDPNUM_TIPO_COD() {
        return DPNUM_TIPO_COD;
    }

    public Number getDPNUM_EQUIP_CANTIDAD() {
        return DPNUM_EQUIP_CANTIDAD;
    }

    public Number getDPNUM_EQUIP_NUMINFER() {
        return DPNUM_EQUIP_NUMINFER;
    }

    public Number getDPNUM_EQUIP_NUMSUPER() {
        return DPNUM_EQUIP_NUMSUPER;
    }

    public Date getDPNUM_EQUIP_FECHA() {
        return DPNUM_EQUIP_FECHA;
    }

    public String getDPNUM_EQUIP_SECTOR() {
        return DPNUM_EQUIP_SECTOR;
    }

    public String getDPRUS_CUENTA() {
        return DPRUS_CUENTA;
    }

    public Number getDPNUM_CLAS_COD() {
        return DPNUM_CLAS_COD;
    }

    public String getOPCION() {
        return OPCION;
    }
    
}
