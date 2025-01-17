package examen2023_;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

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

    private BD () throws Exception {
        if(!permitir_instancianueva)
            throw new Exception("No se puede crear otro objeto de la clase");
        permitir_instancianueva = false;
    }

    public static BD getInstance() throws Exception {
        if (Miinstancia == null) {
            Miinstancia = new BD();
        }
        return Miinstancia;
    }

    public void setCadena_conexion(String cadena_conexion) {
        this.Cadena_conexion = cadena_conexion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public void cargarParametrosconexion() throws ParseException, org.json.simple.parser.ParseException {
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(new FileReader("output.json"));
            String driver = (String) json.get("DRIVER");
            System.out.println(driver);
            String servidor = (String) json.get("SERVIDOR");
            System.out.println(servidor);
            String puerto = (String) json.get("PUERTO");
            System.out.println(puerto);
            String sid = (String) json.get("SID");
            System.out.println(sid);
            String usuario = (String) json.get("USUARIO");
            System.out.println(usuario);
            String clave = (String) json.get("CLAVE");
            System.out.println(clave);

            this.setCadena_conexion(driver + servidor + ":" + puerto + ":" + sid);
            this.setUsuario(usuario);
            this.setPass(clave);
        } catch (IOException e) { 
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            BD bd = BD.getInstance();
            bd.cargarParametrosconexion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

