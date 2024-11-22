package herencia_animales;

public class Perro extends Animal{
private boolean seguro;




public Perro(String nombre, String id, int edad, double peso, String raza, boolean seguro) {
	super(nombre, id, edad, peso, raza);
	this.seguro = seguro;
}




public Perro() {
	super();
	this.seguro = false;
}




public boolean isSeguro() {
	return seguro;
}




public void setSeguro(boolean seguro) {
	this.seguro = seguro;
}




@Override
public String toString() {
	return "Perro [seguro=" + seguro + "]";
}


public String emitesonido() {
	return "guau guau";
	
}



}
