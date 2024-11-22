package Aeropuerto_interface;

import java.io.IOException;
import java.util.Scanner;

import fichero_objetos.Contacto;

public class Aparcamiento {
	
	
	public  void menu(){
		System.out.println("1.Leer Conductores");
		System.out.println("2.Dar de alta cliente ");
		System.out.println("3.Guardar Cliente");
		System.out.println("4.Leer Cliente");
		System.out.println("5.Generar Tikets");
		System.out.println("6.imprimir turno de entrega ");
		System.out.println("7.Salir");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aparcamiento a=new Aparcamiento();

int opcion=0;
Scanner sc=new Scanner(System.in);
a.menu();
opcion=sc.nextInt();
switch (opcion) {
case 1:
	
	break;
case 2:
	break;
case 3:

break;
case 4:
	
break;
case 5:
	
break;
case 6:
	
break;
default:
	break;

} while (opcion!=7);
	}

}
