package Examen_2022;

public abstract class Persona {
private String dni;
private String nombre;
private String apellidos;
private String dirr;




public Persona(String dni, String nombre, String apellidos, String dirr) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dirr = dirr;
}


public Persona() {
	super();
	this.dni = "";
	this.nombre = "";
	this.apellidos = "";
	this.dirr = "";
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
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
public String getDirr() {
	return dirr;
}
public void setDirr(String dirr) {
	this.dirr = dirr;
}


@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dirr=" + dirr + "]";
}





}
