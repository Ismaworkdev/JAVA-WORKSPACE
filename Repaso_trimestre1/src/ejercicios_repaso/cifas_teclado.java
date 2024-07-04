package ejercicios_repaso;

import java.util.Scanner;

public class cifas_teclado {

	public static void main(String[] args) {
		//11. Calcula las cifras de un número que el usuario le pasa por teclado
Scanner teclado= new Scanner(System.in);
 
  System.out.println("numero");
  int numero=teclado.nextInt();
  
  String cifra= String.valueOf(numero);
  System.out.println( "el numero" +cifra+"  tiene "+cifra.length()+" cifras  ");
  
  
          
	}

}
