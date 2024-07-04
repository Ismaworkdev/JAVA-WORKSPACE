package variablesycondiciones;

import java.util.Scanner;

public class ejer_13 {

	public static void main(String[] args) {
		//Dados 10 números introducidos por teclado muestra la suma de los múltiplos de 3 que sean
	//	mayores que 6. También indica qué número de esos múltiplos de 3 que son mayores que 6 es
	//	el mayor.
		
		
		Scanner teclado = new Scanner(System.in);
		int numero =0;
		int suma =0;
		int mayor =0;
		System.out.println("DAME 10 NUMEROS ");
		for (int i=0;i<10;i++) {
		
			numero=teclado.nextInt();
			if(numero%3==0 && numero>6) {
				suma+=numero;
				if(numero>mayor) {
					mayor=numero;
				}
			}
		}
		System.out.println("la suma es : "+suma);
		System.out.println("el mayor es"+mayor);
	}

}
