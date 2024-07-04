package json_dentro_json;

public class producto {
private String nombre ;
private double precio ;
private long cantidad;


public producto(String nombre, double  precio, long cantidad) {
	super();
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}

public producto() {
	super();
	this.nombre = "";
	this.precio = 0;
	this.cantidad = 0;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public long getCantidad() {
	return cantidad;
}

public void setCantidad(long cantidad) {
	this.cantidad = cantidad;
}

@Override
public String toString() {
	return "producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
}


}
