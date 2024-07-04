package ejercicios_tema10;

public class Producto {
private String codigo;
private String nombre;
private double peso ;
private double precio;
private String categoria;



	public Producto(String codigo, String nombre, double peso, double precio, String categoria) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.peso = peso;
	this.precio = precio;
	this.categoria = categoria;
}

	public Producto() {
	super();
	this.codigo = "";
	this.nombre = "";
	this.peso = 0.0;
	this.precio = 0.0;
	this.categoria = "";
}


	public String getCodigo() {
	return codigo;
}



public void setCodigo(String codigo) {
	this.codigo = codigo;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public double getPeso() {
	return peso;
}



public void setPeso(double peso) {
	this.peso = peso;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



public String getCategoria() {
	return categoria;
}



public void setCategoria(String categoria) {
	this.categoria = categoria;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
