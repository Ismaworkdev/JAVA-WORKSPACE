package ejer_json_propio;

public class clase_autores {
private  String  nombre;
private  String autor;
private String año;
private String review;



public clase_autores(String nombre, String autor, String año, String review) {
	super();
	this.nombre = nombre;
	this.autor = autor;
	this.año = año;
	this.review = review;
}

public clase_autores() {
	super();
	this.nombre = "";
	this.autor = "";
	this.año = "";
	this.review = "";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getAño() {
	return año;
}

public void setAño(String año) {
	this.año = año;
}



public String getReview() {
	return review;
}

public void setReview(String review) {
	this.review = review;
}

@Override
public String toString() {
	return "clase_autores [nombre=" + nombre + ", autor=" + autor + ", año=" + año + ", review=" + review + "]";
}



}
