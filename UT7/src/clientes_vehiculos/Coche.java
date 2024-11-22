package clientes_vehiculos;

public  class Coche extends Vehiculo{

private double km;
	private String color;
	private int numeroPuertas;
	
	
	
	
	public Coche(String matricula, String marca, String modelo, String color,
			int numeroPuertas , double km) {
		super(matricula, marca, modelo);
		this.km = km;
		this.color = color;
		this.numeroPuertas = numeroPuertas;
	}
	
	public Coche() {
		super();
		this.km = 0.0;
		this.color = "";
		this.numeroPuertas = 0;
	}

	

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	 @Override
	    public String getTipo() {
	        return "Coche"; // Retorna la cadena "Coche" o cualquier otra lógica específica
	    }

	@Override
	public String toString() {
		return "Coche [km=" + km + ", color=" + color + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
}
