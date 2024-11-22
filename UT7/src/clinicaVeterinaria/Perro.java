package clinicaVeterinaria;

import java.util.ArrayList;

public class Perro extends Animal{
	private String chipId;
	private boolean seguro;
	
	
	
	public Perro(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion,
			String chipId, boolean seguro) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.chipId = chipId;
		this.seguro = seguro;
	}
	public Perro(int edad, double peso, String raza, String sexo, String nombre, String chipId, boolean seguro) {
		super(edad, peso, raza, sexo, nombre);
		this.chipId = chipId;
		this.seguro = seguro;
	}
	
	public Perro() {
		super();
		this.chipId = "";
		this.seguro = false;
	}
	public String getChipId() {
		return chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	@Override
	public String toString() {
		return "Perro: chipId=" + chipId + ", seguro=" + seguro + ", raza=" + raza + ", nombre=" + nombre
				+ ", libroVacunacion=" + libroVacunacion;
	}
	
	
	public static void main(String[] args) {
		Perro p=new Perro(2, 15, "Border Collie", "Hembra", "Lori", "dfsdfsad", false);
		
		Vacuna v=new Vacuna("Antirrábica","10/01/2024", 50);
		Vacuna v2=new Vacuna("Leishmania", "16/01/2024", "Pfizer", 70);
			
//		ArrayList<Vacuna>lista=new ArrayList<Vacuna>();
//		lista.add(v);
//		lista.add(v2);
//		
//		p.setLibroVacunacion(lista);
//		System.out.println(p);
		
		p.getLibroVacunacion().add(v);
		System.out.println(p);
		
		
	}
	
	
}
