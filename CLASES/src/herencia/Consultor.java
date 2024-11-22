package herencia;

public class Consultor extends Trabajador {
private double tarifa;
private int nhoras;



public Consultor(String nombre, String apellido, String dni, String dirrecion, double tarifa, int nhoras) {
	super(nombre, apellido, dni, dirrecion);
	this.tarifa = tarifa;
	this.nhoras = nhoras;
}


public Consultor() {
	super();
	this.tarifa = 0;
	this.nhoras = 0;
}


public double getTarifa() {
	return tarifa;
}


public void setTarifa(double tarifa) {
	this.tarifa = tarifa;
}


public int getNhoras() {
	return nhoras;
}


public void setNhoras(int nhoras) {
	this.nhoras = nhoras;
}


@Override
public String toString() {
	return "Consultor [tarifa=" + tarifa + ", nhoras=" + nhoras + "]";
}




}
