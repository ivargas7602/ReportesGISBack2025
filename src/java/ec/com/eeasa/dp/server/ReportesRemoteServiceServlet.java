package ec.com.eeasa.dp.server;

public class ReportesRemoteServiceServlet {

    private DataBaseObject db;

    public ReportesRemoteServiceServlet() {
        // Constructor vacío
    }

    /**
     * Devuelve la conexión a la base de datos usando DataSource. Si ya existe,
     * retorna la instancia actual.
     *
     * @return DataBaseObject
     * @throws Exception si falla la conexión
     */
    public DataBaseObject getDB() throws Exception {
        if (db == null) {
            Boolean usarWebLogic = true;
            String lookupName = "gispruebasDS";
            //DESCOMENTAR PARA PRODUCCION
            //String lookupName = "ReportesGisDS";

            try {
                if (usarWebLogic) {
                    db = new DataBaseObject(lookupName);
                    System.out.println("Datasource obtenido correctamente: " + lookupName);
                    System.out.println("Conexión al datasource OK");
                } else {
                    throw new Exception("Conexión directa no configurada");
                }
            } catch (Exception e) {
                e.printStackTrace(); // Aquí veremos la excepción real
                throw new Exception("Error al conectar con el datasource '" + lookupName + "': " + e.getMessage(), e);
            }
        }
        return db;
    }

}
