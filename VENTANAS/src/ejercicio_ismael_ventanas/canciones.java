package ejercicio_ismael_ventanas;

public class canciones {
private String codigo_grupo;
private String disco;
private String nombre_cancion ;
private String  duracion_minutos;


public canciones(String codigo_grupo, String disco, String nombre_cancion, String duracion_minutos) {
	super();
	this.codigo_grupo = codigo_grupo;
	this.disco = disco;
	this.nombre_cancion = nombre_cancion;
	this.duracion_minutos = duracion_minutos;
}


public canciones() {
	
	this.codigo_grupo = "";
	this.disco = "";
	this.nombre_cancion = "";
	this.duracion_minutos = "";
}

public canciones(String codigo_grupo) {

	this.codigo_grupo = codigo_grupo;

}
public String getCodigo_grupo() {
	return codigo_grupo;
}


public void setCodigo_grupo(String codigo_grupo) {
	this.codigo_grupo = codigo_grupo;
}


public String getDisco() {
	return disco;
}


public void setDisco(String disco) {
	this.disco = disco;
}


public String getNombre_cancion() {
	return nombre_cancion;
}


public void setNombre_cancion(String nombre_cancion) {
	this.nombre_cancion = nombre_cancion;
}


public String   getDuracion_minutos() {
	return duracion_minutos;
}


public void setDuracion_minutos(String duracion_minutos) {
	this.duracion_minutos = duracion_minutos;
}


@Override
public String toString() {
	return "canciones [codigo_grupo=" + codigo_grupo + ", disco=" + disco + ", nombre_cancion=" + nombre_cancion
			+ ", duracion_minutos=" + duracion_minutos + "]";
}


}
