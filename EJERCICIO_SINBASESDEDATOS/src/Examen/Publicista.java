package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Publicista extends Persona implements Serializable{

	private int antiguedad;
	private ArrayList<Cliente>clientes;
	
	public Publicista(int codigo, String nombre, String apellidos, String correo, int antiguedad,
			ArrayList<Cliente> clientes) {
		super(codigo, nombre, apellidos, correo);
		this.antiguedad = antiguedad;
		this.clientes = clientes;
	}
	
	public Publicista() {
		super();
		this.antiguedad = 0;
		this.clientes = new ArrayList<Cliente>();
	}

	public Publicista(int codigo, String nombre, String apellidos, String correo, int antiguedad) {
		super(codigo, nombre, apellidos, correo);
		this.antiguedad = antiguedad;
		this.clientes = new ArrayList<Cliente>();
	}

	@Override
	public String toString() {
		return "Publicista [antiguedad=" + antiguedad + ", clientes=" + clientes + ", codigo=" + codigo + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	
	
	
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void mostrarClientes() {
		System.out.println("Los clientes de "+this.getNombre()+" "+this.getApellidos()+" son:");
		for (Cliente c : clientes) {
			System.out.println(c.getNombre()+" "+c.getApellidos());
		}
	}

	public void cargarListaClientes(String filename) {
		
		
		//aqui cargamos los clientes de cada publicista 
		Scanner entrada= new Scanner(System.in);
		try {
			entrada = new Scanner(new File(filename));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.trim().split(";");
				
				if(this.getCodigo()==Integer.parseInt(linea[1])) {
					if(linea[0].equalsIgnoreCase("cliente")) {
						this.getClientes().add(new Cliente(Integer.parseInt(linea[2]),linea[3],linea[4],linea[5],Integer.parseInt(linea[6]),Integer.parseInt(linea[9])));
					}
				}
				
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Publicista p=new Publicista(101,"Pablo","Garcia Benito","aaA",23);
		p.cargarListaClientes("Personas.csv");
		p.mostrarClientes();
		for(Cliente c: p.getClientes())
			c.interesesCliente("intereses.csv");
		for(Cliente c: p.getClientes())
			c.mostrarIntereses();
		
	
	}
	
	
	
	
}
