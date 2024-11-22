package proveedor_piezas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {

	public ArrayList<Pieza> leerPiezas(String filename) {
		ArrayList<Pieza> p=new ArrayList<Pieza>();
		//leer fichero de texto 
		
		try {
			Scanner entrada =new Scanner(new File (filename));
			String cadena="";
			String []linea;
			entrada.nextLine();
			while(entrada.hasNext()) {
				//leo la linea 
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				p.add(new Pieza(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Double.parseDouble(linea[3])));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	
	
	public ArrayList<Proveedor> leerProveedor(String filename){
		ArrayList<Proveedor> po=new ArrayList<Proveedor>();
		try {
			Scanner entrada =new Scanner(new File (filename));
			String cadena="";
			String []linea;
			entrada.nextLine();
			while(entrada.hasNext()) {
				//leo la linea 
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				po.add(new Proveedor(Integer.parseInt(linea[0]), linea[1],linea[2]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return po;
		
	}
	
}
