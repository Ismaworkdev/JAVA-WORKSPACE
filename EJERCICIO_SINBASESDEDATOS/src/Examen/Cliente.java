package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public class Cliente extends Persona implements Serializable {

	private double edad;
	private int nPuntos;
	private ArrayList<String>Intereses;
	
	public Cliente(int codigo, String nombre, String apellidos, String correo, double edad, int nPuntos,
			ArrayList<String> intereses) {
		super(codigo, nombre, apellidos, correo);
		this.edad = edad;
		this.nPuntos = nPuntos;
		Intereses = intereses;
	}

	public Cliente() {
		super();
		this.edad = 0;
		this.nPuntos = 0;
		Intereses = new ArrayList<>();
	}

	public Cliente(int codigo, String nombre, String apellidos, String correo, double edad, int nPuntos) {
		super(codigo, nombre, apellidos, correo);
		this.edad = edad;
		this.nPuntos = nPuntos;
		Intereses = new ArrayList<>();
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public int getnPuntos() {
		return nPuntos;
	}

	public void setnPuntos(int nPuntos) {
		this.nPuntos = nPuntos;
	}

	public ArrayList<String> getIntereses() {
		return Intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		Intereses = intereses;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", nPuntos=" + nPuntos + ", Intereses=" + Intereses + ", codigo=" + codigo
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	public void mostrarIntereses() {
	
		System.out.println(" A "+this.nombre+" le gusta : ");
		for (String c : this.getIntereses()) {
			System.out.println("\t *"+c);
		}
	}
	
	public void interesesCliente(String filename) {
		
		//aqui cargamos los intereses de cada cliente 
		Scanner entrada= new Scanner(System.in);
		try {
			entrada = new Scanner(new File(filename));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.trim().split(";");
				
				if(this.getCodigo()==Integer.parseInt(linea[0])) {
					for(int i=1;i<linea.length;i++) {
						this.getIntereses().add(new String(linea[i]));
					}
				}
	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//se debe poner el cliente para probarlo 
		Cliente c=new Cliente(1,"Juan","García","Perez",21,3);
		
		c.interesesCliente("intereses.csv");
		c.mostrarIntereses();
		
		Cliente c2=new Cliente(6,"popo","García","Perez",21,3);
		c2.interesesCliente("intereses.csv");
		c2.mostrarIntereses();
	}
	
	
}
