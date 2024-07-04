package repaso;

import java.util.Scanner;

public class diviasores5 {

	public static void main(String[] args) {
		// . Un número perfecto es aquel que es igual a la suma de sus divisores (excepto él mismo).
	//	Haz un programa Java que dado un número por teclado diga si es perfecto o no
		Scanner teclado =new Scanner(System.in);
		int suma=0;
		int numero=teclado.nextInt();
		for(int i=0; i<=numero; i++) {
			if(numero%i==0) {
				System.out.println(i+"  es divisor ");
				suma+=i;
			}
		}
		if(suma==numero) {
			System.out.println("el numero es perfecto");
		}else {
			System.out.println("el numero no es perfecto ");
		}

	}

}

