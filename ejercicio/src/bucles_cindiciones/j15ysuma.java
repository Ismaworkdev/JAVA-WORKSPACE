package bucles_cindiciones;

import java.util.Scanner;

public class j15ysuma {

	public static void main(String[] args) {
		// pedir 15 numeros y veerr la suma total
Scanner teclado= new Scanner(System.in);
int b=0, suma=0;
int i =0;
do {
	System.out.println("dAME UN NUMERO");
	b=teclado.nextInt();
	suma+=b;
	i++;
}while(i<5);

System.out.println("lA SUMA ES : "+suma);
	}

}
