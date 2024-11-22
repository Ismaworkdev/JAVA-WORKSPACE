package clinicaVeterinaria;

public class Vacuna {
	private String nombre;
	private String fecha;
	private String laboratorio;
	private double precio;
	//todos los parámetros
	public Vacuna(String nombre, String fecha, String laboratorio, double precio) {
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}
	//Por defecto
	public Vacuna() {
		this.nombre = "";
		this.fecha = "";
		this.laboratorio = "";
		this.precio = 0;
	}
	//Constructor con 3 parámetros
	public Vacuna(String nombre, String fecha, double precio) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.laboratorio = "";
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vacuna: " + nombre + " inyectada el " + fecha + " fabricada por " + laboratorio + " cuesta " + precio
				+ "€";
	}
	 
	//Prueba unitaria
	public static void main(String[] args) {
		Vacuna v=new Vacuna("Antirrábica","10/01/2024", 50);
		System.out.println(v);
		Vacuna v2=new Vacuna("Leishmania", "16/01/2024", "Pfizer", 70);
		System.out.println(v2);
	}
	
}
