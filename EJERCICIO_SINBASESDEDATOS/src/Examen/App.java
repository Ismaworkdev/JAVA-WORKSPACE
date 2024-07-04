package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private ArrayList<Publicista> publicistas;
	private ArrayList<Oferta> ofertas;

	public App(ArrayList<Publicista> publicistas, ArrayList<Oferta> ofertas) {
		super();
		this.publicistas = publicistas;
		this.ofertas = ofertas;
	}

	public App() {
		super();
		this.publicistas = new ArrayList<Publicista>();
		this.ofertas = new ArrayList<Oferta>();
	}

	public ArrayList<Publicista> getPublicistas() {
		return publicistas;
	}

	public void setPublicistas(ArrayList<Publicista> publicistas) {
		this.publicistas = publicistas;
	}

	public ArrayList<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(ArrayList<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	@Override
	public String toString() {
		return "App [publicistas=" + publicistas + ", ofertas=" + ofertas + "]";
	}

	public void leerPublicista() {
		// aqui cargamos los publicistas
		Scanner entrada = new Scanner(System.in);
		try {
			entrada = new Scanner(new File("Personas.csv"));
			String linea[];
			String cadena;
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.trim().split(";");
				if (linea[0].equalsIgnoreCase("publicista")) {
					this.getPublicistas().add(new Publicista(Integer.parseInt(linea[1]), linea[2], linea[3], linea[4],
							Integer.parseInt(linea[5])));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void leerOfertas() {

		Scanner entrada = new Scanner(System.in);
		try {
			entrada = new Scanner(new File("Ofertas.txt"));
			String linea[];
			String cadena;
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				linea = cadena.trim().split(",");
				this.getOfertas().add(new Oferta(linea[0], linea[1], linea[2], Integer.parseInt(linea[3])));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void generarCorreos(Publicista p) {

		EnvioPorFicheros e = new EnvioPorFicheros();
		String mensaje = "";

		for (Cliente cli : p.getClientes()) {
			cli.interesesCliente("intereses.csv");

			mensaje = mensaje + "Estimad@ " + cli.getNombre() + "\n" + "Sabemos que entre tus intereses se encuentran: "
					+ "\n";
			for (String in : cli.getIntereses()) {
				mensaje=mensaje+"\t *"+in+"\n";
			}
			cli.mostrarIntereses();

			mensaje = mensaje + "así que puede canjear sus " + cli.getnPuntos()
					+ " puntos por estos productos que tenemos en oferta" + "\n";
			mensaje = mensaje + "*************************************************************************** \n";

			int contador = 0;
			for (Oferta of : this.getOfertas()) {
				for (int i = 0; i < cli.getIntereses().size(); i++) {
					if (of.getCategoria().equals(cli.getIntereses().get(i)) && contador < cli.getnPuntos()) {

						if ((of.getPuntos() + contador) < cli.getnPuntos()) {
							mensaje = mensaje + "\n" + of.getNombre() + ": " + of.getPuntos() + " puntos";
							contador = contador + of.getPuntos();
						} else {
							i++;
						}

					}
				}

			}

			mensaje = mensaje + "\n \t TOTAL: " + contador +  "\n";
			mensaje = mensaje + "******************************************************************************  \n";
			mensaje = mensaje + "No deje pasar estar oportunidad porque vuelan"+  "\n";
			mensaje = mensaje + "Si tienes cualquier duda escribeme a " + p.getCorreo()+  "\n";
			mensaje = mensaje + "\t  Un saludo " + p.getNombre() + " " + p.getApellidos()+  "\n";

			e.enviarPublicidad(cli.getCorreo(), mensaje);
			mensaje="";

		}

	}

	public static void main(String[] args) {
		App app = new App();
		app.leerPublicista();
		app.leerOfertas();
		System.out.println("Envio de ofertas a los clientes 27/02/2024");

		for (Publicista p : app.getPublicistas()) {
			p.cargarListaClientes("Personas.csv");
			app.generarCorreos(p);
			System.out.println(
					" " + p.getNombre() + " " + p.getApellidos() + " envía " + p.getClientes().size() + " correos");

		}
	}

}
