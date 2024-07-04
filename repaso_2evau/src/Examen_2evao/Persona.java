package Examen_2evao;

public class Persona {
private String nombre;
private String apellidos;
private String codigo;
private String gmail;


public Persona() {
	super();
	this.nombre = "";
	this.apellidos = "";
	this.codigo = "";
	this.gmail = "";
}


public Persona(String nombre) {
	super();
	this.nombre = nombre;
	
}
public Persona(String nombre, String apellidos, String codigo, String gmail) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.codigo = codigo;
	this.gmail = gmail;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", codigo=" + codigo + ", gmail=" + gmail + "]";
}


}
