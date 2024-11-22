package herencia_animales;

public class Gato extends Animal {
private int nVidas;





public Gato(String nombre, String id, int edad, double peso, String raza, int nVidas) {
	super(nombre, id, edad, peso, raza);
	this.nVidas = nVidas;
}





public Gato() {
	super();
	this.nVidas = 0;
}





public int getnVidas() {
	return nVidas;
}





public void setnVidas(int nVidas) {
	this.nVidas = nVidas;
}





@Override
public String toString() {
	return "Gato [nVidas=" + nVidas + "]";
}



public String emitesonido() {
	return "miua miua ";
	
}

}
