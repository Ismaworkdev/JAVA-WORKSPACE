package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(3,2,12,5,6,11,13);
		//Imprimir
		
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("Imprimir Streams()");
		list.forEach(i->System.out.println(i));
		
		System.out.println("Imprimir Streams() 2");
		list.forEach(System.out::println);
		
		//Contar los numeros pares de la lista
		int contador=0;
		for (Integer i : list) {
			if(i%2==0) {
				contador++;
			}
		}
		System.out.println("Numero de pares: "+contador);
		
		long cont=list.stream().filter(i->i%2==0).count();
		System.out.println("Numero de pares: "+cont);
		
		//Crear una lista nueva con los numeros de pares 
		List<Integer>nueva=new ArrayList<Integer>();
		for (Integer i : list) {
			if(i%2==0) {
				nueva.add(i);
			}
		}
		System.out.println("Lista de pares "+ nueva);
		
		nueva.clear();
		nueva=list.stream().filter(n->n%2==0).toList();
		//nueva=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Lista de pares "+ nueva);
		
		//acumulador
		int suma=0;
		for (Integer i : list) {
			if(i%2==0) {
				suma+=i;
			}
		}
		System.out.println("La suma es: "+suma);
		
		suma=list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("La suma es: "+suma);
		
		double media=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("La media es: "+media);
		
		//Hay menores de 10?
		
		boolean menor10=false;
		
		for (Integer i : list) {
			if(i<10) {
				menor10=true;
			}
		}
		if(menor10) {
			System.out.println("Hay numeros menores que 10");
		}else {
			System.out.println("No hay");
		}
		
		if(list.stream().anyMatch(i->i<10)) {
			
			System.out.println("Hay numeros menores que 10");
		}else {
			System.out.println("No hay");
		}
		
		
	}
}
