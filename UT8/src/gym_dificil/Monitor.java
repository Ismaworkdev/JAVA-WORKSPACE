package gym_dificil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public class Monitor extends Persona  implements Serializable{
	private ArrayList<ActividadReservada> actividades;

	public Monitor() {
		super();
		this.actividades=new ArrayList<>();
	}
	public Monitor(String codigo, String nombre, String apellidos, String email, ArrayList<ActividadReservada> actividades) {
		super(codigo, nombre, apellidos, email);
		this.actividades = actividades;
	}

	public Monitor(String codigo, String nombre, String apellidos, String email) {
		super(codigo, nombre, apellidos, email);
		this.actividades = new ArrayList<>();
	}

	public ArrayList<ActividadReservada> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadReservada> actividades) {
		this.actividades = actividades;
	}

	@Override
	public String toString() {
		return "Monitor [actividades=" + actividades + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEmail()=" + getEmail() + "]";
	}

	public void cargaActividades() {
		Scanner entrada;
		this.getActividades().clear();
		try {
			entrada = new Scanner(new File("reserva.csv"));
			String cadena="";
			String linea[];
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				if(linea[2].equals(this.getCodigo()))
					this.getActividades().add(new ActividadReservada(linea[0], Double.parseDouble(linea[1]),
							linea[2], Integer.parseInt(linea[3].trim())));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	public static void main(String[] args) {
		Monitor m=new Monitor("100", "", "", "");
		m.cargaActividades();
		System.out.println("Las actividades impartidas el monitor de c�digo 100 son: ");
		for(ActividadReservada a: m.getActividades())
			System.out.println(a.getNombreActividad()+" a las "+a.getHora()+" tiene "+a.getnPart()+" participantes");
		
		
	}
	
}
