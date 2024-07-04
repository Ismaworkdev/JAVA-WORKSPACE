package examen_clinica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paciente extends Persona {
 private int peso;
 private int edad;
 private String cita; //cardiologia argeologia 
 private String historial;
 
 
public Paciente(String dni, String nombre, String apellidos, String telefono, int peso, int edad, String cita,
		String historial) {
	super(dni, nombre, apellidos, telefono);
	this.peso = peso;
	this.edad = edad;
	this.cita = cita;
	this.historial = historial;
}
 

public Paciente() {

	this.peso = 0;
	this.edad = 0;
	this.cita = "";
	this.historial = "";
}


public int getPeso() {
	return peso;
}


public void setPeso(int peso) {
	this.peso = peso;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getCita() {
	return cita;
}


public void setCita(String cita) {
	this.cita = cita;
}


public String getHistorial() {
	return historial;
}


public void setHistorial(String historial) {
	this.historial = historial;
}

public void Guardar_historia() {
	  FileWriter file ;
	  PrintWriter salida;
	  String nombre_fichero = "Historia"+this.getDni()+".txt";
	  
	  try {
		file = new FileWriter(nombre_fichero , true);
		salida = new PrintWriter(nombre_fichero);
		salida.println(this.getHistorial());
		salida.flush();
		salida.close();
				} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

@Override
public String toString() {
	return "Paciente [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historial=" + historial + ", toString()="
			+ super.toString() + "]";
}

public static void main(String[] args) {
	Paciente p= new Paciente();
	p.Guardar_historia();
}
 
}
