package clinicaVeterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String dni;
	private String direccion;
	private String email;
	private ArrayList<Animal>mascotas;
	
	public Cliente(String nombre, String dni, String direccion, String email, ArrayList<Animal> mascotas) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.mascotas = mascotas;
	}

	public Cliente(String nombre, String dni, String direccion, String email) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.mascotas=new ArrayList<Animal>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", email=" + email
				+ ", mascotas=" + mascotas + "]";
	}
	
	
	

}
