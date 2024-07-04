package desarrolo_de_clases;

public class nota {
	//atributos
private String modulo ;
private double calificacion;
//campos //constructor por defecto 
public nota() {
	this.modulo="";
	this.calificacion=0;
}//constructor todos los parametros 
public nota(String modulo, double calificacion) {
	super();
	this.modulo = modulo;
	this.calificacion = calificacion;
}
 //getters setters 
public String getModulo() {
	return modulo;
}
public void setModulo(String modulo) {
	this.modulo = modulo;
}
public double getCalificacion() {
	return calificacion;
}
public void setCalificacion(double calificacion) {
	this.calificacion = calificacion;
}
@Override
public String toString() {
	return "modulo=" + modulo + ", calificacion=" + calificacion ;
}
//public static void main(String[]args) {
//	nota n=new nota("Programacion",9);
//	System.out.println(n);
//	nota m=new nota();
//	System.out.println("bbdd");
//	m.setCalificacion(8);
//	System.out.println(m);
//	
//}

}
