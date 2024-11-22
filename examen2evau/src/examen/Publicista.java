package examen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Publicista extends Cliente{
	private Cliente[] cc;
private String Antiguedad;
private String codcliente;
private String nombre;
private String apellidos;
private String correos;






public Cliente[] getCc() {
	return cc;
}






public void setCc(Cliente[] cc) {
	this.cc = cc;
}






public String getAntiguedad() {
	return Antiguedad;
}






public void setAntiguedad(String antiguedad) {
	Antiguedad = antiguedad;
}






public String getCodcliente() {
	return codcliente;
}






public void setCodcliente(String codcliente) {
	this.codcliente = codcliente;
}






public String getNombre() {
	return nombre;
}






public void setNombre(String nombre) {
	this.nombre = nombre;
}






public String getApellidos() {
	return apellidos;
}






public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}






public String getCorreos() {
	return correos;
}






public void setCorreos(String correos) {
	this.correos = correos;
}











public void CargarListaCliente(String filename) {
	ArrayList<Cliente> c=new ArrayList<Cliente>();
	try {
		Scanner entrada =new Scanner(new File("Personas.csv"));
		String cadena="";
		String []linea;
		while (entrada.hasNext()) {
			cadena=entrada.nextLine();
			System.out.println(cadena);
			linea =cadena.split(";");
			if (linea[1].equalsIgnoreCase()) {
				c.add(new Cliente(String codcliente, String nombre, String apellidos, String correos, int edad, int nPuntos,
						Oferta[] o));
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}




}
