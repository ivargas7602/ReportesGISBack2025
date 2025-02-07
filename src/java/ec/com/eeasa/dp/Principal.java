/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.eeasa.dp;

import ec.com.eeasa.dp.db.ReporteBrechas;
import ec.com.eeasa.dp.db.ReporteClientesProvinciaGIS;
import ec.com.eeasa.dp.db.ReporteComercial;
import ec.com.eeasa.dp.db.ReporteTrafos;
import ec.com.eeasa.dp.db.ReporteTrafosDepartamentos;
import ec.com.eeasa.dp.server.factory.ReporteBrechasFactory;
import ec.com.eeasa.dp.server.reporte.ReporteImplement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanzano
 */
public class Principal {
    public static void main(String args[]) throws ParseException, Exception{
        ReporteImplement objreporteC = new ReporteImplement();

        /*objreporte_b.setDRCPG_FECHA(formato.format(objreporte_b.getDRCPG_FECHA()));
        '[{"DPRUS_CUENTA":"emanzano","DPRTR_FECHA":"2021-12-29 12:26:28"}]'
        
        */
      /*String codigoUnidad = "1080";
      ReporteTrafosDepartamentos rtrafos = new ReporteTrafosDepartamentos(14,"DEPARTAMENTO COMERCIAL",6);
        ReporteImplement objReporte = new ReporteImplement();
        ArrayList<HashMap<String,Object>> hmReportesC = new ArrayList<HashMap<String,Object>>();
     objReporte.insertarReporteTrafosRepetidos2(rtrafos);*/
        
        
    }
}
