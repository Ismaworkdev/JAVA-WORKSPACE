package examen_clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Clinica {
private ArrayList<Profesionales> medicos;
private ArrayList<Paciente>cola;


public Clinica(ArrayList<Profesionales> medicos, ArrayList<Paciente> cola) {
	super();
	this.medicos = medicos;
	this.cola = cola;
}

public Clinica() {
	super();
	this.medicos = new ArrayList<>();
	this.cola =  new ArrayList<>();
}

public ArrayList<Profesionales> getMedicos() {
	return medicos;
}

public void setMedicos(ArrayList<Profesionales> medicos) {
	this.medicos = medicos;
}

public ArrayList<Paciente> getCola() {
	return cola;
}

public void setCola(ArrayList<Paciente> cola) {
	this.cola = cola;
}

public void leer_paciente() {
	
	    try {
	        Scanner entrada = new Scanner(new File("participantes.txt"));
	        String cadena;
	        String linea[];
	        cadena = entrada.nextLine();
	        while (entrada.hasNext()) {
	            cadena = entrada.nextLine();
	            linea = cadena.split(";");
	            // Verifica si el nombre de la actividad y la hora coinciden
	            if (linea[0].equalsIgnoreCase("paciente")) {
	            	cola.add(null)
				}
	               
	            
	        }
	        entrada.close(); // ¡No olvides cerrar el scanner!
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	   
}

public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	int opcion=0;
	Clinica a=new Clinica();
	do {
		System.out.println("1. Lista de pacientes");
		System.out.println("2. Cargar historial cliente ");
		System.out.println("3. Atender paciente  ");
		System.out.println("4. Salir  ");
		System.out.println("5 .elije una opcion");
		opcion=teclado.nextInt();

	
	switch(opcion) {
	case 1:
		
		break;
	case 2:
	
		break;
	case 3:
		break;
	case 4:
	break;
	case 5:
		break;
	}
	}while(opcion!=5);
}
}




