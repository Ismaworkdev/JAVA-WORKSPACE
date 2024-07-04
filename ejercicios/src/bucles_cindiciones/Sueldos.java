package bucles_cindiciones;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		// siempre que sepas cuantas veces un for 
		float sueldo=0.0f, suma=0.0f;
		int contador1000=0;
		
Scanner teclado=new Scanner(System.in);
for(int i=0; i<10;i++) {
	System.out.println("sueldo: ");
	sueldo=teclado.nextFloat();
	suma+=sueldo;
	if(sueldo>1000)
		contador1000++;
}
System.out.println("la suma de los sueldos es "+suma);
System.out.println("los sueldso mayores que 1000"+contador1000);



	}

}
