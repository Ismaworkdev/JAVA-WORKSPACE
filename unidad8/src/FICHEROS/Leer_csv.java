package FICHEROS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leer_csv {
	public static void main(String[] args) {
		
	
	
	try {
		Scanner entrada=new Scanner(new File("lll.csv"));
	
		String cadena;
		String[]linea;
		int suma=0;
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			
			System.out.print(cadena);
			for (int i = 0; i < linea.length; i++) {
				suma=suma+Integer.parseInt(linea[i]);
			}
		}
		System.out.println("suma : "+suma+"\n");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}}

}
