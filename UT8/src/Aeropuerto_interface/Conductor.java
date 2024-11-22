package Aeropuerto_interface;

public class Conductor extends Persona{
private String Codigo;
public static final int mañana=1;
public static final int tarde=2;
public static final int noche=3;
public Conductor(String dni, String nombre, String apellidos, int edad, String dirr, String email, String codigo) {
	super(dni, nombre, apellidos, edad, dirr, email);
	Codigo = codigo;
}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public static int getMañana() {
	return mañana;
}
public static int getTarde() {
	return tarde;
}
public static int getNoche() {
	return noche;
}
@Override
public String toString() {
	return "Conductor [Codigo=" + Codigo + "]";
}



}
