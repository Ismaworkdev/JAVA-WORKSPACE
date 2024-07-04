package bucles_cindiciones;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		// pedir n y mostar del 1 al n 
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("dame un numero");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 System.out.println(i+" ");
		 }

	}

}
