package herencia_animales;

public class Animal {
protected String nombre;
protected String id;
protected int edad;
protected double peso;

protected String raza;


public Animal(String nombre, String id, int edad, double peso,String raza) {
	super();
	this.nombre = nombre;
	this.id = id;
	this.edad = edad;
	this.peso = peso;
	this.raza="";
}


public String getRaza() {
	return raza;
}


public void setRaza(String raza) {
	this.raza = raza;
}


public Animal() {
	super();
	this.nombre = "";
	this.id = "";
	this.edad = 0;
	this.peso = 0;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public double getPeso() {
	return peso;
}


public void setPeso(double peso) {
	this.peso = peso;
}



 @Override
public String toString() {
	return "Animal [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", peso=" + peso + ", raza=" + raza + "]";
}


public String emitesonido() {
	return "";
	 
 }

}
