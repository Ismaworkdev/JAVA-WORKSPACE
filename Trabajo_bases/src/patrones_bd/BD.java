package patrones_bd;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Scanner;
import java.io.*;

public class BD {
	private static BD Miinstancia = null;
	private static boolean permitir_instancianueva;
	private String Cadena_conexion ; //driver@host:puerto:sid
	private String usuario;
	private String pass;
	private Connection conn;
	private java.sql.Statement stmt;
	
	
	public BD () throws Exception {
		if(permitir_instancianueva) //si no puedo  crear el objeto 
			throw new Exception("no se puede crear otroobjeto de la clase ");
		// else  se crea el objeto si es null
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
		return (Statement) stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = (java.sql.Statement) stmt;
	}
	
	//metodo para consultar la bd
	public ResultSet consultaBD(String consulta) {
		ResultSet rset=null;
		try {
			this.conn= DriverManager.getConnection(this.Cadena_conexion,this.usuario,this.pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rset = stmt.executeQuery(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rset;
	}
	//esto es aparte xml pero no se usara porque yo uso lo otro 
	public void cargarparamerosconexionesxml(String fichero) {
		//config xml
		Scanner entrada;
		try {
			entrada = new Scanner (new File(fichero));
			String cadena="";
			String linea[];
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				System.out.println(cadena);
				//split 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
