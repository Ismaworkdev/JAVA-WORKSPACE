package ejercicios_repaso;


import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// 1. Pide al usuario su nombre y su edad y lo muestre por pantalla

		Scanner teclado= new Scanner(System.in);
	
		
System.out.println("inserta el usuario ");
String nombre = teclado.nextLine();
System.out.println("inserta tu edad ");
int edad=teclado.nextInt();

System.out.println("el usuario "+nombre+" tiene "+edad+" años");
	}

	
	}


