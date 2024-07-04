package Examen_ismael;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class App {
private ArrayList<Publicista> p;
private ArrayList<Oferta> o;

public App(ArrayList<Publicista> p, ArrayList<Oferta> o) {
	super();
	this.p = p;
	this.o = o;
}
public App() {
	super();
	this.p = new ArrayList<Publicista>();
	this.o = new ArrayList<Oferta>();
}
public ArrayList<Publicista> getP() {
	return p;
}
public void setP(ArrayList<Publicista> p) {
	this.p = p;
}
public ArrayList<Oferta> getO() {
	return o;
}
public void setO(ArrayList<Oferta> o) {
	this.o = o;
}

@Override
public String toString() {
	return "App [p=" + p + ", o=" + o + "]";
}
public void leerOferta(){
	Scanner entrada = new Scanner(System.in);
	try {
		 entrada =new Scanner(new File ("Ofertas.txt"));
		String cadena="";
		String []linea;
	//	entrada.nextLine(); eso no hace falta saltar una linea 
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(",");
			o.add(new Oferta(linea[0],linea[1], linea[2], Integer.parseInt(linea[3])));
			
		}
		System.out.println("Ofertas : ");
		for (Oferta oo : o) {
			  System.out.println("\t" + oo);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}





public void leerPublicista(){
	Scanner entrada = new Scanner(System.in);
	try {
		 entrada =new Scanner(new File ("Personas.csv"));
		String cadena="";
		String []linea;
	//	entrada.nextLine(); eso no hace falta saltar una linea 
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			if(linea[0].equalsIgnoreCase("publicista")) {
				p.add(new Publicista(Integer.parseInt(linea[1]),linea[2],linea[3],linea[4],Double.parseDouble(linea[5])
						));
				  
			}
			
		}
		
		System.out.println("Publicistas : ");
		for (Publicista pp : p) {
			System.out.println("\t"+pp);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void generarCorreos(Publicista pp) {
	EnvioPorFicheros ee=new EnvioPorFicheros();
	String mensaje="";
	
	for (Cliente cli : pp.getClientes()) {
		cli.interesesCliente("intereses.csv");
		mensaje=mensaje +"hola "+cli.getNombre()+ "tus intereses son :";
		
		for (String ll : cli.getIntereses()) {
			mensaje=mensaje+"\t *"+ll+"\n";
			
		}
		cli.mostrarIntereses();
		
		ee.enviarPublicidad(cli.getCorreo(), mensaje);
		mensaje="";
	}
	
}

public static void main(String[] args) {
	App a=new App();
	a.leerOferta();
	a.leerPublicista();
	
	for (Publicista p : a.getP()) {
		p.cargarListaClientes("Personas.csv");
		a.generarCorreos(p);
		System.out.println(
				" " + p.getNombre() + " " + p.getApellidos() + " envía " + p.getClientes().size() + " correos");
		
	}
}

}
