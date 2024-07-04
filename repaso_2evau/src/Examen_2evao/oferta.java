package Examen_2evao;

public class oferta {
private String codproducto;
private String nombre_oferta;
private String categoria ;
private double puntos;

public oferta() {
	super();
	this.codproducto = "";
	this.nombre_oferta = "";
	this.categoria = "";
	this.puntos = 0;
}




public oferta(String codproducto, String nombre_oferta, String categoria, double d) {
	super();
	this.codproducto = codproducto;
	this.nombre_oferta = nombre_oferta;
	this.categoria = categoria;
	this.puntos = d;
}
public String getCodproducto() {
	return codproducto;
}
public void setCodproducto(String codproducto) {
	this.codproducto = codproducto;
}
public String getNombre_oferta() {
	return nombre_oferta;
}
public void setNombre_oferta(String nombre_oferta) {
	this.nombre_oferta = nombre_oferta;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public double getPuntos() {
	return puntos;
}
public void setPuntos(double puntos) {
	this.puntos = puntos;
}




@Override
public String toString() {
	return "oferta [codproducto=" + codproducto + ", nombre_oferta=" + nombre_oferta + ", categoria=" + categoria
			+ ", puntos=" + puntos + "]";
}

}
