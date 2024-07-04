package ejer_nota;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
System.out.println("a");
int a=teclado.nextInt();
System.out.println("b");
int b=teclado.nextInt();
try {
	System.out.println("a/b"+(a/b));
}catch(Exception e) {
	System.out.println("error division entre 0 ");
}




	}

}
