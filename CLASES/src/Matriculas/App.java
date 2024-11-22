package Matriculas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;



public class App {
	LinkedList<Alumno> preinscritos=new LinkedList<Alumno>();
	LinkedList<Alumno> matriculados=new LinkedList<Alumno>();
	
	public App() {
		super();
		this.preinscritos = new LinkedList<Alumno>();;
		this.matriculados = new LinkedList<Alumno>();;
	}

	
	public LinkedList<Alumno> getPreinscritos() {
		return preinscritos;
	}


	public void setPreinscritos(LinkedList<Alumno> preinscritos) {
		this.preinscritos = preinscritos;
	}


	public LinkedList<Alumno> getMatriculados() {
		return matriculados;
	}


	public void setMatriculados(LinkedList<Alumno> matriculados) {
		this.matriculados = matriculados;
	}


	@Override
	public String toString() {
		return "App [preinscritos=" + preinscritos + ", matriculados=" + matriculados + "]";
	}



		// TODO Auto-generated method stub
//LinkedList<Alumno> daw=new LinkedList<Alumno>();
//daw.add(new Alumno("lolfsggf", "03223432", "@" ,"isma"));
//
//for (Alumno alumno : daw) {
//	alumno.mostraralumno();
//
//	
//}

	public void CargarAlumno(String fichero) throws FileNotFoundException {
	    Scanner entrada = new Scanner(new File(fichero));
	    String linea[];
	    String cadena;
	    
	    // Read the header line and ignore it
	    entrada.nextLine();
	    
	    while (entrada.hasNext()) {
	        cadena = entrada.nextLine();
	        linea = cadena.split(";");
	        
	        // Ensure that the array has at least 4 elements before accessing them
	        if (linea.length >= 4) {
	            this.preinscritos.add(new Alumno(linea[0], linea[1], linea[2], linea[3]));
	        } else {
	            System.out.println("Error: Missing data in the CSV file.");
	        }
	    }

	    // Close the scanner to avoid resource leaks
	    entrada.close();
	}

		public static void main(String[] args) throws FileNotFoundException {
App ap= new App();
ap.CargarAlumno("alumnos.csv");
Scanner teclado = new Scanner(System.in);

int opcion=0;
do {
	ap.menu();
	opcion=teclado.nextInt();
	switch(opcion) {
	//borrar el primero preinscrito y añadir al ultimo matriculado
	case 1:
	//	ap.getMatriculados();
		
		ap.mostrarPreinscritos();
		break;
	case 2 : 
		System.out.println("dni : ");
		String d=teclado.next();
		ap.borrar(d);
		break ;
	case 3 :
		ap.mostrarultimo();
		break ;
	case 4 :
		ap.mostrarmatricula();
		break ;
	case 5 :
		System.out.println("adios");
		break;
	}
}while(opcion!=5);
	}
		
		private void veralumnos() {
		    if (matriculados.isEmpty()) {
		        System.out.println("No hay alumnos matriculados.");
		    } else {
		        for (Alumno alumno : matriculados) {
		            
		        }
		    }
		}

		  private void mostrarPreinscritos() {
		        if (preinscritos.isEmpty()) {
		            System.out.println("No hay alumnos preinscritos.");
		        } else {
		            for (Alumno alumno : preinscritos) {
		                alumno.mostraralumno();
		            }
		        }
		    }

		  private void borrar(String d) {
			    for (Alumno alumno : preinscritos) {
			        if (alumno.getDni().equalsIgnoreCase(d)) {
			            this.preinscritos.remove(alumno);
			            break;  // Salir del bucle una vez que se encuentra el alumno
			        }
			    }
			}



		private void mostrarultimo() {
		this.getMatriculados().getLast().mostraralumno();
		}
	
		
		
		//aqui esta 4 
		private void mostrarmatricula() {
			for (Alumno alumno :this.getMatriculados()) {
				
			}
		}
			

private void matricular() {
	if(this.getPreinscritos().size()>0)
	this.getMatriculados().addLast(this.getPreinscritos().removeFirst());
	else
		System.out.println("no existe alumnos preinscritos");
}
		private void menu() {
			// TODO Auto-generated method stub
			System.out.println("1. mostrar todo el cvs ");
			System.out.println("2. borrar alumno preinscrito con un dni ");
			System.out.println("3. mostar ultimo alumno matriculado ");
			System.out.println("4. mostar alumnos matriculados");
			System.out.println("5. salir ");
		}

}
