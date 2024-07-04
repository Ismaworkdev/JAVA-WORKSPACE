package proveedor_piezas;

public class Pieza {
	private int codPieza;
	private String nombrePieza;
	private int proveedor;
	private double peso;
	
	
	
	public Pieza(int codPieza, String nombrePieza, int proveedor, double peso) {
		super();
		this.codPieza = codPieza;
		this.nombrePieza = nombrePieza;
		this.proveedor = proveedor;
		this.peso = peso;
	}



	


	public int getCodPieza() {
		return codPieza;
	}



	public void setCodPieza(int codPieza) {
		this.codPieza = codPieza;
	}



	public String getNombrePieza() {
		return nombrePieza;
	}



	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}



	public int getProveedor() {
		return proveedor;
	}



	public void setProveedor(int proveedor) {
		this.proveedor = proveedor;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	@Override
	public String toString() {
		return "Pieza [codPieza=" + codPieza + ", nombrePieza=" + nombrePieza + ", proveedor=" + proveedor + ", peso="
				+ peso + "]";
	}
	
	
	
	

}
