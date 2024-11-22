package gympendientes;

public class Dueño  extends Persona{
private String tel;

public Dueño(String codigo, String nombre, String ape, String email, String tel) {
	super(codigo, nombre, ape, email);
	this.tel = tel;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

}
