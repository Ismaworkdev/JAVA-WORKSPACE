package variablesycondiciones;

import java.util.Scanner;

public class ejer17_chongo {

	public static void main(String[] args) {
		// 7. Realiza un programa que calcule la media de los dígitos que contiene un número entero
		//introducido por teclado. También muestra cuál de sus cifras es la mayor y cuál la meno
		
		
//		  Scanner teclado = new Scanner(System.in);
//	        System.out.print("Introduce  número: ");
//	       int numero=teclado.nextInt();
//	       int inicial=numero;
//	       int resto=0;
//	       int suma=0;
//	       int nuevo=0;
//	       int mayor=0,menor=0;
//	       int contador=1;
//	       while(numero>=10) {
//	    	   resto=numero%10;
//	    	   numero=numero/10;
//	    	   if(contador==1) {
//	    		   mayor=resto;
//	    		   menor=resto;
//	    	   }
//	    	   suma+=resto;
//	    	   contador++;
//	    	  
//	    	   
//	    	   
//	       }
//	            
//	            suma =suma+numero;
//	            if(mayor<resto) {
//		    		   mayor=resto;
//		    	   }
//	            if(menor>resto) {
//	            	menor=resto;
//	          
//	            }
//	          
//	            
//	            if(menor>numero) {
//	            	menor=numero;
//	            }
//	            if(mayor<numero) {
//	            	mayor=numero;
//	            }
//	            System.out.println("cifras: "+contador);
//	            System.out.println("suma : "+suma);
//	            System.out.println("media : "+(float)(suma/contador));
//	            System.out.println("el mayor : "+mayor);
//	            System.out.println("el menor es : "+menor);
	
		
		
			// 7. Realiza un programa que calcule la media de los dígitos que contiene un número entero
			//introducido por teclado. También muestra cuál de sus cifras es la mayor y cuál la meno
			
			
			  Scanner teclado = new Scanner(System.in);  
		        System.out.print("Introduce  número: ");
		       int numero=teclado.nextInt();
		       int inicial=numero;
		       int resto=0;
		       int suma=0;
		       int nuevo=0;
		       int mayor=0,menor=0;
		       int contador=1;
		       while(numero>=10) {
		    	   resto=numero%10;
		    	   numero=numero/10;
		    	   if(contador==1) {
		    		   mayor=resto;
		    		   menor=resto;
		    	   }
		    	   suma+=resto;
		    	   contador++;
		    	  
		    	   
		    	   
		       }
		            
		            suma =suma+numero;
		            if(mayor<resto) {
			    		   mayor=resto;
			    	   }
		            if(menor>resto) {
		            	menor=resto;
		          
		            }
		          
		            
		            if(menor>numero) {
		            	menor=numero;
		            }
		            if(mayor<numero) {
		            	mayor=numero;
		            }
		            System.out.println("cifras: "+contador);
		            System.out.println("suma : "+suma);
		            System.out.println("media : "+(float)(suma/contador));
		            System.out.println("el mayor : "+mayor);
		            System.out.println("el menor es : "+menor);
		        }
	        }
	       
	


