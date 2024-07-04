package gimnasio_facil;

public class Dueno {
private String Atributo;
private String codigo;
private String ape;
private String email;
private String tel;
public Dueno(String atributo, String codigo, String ape, String email, String tel) {
	super();
	Atributo = atributo;
	this.codigo = codigo;
	this.ape = ape;
	this.email = email;
	this.tel = tel;
}

public Dueno() {
	super();
	this.Atributo = "";
	this.codigo = "";
	this.ape = "";
	this.email = "";
	this.tel = "";
}

public String getAtributo() {
	return Atributo;
}

public void setAtributo(String atributo) {
	Atributo = atributo;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
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
	return "Dueno [Atributo=" + Atributo + ", codigo=" + codigo + ", ape=" + ape + ", email=" + email + ", tel=" + tel
			+ "]";
}





}
