package ec.com.eeasa.dp.server;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class DataBaseObject {

    public Coneccion con;

    private boolean autoCommit = true;

    public void setAutoCommit(boolean Autocommit) throws SQLException, Exception {
        autoCommit = Autocommit;
    }

    /**
     * Realiza un commit a las operaciones realizadas. Automàticamente cierra la
     * conección a la base de datos
     *
     * @throws SQLException
     * @throws Exception
     * @author Leonardo
     * @creado 21/03/2014
     */
    public void Commit() throws SQLException, Exception {
        Commit(true);
    }

    /**
     * Realiza un commit a las operaciones realizadas. Se debe especificar si la
     * conexiòn a la base de datos se cierra o no
     *
     * @param CloseConnection
     * @throws SQLException
     * @throws Exception
     * @author Leonardo
     * @creado 21/03/2014
     */
    public void Commit(boolean CloseConnection) throws SQLException, Exception {
        if (con != null && !con.getConexion().isClosed()) {
            con.getConexion().commit();
            autoCommit = true;
            if (CloseConnection) {
                con.getConexion().close();
            }
        }
    }

    public DataBaseObject(String ip, String bd, String usr, String pass, String puerto) throws Exception {
        con = new Coneccion(ip, bd, usr, pass, puerto);
    }

    public DataBaseObject(String lookupName) throws Exception {
        con = new Coneccion(lookupName);
    }

    public ArrayList< HashMap<String, Object>> SQL_SELECT(String sql) throws Exception {
        ResultSet rs = null;
        ArrayList< HashMap<String, Object>> valor = new ArrayList< HashMap<String, Object>>();
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();

            rs = conexion.createStatement().executeQuery(sql.toUpperCase());
            valor = ResultSetToCDatos(rs);
            rs.close();

        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }

        }
        return valor;
    }

    public ArrayList< HashMap<String, Object>> SQL_SELECT(String sql, ArrayList<Object> parametros) throws Exception {
        ResultSet rs = null;
        ArrayList< HashMap<String, Object>> valor = new ArrayList< HashMap<String, Object>>();
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            CallableStatement stmSelect = conexion.prepareCall(sql.toUpperCase());

            if (parametros != null) {
                for (int i = 0; i < parametros.size(); i++) {
                    if (parametros.get(i) != null && parametros.get(i).getClass().toString().toLowerCase().contains("date")) {
                        java.util.Date dt = (java.util.Date) parametros.get(i);
                        stmSelect.setObject(i + 1, new java.sql.Timestamp(dt.getTime()));
                    } else if (parametros.get(i) != null && parametros.get(i) instanceof Integer) {
                        stmSelect.setObject(i + 1, parametros.get(i), Types.SMALLINT);
                    } else if (parametros.get(i) != null && parametros.get(i) instanceof Double) {
                        stmSelect.setObject(i + 1, parametros.get(i), Types.DOUBLE);
                    } else if (parametros.get(i) != null && parametros.get(i) instanceof String[][]) {
                        Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i));
                        stmSelect.setArray(i + 1, inArray);
                    } else {
                        stmSelect.setObject(i + 1, parametros.get(i));
                    }
                }
            }

            rs = stmSelect.executeQuery();
            valor = ResultSetToCDatos(rs);
            rs.close();
            conexion.close();
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception(ert.getMessage());
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception(e.getMessage());
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return valor;
    }

    /**
     * Si retorna -1 hay error
	 *
     */
    public int SQL_COMMAND(String SQL) throws Exception {
        int retorno = -1;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            retorno = conexion.createStatement().executeUpdate(SQL);
            if (autoCommit) {
                conexion.commit();
            }
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
        }
        return retorno;
    }

    /**
     * Si retorna -1 hay error
	 *
     */
    public int SQL_COMMAND(String SQL, ArrayList<Object> parametros) throws Exception {
        int retorno = -1;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            PreparedStatement var = conexion.prepareStatement(SQL);
            for (int i = 1; i <= parametros.size(); i++) {
                if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                    java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                    var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                    var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                    var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                    Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                    var.setArray(i, inArray);
                } else {
                    var.setObject(i, parametros.get(i - 1));
                }
            }
            retorno = var.executeUpdate();
            if (autoCommit) {
                conexion.commit();
            }
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
        }
        return retorno;
    }

    /**
     * Permite ejecutar instrucciones DDL en una trasacción. Para el SQL se
     * aplica la ideología de varargs y es por eso que va al final de la
     * función. Es una forma conveniente de decir que lstSQL es una lista de
     * elementos, sin embargo solo se puede ocupar uno a la vez o creando clases
     * que emulen este efecto
     * (http://stackoverflow.com/questions/17868059/java-two-varargs-in-one-method).
     *
     * @param SQL
     * @param parametros
     * @return
     * @throws Exception
     * @author Leonardo
     * @creado 19/03/2014
     */
    public int SQL_COMMAND_TRANSAC(ArrayList<ArrayList<Object>> lstParametros, String... lstSQL) throws Exception {
        int retorno = -1;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            conexion.setAutoCommit(false);
            int j = 0;
            for (String SQL : lstSQL) {
                PreparedStatement var = conexion.prepareStatement(SQL);
                ArrayList<Object> parametros = new ArrayList<Object>();
                if (j < lstParametros.size()) {
                    parametros = lstParametros.get(j);
                }
                for (int i = 1; i <= parametros.size(); i++) {
                    if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                        java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                        var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                        var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                        var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                        Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                        var.setArray(i, inArray);
                    } else {
                        var.setObject(i, parametros.get(i - 1));
                    }
                }
                retorno += var.executeUpdate();
                j++;
            }
            conexion.commit();
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return retorno;
    }

    public int SQL_COMMAND_DDL(String SQL, ArrayList<Object> parametros) throws Exception {
        int retorno = 1;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            PreparedStatement var = conexion.prepareStatement(SQL);
            for (int i = 1; i <= parametros.size(); i++) {
                if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                    java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                    var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                    var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                    var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                    Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                    var.setArray(i, inArray);
                } else {
                    var.setObject(i, parametros.get(i - 1));
                }
            }
            var.executeQuery();
            if (autoCommit) {
                conexion.commit();
            }
        } catch (SQLTimeoutException ert) {
            retorno = 0;
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            retorno = 0;
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
        }
        return retorno;
    }

    /**
     * Permite ejecutar instrucciones DDL en una trasacción. Para el SQL se
     * aplica la ideología de varargs y es por eso que va al final de la
     * función. Es una forma conveniente de decir que lstSQL es una lista de
     * elementos, sin embargo solo se puede ocupar uno a la vez o creando clases
     * que emulen este efecto
     * (http://stackoverflow.com/questions/17868059/java-two-varargs-in-one-method).
     *
     * @param SQL
     * @param parametros
     * @return
     * @throws Exception
     * @author Leonardo
     * @creado 19/03/2014
     */
    public int SQL_COMMAND_DDL_TRANSAC(ArrayList<ArrayList<Object>> lstParametros, String... lstSQL) throws Exception {
        int retorno = 1;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            conexion.setAutoCommit(false);
            int j = 0;
            for (String SQL : lstSQL) {
                PreparedStatement var = conexion.prepareStatement(SQL);
                ArrayList<Object> parametros = new ArrayList<Object>();
                if (j < lstParametros.size()) {
                    parametros = lstParametros.get(j);
                }

                for (int i = 1; i <= parametros.size(); i++) {
                    if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                        java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                        var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                        var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                        var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                        Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                        var.setArray(i, inArray);
                    } else {
                        var.setObject(i, parametros.get(i - 1));
                    }
                }

                var.executeQuery();
                j++;
            }

            conexion.commit();
        } catch (SQLTimeoutException ert) {
            retorno = 0;
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + ert.getMessage(), ert);
        } catch (Exception e) {
            retorno = 0;
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception("Error: " + e.getMessage(), e);
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return retorno;
    }

    public Object SQL_ESCALAR(String SQL) throws Exception {
        return SQL_ESCALAR(SQL, new ArrayList<Object>());
    }

    public Object SQL_ESCALAR(String SQL, ArrayList<Object> parametros) throws Exception {
        Object retorno = 0;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            PreparedStatement var = conexion.prepareStatement(SQL);

            for (int i = 1; i <= parametros.size(); i++) {
                if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                    java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                    var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                    var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                    var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                    Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                    var.setArray(i, inArray);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof byte[]) {
                    var.setBytes(i, (byte[]) parametros.get(i - 1));
                } else {
                    var.setObject(i, parametros.get(i - 1));
                }
            }
            ResultSet rs = var.executeQuery();
            while (rs.next()) {
                retorno = rs.getObject(1);
            }

        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.rollback();
                conexion.close();
            }
            throw new Exception(ert.getMessage());
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception(e.getMessage());
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return retorno;
    }

    /**
     * En el caso de que se necesite almacenar Archivos/Imágenes en la Base de
     * datos se usarà esta función
     *
     * @param SQL
     * @param parametros En la lista de paràmetros, el campo que contendrà la
     * imagen colocar el valor "IMAGE_HERE"
     * @param image
     * @return
     * @throws Exception
     * @author Leonardo
     * @creado 15/03/2014
     */
    public Object SQL_ESCALAR_IMAGE(String SQL, ArrayList<Object> parametros, byte[] image) throws Exception {
        Object retorno = 0;
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            PreparedStatement var = conexion.prepareCall(SQL);

            for (int i = 1; i <= parametros.size(); i++) {
                if (parametros.get(i - 1) != null && parametros.get(i - 1) != null
                        && parametros.get(i - 1).getClass().toString().contains("String")
                        && parametros.get(i - 1).toString().contains("IMAGE_HERE")) {
                    var.setBytes(i, image);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                    java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                    var.setObject(i, new java.sql.Timestamp(dt.getTime()));
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                    var.setObject(i, parametros.get(i - 1), Types.SMALLINT);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                    var.setObject(i, parametros.get(i - 1), Types.DOUBLE);
                } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                    Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                    var.setArray(i, inArray);
                } else {
                    var.setObject(i, parametros.get(i - 1));
                }
            }

            ResultSet rs = var.executeQuery();
            while (rs.next()) {
                retorno = rs.getObject(1);
            }
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception(ert.getMessage());
        } catch (Exception e) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
            throw new Exception(e.getMessage());
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return retorno;
    }

    private ArrayList< HashMap<String, Object>> ResultSetToCDatos(ResultSet rs) throws Exception {
        ArrayList< HashMap<String, Object>> lo = new ArrayList< HashMap<String, Object>>();
        try {

            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            while (rs.next()) {
                HashMap<String, Object> aux = new HashMap<String, Object>();
                for (int i = 0; i < numCols; i++) {
                    String colname = rsmd.getColumnLabel(i + 1).toUpperCase();
                    String tipoCol = rsmd.getColumnTypeName(i + 1);// .getColumnClassName(i+1);
                    int numLongitud = rsmd.getPrecision(i + 1);
                    int numDecimales = rsmd.getScale(i + 1);
                    String colvalue = (!(tipoCol.toLowerCase().contains("[b") || tipoCol.toLowerCase().contains("blob")) ? rs.getString(i + 1) : null);
                    if (tipoCol.toLowerCase().contains("date") || tipoCol.toLowerCase().contains("time")) {
                        if (rs.getDate(i + 1) != null) {
                            colvalue = String.valueOf(rs.getTimestamp(i + 1).getTime());
                        }
                        colname = colname;
                    } else if (tipoCol.toLowerCase().contains("integer") || tipoCol.toLowerCase().contains("int") || (tipoCol.toLowerCase().contains("number") && numDecimales < 1)) {
                        colname = colname;
                    } else if (tipoCol.toLowerCase().contains("decimal")) {
                        colname = colname;
                    } else if ((tipoCol.toLowerCase().contains("number") && numDecimales > 0) || tipoCol.toLowerCase().contains("double") || tipoCol.toLowerCase().contains("float")) {
                        colname = colname;
                    } else if (tipoCol.toLowerCase().contains("long")) {
                        colname = colname;
                    }

                    if (tipoCol.toLowerCase().contains("[b") || tipoCol.toLowerCase().contains("blob")) {
                        colname = colname;
                        aux.put(colname, rs.getBytes(i + 1));
                    } else {
                        aux.put(colname, colvalue);
                    }
                }
                lo.add(aux);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        }
        return lo;
    }

    public String SQL_CALL_FUNCTION(String nombrefuncion) throws Exception {
        return SQL_CALL_FUNCTION(nombrefuncion, null);
    }

    /**
     * Funcion para ejecutar una funcion sql de postgres que devuelva un cursor
     *
     * @param nombrefuncion
     * @return
     * @throws Exception
     */
    public String SQL_CALL_FUNCTION(String nombrefuncion, ArrayList<Object> parametros) throws Exception {
        String valor = "";
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            conexion.setAutoCommit(autoCommit);

            CallableStatement stmSelect = conexion.prepareCall("{ ? = call " + nombrefuncion + "}");
            stmSelect.registerOutParameter(1, java.sql.Types.VARCHAR);

            if (parametros != null) {
                for (int i = 1; i <= parametros.size(); i++) {
                    if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                        java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                        stmSelect.setObject(i + 1, new java.sql.Timestamp(dt.getTime()));
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                        stmSelect.setObject(i + 1, parametros.get(i - 1), Types.INTEGER);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                        stmSelect.setObject(i + 1, parametros.get(i - 1), Types.DOUBLE);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                        Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                        stmSelect.setArray(i + 1, inArray);
                    } else {
                        stmSelect.setObject(i + 1, parametros.get(i - 1));
                    }
                }
            }

            stmSelect.execute();
            valor = stmSelect.getString(1);
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
            throw new Exception(ert.getMessage());
        } catch (Exception e) {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
            throw new Exception(e.getMessage());
        } finally {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
        }
        return valor;
    }

    public ArrayList< HashMap<String, Object>> SQL_CALL_PROCEDURE(String nombrefuncion) throws Exception {
        return SQL_CALL_PROCEDURE(nombrefuncion, null);
    }

    /**
     * Funcion para ejecutar una funcion sql de postgres que devuelva un cursor
     *
     * @param nombrefuncion
     * @return
     * @throws Exception
     */
    public ArrayList< HashMap<String, Object>> SQL_CALL_PROCEDURE(String nombrefuncion, ArrayList<Object> parametros) throws Exception {
        ResultSet rs = null;
        ArrayList< HashMap<String, Object>> valor = new ArrayList< HashMap<String, Object>>();
        java.sql.Connection conexion = null;
        try {
            conexion = con.getConexion();
            conexion.setAutoCommit(autoCommit);

            CallableStatement stmSelect = conexion.prepareCall("{ call " + nombrefuncion + "}");
            stmSelect.registerOutParameter(1, OracleTypes.CURSOR);

            if (parametros != null) {
                for (int i = 1; i <= parametros.size(); i++) {
                    if (parametros.get(i - 1) != null && parametros.get(i - 1).getClass().toString().toLowerCase().contains("date")) {
                        java.util.Date dt = (java.util.Date) parametros.get(i - 1);
                        stmSelect.setObject(i + 1, new java.sql.Timestamp(dt.getTime()));
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Integer) {
                        stmSelect.setObject(i + 1, parametros.get(i - 1), Types.INTEGER);
                    } //stmSelect.setObject(i+1, parametros.get(i-1),Types.SMALLINT); COMENTADO POR ANavas 18/12/2024
                    else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof Double) {
                        stmSelect.setObject(i + 1, parametros.get(i - 1), Types.DOUBLE);
                    } else if (parametros.get(i - 1) != null && parametros.get(i - 1) instanceof String[][]) {
                        Array inArray = conexion.createArrayOf("varchar", (String[][]) parametros.get(i - 1));
                        stmSelect.setArray(i + 1, inArray);
                    } else {
                        stmSelect.setObject(i + 1, parametros.get(i - 1));
                    }
                }
            }
            stmSelect.execute();
            rs = ((OracleCallableStatement) stmSelect).getCursor(1);
            valor = ResultSetToCDatos(rs);
            rs.close();
        } catch (SQLTimeoutException ert) {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
            throw new Exception(ert.getMessage());
        } catch (Exception e) {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
            throw new Exception(e.getMessage());
        } finally {
            if (!conexion.isClosed() && autoCommit) {
                conexion.close();
            }
        }
        return valor;
    }
}
