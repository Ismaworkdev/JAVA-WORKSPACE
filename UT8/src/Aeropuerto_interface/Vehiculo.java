package Aeropuerto_interface;

public class Vehiculo implements Valida {
    protected String matricula;
    protected String Color;
    protected String Marca;
    protected String Modelo;
    
    

	public Vehiculo(String matricula, String color, String marca, String modelo) {
		
		this.matricula = matricula;
		Color = color;
		Marca = marca;
		Modelo = modelo;
	}

	public Vehiculo() {
		
		this.matricula = "";
		Color = "";
		Marca = "";
		Modelo = "";
	}

	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}



	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	@Override
    public boolean valida(String matricula) {
        // Asume que una matrícula válida tiene 7 caracteres: 4 dígitos y 3 letras
        return matricula.matches("\\d{4}[A-Z]{3}");
    }



	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", Color=" + Color + ", Marca=" + Marca + ", Modelo=" + Modelo
				+ "]";
	}
	
	
}
