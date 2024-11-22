package ejercicios_tema10;

import java.util.ArrayList;

public class Programa {
private ArrayList<Producto>lol;


public Programa() {
super();
this.lol = new ArrayList<>();
}



	public Programa(ArrayList<Producto> lol) {
	super();
	this.lol = lol;
}





	public ArrayList<Producto> getLol() {
	return lol;
}





public void setLol(ArrayList<Producto> lol) {
	this.lol = lol;
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assuming Producto has appropriate fields and constructor
		Producto producto = new Producto("43", "lol", 3.3, 5.5, "lolll");
		producto.getLol().add(producto);

	}

}
