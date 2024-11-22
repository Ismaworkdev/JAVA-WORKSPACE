package json_profe;

public class Producto {
	private String nombre;
	private double precio;
	private long cantidad;
	public Producto(String nombre, double precio,long cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad=cantidad;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
