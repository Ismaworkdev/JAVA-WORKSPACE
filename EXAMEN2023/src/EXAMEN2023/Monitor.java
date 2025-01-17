package EXAMEN2023;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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


	
	public Monitor(	String dni, String nombre, String apellido, String dirr, String correo, 
			String cod_monitor, String clave) {
		super(dni, nombre, apellido, dirr, correo);
		this.cod_monitor = cod_monitor;
		this.clave = clave;
		this.clase = new ArrayList<>();
	
	}
	public Monitor(String cod_monitor , String nombre, String apellido ) {
		super( nombre, apellido);
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
		               
			            if (linea.length > 5 && linea[5].equalsIgnoreCase(this.cod_monitor)) { // Verificar si hay al menos 6 elementos
 // código del monitor
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
	    Scanner entrada = null;

	    try {
	        entrada = new Scanner(new File("asistencia" + mes + "2023.csv"));
	        String linea[];
	        String cadena;
	        
	  

	        while (entrada.hasNextLine()) {
	            cadena = entrada.nextLine();
	            linea = cadena.trim().split(";");

	            if (linea.length > 5 && linea[5].equalsIgnoreCase(this.cod_monitor) && mes.equalsIgnoreCase(linea[1])) { // Verificar si hay al menos 6 elementos
	                Clase reserva = new Clase(linea[0], linea[1], linea[3], Integer.parseInt(linea[4]), linea[5],
	                        Integer.parseInt(linea[6]));

	                clase.add(reserva);
	            }
	        }

	        
	        entrada.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    

        // Escribir la información en un archivo

			
		
        try {
            // Variables para contabilizar totales
	        int contar_clase = 0;
	        int contar_participante = 0;
	        int total_dinero = 0;
            BufferedWriter mensaje = new BufferedWriter(
                    new FileWriter("complemento" + mes + this.getApellido() + this.getNombre() + ".txt", true));
            mensaje.write("El monitor  "+this.getNombre()+" tiene los dias EN EL MES  : "+mes);
            String dia_anterior = "";
            boolean dia_impreso = false;
                         
            // Se recorre la lista de clases
            for (Clase clase : this.clase) {
                // Si el día de la clase actual es diferente del día anterior, imprimir el día
                if (!dia_anterior.equals(clase.getDia())) {
                    dia_anterior = clase.getDia();
                    dia_impreso = false;
                    
                    mensaje.write("\nDia: " + dia_anterior + "\n");
                }

                // Imprimir información de la clase
                mensaje.write("Hora de la clase: " + clase.getHora() + "\n");
                mensaje.write("Número de participantes: " + clase.getNumero_participantes() + "\n");

                // Actualizar totales
                contar_clase++;
                contar_participante += clase.getNumero_participantes();
            }

            // Calcular el dinero total y escribir totales
            total_dinero = contar_clase * 5 + contar_participante * 3 / 10;
            mensaje.write("\nTotal de participantes: " + contar_participante + "\n");
            mensaje.write("Total de clases: " + contar_clase + "\n");
            mensaje.write("Dinero total: " + total_dinero + " euros\n");

            mensaje.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	
	
public static void main(String[] args) {
	Monitor m= new Monitor("100", "lol", "lol");
	
	m.ClasesMonitor("Mayo");
	
	m.CalculaComplementoClase("Mayo");
}

}
