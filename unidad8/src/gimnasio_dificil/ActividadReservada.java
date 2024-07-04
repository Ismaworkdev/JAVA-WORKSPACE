package gimnasio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class ActividadReservada implements Serializable{
	private String nombreActividad;
	private double hora;
	private String codigoMonitor;
	private int nMax;
	private int nPart;
	public ActividadReservada(String nombreActividad, double hora, String codigoMonitor, int nMax) {
		super();
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMax = nMax;
		this.nPart = this.calculaParticipantes();
	}
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public String getCodigoMonitor() {
		return codigoMonitor;
	}
	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	public int getnMax() {
		return nMax;
	}
	public void setnMax(int nMax) {
		this.nMax = nMax;
	}
	public int getnPart() {
		return nPart;
	}
	public void setnPart(int nPart) {
		this.nPart = nPart;
	}
	@Override
	public String toString() {
		return "ActividadReservada [nombreActividad=" + nombreActividad + ", hora=" + hora + ", codigoMonitor=" + codigoMonitor
				+ ", nMax=" + nMax + ", nPart=" + nPart + "]";
	}
	public int calculaParticipantes() {
		int contador=0;
		try {
			Scanner entrada=new Scanner(new File("participantes.txt"));
			String cadena;
			String linea[];
			cadena=entrada.nextLine();
			
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split("-");
				if(this.getNombreActividad().equals(linea[1]) && this.getHora()==Double.parseDouble(linea[2])) {
					contador++;
				}
			}
			
			//Actualizo el valor del atributo del objeto
			//this.setnPart(contador);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contador;
	}
	
}
