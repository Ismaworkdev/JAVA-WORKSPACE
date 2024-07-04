package examen_clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Profesionales extends Persona {
private String especialidad;
public static final int MAÑANA=0;
public static final int TARDE=1;
public static final int NOCHE=2;
private ArrayList<Persona> p ;




public Profesionales(String dni, String nombre, String apellidos, String telefono, String especialidad,
		ArrayList<Persona> p) {
	super(dni, nombre, apellidos, telefono);
	this.especialidad = especialidad;
	this.p = p;
}


public Profesionales() {
	super();
	this.especialidad = "";
	this.p = new ArrayList<>();
}

public String getEspecialidad() {
	return especialidad;
}


public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}


public static int getMañana() {
	return MAÑANA;
}


public static int getTarde() {
	return TARDE;
}


public static int getNoche() {
	return NOCHE;
}


public ArrayList<Persona> getP() {
	return p;
}


public void setP(ArrayList<Persona> p) {
	this.p = p;
}




@Override
public String toString() {
	return "Profesionales [especialidad=" + especialidad + ", p=" + p + ", toString()=" + super.toString() + "]";
}





public static void main(String[] args) {
    Profesionales pp = new Profesionales();
 
    
}
}