package gimnasio;

public class Dueño extends Persona{
	private String formacion;

	public Dueño(String codigo, String nombre, String apellidos, String email, String formacion) {
		super(codigo, nombre, apellidos, email);
		this.formacion = formacion;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	@Override
	public String toString() {
		return "Dueño [formacion=" + formacion + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEmail()=" + getEmail() + "]";
	}
	
}
