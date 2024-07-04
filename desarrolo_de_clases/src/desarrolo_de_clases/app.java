package desarrolo_de_clases;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// Alumno o alumna
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		alumno a=new alumno();
		do {
			System.out.println("1. dar de alta");
			System.out.println("2.asignar notas ");
			System.out.println("3.numero de suspensos ");
			System.out.println("4.nota media ");
			System.out.println("5 .elije una opcion");
			opcion=teclado.nextInt();
	
		
		switch(opcion) {
		case 1:
			System.out.println("nombre:   ");
			String n=teclado.next();
			System.out.println("ape:   ");
			String ape=teclado.next();
			System.out.println("edad:   ");
			int edad=teclado.nextInt();
			a.setNombre(n);
			a.setApellidos(ape);
			a.setEdad(edad);
			break;
		case 2:
			for (int i = 0; i < a.getNotasAlumno().length; i++) {
				System.out.println("modulo");
				String m=teclado.next();
				System.out.println("calificacion");
				double c=teclado.nextDouble();
				a.getNotasAlumno()[i].setModulo(m);
				a.getNotasAlumno()[i].setCalificacion(c);
			}
			break;
		case 3:
			int contador=0;
			for (int i = 0; i < a.getNotasAlumno().length  ; i++) {
				if(a.getNotasAlumno()[i].getCalificacion() <=5) {
					contador++;
				}
			
			}
			System.out.println("hay "+contador+" suspensos");
			break;
		case 4:
			int media=0;
			for (int i = 0; i < a.getNotasAlumno().length  ; i++) {
				
					media=(int) (a.getNotasAlumno()[i].getCalificacion())/7;
				
			}
			System.out.println("la media es :  "+media);
			break;
		case 5:
			System.out.println("adios");
			break;
		}
		}while(opcion!=5);
	}

}
