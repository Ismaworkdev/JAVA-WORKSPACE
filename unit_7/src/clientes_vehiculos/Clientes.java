package clientes_vehiculos;

public class Clientes {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private double saldo;
    private Vehiculo[] v; // Asegúrate de que 'Vehiculo' comience con 'V' mayúscula

    public Clientes(String dni, String nombre, String apellido, String direccion, double saldo, Vehiculo[] v) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.saldo = saldo;
        this.v = v;
    }

    public Clientes() {
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.saldo = 0.0; // Inicializa 'saldo' con un valor por defecto, por ejemplo 0.0
        this.v = new Vehiculo[5]; // Inicializa 'v' como un nuevo array de 'Vehiculo'
    }


	
	
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Vehiculo[] getV() {
		return v;
	}
	public void setV(Vehiculo[] v) {
		this.v = v;
	}
	 
	 



}
