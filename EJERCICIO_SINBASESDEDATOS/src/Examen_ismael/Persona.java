package Examen_ismael;

public class Persona {
protected int codigo;
protected String nombre;
protected String apellidos;
protected String correo;


public Persona(int codigo, String nombre, String apellidos, String correo) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
}


public Persona() {
	super();
	this.codigo = 0;
	this.nombre = "";
	this.apellidos = "";
	this.correo = "";
}


public int getCodigo() {
	return codigo;
}


public void setCodigo(int codigo) {
	this.codigo = codigo;
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


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


@Override
public String toString() {
	return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
}


}
