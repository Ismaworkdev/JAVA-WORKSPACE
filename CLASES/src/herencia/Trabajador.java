package herencia;

public class Trabajador {
// ejemplo de erencia y polimorfismo 
	
	protected 	String nombre ;
	protected String apellido ;
	protected String dni;
	protected String dirrecion;
	protected static  final int PAGAS=14;
	
	

	public Trabajador() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.dirrecion = "";
	}
	
	
	
	public Trabajador(String nombre, String apellido, String dni, String dirrecion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.dirrecion = dirrecion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}



	@Override
	public String toString() {
		return "trabajador [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", dirrecion=" + dirrecion
				+ "]";
	}
	
	public double calcularpaga() {
		return 0;
		
	}
	
}
