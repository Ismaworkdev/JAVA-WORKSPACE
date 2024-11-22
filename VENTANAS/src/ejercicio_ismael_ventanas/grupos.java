package ejercicio_ismael_ventanas;

public class grupos {
private String codigo;
private String nombre;
private String añocreacion;
private String tipo_musica;


public grupos(String codigo, String nombre, String añocreacion, String tipo_musica) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.añocreacion = añocreacion;
	this.tipo_musica = tipo_musica;
}


public grupos() {

	this.codigo = "";
	this.nombre = "";
	this.añocreacion = "";
	this.tipo_musica = "";
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getAñocreacion() {
	return añocreacion;
}


public void setAñocreacion(String añocreacion) {
	this.añocreacion = añocreacion;
}


public String getTipo_musica() {
	return tipo_musica;
}


public void setTipo_musica(String tipo_musica) {
	this.tipo_musica = tipo_musica;
}


@Override
public String toString() {
	return "grupos [codigo=" + codigo + ", nombre=" + nombre + ", añocreacion=" + añocreacion + ", tipo_musica="
			+ tipo_musica + "]";
}



}
