package gympendientes;

import java.io.IOException;
import java.util.Scanner;



public class App_gym {
	private void menu() {
		// TODO Auto-generated method stub
System.out.println("usuario:");
System.out.println("contraseña : ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App_gym a=new App_gym();
		
		
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		do {
			a.menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				
				break;
		case 2:
			
				break;
		case 3:
			
			break;
		case 4:
				
			break;
			default:
				break;
			}
		} while (opcion!=4);
			}

	}


