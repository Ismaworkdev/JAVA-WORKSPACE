package ejercicios_repaso;

import java.util.Scanner;

public class Termina_en_0 {

	public static void main(String[] args) {
		// 3. Suma los números que el usuario le pasa por teclado. Termina cuando pone un 0
Scanner teclado= new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("inserta un numero  ");
			 numero=teclado.nextInt();
		}while(numero!=0);
			System.out.println("lo siento :(");
	
		

	}

}
