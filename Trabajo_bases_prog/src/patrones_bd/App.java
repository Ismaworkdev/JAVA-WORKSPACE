package patrones_bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		BD MIBD= BD.getInstance();
		
		
		
		// JDBC LIBRERIA 
BD.getInstance().setCadena_conexion("jdbc:oracle:thin:@localhost:1521:xe");
BD.getInstance().setUsuario("JARDINERIA");
BD.getInstance().setPass("JARDINERIA");
   ResultSet rset = BD.getInstance().consultaBD("select count(*) from clientes");
   
   try {
	while(rset.next())
		   System.out.println("hay "+rset.getString(1)+" clientes");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
