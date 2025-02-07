package ec.com.eeasa.dp.server;

public class ReportesRemoteServiceServlet {

    DataBaseObject db;

    public ReportesRemoteServiceServlet() {
    }

    public DataBaseObject getDB() throws Exception {
        /*
        String Servidor = "raceeasa-scan.eeasa.com";
        String BaseDatos = "pdbamb";
        String Clave = "Intranet.2020";
         */
        
        /*String Servidor = "172.20.1.64";
        String BaseDatos = "dasig";
        String Usuario = "reportes_gis";
        String Clave = "gis";
        String Puerto = "1521";*/

        //Pruebas [Desarrollo]
        String Servidor = "172.20.1.64";
        String BaseDatos = "dasig";
        String Usuario = "REPORTES_GIS_PRUEBAS";
        String Clave = "pruebas";
        String Puerto = "1521";
        
        Boolean UsarWebLogic = false; //Para desarrollo

        //Boolean UsarWebLogic=true; //Para Produccion
        String LookupName = "gisDS";
        if (UsarWebLogic) {
            db = new DataBaseObject(LookupName);
        } else {
            db = new DataBaseObject(Servidor, BaseDatos, Usuario, Clave, Puerto);
        }

        return db;
    }

}
