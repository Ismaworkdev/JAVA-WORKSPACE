package json_dentro_json;

import java.util.ArrayList;



public class cliente {
	private String nombre ;
	private int edad;
	private String ciudad;
	 private ArrayList<producto> compra_producto;
	 
	public cliente(String nombre, int edad, String ciudad, ArrayList<producto> compra_producto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.compra_producto = compra_producto;
	}
	public cliente(String nombre, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		
	}
	 
	public cliente() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.ciudad = "";
		this.compra_producto = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public ArrayList<producto> getCompra_producto() {
		return compra_producto;
	}


	public void setCompra_producto(ArrayList<producto> compra_producto) {
		this.compra_producto = compra_producto;
	}


	@Override
	public String toString() {
		return "cliente [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", compra_producto="
				+ compra_producto + "]";
	}
	
	
	 

}
