package EXAMEN2023_PROFE;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BD {
    private static BD miInstancia = null;
    private static boolean permitirInstancianueva;
    private String cadenaConexion;
    private String usuario;
    private String password;
    private Connection conn;
    private Statement stmt;

    private BD() throws Exception {
        if (!permitirInstancianueva)
            throw new Exception("No se puede crear la instancia, usa getInstance");
    }

    public static BD getInstance() {
        if (miInstancia == null) {
            permitirInstancianueva = true;
            try {
                miInstancia = new BD();
            } catch (Exception e) {
                e.printStackTrace();
            }
            permitirInstancianueva = false;
        }
        return miInstancia;
    }

    public ResultSet consultaBD(String consulta) throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection(cadenaConexion, usuario, password);
        stmt = conn.createStatement();
        return stmt.executeQuery(consulta);
    }

    public void cerrarConsulta() throws SQLException {
        if (stmt != null && !stmt.isClosed()) {
            stmt.close();
        }
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

    public String getCadenaConexion() {
        return cadenaConexion;
    }

    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void cargarParametrosConexion() {
        String nombreFichero = "output.json";
        File file = new File(nombreFichero);

        if (file.exists()) {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(file)) {
                JSONObject jsonObject = (JSONObject) parser.parse(reader);

                String driver = (String) jsonObject.get("DRIVER");
                String servidor = (String) jsonObject.get("SERVIDOR");
                String puerto = (String) jsonObject.get("PUERTO");
                String sid = (String) jsonObject.get("SID");
                setUsuario((String) jsonObject.get("USUARIO"));
                setPassword((String) jsonObject.get("CLAVE"));

                if (!driver.isEmpty() && !servidor.isEmpty() && !puerto.isEmpty() && !sid.isEmpty()) {
                    setCadenaConexion(driver + "@" + servidor + ":" + puerto + ":" + sid);
                }
            } catch (IOException | ParseException e) {
                System.err.println("Error al leer el fichero o parsear el JSON");
                e.printStackTrace();
            }
        } else {
            System.err.println("El fichero de configuración no existe");
        }
    }

    public void cargarParametros2() {
        String driver = "jdbc:oracle:thin:";
        String servidor = "localhost";
        String puerto = "1521";
        String sid = "XE";
        setUsuario("XX");
        setPassword("XX");

        if (!driver.isEmpty() && !servidor.isEmpty() && !puerto.isEmpty() && !sid.isEmpty()) {
            setCadenaConexion(driver + "@" + servidor + ":" + puerto + ":" + sid);
        }
    }

    public void cargarParametros3() {
        String nombreFichero = "output3.json";
        File file = new File(nombreFichero);

        if (file.exists()) {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(file)) {
                JSONObject jsonObject = (JSONObject) parser.parse(reader);

                JSONObject cadenas = (JSONObject) jsonObject.get("CADENAS");
                JSONObject usuarios = (JSONObject) jsonObject.get("USUARIOS");

                String driver = (String) cadenas.get("DRIVER");
                String servidor = (String) cadenas.get("SERVIDOR");
                String puerto = (String) cadenas.get("PUERTO");
                String sid = (String) cadenas.get("SID");
                setUsuario((String) usuarios.get("USUARIO"));
                setPassword((String) usuarios.get("CLAVE"));

                if (!driver.isEmpty() && !servidor.isEmpty() && !puerto.isEmpty() && !sid.isEmpty()) {
                    setCadenaConexion(driver + "@" + servidor + ":" + puerto + ":" + sid);
                }
            } catch (IOException | ParseException e) {
                System.err.println("Error al leer el fichero o parsear el JSON");
                e.printStackTrace();
            }
        } else {
            System.err.println("El fichero de configuración no existe");
        }
    }

    public ArrayList<Monitor> cargarMonitores() {
        ArrayList<Monitor> LOL = new ArrayList<>();
        try {
            ResultSet rset = consultaBD("SELECT * FROM MONITOR");
            while (rset.next()) {
                String dni = rset.getString("DNI");
                String nombre = rset.getString("NOMBRE");
                String apellidos = rset.getString("APELLIDOS");
                String direccion = rset.getString("DIRECCION");
                String correo = rset.getString("CORREO");
                String codigoMonitor = rset.getString("CODIGOMONITOR");
                String clave = rset.getString("CLAVE");
                Monitor monitor = new Monitor(dni, nombre, apellidos, direccion, correo, codigoMonitor, clave);
                LOL.add(monitor);
            }
            cerrarConsulta();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return LOL;
    }

    public static void main(String[] args) {
        BD.getInstance().cargarParametrosConexion();
        System.out.println("Cadena de conexión desde cargarParametrosConexion: " + BD.getInstance().getCadenaConexion());
        System.out.println("Usuario: " + BD.getInstance().getUsuario());
        System.out.println("Password: " + BD.getInstance().getPassword());
//
//        BD.getInstance().cargarParametros2();
//        System.out.println("Cadena de conexión desde cargarParametros2: " + BD.getInstance().getCadenaConexion());
//        System.out.println("Usuario: " + BD.getInstance().getUsuario());
//        System.out.println("Password: " + BD.getInstance().getPassword());
//
//        BD.getInstance().cargarParametros3();
//        System.out.println("Cadena de conexión desde cargarParametros3: " + BD.getInstance().getCadenaConexion());
//        System.out.println("Usuario: " + BD.getInstance().getUsuario());
//        System.out.println("Password: " + BD.getInstance().getPassword());

        ArrayList<Monitor> LOL = BD.getInstance().cargarMonitores();
        for (Monitor RESUL : LOL) {
            System.out.println(RESUL);
        }
    }
}

