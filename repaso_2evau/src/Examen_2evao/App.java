package Examen_2evao;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class App {
private ArrayList<Publicista> p=new ArrayList<>();
private ArrayList<oferta> o=new ArrayList<>();



	public App(ArrayList<Publicista> p, ArrayList<oferta> o) {
	super();
	this.p = p;
	this.o = o;
}

	public App() {
	super();
	this.p = new ArrayList <>();
	this.o = new ArrayList <>();
}
	


	public ArrayList<Publicista> getP() {
		return p;
	}

	public void setP(ArrayList<Publicista> p) {
		this.p = p;
	}

	public ArrayList<oferta> getO() {
		return o;
	}

	public void setO(ArrayList<oferta> o) {
		this.o = o;
	}
	
	
	
	

	@Override
	public String toString() {
		return "App [p=" + p + ", o=" + o + "]";
	}
	public void LeerOferta() {
		//aqui cargamos los clientes de cada publicista 
				Scanner entrada= new Scanner(System.in);
				try {
					entrada = new Scanner(new File("Ofertas.txt"));
					String linea[];
					String cadena;
					while(entrada.hasNext()) {
						cadena=entrada.nextLine();
						linea=cadena.trim().split(",");
						
						this.getO().add(new oferta(linea[0], linea[1], linea[2],Double.parseDouble(linea[3])));
						
						
						
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		
	}
	
	public void LeerPublicista() {
		//aqui cargamos los clientes de cada publicista 
		Scanner entrada= new Scanner(System.in);
		try {
			entrada = new Scanner(new File("Personas.csv"));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.trim().split(";");
				if (linea[0].equalsIgnoreCase("publicista")) {
					this.p.add(new Publicista(linea[2], linea[3], linea[1], linea[4] , Double.parseDouble(linea[5])));
				}
			
				
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

	
	
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.LeerOferta();
		app.LeerPublicista();
		System.out.println("Envio de ofertas a los clientes 27/02/2024");
		for (Publicista p : app.getP()) {
			p.cargarListaClientes("Personas.csv");
			
			
		
		}
	}

}
