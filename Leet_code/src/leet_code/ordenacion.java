package leet_code;

import java.util.Arrays;

public class ordenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int [5];
array[0]=5;
array[1]=3;
array[2]=7;
array[3]=8;
array[4]=1;
System.out.println(Arrays.toString(array));

System.out.println(Arrays.toString(array));
burbuja(array);
	}
	
	
	private static void burbuja(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j]>array[j+1]) {
					intercambio(array ,j,j+1);
					
				}
			}
		}
	}


	public static void intercambio(int array[],int indiceA , int indiceB) {
		int aux=array[indiceA];
		array[indiceA]=array[indiceB];
		array[indiceB]=aux;
	}

}
