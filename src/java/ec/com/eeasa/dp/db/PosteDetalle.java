/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.eeasa.dp.db;

/**
 *
 * @author gmedina
 */
public class PosteDetalle {
    
    private int DPNUM_EQUIP_COD;
    private int DPNUM_NUMERO_POSTE;
    private String DPNUM_SECTOR_POSTE;
    private String DPNUM_RESP_NOMBRE;
    private String DPNUM_RESP_APELLIDO;
    private String DPNUM_RESP_GRUPO;

    public PosteDetalle() {
    }

    public String getDPNUM_RESP_APELLIDO() {
        return DPNUM_RESP_APELLIDO;
    }

    public void setDPNUM_RESP_APELLIDO(String DPNUM_RESP_APELLIDO) {
        this.DPNUM_RESP_APELLIDO = DPNUM_RESP_APELLIDO;
    }
    
    public int getDPNUM_EQUIP_COD() {
        return DPNUM_EQUIP_COD;
    }

    public void setDPNUM_EQUIP_COD(int DPNUM_EQUIP_COD) {
        this.DPNUM_EQUIP_COD = DPNUM_EQUIP_COD;
    }

    public int getDPNUM_NUMERO_POSTE() {
        return DPNUM_NUMERO_POSTE;
    }

    public void setDPNUM_NUMERO_POSTE(int DPNUM_NUMERO_POSTE) {
        this.DPNUM_NUMERO_POSTE = DPNUM_NUMERO_POSTE;
    }

    public String getDPNUM_SECTOR_POSTE() {
        return DPNUM_SECTOR_POSTE;
    }

    public void setDPNUM_SECTOR_POSTE(String DPNUM_SECTOR_POSTE) {
        this.DPNUM_SECTOR_POSTE = DPNUM_SECTOR_POSTE;
    }

    public String getDPNUM_RESP_NOMBRE() {
        return DPNUM_RESP_NOMBRE;
    }

    public void setDPNUM_RESP_NOMBRE(String DPNUM_RESP_NOMBRE) {
        this.DPNUM_RESP_NOMBRE = DPNUM_RESP_NOMBRE;
    }

    public String getDPNUM_RESP_GRUPO() {
        return DPNUM_RESP_GRUPO;
    }

    public void setDPNUM_RESP_GRUPO(String DPNUM_RESP_GRUPO) {
        this.DPNUM_RESP_GRUPO = DPNUM_RESP_GRUPO;
    }
    
    
    
}
