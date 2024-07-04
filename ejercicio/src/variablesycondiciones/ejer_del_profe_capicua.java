package variablesycondiciones;

import java.util.Scanner;

public class ejer_del_profe_capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial=0;
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce  número: ");
	        int numero = scanner.nextInt();
	        System.out.print("El número  reves : ");
	        while (numero != 0) {
	        	
	        	int i = numero % 10;
	            numero = numero/10;
	            System.out.print(i);
	           
	            
	            
	        }
	        int i = numero % 10;
	       
			if(inicial==i) {
	        	System.out.println("     es capicua");
	        	
	        }else {
	        	System.out.println("    no es capicua");
	        }
	     
	}

}
