package desarrolo_de_clases;

import java.util.Arrays;

public class alumno {
private String nombre;
private String apellidos;
private int edad;
private nota[]notasAlumno;

public alumno() {
	this.nombre="";
	this.apellidos="";
	this.edad=0;
	this.notasAlumno=new nota[7];
	for (int i = 0; i < notasAlumno.length; i++) {
		this.notasAlumno[i]=new nota();
		
	}
	
	
}

public alumno(String nombre, String apellidos, int edad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.notasAlumno=new nota[7];
	for (int i = 0; i < notasAlumno.length; i++) {
		this.notasAlumno[i]=new nota();
		
	}
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
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

public nota[] getNotasAlumno() {
	return notasAlumno;
}

public void setNotasAlumno(nota[] notasAlumno) {
	this.notasAlumno = notasAlumno;
}

@Override
public String toString() {
	return "alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notasAlumno="
			+ Arrays.toString(notasAlumno) + "]";
}

public static void main(String[]args) {
	alumno a=new alumno("marta ","peña",22);
	alumno b=new alumno("ana montalban","peña" ,34);
	a.getNotasAlumno()[0].setModulo("programacion");
	a.getNotasAlumno()[0].setCalificacion(8);
	System.out.println(a);
}
}
