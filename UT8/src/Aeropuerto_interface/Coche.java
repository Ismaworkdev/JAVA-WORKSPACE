package Aeropuerto_interface;

public class Coche extends Vehiculo {
	
	private int n_puertas;

	public Coche(String matricula, String color, String marca, String modelo, int n_puertas) {
		super(matricula, color, marca, modelo);
		this.n_puertas = n_puertas;
	}

	public int getN_puertas() {
		return n_puertas;
	}

	public void setN_puertas(int n_puertas) {
		this.n_puertas = n_puertas;
	}

	@Override
	public String toString() {
		return "Coche [n_puertas=" + n_puertas + "]";
	}
	
	

}
