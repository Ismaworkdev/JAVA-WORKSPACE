package ejercicios_repaso;

import java.util.Scanner;

public class ejer1_semana1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner (System.in);
System.out.println("dame 5 numeros");
teclado.nextInt();
int suma=0;
int mayor=0;
int menor=0;
for (int i = 0; i < 5; i++) {
	int num=teclado.nextInt();
	
	if (num > mayor) {
		mayor=num;
	}
	
	if (num < menor) {
		menor=num;
	}
	
	suma++;
}
System.out.println("la suma es : "+suma );
   suma=suma/5;

System.out.println(" resultado : "+suma);
System.out.println("mayor "+mayor);

System.out.println("mayor "+menor);
	}

}
