package ejercicios_repaso;

import java.util.Scanner;

public class impares20_50 {

	public static void main(String[] args) {
	    // 6. Multiplica los números impares comprendidos entre 20 y 60

	    Scanner teclado= new Scanner(System.in);
	    int numero;
	    int producto = 1;

	    for(int i = 21; i < 60; i ++) {
	    	
	        producto *= i;
	    }

	    System.out.println("La multiplicación total de impares entre 20 y 60 es " + producto);
	}


	}


