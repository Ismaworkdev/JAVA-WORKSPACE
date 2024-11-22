package clientes_vehiculos;

public  class Moto extends Vehiculo{
public double cilindrada=0.0;

public Moto(String matricula, String marca, String modelo, double cilindrada) {
	super(matricula, marca, modelo);
	this.cilindrada = cilindrada;
}
public Moto() {
	super();
	this.cilindrada = 0;
}
public double getCilindrada() {
	return cilindrada;
}
public void setCilindrada(double cilindrada) {
	this.cilindrada = cilindrada;
}
@Override
public String getTipo() {
	// TODO Auto-generated method stub
	return null;
}



}