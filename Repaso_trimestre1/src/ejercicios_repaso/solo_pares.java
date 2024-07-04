package ejercicios_repaso;

import java.util.Scanner;

public class solo_pares {

	public static void main(String[] args) {
	
		    // 4. Suma solo los números pares que el usuario le pasa por teclado. Termina cuando pone un 1

		    Scanner teclado= new Scanner(System.in);
		    int numero;
		    int suma=0;

		    do {
		        System.out.println("inserta un numero  ");
		        numero=teclado.nextInt();

		        if(numero%2==0) {
		            suma=suma+numero;
		        }

		    }while(numero!=1);

		    System.out.println("has terminado porque has puesto 1 ");
		    System.out.println("suma total de pares "+suma);
		}

	
	
}


