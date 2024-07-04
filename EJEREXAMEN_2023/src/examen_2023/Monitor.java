package examen_2023;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileReader;
import java.io.*;
public class Monitor extends Persona{
	
	private String cod_monitor;
	private String clave;
	
	private ArrayList<Clase> clase;
	private int extraClase;
	private int extraAlumno;
public static final int BASE = 1200;



	public Monitor(String dni, String nombre, String apellido, String dirr, String correo, 
			String cod_monitor, String clave, ArrayList<Clase> clase, int extraClase, int extraAlumno) {
		super(dni, nombre, apellido, dirr, correo);
		this.cod_monitor = cod_monitor;
		this.clave = clave;
		this.clase = new ArrayList<>();
		this.extraClase = extraClase;
		this.extraAlumno = extraAlumno;
	}
	

	public Monitor(String cod_monitor) {
		super();
		this.cod_monitor = cod_monitor;
		
		this.clase = new ArrayList<>();
		
	}
	
	
	
	
	public Monitor() {
		super();
		this.cod_monitor = "";
		this.clave = "";
		this.clase = new ArrayList<>();
		this.extraClase = 0;
		this.extraAlumno = 0;
	}



	public String getCod_monitor() {
		return cod_monitor;
	}



	public void setCod_monitor(String cod_monitor) {
		this.cod_monitor = cod_monitor;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public ArrayList<Clase> getClase() {
		return clase;
	}



	public void setClase(ArrayList<Clase> clase) {
		this.clase = clase;
	}



	public int getExtraClase() {
		return extraClase;
	}



	public void setExtraClase(int extraClase) {
		this.extraClase = extraClase;
	}



	public int getExtraAlumno() {
		return extraAlumno;
	}



	public void setExtraAlumno(int extraAlumno) {
		this.extraAlumno = extraAlumno;
	}



	public static int getBase() {
		return BASE;
	}



	@Override
	public String toString() {
		final int maxLen = 10;
		return "Monitor [cod_monitor=" + cod_monitor + ", clave=" + clave + ", clase="
				+ (clase != null ? clase.subList(0, Math.min(clase.size(), maxLen)) : null) + ", extraClase="
				+ extraClase + ", extraAlumno=" + extraAlumno + ", getCod_monitor()=" + getCod_monitor()
				+ ", getClave()=" + getClave() + ", getClase()="
				+ (getClase() != null ? getClase().subList(0, Math.min(getClase().size(), maxLen)) : null)
				+ ", getExtraClase()=" + getExtraClase() + ", getExtraAlumno()=" + getExtraAlumno() + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getDirr()="
				+ getDirr() + ", getCorreo()=" + getCorreo() + ", getTel()=" + getTel() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public void ClasesMonitor(String mes) {
		Scanner entrada= new Scanner(System.in);
		        
		        try {
		        	entrada = new Scanner(new File("asistencia"+mes+"2023.csv"));
		            String linea[];
					String cadena;
		            while (entrada.hasNextLine()) {
		            	cadena=entrada.nextLine();
						linea=cadena.trim().split(";");
		               
		                if (linea[5].equalsIgnoreCase(this.cod_monitor)) { // código del monitor
		                    Clase reserva = new Clase(linea[0], linea[1], linea[3],Integer.parseInt(linea[4]), linea[5],
		                			Integer.parseInt(linea[6]));
		                   
		                    clase.add(reserva);
		                    System.out.println(reserva);
		                }
		            }
		            entrada.close();
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        }
		    
	}
	
	public void CalculaComplementoClase(String mes) {
		Scanner entrada= new Scanner(System.in);
        
        try {
        	entrada = new Scanner(new File("asistencia"+mes+"2023.csv"));
            String linea[];
			String cadena;
            while (entrada.hasNextLine()) {
            	cadena=entrada.nextLine();
				linea=cadena.trim().split(";");
               
                if (linea[5].equalsIgnoreCase(this.cod_monitor)) { // código del monitor
                	  Clase reserva = new Clase(linea[0], linea[1], linea[3],Integer.parseInt(linea[4]), linea[5],
	                			Integer.parseInt(linea[6]));
	                   
	                   clase.add(reserva);
	                   
	               
                 
                   
                }
               
             	 
				
            }
            
       int contador_dias=0;
            for (Clase  lol : clase) {
          	 
			
				contador_dias= contador_dias+1;
			}
            
            System.out.println( contador_dias);
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 }
	
	
public static void main(String[] args) {
	Monitor m= new Monitor("100");
	
	//m.ClasesMonitor("abril");
	
	m.CalculaComplementoClase("abril");
}

}
