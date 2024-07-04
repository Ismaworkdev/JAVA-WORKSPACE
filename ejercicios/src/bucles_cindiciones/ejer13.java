package bucles_cindiciones;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		// duda
		float suma=0.0f;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("dame un numero");
			numero=sc.nextInt();
			if(numero>=0) {
				
			
			suma+=numero;
			contador++;
			}
		}while(numero>=0);
System.out.println("la media es "+(suma/contador));
	}

}
