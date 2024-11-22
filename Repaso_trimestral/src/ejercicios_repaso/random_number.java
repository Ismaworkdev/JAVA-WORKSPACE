package ejercicios_repaso;

import java.util.Scanner;

public class random_number {

	public static void main(String[] args) {
		// Se genera un número aleatorio entre 1 y 20. El usuario introduce números por teclado y
	//	el programa le dirá si el número secreto es mayor o menor. Se termina cuando lo adivina
		Scanner teclado= new Scanner(System.in);
		int random = (int) (1 + (Math.random() * 20));
	int contador=0;
		
	
	
		  int numero;

	        do {
	            System.out.print("Introduce un número: ");
	            numero = teclado.nextInt();
contador++;
	            if(numero == random) {
	                System.out.println("Has ganado, el número es " + random);
	            } else if(numero > random){
	                System.out.println("El número es más pequeño");
	            } else if(numero < random){
	                System.out.println("El número es más grande ");
	            }
	         if(contador>=4) {
	        	 System.out.println("contafgsahdfhgfdh");
	        	 break;
	         }
	        } while(numero != random  );
		
		
		

	}

}
