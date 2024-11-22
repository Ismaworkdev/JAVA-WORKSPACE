package Examen_2022;

public class Producto_pedido {
private int cod_pedido;
private int cod_producto;
private String nombre_producto;
private String descripcion_Producto_pedido;
private String temporada;
private Double precio_el_kilo;
private Double kilogramo;


public Producto_pedido() {
	super();
	this.cod_pedido = 0;
	this.cod_producto = 0;
	this.nombre_producto = "";
	this.descripcion_Producto_pedido = "";
	this.temporada = "";
	this.precio_el_kilo = 0.0;
	this.kilogramo = 0.0;
}




public Producto_pedido(int cod_pedido, int cod_producto, String nombre_producto, String descripcion_Producto_pedido,
		String temporada, Double precio_el_kilo, Double kilogramo) {
	super();
	this.cod_pedido = cod_pedido;
	this.cod_producto = cod_producto;
	this.nombre_producto = nombre_producto;
	this.descripcion_Producto_pedido = descripcion_Producto_pedido;
	this.temporada = temporada;
	this.precio_el_kilo = precio_el_kilo;
	this.kilogramo = kilogramo;
}

public int getCod_pedido() {
	return cod_pedido;
}
public void setCod_pedido(int cod_pedido) {
	this.cod_pedido = cod_pedido;
}
public int getCod_producto() {
	return cod_producto;
}
public void setCod_producto(int cod_producto) {
	this.cod_producto = cod_producto;
}
public String getNombre_producto() {
	return nombre_producto;
}
public void setNombre_producto(String nombre_producto) {
	this.nombre_producto = nombre_producto;
}
public String getDescripcion_Producto_pedido() {
	return descripcion_Producto_pedido;
}
public void setDescripcion_Producto_pedido(String descripcion_Producto_pedido) {
	this.descripcion_Producto_pedido = descripcion_Producto_pedido;
}
public String getTemporada() {
	return temporada;
}
public void setTemporada(String temporada) {
	this.temporada = temporada;
}
public Double getPrecio_el_kilo() {
	return precio_el_kilo;
}
public void setPrecio_el_kilo(Double precio_el_kilo) {
	this.precio_el_kilo = precio_el_kilo;
}
public Double getKilogramo() {
	return kilogramo;
}
public void setKilogramo(Double kilogramo) {
	this.kilogramo = kilogramo;
}




@Override
public String toString() {
	return "Producto_pedido [cod_pedido=" + cod_pedido + ", cod_producto=" + cod_producto + ", nombre_producto="
			+ nombre_producto + ", descripcion_Producto_pedido=" + descripcion_Producto_pedido + ", temporada="
			+ temporada + ", precio_el_kilo=" + precio_el_kilo + ", kilogramo=" + kilogramo + "]";
}





}
