package Examen_2022;

import java.util.ArrayList;

public  class Empleado extends Persona {
private int turno;
private ArrayList<Pedido> pedidosAsignados = new ArrayList<>();

public Empleado() {
	super();
	this.turno = 0;
	this.pedidosAsignados = new ArrayList<>();
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno,
		ArrayList<Pedido> pedidosAsignados) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	this.pedidosAsignados = pedidosAsignados;
}
public int getTurno() {
	return turno;
}
public void setTurno(int turno) {
	this.turno = turno;
}
public ArrayList<Pedido> getPedidosAsignados() {
	return pedidosAsignados;
}
public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
	this.pedidosAsignados = pedidosAsignados;
}

@Override
public String toString() {
	final int maxLen = 10;
	return "Empleado [turno=" + turno + ", pedidosAsignados="
			+ (pedidosAsignados != null ? pedidosAsignados.subList(0, Math.min(pedidosAsignados.size(), maxLen)) : null)
			+ "]";
}


}
