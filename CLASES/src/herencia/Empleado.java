package herencia;

public class Empleado extends Trabajador {
	private double sueldo;
	private double impuestos;
	
	
	
	public Empleado(String nombre, String apellido, String dni, String dirrecion, double sueldo) {
		super(nombre, apellido, dni, dirrecion);
		this.sueldo = sueldo;
		this.impuestos = 0.3*this.sueldo;
	}



	public Empleado() {
		super();
		this.sueldo = 0;
		this.impuestos = 0;
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public double getImpuestos() {
		return impuestos;
	}



	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}



	@Override
	public String toString() {
		return "empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	public double calcularPaga() {
		
		return (this.sueldo - this.impuestos)/PAGAS;
		
	}
	
}
