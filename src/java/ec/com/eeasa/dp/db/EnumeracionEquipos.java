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
    //Agregados
    private Number DPNUM_CERTIFICADO;
    private String DPNUM_NUM_CONT;
    private String DPNUM_ANIO_CONT;
    private Number DPNUM_GRUPOS;
    private Number DPNUM_NUMSUPER;
    //Agregados
    private Double DPNUM_EQUIP_NUMSUPER_ACTUAL;
    private Double expectedNUMINFER;
    private Double expectedCANTIDAD;

    public EnumeracionEquipos() {
    }

    public EnumeracionEquipos(Number DPNUM_EQUIP_COD, Number DPNUM_CONTRA_COD, Number DPNUM_TIPO_COD, Number DPNUM_EQUIP_CANTIDAD,
            Number DPNUM_EQUIP_NUMINFER, Number DPNUM_EQUIP_NUMSUPER, Date DPNUM_EQUIP_FECHA,
            String DPNUM_EQUIP_SECTOR, String DPRUS_CUENTA, Number DPNUM_CLAS_COD, String OPCION, Number DPNUM_EQUIP_CANTIDAD_ACTULIZADA,
            Number DPNUM_EQUIP_NUMSUPER_ACTUALIZADA, Number DPNUM_CERTIFICADO, String DPNUM_NUM_CONT, String DPNUM_ANIO_CONT, Number DPNUM_GRUPOS, Number DPNUM_NUMSUPER, Double DPNUM_EQUIP_NUMSUPER_ACTUAL) {
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
        //agregado
        this.setDPNUM_CERTIFICADO(DPNUM_CERTIFICADO);
        this.setDPNUM_NUM_CONT(DPNUM_NUM_CONT);
        this.setDPNUM_ANIO_CONT(DPNUM_ANIO_CONT);
        this.setDPNUM_GRUPOS(DPNUM_GRUPOS);
        this.setDPNUM_NUMSUPER(DPNUM_NUMSUPER);

    }

    //agregados 
    public void setDPNUM_NUMSUPER(Number DPNUM_NUMSUPER) {
        this.DPNUM_NUMSUPER = DPNUM_NUMSUPER;
    }

    public Number getDPNUM_NUMSUPER() {
        return DPNUM_NUMSUPER;
    }

    public void setDPNUM_CERTIFICADO(Number DPNUM_CERTIFICADO) {
        this.DPNUM_CERTIFICADO = DPNUM_CERTIFICADO;
    }

    public Number getDPNUM_CERTIFICADO() {
        return DPNUM_CERTIFICADO;
    }

    public void setDPNUM_NUM_CONT(String DPNUM_NUM_CONT) {
        this.DPNUM_NUM_CONT = DPNUM_NUM_CONT;
    }

    public String getDPNUM_NUM_CONT() {
        return DPNUM_NUM_CONT;
    }

    public void setDPNUM_ANIO_CONT(String DPNUM_ANIO_CONT) {
        this.DPNUM_ANIO_CONT = DPNUM_ANIO_CONT;
    }

    public String getDPNUM_ANIO_CONT() {
        return DPNUM_ANIO_CONT;
    }

    public void setDPNUM_GRUPOS(Number DPNUM_GRUPOS) {
        this.DPNUM_GRUPOS = DPNUM_GRUPOS;
    }

    public Number getDPNUM_GRUPOS() {
        return DPNUM_GRUPOS;
    }

    public Double getDPNUM_EQUIP_NUMSUPER_ACTUAL() {
        return DPNUM_EQUIP_NUMSUPER_ACTUAL;
    }

    public void setDPNUM_EQUIP_NUMSUPER_ACTUAL(Double val) {
        this.DPNUM_EQUIP_NUMSUPER_ACTUAL = val;
    }

    public Double getExpectedNUMINFER() {
        return expectedNUMINFER;
    }

    public void setExpectedNUMINFER(Double val) {
        this.expectedNUMINFER = val;
    }

    public Double getExpectedCANTIDAD() {
        return expectedCANTIDAD;
    }

    public void setExpectedCANTIDAD(Double val) {
        this.expectedCANTIDAD = val;
    }

    //Fin agregados
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
