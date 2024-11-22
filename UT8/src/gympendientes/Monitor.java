package gympendientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import fichero_objetos.App;

public class Monitor extends Persona {

	private ArrayList<ActividadesReserva>ac;

	public Monitor(String codigo, String nombre, String ape, String email, ArrayList<ActividadesReserva> ac) {
		super(codigo, nombre, ape, email);
		this.ac = ac;
	}

	public Monitor(String codigo, String nombre, String ape, String email) {
		super(codigo, nombre, ape, email);
		this.ac=new  ArrayList<ActividadesReserva>();
	}

	

	

	public ArrayList<ActividadesReserva> getAc() {
		return ac;
	}

	public void setAc(ArrayList<ActividadesReserva> ac) {
		this.ac = ac;
	}
	
@Override
	public String toString() {
		return "Monitor [ac=" + ac + "]";
	}

public void cargarActividades(String filename) {
	try {
		Scanner entrada =new Scanner(new File(filename));
		String cadena="";
		String []linea;
		while (entrada.hasNext()) {
			cadena=entrada.nextLine();
			System.out.println(cadena);
			linea =cadena.split(";");
			if (linea[2].equalsIgnoreCase(this.getCodigo())) {
				this.getAc().add(new ActividadesReserva(linea[0], Double.parseDouble(linea[1]), linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4])));
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
