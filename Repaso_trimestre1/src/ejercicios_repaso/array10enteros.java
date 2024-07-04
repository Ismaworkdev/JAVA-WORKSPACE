package ejercicios_repaso;

import java.util.Scanner;

public class array10enteros {

	public static void main(String[] args) {
		// 14. Crea un array de 10 enteros.
	//	a. El usuario introduce los 10 valores
	//	b. Calcula la suma de todos los números
	//	c. El número de números pares
//		d. El producto de todos
	//	e. La media
//		f. ¿Cuántos números hay mayores que la media? ¿y menores?
		
		  Scanner scanner = new Scanner(System.in);
	        int[] array = new int[10];
	     
	       for (int i = 0; i < array.length; i++) {
			System.out.println("introduce el valor " +(i+1)+" : ");
			array[i]=scanner.nextInt();
			
		}
	       
	       int suma = 0;
	       int media=0;
	       
	       for (int i = 0; i < array.length; i++) {
	           suma += array[i];
	           
	       }
	     media=suma/10;
	    
	     
	     for (int i = 0; i < array.length; i++) {
	    	  if(array[i] < media) {
	 	    	 System.out.println((i+1)+" es menor que la media ");
	 	     }else {
	 	    	 System.out.println((i+1)+" es mayor que la media ");
	 	     }
	           
	       }
	   
	    
	       System.out.println("La suma es: " + suma);
	       System.out.println("La media es: " + media);

		       

	}

}
