package Examen_2evao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {
private int edad; 
private int npuntos;
private ArrayList<String> intereses = new ArrayList<>();



public Cliente(String nombre, String apellidos, String codigo, String gmail, int edad, int npuntos,
		ArrayList<String> intereses) {
	super(nombre, apellidos, codigo, gmail);
	this.edad = edad;
	this.npuntos = npuntos;
	this.intereses = intereses;
}

public Cliente(String nombre, String apellidos, String codigo, String gmail, int edad, int npuntos) {
	super(nombre, apellidos, codigo, gmail);
	this.edad = edad;
	this.npuntos = npuntos;

}


public Cliente(String nombre, String apellidos, String codigo, String gmail) {
	super(nombre, apellidos, codigo, gmail);
	

}

public Cliente() {
	super();
	
	this.edad = 0;
	this.npuntos = 0;
	intereses = new ArrayList<>(); //rcordar siempre inicializar el array joderrrrrrrrrrrrr
	//no funciona y da puntero nulo si no inicilalizzas . 
}

public Cliente(String nombre) {
	super(nombre);
	

}


public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getNpuntos() {
	return npuntos;
}

public void setNpuntos(int npuntos) {
	this.npuntos = npuntos;
}

public ArrayList<String> getIntereses() {
	return intereses;
}

public void setIntereses(ArrayList<String> intereses) {
	this.intereses = intereses;
}

@Override
public String toString() {
	return "Cliente [edad=" + edad + ", npuntos=" + npuntos + ", intereses=" + intereses + "]";
}




public void interesesCliente(String filename) {
	 try {
		Scanner entrada = new Scanner(new File("intereses.csv"));
	    String cadena;
        String linea[];
        cadena = entrada.nextLine();
    	System.out.println("el cliente "+this.getNombre()+"le gusta : ");
        while (entrada.hasNext()) {
            cadena = entrada.nextLine();
            linea = cadena.split(";");
          
            if (this.getCodigo().equalsIgnoreCase(linea[0])) {
                for (int i = 1; i < linea.length; i++) {
                  
                	this.getIntereses().add(new String(linea[i]));
                	System.out.println(linea[i]);
                }
            }

        }
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



public static void main(String[] args) {
	Cliente c=new Cliente("ll", "lll", "4", "ewrwerwe");
	
	c.interesesCliente("intereses.csv");
	
	;
}

	
}
