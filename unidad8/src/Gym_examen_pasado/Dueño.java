package Gym_examen_pasado;

import java.util.ArrayList;



public class Dueño {
	private String codigo;
	private String nombre;
	private String ape;
	private String email;
	private String tel;
//	private ArrayList<Actividad_reserva> actividadesReserva;
	public Dueño(String codigo, String nombre, String ape, String email, String tel) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ape = ape;
		this.email = email;
		this.tel = tel;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Dueño [codigo=" + codigo + ", nombre=" + nombre + ", ape=" + ape + ", email=" + email + ", tel=" + tel
				+ "]";
	}
	
	
	

}
