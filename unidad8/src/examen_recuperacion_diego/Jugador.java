package examen_recuperacion_diego;

import java.util.Arrays;

public class Jugador {

	private String nombre;
	private String ciudad;
	private double apuesta;
	private int[] gana;
	private int[] lanzamiento;
	private int edad;
	
	public Jugador() {
		super();
		
		this.nombre = "";
		this.ciudad = "";
		this.apuesta = 500;
		this.gana = new int[4]; // Array para almacenar si gana o no en cada partida
		this.lanzamiento = new int[10]; // Array para simular lanzar un dado 10 veces
		this.edad = 0;
	}


	
	
	public Jugador(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		
		this.edad = edad;	
		this.gana = new int[4]; // Array para almacenar si gana o no en cada partida
		this.lanzamiento = new int[10]; // Array para simular lanzar un dado 10 veces
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getApuesta() {
		return apuesta;
	}
	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}
	public int[] getGana() {
		return gana;
	}
	public void setGana(int[] gana) {
		this.gana = gana;
	}
	public int[] getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(int[] lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public double apostarDinero() {
	    double dinero = (1+Math.random()*499);
	    System.out.println("Dinero apostado: " + dinero);
		return dinero;
	    
	}

	public void lanzarDados() {
		 System.out.println("*************************************************************************************");
		System.out.print(this.getNombre()+"   : ");
	    for (int i = 0; i < 10; i++) {
	        this.lanzamiento[i]=(int)(Math.random() * 6) + 1;
	       
	        System.out.print("[" + this.lanzamiento[i]+"]");
	    }
	}




	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", ciudad=" + ciudad + ", apuesta=" + apuesta + ", gana="
				+ Arrays.toString(gana) + ", lanzamiento=" + Arrays.toString(lanzamiento) + ", edad=" + edad + "]";
	}

	
}
