package EXAMEN2023_PROFE;

public class Cliente extends Persona{
	private String metodoPago;
	private double cuota;
	public Cliente(String dNI, String nombre, String apellidos, String direccion, String correo, String metodoPago,
			double cuota) {
		super(dNI, nombre, apellidos, direccion, correo);
		this.metodoPago = metodoPago;
		this.cuota = cuota;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", cuota=" + cuota + ", toString()=" + super.toString() + "]";
	}
	
	
}
