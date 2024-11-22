package edd;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numeros=new ArrayList<>();
ArrayList<Double> nominas=new ArrayList<>();

  numeros.add(3);//posicion 0 
  System.out.println(numeros);
  numeros.add(0,8);//cambiar a la posicion 0 y poner un 8
  System.out.println(numeros);
  numeros.remove(0);
  System.out.println(numeros);
  
 for (Integer i :numeros) 
	System.out.println(i);

 
 

	}

}
