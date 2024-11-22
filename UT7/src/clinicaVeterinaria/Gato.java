package clinicaVeterinaria;

import java.util.ArrayList;

public class Gato extends Animal {
	private boolean obesidad;

	public Gato(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion,
			boolean obesidad) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.obesidad = obesidad;
	}

	public Gato(int edad, double peso, String raza, String sexo, String nombre, boolean obesidad) {
		super(edad, peso, raza, sexo, nombre);
		this.obesidad = obesidad;
	}
	
	public Gato() {
		super();
		this.obesidad=false;
	}

	public boolean isObesidad() {
		return obesidad;
	}

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}

	@Override
	public String toString() {
		return "Gato: obesidad=" + obesidad + ", peso=" + peso + ", raza=" + raza + ", nombre=" + nombre
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}

}
