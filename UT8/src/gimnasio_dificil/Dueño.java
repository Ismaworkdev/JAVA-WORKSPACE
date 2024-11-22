package gimnasio;

public class Due�o extends Persona{
	private String formacion;

	public Due�o(String codigo, String nombre, String apellidos, String email, String formacion) {
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
		return "Due�o [formacion=" + formacion + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEmail()=" + getEmail() + "]";
	}
	
}
