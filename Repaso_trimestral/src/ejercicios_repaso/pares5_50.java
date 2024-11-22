package ejercicios_repaso;

import java.util.Scanner;

public class pares5_50 {

	public static void main(String[] args) {
		// 5. Suma los números pares que hay entre 1 y 50.

		 Scanner teclado= new Scanner(System.in);
		    int numero;
		    int suma=0;

		    do {
		        System.out.println("inserta un numero  ");
		        numero=teclado.nextInt();

		       if(5<numero&& 50>numero) {
		    	   suma=suma+numero;
		       }
		            
		    

		    }while(5<numero&& 50>numero);

		    System.out.println("has terminado  ");
		    System.out.println("suma total de pares "+suma);
		}

	
	}


