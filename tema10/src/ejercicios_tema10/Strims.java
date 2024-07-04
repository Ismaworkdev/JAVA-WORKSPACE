package ejercicios_tema10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Strims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>m=Arrays.asList("lol", "pp","nn", "Alol<","lollO");
// Crear una lista de enteros utilizando Integer (no int)
List<Integer> m2 = Arrays.asList(3, 4, 44, 4, 44);

// Imprimir la lista
m2.forEach(System.out::println);

//m.stream().sorted().forEach(n->System.out.println(n));
//
//m.forEach(n->System.out.println(n));

m=m.stream().sorted().toList();
m.forEach(n->System.out.println(n));

//lista de nombrees que empiece por a y termine por o 
List<String>nueva=m.stream().filter(n->n.startsWith("A")||n.endsWith("O")).toList();
nueva.forEach(System.out::println);

//nombre de longuitud 3 y pasar  a mayuscula 
List<String> nueva1 = m.stream()
.filter(n -> n.length() == 3)
.map(String::toUpperCase) // Convertir a mayúsculas
.toList();

nueva1.forEach(System.out::println);



       }

}
