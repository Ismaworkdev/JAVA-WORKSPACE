package proveedor_piezas;

public class Proveedor {

	private int codProveedor;
private	String nombreProveedor;
private 	String localidad;


public Proveedor(int codProveedor, String nombreProveedor, String localidad) {
	super();
	this.codProveedor = codProveedor;
	this.nombreProveedor = nombreProveedor;
	this.localidad = localidad;
}
public int getCodProveedor() {
	return codProveedor;
}
public void setCodProveedor(int codProveedor) {
	this.codProveedor = codProveedor;
}
public String getNombreProveedor() {
	return nombreProveedor;
}
public void setNombreProveedor(String nombreProveedor) {
	this.nombreProveedor = nombreProveedor;
}
public String getLocalidad() {
	return localidad;
}
public void setLocalidad(String localidad) {
	this.localidad = localidad;
}
@Override
public String toString() {
	return "Proveedor [codProveedor=" + codProveedor + ", nombreProveedor=" + nombreProveedor + ", localidad="
			+ localidad + "]";
}



}
