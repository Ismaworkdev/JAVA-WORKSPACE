package clinicaVeterinaria;

import java.util.ArrayList;

//Super clase
public abstract class Animal {
	protected int edad;
	protected double peso;
	protected String raza;
	protected String sexo;
	protected String nombre;
	protected ArrayList<Vacuna>libroVacunacion;
	
	public Animal(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.libroVacunacion = libroVacunacion;
	}
	public Animal(int edad, double peso, String raza, String sexo, String nombre) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.libroVacunacion=new ArrayList<Vacuna>();
	}
	
	public Animal() {
		this.edad = 0;
		this.peso = 0;
		this.raza = "";
		this.sexo = "";
		this.nombre = "";
		this.libroVacunacion=new ArrayList<Vacuna>();
	}
	
	public Animal(String nombre) {
		this.edad = 0;
		this.peso = 0;
		this.raza = "";
		this.sexo = "";
		this.nombre = nombre;
		this.libroVacunacion=new ArrayList<Vacuna>();
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Vacuna> getLibroVacunacion() {
		return libroVacunacion;
	}
	public void setLibroVacunacion(ArrayList<Vacuna> libroVacunacion) {
		this.libroVacunacion = libroVacunacion;
	}
	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", peso=" + peso + ", raza=" + raza + ", sexo=" + sexo + ", nombre=" + nombre
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	
	
	
}
