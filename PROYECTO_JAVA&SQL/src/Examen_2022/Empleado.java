package Examen_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public  class Empleado extends Persona {
private int turno;
private ArrayList<Pedido> pedidosAsignados = new ArrayList<>();

public Empleado() {
	super();
	this.turno = 0;
	this.pedidosAsignados = new ArrayList<>();
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	this.pedidosAsignados = new ArrayList<>();
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno,
		ArrayList<Pedido> pedidosAsignados) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	this.pedidosAsignados = new ArrayList<>();
}
public int getTurno() {
	return turno;
}
public void setTurno(int turno) {
	this.turno = turno;
}
public ArrayList<Pedido> getPedidosAsignados() {
	return pedidosAsignados;
}
public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
	this.pedidosAsignados = pedidosAsignados;
}

@Override
public String toString() {
	return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + "]";
}
 

	public void AsignarpedidosEmpleado(String fichero) {
		  
		Scanner entrada;
		

	    try {
	    	 entrada = new Scanner(new File(fichero));
	    	String linea[];
			String cadena ="";
			cadena =entrada.nextLine();
	        while (entrada.hasNext()) {
	        	cadena=entrada.nextLine();
				linea=cadena.split(";");
				
				    if (this.turno == Integer.parseInt(linea[3]) ) {
                                   this.getPedidosAsignados().add(new Pedido(linea[0], linea[1],Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
					    
	         
				
	        
                           
	            
	        }
	    
	     
	    }} catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    System.out.println(this.getPedidosAsignados());
	


}
	
	
	
}