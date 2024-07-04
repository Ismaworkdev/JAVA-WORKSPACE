package ejercicios_repaso;

import java.util.Scanner;

public class ejer_7 {

	


	    public static void main(String[] args) {
	        // 7. Cuenta los números que sean múltiplos de 3 entre 1 y N. N es un número que el usuario nos da por teclado se hara 10 veces 
	        Scanner teclado = new Scanner(System.in);
	        int contador = 0;

	        do {
	            System.out.println("Inserta un número: ");
	            int N = teclado.nextInt();
	            int contadorn = 0;

	            for (int i = 1; i <= N; i++) {
	                if (i % 3 == 0) {
	                    contadorn++;
	                }
	            }

	            System.out.println("Hay " + contadorn + " múltiplos de 3 entre 1 y " + N);
	            contador++;
	        } while (contador < 10);
	    }
	}



