package streams;

import java.util.Arrays;
import java.util.List;

public class NumerosStream {

	public static void main(String[] args) {
		List<Integer>numeros=Arrays.asList(2,3,4,5,6,7);
		
		//Crear una nueva lista con los cuadrados
		List<Integer>nueva=numeros.stream().map(n->n*n).toList();
		System.out.println(nueva);
		
		//Contar cuantos numeros hay mayores o iguales a 4
		int cont=(int) numeros.stream().filter(n->n>=4).count();
		System.out.println("Numeros mayores o iguales a 4: "+cont);
		
		//media
		double media=numeros.stream().mapToInt(i->i.intValue()).average().getAsDouble();
		System.out.println("La media es "+media);
		
		//suma total
		int suma=numeros.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("La suma es "+suma);
		
		//Comprobar si todos son menores que 10
		if(numeros.stream().allMatch(i->i<10)) {
			System.out.println("Todos son menores que 10");
		}else {
			System.out.println("Hay mayores a 10");
		}
	
	}
}
