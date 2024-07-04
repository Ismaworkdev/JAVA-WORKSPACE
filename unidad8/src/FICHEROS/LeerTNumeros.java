package FICHEROS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerTNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	File f=new File("documento.txt");
	Scanner entrada=new Scanner(f);
	int num=0;
	int suma=0;
	while(entrada.hasNext()) {
		num=entrada.nextInt();
		System.out.println(num);
		suma=suma+num;
	}
	
	
	System.out.println("el resultado es :  "+suma);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



	}

}
