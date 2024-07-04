package ejer_15_14;

public class alumno {
			// 15. Crea una clase alumno que tenga los siguientes atributos
		      //a. String nombre
	        	//b. Int edad
	            //c.String email
	           //--Sus métodos son:
	           //Constructor por defecto
	           //Constructor con todos los parámetros
	           // Getters y Setters
	           // toString
private String nombre;
private int edad;
private String email;



public alumno() {
	super();
	this.nombre = "";
	this.edad = 0;
	this.email ="";
}


public alumno(String nombre, int edad, String email) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.email = email;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "alumno [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
}


		

	

}
