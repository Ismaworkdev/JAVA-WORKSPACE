package gym_dificil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGimnasio {
	ArrayList<Monitor> monitores;
	

	public AppGimnasio() {
		this.monitores=new ArrayList<Monitor>();
			
	}

	public ArrayList<Monitor> getMonitores() {
		return monitores;
	}

	public void setMonitores(ArrayList<Monitor> monitores) {
		this.monitores = monitores;
	}
	
	public static void main(String[] args) {
		AppGimnasio app=new AppGimnasio();
		Scanner teclado=new Scanner(System.in);
//		Cliente c=new Cliente("10", "Julia", "Nieto", "julia@gimnasio.com", "Febrero");
//		app.getClientes().add(c);
		
		app.cargaInicial();
		String usuario="";
		String pass="";
		System.out.println("Usuario");
		usuario=teclado.next();
		System.out.println("Contrase�a");
		pass=teclado.next();
		
		if(usuario.equals("monitor")) {
			for(Monitor m: app.getMonitores()) {
				if(m.getCodigo().equals(pass)) {
				System.out.println("Monitor "+m.getCodigo()+": "+m.getNombre()+" "+m.getApellidos());
				for(ActividadReservada a: m.getActividades()) {
					if(a.getnMax()-a.getnPart()>0) {
						System.out.println(a.getnMax()-a.getnPart()+" plazas disponibles "+a.getNombreActividad()+" a las "+a.getHora());
					}else
						System.out.println("No hay plazas disponibles "+a.getNombreActividad()+" a las "+a.getHora());
				}
			}
				
			}//if codigo
			
		}//if monitor
		if(usuario.equals("admin") && pass.equals("1234")) {
			
			int opcion;
			do {
				app.menu();
				opcion=teclado.nextInt();
				switch(opcion) {
				case 1: 
					
					for(Monitor m: app.getMonitores())
						System.out.println(m.getNombre()+" "+m.getApellidos());
					break;
				case 2:
					System.out.println("Codigo de monitor:");
					String codigo=teclado.next();
					for(Monitor m: app.getMonitores()) {
						if(m.getCodigo().equals(codigo)) {
							for(ActividadReservada a: m.getActividades()) {
								System.out.println(a.getNombreActividad()+" a las "+a.getHora()+"h");
							}
						}
					}
					break;
				case 3:
					Monitor m=new Monitor();
					System.out.println("Codigo");
					String c=teclado.next();
					m.setCodigo(c);
					System.out.println("Nombre");
					c=teclado.next();
					m.setNombre(c);
					System.out.println("Apellido");
					c=teclado.next();
					m.setApellidos(c);
					System.out.println("Correo");
					c=teclado.next();
					m.setEmail(c);
					app.getMonitores().add(m);
					
					
					break;
				case 4:
					app.guardarMonitores();
					break;
				}
			}while(opcion!=4);
		}
		
	}

	private void guardarMonitores() {
		
//		this.getMonitores().add(new Monitor("100","Mario", "Lopez", "mario@gimnasio"));
//		this.getMonitores().add(new Monitor("200","Carmen", "Rodriguez", "carmen@gimnasio"));
//		this.getMonitores().add(new Monitor("300","Jose", "Bonilla", "jose@gimnasio"));
//		this.getMonitores().add(new Monitor("400","Adela", "Canovas", "adela@gimnasio"));
//		this.getMonitores().add(new Monitor("400","Marta", "Mu�oz", "marta@gimnasio"));
		try {
			FileOutputStream fi=new FileOutputStream("monitores.bin");
			ObjectOutputStream salida=new ObjectOutputStream(fi);
			
			for(Monitor m: this.getMonitores()) {
				salida.writeObject(m);
			}
			salida.flush();
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}





	private void menu() {
		System.out.println("1)Ver monitores");
		System.out.println("2)Ver actividades de un monitor");
		System.out.println("3)Dar de alta un monitor");
		System.out.println("4)Guardar y salir");
		
	}

	private void cargaInicial() {
//		try {
//			Scanner entrada=new Scanner(new File("monitores.txt"));
//			String cadena="";
//			String linea[];
//			cadena=entrada.nextLine();
//			while(entrada.hasNext()) {
//				cadena=entrada.nextLine();
//				linea=cadena.split(" ");
//				this.monitores.add(new Monitor(linea[0], linea[1], linea[2], linea[3]));
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileInputStream fi=new FileInputStream("monitores.bin");
			ObjectInputStream entrada=new ObjectInputStream(fi);
			Monitor m=new Monitor();
			while(entrada!=null) {
				try {
					m=(Monitor)entrada.readObject();
					this.getMonitores().add(m);
				} catch (Exception e) {
					entrada=null;
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(Monitor m: this.monitores) {
			m.cargaActividades();
		}
			
		
		for(Monitor m: this.monitores) {
			System.out.println(m);
		}
	}
	

}
