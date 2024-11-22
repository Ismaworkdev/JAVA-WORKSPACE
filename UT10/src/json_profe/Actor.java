package json_profe;

public class Actor {
	private String nombre;
	private String apellido;
	private int edad;
	private String peliculas;
	private String pais;
	public Actor(String nombre, String apellido, int edad, String peliculas, String pais) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.peliculas = peliculas;
		this.pais = pais;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(String peliculas) {
		this.peliculas = peliculas;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peliculas=" + peliculas
				+ ", pais=" + pais + "]";
	}
	

}
