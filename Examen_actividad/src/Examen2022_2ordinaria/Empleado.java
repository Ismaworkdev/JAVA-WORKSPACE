package Examen2022_2ordinaria;

public class Empleado extends Persona{
private String turno;



public Empleado(String dni, String nombre, String apellidos, String dirr, String turno) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
}

public Empleado() {
	
	this.turno = "";
}

public String getTurno() {
	return turno;
}

public void setTurno(String turno) {
	this.turno = turno;
}

@Override
public String toString() {
	return "Empleado [turno=" + turno + "]";
}


}
