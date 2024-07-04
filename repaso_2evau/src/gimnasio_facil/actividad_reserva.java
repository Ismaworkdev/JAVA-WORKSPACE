package gimnasio_facil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class actividad_reserva {
private String nombreactividad ;
private double hora;
private String cod_monitor;
private int numero;
private int max_participantes;
private int num_participantes;





public actividad_reserva(String nombreactividad, double hora, String cod_monitor,  int max_participantes
		) {
	super();
	this.nombreactividad = nombreactividad;
	this.hora = hora;
	this.cod_monitor = cod_monitor;
	
	this.max_participantes = max_participantes;

}


public actividad_reserva(String nombreactividad, double hora, String cod_monitor, int numero, int max_participantes,
		int num_participantes) {
	super();
	this.nombreactividad = nombreactividad;
	this.hora = hora;
	this.cod_monitor = cod_monitor;
	this.numero = numero;
	this.max_participantes = max_participantes;
	this.num_participantes =this.calculaParticipantes();
}



public actividad_reserva() {
	super();
	this.nombreactividad = "";
	this.hora = 0;
	this.cod_monitor = "";
	this.numero = 0;
	this.max_participantes = 0;
	this.num_participantes = 0;
}




public String getNombreactividad() {
	return nombreactividad;
}


public void setNombreactividad(String nombreactividad) {
	this.nombreactividad = nombreactividad;
}


public double getHora() {
	return hora;
}


public void setHora(double hora) {
	this.hora = hora;
}


public String getCod_monitor() {
	return cod_monitor;
}


public void setCod_monitor(String cod_monitor) {
	this.cod_monitor = cod_monitor;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


public int getMax_participantes() {
	return max_participantes;
}


public void setMax_participantes(int max_participantes) {
	this.max_participantes = max_participantes;
}





public void setNum_participantes(int num_participantes) {
	this.num_participantes = num_participantes;
}


@Override
public String toString() {
	return "actividad_reserva [nombreactividad=" + nombreactividad + ", hora=" + hora + ", cod_monitor=" + cod_monitor
			+ ", numero=" + numero + ", max_participantes=" + max_participantes + ", num_participantes="
			+ num_participantes + "]";
}



//public void Calcular_participantes() {
//	
//	try {
//		Scanner entrada=new Scanner(new File("participantes.txt"));
//		String cadena;
//		String linea[];
//		cadena=entrada.nextLine();
//		
//		while(entrada.hasNext()) {
//			cadena=entrada.nextLine();
//			linea=cadena.split("-");
//			actividad_reserva a=new actividad_reserva(linea[0], 
//					Double.parseDouble(linea[1])   , linea[2], 
//					Integer.parseInt(linea[3])  ,  Integer.parseInt(linea[4]) ,
//					 Integer.parseInt(linea[5]) );
//		}
//		
//		
//		
//		
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//}

private int calculaParticipantes() {
    int contador = 0;
    try {
        Scanner entrada = new Scanner(new File("participantes.txt"));
        String cadena;
        String linea[];
        cadena = entrada.nextLine();
        while (entrada.hasNext()) {
            cadena = entrada.nextLine();
            linea = cadena.split("-");
            // Verifica si el nombre de la actividad y la hora coinciden
            if (this.getNombreactividad().equals(linea[1]) && this.getHora()==Double.parseDouble(linea[2])) {
            	 contador++;
			}
               
            
        }
        entrada.close(); // ¡No olvides cerrar el scanner!
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return contador;
}
public int getNum_participantes() {
    return calculaParticipantes();
}


public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	actividad_reserva aa=new actividad_reserva();
	aa.calculaParticipantes();
	
	System.out.println(aa.calculaParticipantes());
	
}
}


