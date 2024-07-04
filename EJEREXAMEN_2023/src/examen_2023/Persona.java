package examen_2023;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private String dirr;
	private String correo;
	private String tel;
	
	public Persona(String dni, String nombre, String apellido, String dirr, String correo, String tel) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirr = dirr;
		this.correo = correo;
		this.tel = tel;
	}
	
	public Persona(String dni, String nombre, String apellido, String dirr, String correo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirr = dirr;
		this.correo = correo;
		this.tel = tel;
	}
	
	public Persona() {
		super();
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
		this.dirr = "";
		this.correo = "";
		this.tel = "";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getDirr() {
		return dirr;
	}

	public void setDirr(String dirr) {
		this.dirr = dirr;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", dirr=" + dirr + ", correo="
				+ correo + ", tel=" + tel + "]";
	}
	

}
