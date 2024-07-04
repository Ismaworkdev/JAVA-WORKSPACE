package Examen2022_2ordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void cargarParametrosconexion() {
		try {
			Scanner entrada = new Scanner(new File("configTienda_.txt"));
			String cadena;
			while(entrada.hasNext()) {
				cadena = entrada.nextLine();
				String[] linea = cadena.split(":=");
				switch(linea[0]) {
					case "conection":
						this.setCadena_conexion(linea[1]);
						break;
					case "user":
						this.setUsuario(linea[1]);
						break;
					case "pass":
						this.setPass(linea[1]);
						break;
				}
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Cliente> Cargar_clientes() throws SQLException {
		ArrayList<Cliente> cc = new ArrayList<Cliente>();
		ResultSet rs = null;
		try {
			this.conn = DriverManager.getConnection(this.Cadena_conexion, this.usuario, this.pass);
			this.stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM PERSONA");
			while(rs.next()) {
				String numero = "0"; 
				String metodo_pago = rs.getString("TURNO");
				if ( numero.equalsIgnoreCase(metodo_pago)) {
					String dni = rs.getString("DNI");
					String nombre = rs.getString("NOMBRE");
					String apellidos = rs.getString("APELLIDOS");
					String direccion = rs.getString("DIRECCION");
					 
					cc.add(new Cliente(dni, nombre, apellidos, direccion));
					
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cc;
	}

	
	
	    public static void main(String[] args) {
	        try {
	            BD bd = BD.getInstance();
	            bd.cargarParametrosconexion(); // Carga los parámetros de conexión desde el archivo
	            ArrayList<Cliente> clientes = bd.Cargar_clientes(); // Carga los clientes desde la base de datos
	            for(Cliente cliente : clientes) {
	                System.out.println(cliente); // Imprime los detalles del cliente
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



