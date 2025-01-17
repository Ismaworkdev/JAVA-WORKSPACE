package gimnasio_facil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



import java.io.File;
public class Monitor {
	private ArrayList<actividad_reserva> list = new ArrayList<>();

	private String codigo;
	private String nombre;
	private Double hora;
	private String ape;
	public Monitor(ArrayList<actividad_reserva> list, String codigo, String nombre, Double hora, String ape) {
		super();
		this.list = list;
		this.codigo = codigo;
		this.nombre = nombre;
	this.hora=hora;
		this.ape = ape;
	}
	
	public Monitor( String nombre , Double hora, String codigo) {
		super();
	
		this.codigo = codigo;
		this.nombre = nombre;
		this.hora = hora;
	
	}
	
	public Monitor(  String codigo) {
	
	
		this.codigo = codigo;
		
	
	}
	
	public Monitor() {
		super();
		this.list = new ArrayList<>();
		this.codigo = "";
		this.nombre = "";
		this.hora = 0.0;
		this.ape = "";
	}

	public ArrayList<actividad_reserva> getList() {
		return list;
	}

	public void setList(ArrayList<actividad_reserva> list) {
		this.list = list;
	}

	public Double getHora() {
		return hora;
	}

	public void setHora(Double hora) {
		this.hora = hora;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}


	
	@Override
	public String toString() {
		return "Monitor [list=" + list + ", codigo=" + codigo + ", nombre=" + nombre + ", hora=" + hora + ", ape=" + ape
				+ "]";
	}

	public void cargaActividades() {
	    try {
	        Scanner entrada = new Scanner(new File("reserva.csv"));
	        String cadena;
	        String linea[];
	        cadena = entrada.nextLine();
	        
	        while (entrada.hasNext()) {
	            cadena = entrada.nextLine();
	            linea = cadena.split(";");
	            if (linea.length >= 4 && linea[2].equals(this.getCodigo())) {
	                this.getList().add(new actividad_reserva(linea[0], Double.parseDouble(linea[1]), linea[2], Integer.parseInt(linea[3].trim())));
	            }
	        }
	        entrada.close(); // Cerrar el Scanner después de usarlo
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (NumberFormatException e) {
	        e.printStackTrace();
	    } catch (ArrayIndexOutOfBoundsException e) {
	        e.printStackTrace();
	    }
	}

	
	public static void main(String[] args) {
		Monitor a=new Monitor("" ,0.0, "100");
		a.cargaActividades();
		System.out.println("Las actividades impartidas el monitor de c�digo 100 son: ");
		if (a.getList().isEmpty()) {
		    System.out.println("La lista está vacía.");
		} else {
		    for (actividad_reserva p : a.getList()) {
		        System.out.println(p.getNombreactividad() + " a las " + p.getHora() + " tiene " + p.getNum_participantes());
		    }
		}
}
	}
	
	
	

