package examen_clinica;

public abstract class Persona {
private String dni;
private String nombre;
private String apellidos;
private String telefono ;
public Persona(String dni, String nombre, String apellidos, String telefono) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.telefono = telefono;
}

public Persona() {
	super();
	this.dni = "";
	this.nombre = "";
	this.apellidos = "";
	this.telefono = "";
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
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
}


}
