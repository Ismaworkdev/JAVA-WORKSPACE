package clientes_vehiculos;

public abstract class Vehiculo {
    // Atributos de la clase
    private String matricula;
    private String marca;
    private String modelo;

    // Enumeración para los tipos de carburante
    

	public Vehiculo(String matricula, String marca, String  modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = ""; // no se si es asi 
		// Asigna un valor por defecto, por ejemplo DIESEL
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public abstract String getTipo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    // Constructor, getters, setters y métodos abstractos pueden ser añadidos aquí






}
