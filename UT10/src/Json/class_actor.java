package Json;

public class class_actor {
private String nombre;
private String apellidos;
private String edad;
private String peli;
private String pais;
public class_actor(String nombre, String apellidos, String edad, String peli, String pais) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.peli = peli;
	this.pais = pais;
}

public class_actor() {
	super();
	this.nombre = "";
	this.apellidos = "";
	this.edad = "";
	this.peli = "";
	this.pais = "";
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

public String getEdad() {
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}

public String getPeli() {
	return peli;
}

public void setPeli(String peli) {
	this.peli = peli;
}

public String getPais() {
	return pais;
}

public void setPais(String pais) {
	this.pais = pais;
}

@Override
public String toString() {
	return "class_actor [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", peli=" + peli
			+ ", pais=" + pais + "]";
}

}
