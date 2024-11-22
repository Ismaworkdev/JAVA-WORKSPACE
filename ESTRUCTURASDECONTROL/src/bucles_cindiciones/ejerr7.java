package bucles_cindiciones;

import java.util.Scanner;

public class ejerr7 {

	public static void main(String[] args) {
		//  logtin -usuario = root pass = 1234
		Scanner teclado=new Scanner(System.in);
		String usuario , pass;
		int contador = 3;
		
		do {
			System.out.println("usuario :");
			usuario=teclado.next();
			System.out.println("contraseña : ");
			pass=teclado.next();
			contador--;
			
		}while(contador >0 &&(!usuario.equals("root")||!pass.equals("1234")));
	if(contador>0) {
		System.out.println("bienvenido");
	}else {
		System.out.println("cuenta bloqueada");
	}
		

	}

}
