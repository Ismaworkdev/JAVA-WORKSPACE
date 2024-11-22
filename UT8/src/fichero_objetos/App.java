package fichero_objetos;

import java.io.IOException;
import java.util.Scanner;

public class App {
	public  void menu(){
		System.out.println("1.imprimir agenda");
		System.out.println("2.Añadir contacto");
		System.out.println("3.eliminar contacto");
		System.out.println("4.salir");
		System.out.println("elige una opcion ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
App a=new App();
Agenda ag=new Agenda();
try {
	ag.cargarAgenda("agenda.bin");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

int opcion=0;
Scanner sc=new Scanner(System.in);
do {
	a.menu();
	opcion=sc.nextInt();
	switch (opcion) {
	case 1:
		ag.listarAgenda();
		break;
case 2:
		System.out.println("nombre : ");
		sc.nextInt();
		String nombre =sc.nextLine();
		System.out.println("dirr:");
		String dir=sc.nextLine();
		System.out.println("tel : ");
		String tel =sc.nextLine();
		System.out.println("correo :");
		String correo=sc.nextLine();
		ag.addContacto(new Contacto( nombre,  tel,  correo,  dir));
		break;
case 3:
	System.out.println("nombre :");
	String nom=sc.nextLine();
	sc.nextLine();
	ag.eliminarContacto(nom);
	break;
case 4:
		try {
			ag.guardarAgenda("agenda.bin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;
	default:
		break;
	}
} while (opcion!=4);
	}

}
