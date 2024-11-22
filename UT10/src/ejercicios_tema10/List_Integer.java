package ejercicios_tema10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import java.lang.*;
public class List_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = Arrays.asList(3.0, 2.0, 12.0, 5.0, 6.0, 11.0, 13.0);
		System.out.println(lista);
		int contador =0;
		for (Double numero : lista) {
		    if (numero % 2.0 == 0.0) {contador ++;
		        System.out.println("El número " + numero + " es par");
		    } else {
		        System.out.println("El número " + numero + " es impar");
		    }
		    
		}
	    System.out.println("hay "+contador+"numeros pares. ");
  long cont =lista.stream().filter(i->i%2==0).count();
System.out.println(cont);

//nueva lista 

ArrayList<Double>nueva=new ArrayList<Double>();

System.out.println("la suma es "+lista);

for(list i : i>10 ) {
	
	
}

for (Iterator iterator = nueva.iterator(); iterator.hasNext();) {
	System.out.println("hola");
	Double double1 = (Double) iterator.next();
	
}


	}

}