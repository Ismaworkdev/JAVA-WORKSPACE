package fichero_objetos;

import java.io.Serializable;

public class Contacto implements Serializable {
private String nombre;
private String tel;
private String correo;
private String dirr;
public Contacto(String nombre, String tel, String correo, String dirr) {
	super();
	this.nombre = nombre;
	this.tel = tel;
	this.correo = correo;
	this.dirr = dirr;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getDirr() {
	return dirr;
}
public void setDirr(String dirr) {
	this.dirr = dirr;
}
@Override
public String toString() {
	return "Contacto [nombre=" + nombre + ", tel=" + tel + ", correo=" + correo + ", dirr=" + dirr + "]";
}


}
