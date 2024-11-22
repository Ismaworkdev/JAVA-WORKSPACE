package FICHEROS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f=new File("documento.txt");
			Scanner entrada=new Scanner(f);
			String n;
			int suma=0;
			while(entrada.hasNext()) {
				n=entrada.next();
				System.out.println(n);
				suma=suma+ Integer.parseInt(n);
			}
			System.out.println(suma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
