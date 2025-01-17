package EXAMEN2023;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class BD {
    private static BD Miinstancia = null;
    private static boolean permitir_instancianueva = true;
    private String Cadena_conexion;
    private String usuario;
    private String pass;
    private Connection conn;
    private Statement stmt;

    private BD() throws Exception {
        if (!permitir_instancianueva)
            throw new Exception("No se puede crear otro objeto de la clase");
        permitir_instancianueva = false;
    }

    public static BD getInstance() throws Exception {
        if (Miinstancia == null) {
            Miinstancia = new BD();
        }
        return Miinstancia;
    }


        
    // Método para conectar a la base de datos utilizando los parámetros cargados
    public static BD getMiinstancia() {
		return Miinstancia;
	}

	public static void setMiinstancia(BD miinstancia) {
		Miinstancia = miinstancia;
	}

	public static boolean isPermitir_instancianueva() {
		return permitir_instancianueva;
	}

	public static void setPermitir_instancianueva(boolean permitir_instancianueva) {
		BD.permitir_instancianueva = permitir_instancianueva;
	}

	public String getCadena_conexion() {
		return Cadena_conexion;
	}

	public void setCadena_conexion(String cadena_conexion) {
		Cadena_conexion = cadena_conexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public void conectarBD() {
        try {
            this.conn = DriverManager.getConnection(this.Cadena_conexion, this.getUsuario(), this.getPass());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet consultaBD(String consulta) {
        ResultSet rset = null;
        try {
            this.conn = DriverManager.getConnection(this.Cadena_conexion, this.usuario, this.pass);
            this.stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rset;
    }

    
    
    public ArrayList<Monitor> cargarMonitor() {
        ArrayList<Monitor> monn = new ArrayList<>();

        try {
            // Verificar si la conexión está establecida
            if (conn == null || conn.isClosed()) {
                conectarBD(); // Si no está establecida, conectar a la base de datos
            }

            // Consultar la base de datos para obtener empleados
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MONITOR ");

            // Recorrer el resultado y crear objetos Empleado
            while (rs.next()) {
                String dni = rs.getString("DNI");
                String nombre = rs.getString("NOMBRE");
                String apellidos = rs.getString("APELLIDOS");
                String dirr = rs.getString("DIRECCION");
                String  correo = rs.getString("CORREO");
                String  cod_monitor = rs.getString("CODIGOMONITOR");
                String  clave = rs.getString("CLAVE");
                Monitor lol = new Monitor(	dni,nombre, apellidos, dirr, correo, cod_monitor, clave);
                monn.add(lol);
            }

            // Cerrar el statement y el resultset
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return monn;
    }


    public void cargarParametrosconexion() {
        try {
            String driver = "jdbc:oracle:thin:@";
            String servidor = "localhost";
            String puerto = "1521";
            String sid = "XE";
            String usuario = "XX"; // Reemplaza "tu_usuario" con tu nombre de usuario de la base de datos
            String clave = "XX"; // Reemplaza "tu_clave" con tu contraseña de la base de datos

            // Construye la URL de conexión
            String urlConexion = driver + servidor + ":" + puerto + ":" + sid;
System.out.println(urlConexion);
            this.setCadena_conexion(urlConexion);
            this.setUsuario(usuario);
            this.setPass(clave);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertarPago(String codigoMonitor, String mes, int year, double nomina, String estado) {
        try {
            this.conn = DriverManager.getConnection(this.Cadena_conexion, this.usuario, this.pass);
            this.stmt = conn.createStatement();
            String sql = "INSERT INTO PAGOS (CODIGOMONITOR, MES, YEAR, NOMINA, ESTADO) VALUES ('" + codigoMonitor
                    + "', '" + mes + "', " + year + ", " + nomina + ", '" + estado + "')";
            stmt.executeUpdate(sql);
            System.out.println("Pago insertado correctamente en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            BD bd = BD.getInstance();
            bd.cargarParametrosconexion();

            // Cargar la lista de monitores
            ArrayList<Monitor> monn = bd.cargarMonitor();
        System.out.println(monn);
            // Mostrar los detalles de cada monitor por pantalla
            System.out.println("Detalles de los monitores:");
//            for (Monitor monitor : monn) {
//                System.out.println("DNI: " + monitor.getDni());
//                System.out.println("Nombre: " + monitor.getNombre());
//              
//                System.out.println("Dirección: " + monitor.getDirr());
//                System.out.println("Correo: " + monitor.getCorreo());
//                System.out.println("Código de monitor: " + monitor.getCod_monitor());
//                System.out.println("Clave: " + monitor.getClave());
//                System.out.println(); // Salto de línea para separar los detalles de cada monitor
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
