package gympendientes;

public class ActividadesReserva {
private String nombre;
private double hora;
private String codMonitor;
private int nMax ;
private int nPar;


public ActividadesReserva() {
	super();
	this.nombre = "";
	this.hora = 0;
	this.codMonitor = "";
	this.nMax = 0;
	this.nPar = 0;
}

public ActividadesReserva(String nombre, double hora, String codMonitor, int nMax, int nPar) {
	super();
	this.nombre = nombre;
	this.hora = hora;
	this.codMonitor = codMonitor;
	this.nMax = nMax;
	this.nPar = nPar;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getHora() {
	return hora;
}
public void setHora(double hora) {
	this.hora = hora;
}
public String getCodMonitor() {
	return codMonitor;
}
public void setCodMonitor(String codMonitor) {
	this.codMonitor = codMonitor;
}
public int getnMax() {
	return nMax;
}
public void setnMax(int nMax) {
	this.nMax = nMax;
}
public int getnPar() {
	return nPar;
}
public void setnPar(int nPar) {
	this.nPar = nPar;
}

@Override
public String toString() {
	return "ActividadesReserva [nombre=" + nombre + ", hora=" + hora + ", codMonitor=" + codMonitor + ", nMax=" + nMax
			+ ", nPar=" + nPar + "]";
}



}
