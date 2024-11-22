package Aeropuerto_interface;

public class Moto extends Vehiculo {
private String tipo;
private String Cilindrada;
private String Carnet;


public Moto(String matricula, String color, String marca, String modelo, String tipo, String cilindrada,
		String carnet) {
	super(matricula, color, marca, modelo);
	this.tipo = tipo;
	Cilindrada = cilindrada;
	Carnet = carnet;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getCilindrada() {
	return Cilindrada;
}


public void setCilindrada(String cilindrada) {
	Cilindrada = cilindrada;
}


public String getCarnet() {
	return Carnet;
}


public void setCarnet(String carnet) {
	Carnet = carnet;
}


@Override
public String toString() {
	return "Moto [tipo=" + tipo + ", Cilindrada=" + Cilindrada + ", Carnet=" + Carnet + "]";
}


}
