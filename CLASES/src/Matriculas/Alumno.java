package Matriculas;

import java.util.Objects;

public class Alumno {

	private String clave ;
	private String dni;
	private String email;
	private String nombre;
	
	
	
	
	public Alumno() {
		super();
		this.nombre="";
		this.clave = "";
		this.dni = "";
		this.email = "";
	}
	
	
	



	public Alumno(String clave, String dni, String email ,String nombre) {
		super();
		this.clave = clave;
		this.dni = dni;
		this.email = email;
		this.nombre=nombre;
	}
	

	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	   @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Alumno alumno = (Alumno) obj;
	        return dni.equals(alumno.dni);
	    }
	   
	   
	   @Override
	    public int hashCode() {
	        return Objects.hash(dni);
	    }
	   public void mostraralumno() {
		   System.out.println(this.getDni()+" "+this.getNombre());
	   }






	@Override
	public String toString() {
		return "Alumno [clave=" + clave + ", dni=" + dni + ", email=" + email + ", nombre=" + nombre + "]";
	}
	
	
}
