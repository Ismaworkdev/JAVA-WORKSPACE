package Generar_agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Generar_correos {

	private ArrayList<String>correos;

	public Generar_correos() {
		this.correos=new ArrayList<String>();
	}
	public ArrayList<String> getCorreos() {
		return correos;
	}



	public void setCorreos(ArrayList<String> correos) {
		this.correos = correos;
	}



	public Generar_correos(ArrayList<String> correos) {
		super();
		this.correos = correos;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generar_correos		app =new Generar_correos();
		try {
			Scanner entrada=new Scanner(new File("mixto.csv"));
		
			String cadena="";
			String[]linea;
			String nombrecompleto,nombre,apellidos;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				nombrecompleto=linea[0].trim().toLowerCase();
				System.out.println("*"+nombrecompleto+"*");
				System.out.println(cadena);
				nombrecompleto=app.quitartildes(nombrecompleto);
						}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

	}

public String quitartildes(String nombrecompleto) {
    nombrecompleto = Normalizer.normalize(nombrecompleto, Normalizer.Form.NFD);
    nombrecompleto = nombrecompleto.replaceAll("[^\\p{ASCII}]", "");
    return nombrecompleto;
}


}
