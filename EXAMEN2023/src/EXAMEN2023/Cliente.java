package EXAMEN2023;

public class Cliente extends Persona {
	
	private String metodo_pago;
	private int cuota;
	
	
	public Cliente(String dni, String nombre, String apellido, String dirr, String correo, String tel,
			String metodo_pago, int cuota) {
		super(dni, nombre, apellido, dirr, correo, tel);
		this.metodo_pago = metodo_pago;
		this.cuota = cuota;
	}
	
	
	
	public Cliente() {
		super();
		this.metodo_pago = "";
		this.cuota = 0;
	}



	public String getMetodo_pago() {
		return metodo_pago;
	}



	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}



	public int getCuota() {
		return cuota;
	}



	public void setCuota(int cuota) {
		this.cuota = cuota;
	}



	@Override
	public String toString() {
		return "Cliente [metodo_pago=" + metodo_pago + ", cuota=" + cuota + ", getMetodo_pago()=" + getMetodo_pago()
				+ ", getCuota()=" + getCuota() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getDirr()=" + getDirr() + ", getCorreo()=" + getCorreo()
				+ ", getTel()=" + getTel() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}




	

}
