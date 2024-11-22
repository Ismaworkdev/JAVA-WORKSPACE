package Aeropuerto_interface;

public class Forgoneta extends Vehiculo {
private String Capacidad;

public Forgoneta(String matricula, String color, String marca, String modelo, String capacidad) {
	super(matricula, color, marca, modelo);
	Capacidad = capacidad;
}

public String getCapacidad() {
	return Capacidad;
}

public void setCapacidad(String capacidad) {
	Capacidad = capacidad;
}

@Override
public String toString() {
	return "Forgoneta [Capacidad=" + Capacidad + "]";
}




}
