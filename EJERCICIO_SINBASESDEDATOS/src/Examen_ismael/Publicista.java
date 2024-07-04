package Examen_ismael;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Publicista extends Persona {
private double Antiguedad;
private ArrayList<Cliente>clientes;


public Publicista(int codigo, String nombre, String apellidos, String correo, double antiguedad,
		ArrayList<Cliente> clientes) {
	super(codigo, nombre, apellidos, correo);
	Antiguedad = antiguedad;
	this.clientes = clientes;
}


public Publicista() {
	super();
	Antiguedad = 0;
	this.clientes = new ArrayList<Cliente>();
}
public Publicista(int codigo, String nombre, String apellidos, String correo, double antiguedad
		) {
	super(codigo, nombre, apellidos, correo);
	Antiguedad = antiguedad;
	this.clientes = new ArrayList<Cliente>();
}


public double getAntiguedad() {
	return Antiguedad;
}


public void setAntiguedad(double antiguedad) {
	Antiguedad = antiguedad;
}


public ArrayList<Cliente> getClientes() {
	return clientes;
}


public void setClientes(ArrayList<Cliente> clientes) {
	this.clientes = clientes;
}




@Override
public String toString() {
	return "Publicista [Antiguedad=" + Antiguedad + ", clientes=" + clientes + ", codigo=" + codigo + ", nombre="
			+ nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
}


public void cargarListaClientes(String filename) {
	Scanner entrada= new Scanner(System.in);
	
	
	
	
	try {
		entrada=new Scanner(new File(filename));
		
		
		String linea[];
		String cadena;
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.trim().split(";");
			if (this.getCodigo()==Integer.parseInt(linea[1])) {
				if (linea[0].equalsIgnoreCase("Publicista")) {
					System.out.println("El Publicista  "+this.nombre+"  tiene de Clientes : ");
				}
				if (linea[0].equalsIgnoreCase("cliente")) {
                    this.getClientes().add(new Cliente(Integer.parseInt(linea[2]),
                            linea[3], linea[4], linea[5], Integer.parseInt(linea[6]),
                            Integer.parseInt(linea[9])));
                    System.out.println("Cliente agregado: " + linea[3]);
                }
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	
	Publicista o=new Publicista(101, "Pablo", "eee","eee",222);
	o.cargarListaClientes("Personas.csv");
}

}
