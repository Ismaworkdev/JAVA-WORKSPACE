package ejercicios_repaso;

import java.util.Scanner;

public class tamaño_String {

	public static void main(String[] args) {
		//12. Crea un array de String de tamaño 5 e introduce por teclado 5 nombres. Imprime el resultado.
		  Scanner scanner = new Scanner(System.in);
	        String[] nombres = new String[5];
	        
	        for(int i = 0; i < nombres.length; i++) {
	            System.out.print("Introduce el nombre " + (i+1) + ": ");
	            nombres[i] = scanner.nextLine();
	        }

	        System.out.println("Los nombres introducidos son:");
	        for(String nombre : nombres) {
	            System.out.println(nombre);
	        }
	    }
	}
	
