package json_profe;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private long edad;
	private String ciudad;
	private ArrayList<Producto>compras;
	public Cliente(String nombre, long edad, String ciudad, ArrayList<Producto> compras) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.compras = compras;
	}
	public Cliente(String nombre, long edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.compras=new ArrayList<Producto>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getEdad() {
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
	public ArrayList<Producto> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<Producto> compras) {
		this.compras = compras;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", compras=" + compras + "]";
	}
	
	
	

}
