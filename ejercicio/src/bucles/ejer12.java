package bucles;

import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12 pedir 10 numeros mostrar la meda de lso numeros negativos y positivos y la cantidad de 0 
				Scanner teclado=new Scanner(System.in);
				int numero=0;
				int i =0;
				int ccero=0 ,cpositivo=0 , cnegativos=0;
				int sumpos=0, sumneg=0;
				while(i<10) {
					System.out.println("dame un numero ");
					numero =teclado.nextInt();
					if(numero==0)
						ccero++;
					if(numero<0) {
						sumneg=sumneg+numero;
						cnegativos++;
					}
					if(numero>0) {
						sumpos=sumpos+numero;
						cpositivo++;
					}
					
					i++;
					
				}
				System.out.println("la media del positovo es :"+(float)(sumpos/cpositivo));
				System.out.println("la media del negativo es :"+(float)(sumneg/cnegativos));
				System.out.println("fin");
				
	}

}
