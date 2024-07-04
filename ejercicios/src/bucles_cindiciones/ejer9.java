package bucles_cindiciones;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		// Escriba un programa en Java que solicite 10 números enteros positivos al usuario y
		//calcule y muestre los siguientes valores:
		//	• La suma de todos los números leídos.
		//	• La media de los números.
			//• El mayor número introducido.
		//	• El menor número introducido. 
		    
		Scanner teclado=new Scanner(System.in);
		int numero ;
		int suma =0;
		int media =0;
		int nummayor=0;
		int nummenor=0;
		
		
		for(numero =0; numero<10 ; numero++) {
			
		System.out.println("dame 10 numeros ");
		numero=teclado.nextInt();
		suma=suma+numero;
		if(numero >nummayor) {
			nummayor=numero;
		}if(numero <nummenor) {
			nummenor=numero;
		}
		}
		media=suma/numero;
		System.out.println("suma : "+suma);
		System.out.println("media : "+media);
		System.out.println("numero mayor : "+nummayor);
		System.out.println("numero menor : "+nummenor);

	}

}
