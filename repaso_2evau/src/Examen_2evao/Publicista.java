package Examen_2evao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Publicista extends Persona {
private double antiguedad;
private ArrayList<Cliente>cli;


public Publicista(String nombre, String apellidos, String codigo, String gmail, int antiguedad,
		ArrayList<Cliente> cli) {
	super(nombre, apellidos, codigo, gmail);
	this.antiguedad = antiguedad;
	this.cli =cli;
}


public Publicista(String nombre, String apellidos, String codigo, String gmail, double d) {
    super(nombre, apellidos, codigo, gmail);
    this.antiguedad = d;
    this.cli = new ArrayList<Cliente>(); // Inicializa la lista cli
}



public Publicista() {
    super();
    this.antiguedad = 0;
    this.cli = new ArrayList<Cliente>(); // Initialize cli as an empty ArrayList
}


public double getAntiguedad() {
	return antiguedad;
}

public void setAntiguedad(double antiguedad) {
	this.antiguedad = antiguedad;
}

public ArrayList<Cliente> getCli() {
	return cli;
}

public void setCli(ArrayList<Cliente> cli) {
	this.cli = cli;
}

@Override
public String toString() {
	return "Publicista [antiguedad=" + antiguedad + ", cli=" + cli + "]";
}

public void cargarListaClientes(String filename) {
    try {
        Scanner entrada = new Scanner(new File("Personas.csv"));
        System.out.println("El publicista " + this.getNombre() + " tiene los siguientes clientes:");

        while (entrada.hasNext()) {
            String[] linea = entrada.nextLine().split(";");

            if (linea[0].equalsIgnoreCase("cliente") && this.getCodigo().equalsIgnoreCase(linea[1])) {
                Cliente cliente = new Cliente(); //creas un objeto 
                cliente.setNombre(linea[3]); //haces el set no el get solo set 
                this.getCli().add(cliente); //y haces el add en ela array 
            }
        }
        entrada.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

public static void main(String[] args) {
    Publicista p = new Publicista("llol", "lol", "101", "lol", 88);
    p.cargarListaClientes("Personas.csv");

    // Mostrar los nombres de los clientes
    for (Cliente cliente : p.getCli()) {
        System.out.println(cliente.getNombre());
    }
}}