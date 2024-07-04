package bucles;

import java.util.Scanner;

public class Ejemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int n = 1;//interador
//		while(n<=7) {
//			System.out.println(n);
//			n++;
//				
//		}
//		//mostrar los pares entre 0 y 20 
//		int o =1;
//		while(o<=20) {
//			System.out.println(o);
//			o=o+2;
//		}
//		
//		System.out.println("multiplos de 3 y entre 3 y 21");
//		int l = 3;
//		while(l<=21) {
//			System.out.println(l);
//			l=l+3;
//		}
//		
//		System.out.println("del 100 al 0 de 7 en 7 ");
//		int p = 100;
//		while(p>=0) {
//			System.out.println(p);
//			p=p-7;
//		}
//		
//		
//		//leer numeros hasta que se introduzca un 0 
	Scanner teclado = new Scanner(System.in);
//		int j = 1 ;
//		
//		
//		
//		while(j!=0) {
//			System.out.println("Dame un numero ");
//			j = teclado.nextInt();
//			System.out.println(j);
//			
//		}
//	
//		
		//pedir 15 numeros y escribir la suma total 
		
//		int numero=0;
//		int contador = 1;
//		int suma = 0;
//
//		while (contador < 5) {
//			
//		    System.out.println("Dame un número:");
//		
//		    numero = teclado.nextInt();
//
//		    suma = suma + numero;
//		 
//
//		    contador++;
//		}
//		   System.out.println("La suma es: " + suma);
		   
		   
		   //el juego 
//		int secreto=(int)(1+Math.random()*20);
//		System.out.println(secreto);
//		Scanner teclado1=new Scanner(System.in);
//		boolean gana = false;
//		int contador = 5;
//		while(!gana && contador>0) {
//			
//		
//		System.out.println("dame un numero");
//		int numero2 =0;
//		numero2 = teclado1.nextInt();
//		if(numero2==secreto) {
//			System.out.println("has ganado");
//			gana = true;
//		}else {
//			if(numero2>secreto) {
//				System.out.println("el numero secreto es menor");
//				
//			}else {
//				System.out.println("El numero secreto es mayor ");
//			}
//		}
//		contador--;
//		}
//		if(contador==0) {
//			System.out.println("has agotado tus intentos : ) ");
//		}
	
	
	
	
	
	//pedir numeros hasta que se introduzca uno negativo y calcula la media 
	
	Scanner teclado3=new Scanner(System.in);
	System.out.println("dame un numero");
	float media=0;
	int contador =0;
	int numero=0;
	int suma =0;
	numero = teclado3.nextInt();
	while(numero>=0) {
		System.out.println("dame un numero");
		numero=teclado.nextInt();
		if(numero>=0) {
			suma=numero+suma;
			contador++;
		}
		
	}
	media =suma/contador;
		System.out.println("fin ");
		System.err.println(" la media es "+media);
		System.out.println("la suma es"+suma);
	}
	

}
