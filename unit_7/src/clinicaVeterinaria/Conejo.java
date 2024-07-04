package clinicaVeterinaria;

import java.util.ArrayList;

public class Conejo extends Animal{
	private double longOrejas;

	public Conejo(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion,
			double longOrejas) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.longOrejas = longOrejas;
	}

	public Conejo(int edad, double peso, String raza, String sexo, String nombre, double longOrejas) {
		super(edad, peso, raza, sexo, nombre);
		this.longOrejas = longOrejas;
	}
	
	public Conejo() {
		super();
		this.longOrejas=0;
	}

	public double getLongOrejas() {
		return longOrejas;
	}

	public void setLongOrejas(double longOrejas) {
		this.longOrejas = longOrejas;
	}

	@Override
	public String toString() {
		return "Conejo: longOrejas=" + longOrejas + ", peso=" + peso + ", raza=" + raza + ", nombre=" + nombre + "]";
	}
	
	
	
}
