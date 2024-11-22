package ejercicios_repaso;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		// 2. El usuario introduce por pantalla un número y el programa le indica si es par o impar
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("inserta un numero  ");
		int numero=teclado.nextInt();

		
		if(numero%2==0) {
			System.out.println("es par");
		}else {
			System.out.println("es impar");
		}
	}

}
