package examen;

public class Oferta {
 private String codproducto;
 private String nombre;
 private String categoria;
 private int puntos;
 
public Oferta(String codproducto, String nombre, String categoria, int puntos) {
	super();
	this.codproducto = codproducto;
	this.nombre = nombre;
	this.categoria = categoria;
	this.puntos = puntos;
}
 
public Oferta() {
	super();
	this.codproducto = "";
	this.nombre = "";
	this.categoria = "";
	this.puntos = 0;
}

public String getCodproducto() {
	return codproducto;
}

public void setCodproducto(String codproducto) {
	this.codproducto = codproducto;
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
	return "Oferta [codproducto=" + codproducto + ", nombre=" + nombre + ", categoria=" + categoria + ", puntos="
			+ puntos + "]";
}
 
 

}
