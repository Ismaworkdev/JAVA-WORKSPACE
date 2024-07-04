package Examen_ismael;

public class Oferta {
private String codProducto;
private String nombre;
private String categoria;
private int puntos;




public Oferta() {
	super();
	this.codProducto = "";
	this.nombre = "";
	this.categoria = "";
	this.puntos = 0;
}

public Oferta(String codProducto, String nombre, String categoria, int puntos) {
	super();
	this.codProducto = codProducto;
	this.nombre = nombre;
	this.categoria = categoria;
	this.puntos = puntos;
}
public String getCodProducto() {
	return codProducto;
}
public void setCodProducto(String codProducto) {
	this.codProducto = codProducto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public int getPuntos() {
	return puntos;
}
public void setPuntos(int puntos) {
	this.puntos = puntos;
}
@Override
public String toString() {
	return "Oferta [codProducto=" + codProducto + ", nombre=" + nombre + ", categoria=" + categoria + ", puntos="
			+ puntos + "]";
}




}
