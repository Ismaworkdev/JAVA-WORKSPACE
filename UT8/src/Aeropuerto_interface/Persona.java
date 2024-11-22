package Aeropuerto_interface;


public class Persona implements Valida {
    protected String dni;
protected String Nombre;
protected String apellidos;
protected int edad;
protected String Dirr;
protected String email;


    // constructor, getters, setters...

public Persona(String dni, String nombre, String apellidos, int edad, String dirr, String email) {
		
		this.dni = dni;
		this.Nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.Dirr = dirr;
		this.email = email;
	}


public Persona() {
		
		this.dni = "";
		this.Nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.Dirr = "";
		this.email = "";
	}

  
    public String getDni() {
	return dni;
}



public void setDni(String dni) {
	this.dni = dni;
}


public String getNombre() {
	return Nombre;
}


public void setNombre(String nombre) {
	Nombre = nombre;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getDirr() {
	return Dirr;
}


public void setDirr(String dirr) {
	Dirr = dirr;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


	public boolean valida(String dni) {
        // Asume que un DNI válido tiene 8 dígitos y 1 letra
        return dni.matches("\\d{8}[A-Z]");
    }
}
