package ejer_evaluable;

import java.util.Scanner;

public class ejer_isma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       
		int a, b;
		 
	    do {
	    	
	        System.out.println("Introduce el primer número entero positivo (a):");
	        a = scanner.nextInt();

	        System.out.println("Introduce el segundo número entero positivo (b):");
	        b = scanner.nextInt();
	    } while(!correctos(a, b));

	    System.out.println("Has introducido los números " + a + " y " + b + ".");

	    String opcion_letras;
	    String pregunta1 = "a";
	    String pregunta2 = "b";
	    String pregunta3 = "c";
	    String pregunta4 = "d";
	    String pregunta5 = "e";
	        
		do {
	        System.out.println("Elige una opción:");
	        
	        System.out.println("a. Imprimir los primeros  a terminos de la succesion de Fibonacci : ");
	        
	        System.out.println("b. el mayor primo entre  a y b ");

	        System.out.println("c. imprimir los palindromos impares  entre a y b ");
	        
	        System.out.println("d. imprimir el factorial de  b");
	       
	        System.out.println("e. Salir");
              
	     
	        opcion_letras = scanner.next();
	        
	        switch(opcion_letras) {
	        
	            case "a":
	            	// Imprimir los primeros 'a' términos de la sucesión de Fibonacci
	                for(int i = 0; i < a; i++) {
	                    System.out.println(fibonacci(i));
	                }
	                break;
	            case "b":
	                // Imprimir el mayor primo entre 'a' y 'b'
	                System.out.println(mayorPrimo(a, b));
	                break;
	            case "c":
	                // Imprimir los palíndromos impares entre 'a' y 'b'
	                for(int i = a; i <= b; i++) {
	                    if(esPalindromo(i) && i % 2 != 0) {
	                        System.out.println(i);
	                    }
	                }
	                break;
	            case "d":
	                // Imprimir el factorial de 'b'
	                System.out.println(factorial(b));
	                break;
	                
	            
	            case "e":
	                System.out.println("¡Hasta luego!");
	                break;  
	            default:
	                System.out.println("Opción no válida. Por favor, elige una opción del  a al e .");
	                break;
	        }
	    }while(!(opcion_letras !="e")); 
		
	}

	private static long fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

	private static long factorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * factorial(n - 1);
	    }
	}

	private static boolean esPrimo(int n) {
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	private static int mayorPrimo(int a, int b) {
	    int mayorPrimo = -1;
	    for (int i = a; i <= b; i++) {
	        if (esPrimo(i)) {
	            mayorPrimo = i;
	        }
	    }
	    return mayorPrimo;
	}

	private static boolean esPalindromo(int n) {
	    int reverso = 0, resto, original;

	    original = n;

	    while (n != 0) {
	        resto = n % 10;
	        reverso = reverso * 10 + resto;
	        n /= 10;
	    }

	    if (original == reverso) {
	        return true;
	    } else {
	        return false;
	    }
	}


	public static boolean correctos(int a, int b) {
	    if(a <= 0 || b <= 10) {
	        System.out.println("Por favor, introduce solo números enteros positivos.");
	        return false;
	    } else if(a == b) {
	        System.out.println("Por favor, introduce dos números diferentes.");
	        return false;
	    } else {
	        return true;
	    }
	}
}


