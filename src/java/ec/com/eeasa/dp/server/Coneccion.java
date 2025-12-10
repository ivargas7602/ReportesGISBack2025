package ec.com.eeasa.dp.server;

import java.sql.*;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import oracle.jdbc.OracleConnection;

public class Coneccion {

    private Connection myConnection = null;
    long timeout = 3000;
    private String ip;
    private String bd;
    private String usr;
    private String pass;
    private String puerto;
    private String LookupName;
    boolean flagWeLogic;

    public Coneccion(String _ip, String _bd, String _usr, String _pass, String _puerto) throws Exception {

        this.ip = _ip;
        this.bd = _bd;
        this.usr = _usr;
        this.pass = _pass;
        this.puerto = _puerto;
        this.LookupName = "";
        flagWeLogic = false;
    }

    public Coneccion(String inLookupName) throws Exception {
        this.LookupName = inLookupName;
        flagWeLogic = true;
    }

    public Connection getConexion() throws Exception {
        if (myConnection == null || myConnection.isClosed()) {
            try {
                if (LookupName.isEmpty() && flagWeLogic == false) {
                    Properties prop = new Properties();
                    prop.put("user", usr);
                    prop.put("password", pass);

                    Class.forName("oracle.jdbc.OracleDriver");
                    myConnection = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@" + this.ip + ":" + this.puerto + "/" + this.bd, prop);
                } else {
                    if (LookupName.isEmpty()) {
                        throw new Exception("No se ha agregado el parametro de LookupName.");
                    }
                    InitialContext myInitialContext = new InitialContext();
                    DataSource myDataSource = (DataSource) myInitialContext.lookup(LookupName);
                    myConnection = myDataSource.getConnection();
                }
            } catch (Exception e) { // ¡CAMBIO IMPORTANTE: Atrapa Exception genérica!
                System.err.println("❌ ERROR FATAL DE CONEXIÓN JNDI/DS: " + e.getMessage());
                e.printStackTrace(); // Imprime la traza completa para ver si es NamingException, SQL, etc.

                // Re-lanza la excepción para que DataBaseObject.java la atrape y la muestre.
                throw new Exception("Fallo en la conexión JNDI/Datasource (" + LookupName + "). Causa: " + e.getMessage(), e);
            }
        }
        return myConnection;
    }

    private String getJdbcUrlOracle(String ip, String bd, String prto) {
        if (ip.length() == 0) {
            ip = "localhost";
        }
        String databaseName = bd;
        String url = (new StringBuilder("jdbc:oracle:thin:@")).append(ip).append(":").append(prto).append(":").toString();
        if (databaseName.length() > 0) {
            url = (new StringBuilder(String.valueOf(url))).append(databaseName).toString();
        } else {
            url = (new StringBuilder(String.valueOf(url))).append("MYDATABASE").toString();
        }
        return url;
    }
}
