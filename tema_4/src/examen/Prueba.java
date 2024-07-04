package examen;

import java.util.Arrays;

public class Prueba {
	public static void main(String[] args) {
		int matriz[][]=new int[4][10];
		int gana[]=new int[4];
		
		System.out.print("************Lanzamientos************");
		for(int i=0; i<matriz.length; i++){
			System.out.println();
			for(int j=0;j<matriz[0].length; j++) {
				matriz[i][j]=(int)(1+Math.random()*6);
				System.out.print(matriz[i][j]+"  ");
			}
		}
		System.out.print("\n************************************\n");
		imparPar(matriz,gana);
		sumaSiguiente(matriz,gana);
		Consecutivos(matriz,gana);
	}
	
	private static void sumaSiguiente(int[][] matriz,int []gana) {
		for (int i = 0; i < gana.length; i++) {
			for (int j = 0; j < gana.length-2; j++) {
				if(matriz[i][j]+matriz[i][j+1]==matriz[i][j+2])
						gana[i]=1;
			}
		}
		
		
	}
	
	private static void imparPar(int[][] matriz,int[] gana) {
		int suma=0;
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			suma=suma+matriz[i][j];
			// 
			
			
		}
		System.out.println(suma+" ");
		
	}
	}
	
	private static void Consecutivos(int[][] matriz,int []gana) {
		for (int i = 0; i < gana.length; i++) {
			for (int j = 0; j  <matriz[0].length-1; j++) {
				if(matriz[i][j+1]-matriz[i][j]==1) {
					System.out.println(i+" "+j);
				}
			
		}
			
		}
		
		
	}
}
