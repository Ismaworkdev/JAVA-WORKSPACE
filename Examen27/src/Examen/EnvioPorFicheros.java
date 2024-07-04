package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;





public class EnvioPorFicheros implements Envio {

	@Override
	public void enviarPublicidad(String destino, String mensaje) {

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
