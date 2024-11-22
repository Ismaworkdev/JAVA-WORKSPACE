package Examen_2022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BD {
    private static BD Miinstancia = null;
    private static boolean permitir_instancianueva;
    private String Cadena_conexion; //driver@host:puerto:sid
    private String usuario;
    private String pass;
    private Connection conn;
    private java.sql.Statement stmt;

    public BD() throws Exception {
        if (permitir_instancianueva) //si no puedo crear el objeto
            throw new Exception("no se puede crear otro objeto de la clase ");
        // else se crea el objeto si es null
    }

    public static BD getInstance() {
        if (Miinstancia == null) {
            permitir_instancianueva = false;
            try {
                Miinstancia = new BD();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Miinstancia;
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

    // Método para cargar los parámetros de conexión desde un archivo de texto
    public void cargarParametrosConexion(String archivo) {
        try {
            // Leer el archivo de texto
            Scanner scanner = new Scanner(new File(archivo));

            // Leer la primera línea que contiene la cadena de conexión, usuario y contraseña
            String[] parametros = scanner.nextLine().split("-");

            // Establecer los parámetros de conexión
            this.setCadena_conexion(parametros[0]);
            this.setUsuario(parametros[1]);
            this.setPass(parametros[2]);

            // Cerrar el scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(this.getUsuario());
    }

    // Método para conectar a la base de datos utilizando los parámetros cargados
    public void conectarBD() {
        try {
            this.conn = DriverManager.getConnection(this.getCadena_conexion(), this.getUsuario(), this.getPass());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para consultar la base de datos
    public ResultSet consultaBD(String consulta) {
        ResultSet rset = null;
        try {
            this.conectarBD();
            this.stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rset;
    }
    
    //cargar empleados 
//    public ArrayList<Empleado> cargarEmpleado() {
//        ArrayList<Empleado> empleados = new ArrayList<>();
//        String consulta = "SELECT DNI, NOMBRE FROM PERSONA WHERE TURNO != 0";
//
//        try {
//            PreparedStatement pstmt = conn.prepareStatement(consulta);
//            ResultSet rset = pstmt.executeQuery();
//            
//            while (rset.next()) {
//                String dni = rset.getString("DNI");
//                String nombre = rset.getString("NOMBRE");
//                
//                Empleado empleado = new Empleado(dni, nombre, "", "", 0); // Crear un Empleado con DNI y nombre obtenidos de la base de datos
//                empleados.add(empleado);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        
//        return empleados;
//    }
//  
    
    public ArrayList<Empleado> cargarEmpleado() {
        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            // Verificar si la conexión está establecida
            if (conn == null || conn.isClosed()) {
                conectarBD(); // Si no está establecida, conectar a la base de datos
            }

            // Consultar la base de datos para obtener empleados
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONA WHERE TURNO <> 0");

            // Recorrer el resultado y crear objetos Empleado
            while (rs.next()) {
                String dni = rs.getString("DNI");
                String nombre = rs.getString("NOMBRE");
                String apellidos = rs.getString("APELLIDOS");
                String dirr = rs.getString("DIRECCION");
                int turno = rs.getInt("TURNO");

                Empleado empleado = new Empleado(dni, nombre, apellidos, dirr, turno);
                empleados.add(empleado);
            }

            // Cerrar el statement y el resultset
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }

        public static void main(String[] args) {
            BD bd = BD.getInstance(); // Obtener instancia de la clase BD

            // Cargar parámetros de conexión desde el archivo configTienda.txt
            bd.cargarParametrosConexion("configTienda.txt");
            bd.conectarBD();

            // Verificar si la conexión fue exitosa
            if (bd.getConn() != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí podrías realizar otras operaciones con la base de datos si lo deseas
            } else {
                System.out.println("No se pudo establecer conexión a la base de datos.");
            }
            
            ResultSet rset = BD.getInstance().consultaBD("select count(*) from PERSONA");
            try {
                while(rset.next()) {
                    int count = rset.getInt(1);
                    System.out.println("hay " + count + " Personas");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            
            // empleados 
            
            if (bd.getConn() != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                
                // Cargar empleados desde la base de datos
                ArrayList<Empleado> empleados = bd.cargarEmpleado();
                
                // Mostrar los empleados cargados
                System.out.println("Empleados cargados:");
                for (Empleado empleado : empleados) {
                    System.out.println("Nombre: " + empleado.getNombre() + ", DNI: " + empleado.getDni());
                }
            } else {
                System.out.println("No se pudo establecer conexión a la base de datos.");
            }

        }
    }



