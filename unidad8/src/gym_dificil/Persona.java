package gym_dificil;

import java.io.Serializable;

public class Persona implements Serializable {
	private String codigo;
	private String nombre;
	private String apellidos;
	private String email;
	
	public Persona(String codigo, String nombre, String apellidos, String email) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	public Persona() {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ "]";
	}
	
	
	
	
}
