package Examen_2evao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EnvioPorFichero implements Envio{

	@Override
	public void enviarPublicidad(String destino, String mensaje) {
		// TODO Auto-generated method stub
		PrintWriter fichero;
		try {
			fichero = new PrintWriter(new File("Oferta"+destino+".txt"));
			fichero.println(mensaje);
			fichero.flush();
			fichero.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
