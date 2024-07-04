package gympendientes;

public class Persona {
protected String codigo;
protected String nombre;
protected String ape;
protected String email;
public Persona(String codigo, String nombre, String ape, String email) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.ape = ape;
	this.email = email;
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
public String getApe() {
	return ape;
}
public void setApe(String ape) {
	this.ape = ape;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", ape=" + ape + ", email=" + email + "]";
}




}
