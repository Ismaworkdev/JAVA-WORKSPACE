package examen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Publicista {
	
private String Antiguedad;
private String codcliente;
private String nombre;
private String apellidos;
private String correos;



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
		Scanner entrada =new Scanner(new File(filename));
		String cadena="";
		String []linea;
		while (entrada.hasNext()) {
			cadena=entrada.nextLine();
			System.out.println(cadena);
			linea =cadena.split(";");
			if (linea[0].equalsIgnoreCase("cliente")) {
				// Crear un nuevo cliente y añadirlo a la lista
				Cliente cliente = new Cliente();
				cliente.setCodcliente(linea[1]);
				cliente.setNombre(linea[3]);
				cliente.setApellidos(linea[4]);
				cliente.setCorreos(linea[5]);
				
				
				c.add(cliente);
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}

}
