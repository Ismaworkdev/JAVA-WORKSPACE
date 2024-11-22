package clientes_vehiculos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class App {

	
		// TODO Auto-generated method stub
		ArrayList<Coche> cargarCoches(String fichero) throws FileNotFoundException{
			Scanner entrada=new Scanner(new File(fichero));
			ArrayList<Coche>coches=new ArrayList<Coche>();
			String linea[];
			String cadena;
			entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				coches.add(new Coche(linea[0], linea[1], linea[2], linea[3], Integer.parseInt(linea[4]), Double.parseDouble(linea[5])));
			}
			
			
			
			return coches;
			
		
		}
	
		
		
		public static void main(String[] args)throws FileNotFoundException{ 
			App a=new App();
			ArrayList<Coche>miscoches=new ArrayList<Coche>();
			ArrayList<Coche>miscoches_PUERTA=new ArrayList<Coche>();
			miscoches=a.cargarCoches("coches.csv");
			int contp=0;
			int contn=0;

			App e=new App();
			for (Coche c : miscoches) {
				System.out.println(c);
				
			
				
				miscoches=e.cargarCoches("coches.csv");
			}
			//imprimir los coches que 5puertas
				
				for (Coche s : miscoches) {
					if (s.getNumeroPuertas() ==  5) {
						
						contp++;
					}
				}
				//contar cuantos coches hay negros 
					for (Coche n : miscoches) {
						if (n.getColor().equalsIgnoreCase("negro")) {
							
							contn++;
						}}
					
	//pillar la matricula del coche con mas km 
					Object cocheConMasKm = null;
					for (Coche mask : miscoches) {		
						   
						if (cocheConMasKm == null || mask.getKm() > ((Coche) cocheConMasKm).getKm()) {
						        cocheConMasKm = mask;
						    }
					
					}
					if (cocheConMasKm != null) {
					    System.out.println("La matrícula del coche con más kilómetros es: " + ((Vehiculo) cocheConMasKm).getMatricula());
					}
				
					
					//imprimir el objeto que tenga mas km 
					
					
					
					
					
					
					//borrar coches con 3 puertas 
					
					for (int i = 0; i < miscoches.size(); i++) {
						if(miscoches.get(i).getNumeroPuertas()==3) {
							miscoches_PUERTA.add(miscoches.remove(i));
						}
					}
				
					System.out.println("los coches de 3 puertas : ");
					
					for (Coche coche : miscoches_PUERTA) {
						
							System.out.println(coche.getMatricula());
						
					}
					
					
					//coches que la marca enpice por S mayuscula 
					for (Coche coche : miscoches) {
						if (coche.getMarca().startsWith("A")) {
							System.out.println(coche.getMatricula()+" "+coche.getMarca());
						}
					}
					
			//si el modelo son 2 palabras
					
					
					for (Coche coche : miscoches) {
						if (coche.getModelo().contains(" ")) {
							System.out.println(coche.getMatricula()+" "+coche.getMarca());
						}
					}
				
					for (Coche lol : miscoches) {
					    System.out.println(lol.toString());
					}

		
			System.out.println("hay "+contp+" de chces que tengan 5 puertas");
			System.out.println("hay "+contn+" de chces que son negros");
		
			}}

