package examen_recuperacion_diego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.*;


public class Appjuego {
	
	public ArrayList<Jugador>jugadores;
	public double dineroBanca;

	public Appjuego() {
		
		this.jugadores = new ArrayList<Jugador>();
		this.dineroBanca=0;
	}
	
	public double getDineroBanca() {
		return dineroBanca;
	}

	public void setDineroBanca(double dineroBanca) {
		this.dineroBanca = dineroBanca;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}


	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	//carga los nombres de los jugadores de un fichero .csv
	public void cargarJugadores(String fichero) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(fichero));
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			this.getJugadores().add(new Jugador(linea[0], Integer.parseInt(linea[1]), linea[2]));
		}
	}

	


	public static void main(String[] args) throws FileNotFoundException {
		 Appjuego app=new Appjuego();
		 app.cargarJugadores("lol.csv");
		 System.out.println("Los jugadores son: ");
		 app.mostrarJugadores();
		 System.out.println("***************************************");
		 System.out.println("********Comienza el juego *************");
		 System.out.println("***************************************");
		// System.out.println(app.getJugadores());
		 for(int i=0; i<4; i++) {
			 app.jugar(i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 app.mostrarInformes();
		 
		 app.generarInformes();
	}

	private void mostrarJugadores() {
		for(Jugador j: this.getJugadores()) {
			System.out.println(j);
		}
		
	}

	private void mostrarInformes() {
		
		System.out.println("*****************************************");
		System.out.println("***********Resultado final***************");
		DecimalFormat formato = new DecimalFormat("#.##");
		String dineroFormateado="";
		for(Jugador j: this.getJugadores()) {
			dineroFormateado=formato.format(j.getApuesta());
			System.out.print(j.getNombre()+" de "+j.getCiudad());
			System.out.println(" tiene "+dineroFormateado+"€");
			
		}
		dineroFormateado=formato.format(this.getDineroBanca());
		System.out.println("La banca ha ganado: "+dineroFormateado+"€");
		System.out.println("*****************************************");
		System.out.println("*****************************************");
	}

	private void generarInformes() throws FileNotFoundException {
		DecimalFormat formato = new DecimalFormat("#.##");
		String dineroFormateado="";
		for(Jugador j: this.getJugadores()) {
			PrintWriter salida=new PrintWriter(new File("Resultado"+j.getNombre()+".txt"));
			salida.println("Resultado del juego para "+j.getNombre()+":");
			int nGanadas=0;
			for(int i=0; i<4; i++)
				if(j.getGana()[i]==1)
					nGanadas++;
			salida.println("Partidas ganadas: "+nGanadas);
			dineroFormateado=formato.format(j.getApuesta());
			salida.println("Dinero conseguido: "+dineroFormateado+"€");
			salida.flush();
			salida.close();
			
		}
		
	}

	
	
	private void jugar(int nPartida) {
		double totalApostado=0;
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println();
		
		//Los jugadores lanzan sus dados
		for(Jugador j: this.getJugadores()) {
			j.lanzarDados();
			
		}
		//Apuestan dinero y lo restan de su partida
		for(Jugador j: this.getJugadores()) {
			System.out.println(j.getNombre()+" "+Arrays.toString(j.getLanzamiento()));
			double dinero=j.apostarDinero();
			String dineroFormateado=formato.format(dinero);
			j.setApuesta(j.getApuesta()-dinero);
			String dineroQueda=formato.format(j.getApuesta());
			System.out.println("\tApuesta: "+dineroFormateado+"€-----"+"le quedan "+dineroQueda+"€");
			totalApostado+=dinero;
		}
		
	
        // Formatear el número double con dos decimales
        String numeroFormateado = formato.format(totalApostado);

        // Imprimir el resultado
       
		System.out.println("\t\t TOTAL APOSTADO: "+numeroFormateado+"€");
		//Juegan
		//dos números iguales consecutivos
		boolean gana=false;
		for(Jugador j: this.getJugadores()) {
			for(int i=0; i<j.getLanzamiento().length-2; i++) {
				if(j.getLanzamiento()[i]==j.getLanzamiento()[i+1] &&
				   j.getLanzamiento()[i+1]==j.getLanzamiento()[i+2]	
					)
					gana=true;
			}
			if(gana) {
				//System.out.println("Gana: "+j.getNombre()+" partida "+nPartida);
				j.getGana()[nPartida]=1;
			}
			//j.setGana(j.getGana()+1);
			gana=false;
		}
		
		//Se reparten el dinero
		// aqui se pasa los valores 
		this.repartoTotal(totalApostado,nPartida);
		
		
		
	}//método

	private void repartoTotal(double totalApostado, int nPartida) {
		DecimalFormat formato = new DecimalFormat("#.##");
		
		int contador=0;
		for(Jugador j: this.getJugadores()) {
			if(j.getGana()[nPartida]==1)
				contador++;
		}
		//Han ganado contador jugadores
		double dinero=0;
		if(contador>0) {
			dinero=totalApostado/contador;
		
		//Sumar lo que ha ganado
			for(Jugador j: this.getJugadores()) {
				if(j.getGana()[nPartida]==1) {
					j.setApuesta(j.getApuesta()+dinero);
					String numeroFormateado = formato.format(j.getApuesta());
					System.out.println("GANADOR "+j.getNombre()+" "+numeroFormateado+"€");
				}	
			}
		}//if
		else {
			String numeroFormateado = formato.format(totalApostado);
			System.out.println("\nGANA LA BANCA: "+numeroFormateado+"€");
			dineroBanca+=totalApostado;
		}
		
		
	}

}