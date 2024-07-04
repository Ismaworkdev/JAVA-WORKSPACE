package Examen_2022;

public class Cliente extends Persona{
private String metodo_pago;

public Cliente() {
	super();
	this.metodo_pago = "";
}



public Cliente(String dni, String nombre, String apellidos, String dirr, String metodo_pago) {
	super(dni, nombre, apellidos, dirr);
	this.metodo_pago = metodo_pago;
}

public String getMetodo_pago() {
	return metodo_pago;
}

public void setMetodo_pago(String metodo_pago) {
	this.metodo_pago = metodo_pago;
}



@Override
public String toString() {
	return "Cliente [metodo_pago=" + metodo_pago + "]";
}


}
