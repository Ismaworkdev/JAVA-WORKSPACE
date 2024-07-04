package clinicaVeterinaria;

import java.util.*;






public class AppMascotas {
	private ArrayList<Cliente>clientes;
	
	public AppMascotas() {
		this.clientes=new ArrayList<Cliente>();
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void menu() {
		System.out.println("1. Dar de alta cliente");
		System.out.println("2. Atender cliente");//dni
		System.out.println("3. Dar de alta la mascota de Cliente ");
		System.out.println("4.Cuantos animales tienes :  ");
		System.out.println("5.Mostrar perros y si tienen seguro o no ");
		System.out.println("6.mostrar todos los gatos con obesidad");
		System.out.println("7.buscar Animales de una raza : ");
		System.out.println("8.Salir");
	}
	 public double costeVacunas() {
		 return 0;
	 }
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		AppMascotas app=new AppMascotas();//creo el AL de clientes
		//Carga inicial
		//1Vacunas
		Vacuna v=new Vacuna("Antirrábica","10/01/2024", 50);
		Vacuna v2=new Vacuna("Leishmania", "16/01/2024", "Pfizer", 70);
		Vacuna v3=new Vacuna("Leishmania", "17/01/2024", "Pfizer", 70);
		
		//Animales
		Perro p=new Perro(2, 15, "Border Collie", "Hembra", "Lori", "dfsdfsad", false);
		Perro q=new Perro(2, 15, "Border Collie", "Macho", "Cooper", "dfsdfsad", false);
		Perro ppp=new Perro(2, 15, "Border Collie", "Macho", "toti", "dfsdfsad", true); //porque no se pone con ellos
		Gato g=new Gato(3, 4, "RagDoll", "Hembra", "Tina", false);
		Gato g2=new Gato(3, 6, "RagDoll", "Macho", "León", true);
		Conejo cc=new Conejo(5, 41, "mimi", "masculino", "bibi", 4);
		
		p.getLibroVacunacion().add(v2);
		p.getLibroVacunacion().add(v);
		q.getLibroVacunacion().add(v3);
		g.getLibroVacunacion().add(v);
		g2.getLibroVacunacion().add(v);
		g2.getLibroVacunacion().add(v3);
		//Clientes
		
		app.getClientes().add(new Cliente("María", "dfdsf", "dfds", "maria@gmail.com"));
		app.getClientes().add(new Cliente("Jose", "dtdsf", "dfds", "jose@gmail.com"));
		
		//Añado a maria sus mascotas
		ArrayList<Animal>mascotasMaria=new ArrayList<Animal>();
		mascotasMaria.add(p);
		mascotasMaria.add(ppp);
		mascotasMaria.add(cc);
		app.getClientes().get(0).setMascotas(mascotasMaria);
		
		//Añado a Jose sus mascotas
		ArrayList<Animal>mascotasJose=new ArrayList<Animal>();
		mascotasJose.add(q);
		mascotasJose.add(g);
		mascotasJose.add(g2);
		app.getClientes().get(1).setMascotas(mascotasJose);
		//fin carga inicial
	
		int opcion=0;
		do {
			app.menu();
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				//dar de alta un cliente 
				app.dardealtacliente();
				break;
			case 2://dado dni buscar el client y mostrar sus mascotas
				System.out.println("DNI:");
				String dni=teclado.next();
			//	app.atenderCliente(dni);
				app.mostrarmascotascliente(dni);
				break;
			case 3:
				//dado el dni de cleinte dar de alta mascota y preguntar si es gato ,perro o conejo y podir los valores y insertarlo al Arraylist
				System.out.println("DNI:");
				String mdni=teclado.next();
			//	app.atenderCliente(dni);
				app.daraltamascotaconcliente(mdni);
				;
				break;
			case 4:
				//mostrar los animales que tiene cada clientey de que tipo son 
				System.out.println("DNI:");
				String c=teclado.next();
			//	app.atenderCliente(dni);
				app.cunatosanimalestengo(c);
				break;
			case 5:
				//mostrar los nombres de todo los perros de la clinica y si tienen el seguro obligatorio o no 
				app.perrossivacuna();
				break;
			case 6:
				//mostrar todos los gatos obesos de la clinica .
				app.gatosgordos();
				break;
			case 7:
			
				//buscar y mostrar los animales de una determinada raza dada por el usuario .
				teclado.nextLine();

				System.out.println("Raza:");
				String raza=teclado.nextLine();
			
				
				app.animalesdeterndaraza(raza);
//				app.atenderCliente(dni);
				break;
			}
		}while(opcion!=8);
		
		
		
	}
	private void gatosgordos() {
		
	    for (Cliente cliente_gatos : clientes) {
	        for (Animal cliente_gordos : cliente_gatos.getMascotas()) {
	            if(cliente_gordos instanceof Gato) {
	            	
	            	
	            	
	                Gato gato = (Gato) cliente_gordos;

//	                En tu código, `(Gato) cliente_gordos;
//	                ` está intentando convertir el objeto `cliente_gordos` al tipo `Gato`. 
//
//	                
//
//	                - `Gato gato`: Aquí estás declarando una variable llamada `gato` del tipo `Gato`.
//	                - `(Gato) cliente_gordos`: Aquí estás intentando convertir (o "castear") `cliente_gordos` al tipo `Gato`.
//	                Entonces, `Gato gato = (Gato) cliente_gordos;` significa que estás creando una nueva referencia `gato` del tipo `Gato`, y 
//	                estás intentando asignarle el objeto `cliente_gordos` después de convertirlo al tipo `Gato`.
//	                Es importante notar que esto solo funcionará si `cliente_gordos` es de hecho un `Gato`, o una subclase de `Gato`.
//	                Si no lo es, obtendrás un error en tiempo de ejecución: `ClassCastException`. 
	                
	                if (gato.isObesidad()) {
	                    System.out.println("El gato " + gato.getNombre() + " tiene obesidad.");
	                }
	            }
	        }
	    }
	}
	private void animalesdeterndaraza(String raza) { //coger cosas con espacio 
		// TODO Auto-generated method stub
		for (Cliente cliente_raza: clientes) {
			  
			for (Animal raza_random: cliente_raza.getMascotas()) {
				if(raza_random.getRaza().equalsIgnoreCase(raza)) {
					System.out.println("los Animales con raza "+raza+"  se llaman "+raza_random.getNombre());
				}
			}
		}
		
	}
	private void perrossivacuna() {
		// TODO Auto-generated method stub
	
		for (Cliente cliente_deperro : clientes) {
			for (Animal pee : cliente_deperro.getMascotas()) {
				if(pee instanceof Perro ) {
					
					if(!pee.libroVacunacion.isEmpty()) {

						System.out.println("Los perros con Vacunas son  : "+pee.getNombre());
					}else {
					System.out.println("Los perros sin  Vacunas son  : "+pee.getNombre());
					
					}
						
					
				}
		}
		
		}
	}
	private void cunatosanimalestengo(String c) {
		int contp = 0;
		int contg = 0;
		int contC = 0;
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		for (Cliente cliente_quiere : clientes) {
			if(cliente_quiere.getDni().equalsIgnoreCase(c)) {
				System.out.println("El cliente "+cliente_quiere.getNombre()+" tiene los animales : ");
				for (Animal an : cliente_quiere.getMascotas()) {
					if(an instanceof Perro) {
						
						contp++;
					}else if(an instanceof Gato){
						
						contg++;
					}else if (an instanceof Conejo) {
						
						contC++;
					}
				}
				System.out.println("Perros : "+contp);
				System.out.println("Gatos : "+contg);
				System.out.println("Conejos : "+contC);
			}
		}
		
	}
	private void daraltamascotaconcliente(String mdni) { 
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		for (Cliente clientealtamascota : this.getClientes()) {
			if(clientealtamascota.getDni().equalsIgnoreCase(mdni)) {
				System.out.println("El cliente "+clientealtamascota.getNombre()+"  quiere dar de Alta su Animal  : ");
				System.out.println("Rellena el formulario : ");
				
				
				System.out.println("¿Qué animal es?");
				String variable = teclado.nextLine();

				switch(variable.toLowerCase()) {
				    case "perro":
				        System.out.println("Introduce la edad del perro:");
				        int edad = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce el peso del perro:");
				        int peso = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce la raza del perro:");
				        String raza = teclado.nextLine();
				        System.out.println("Introduce el sexo del perro:");
				        String sexo = teclado.nextLine();
				        System.out.println("Introduce el nombre del perro:");
				        String nombre = teclado.nextLine();
				        System.out.println("Introduce el CHIP del perro:");
				        String CHIP = teclado.nextLine();
				        System.out.println("¿El perro está vacunado? (s/n):");
				        boolean vacunado = teclado.nextLine().equalsIgnoreCase("s");
				        
				        Perro p = new Perro(edad, peso, raza, sexo, nombre, CHIP, vacunado);
				        // Aquí puedes usar el objeto 'p'
				        System.out.println("Animal Creado : " +nombre );
				        clientealtamascota.getMascotas().add(p);
				        break;
				    case "gato":
				        System.out.println("Introduce la edad del gato:");
				        int edad1 = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce el peso del gato:");
				        int peso1 = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce la raza del gato:");
				        String raza1 = teclado.nextLine();
				        System.out.println("Introduce el sexo del gato:");
				        String sexo1 = teclado.nextLine();
				        System.out.println("Introduce el nombre del gato:");
				        String nombre1 = teclado.nextLine();
				        System.out.println("¿El gato está OBESO? (s/n):");
				        boolean OBESO = teclado.nextLine().equalsIgnoreCase("s");
				        
				        Gato g = new Gato(edad1, peso1, raza1, sexo1, nombre1, OBESO);
				        // Aquí puedes usar el objeto 'g'
				        System.out.println("Animal Creado : " +nombre1 );
				        clientealtamascota.getMascotas().add(g);
				        break;
				    case "conejo":
				        System.out.println("Introduce la edad del conejo:");
				        int edad2 = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce el peso del conejo:");
				        int peso2 = Integer.parseInt(teclado.nextLine());
				        System.out.println("Introduce el nombre del conejo:");
				        String nombre2 = teclado.nextLine();
				        System.out.println("Introduce el sexo del conejo:");
				        String sexo2 = teclado.nextLine();
				        System.out.println("Introduce la raza  del conejo:");
				        String RAZA = teclado.nextLine();
				        System.out.println("Introduce el número de orejas del conejo:");
				        int orejas2 = Integer.parseInt(teclado.nextLine());
				        
				        Conejo c = new Conejo(edad2, peso2, RAZA, sexo2,nombre2, orejas2);
				        
				        // Aquí puedes usar el objeto 'c'
				       
				        System.out.println("Animal Creado : " +nombre2 );
				        clientealtamascota.getMascotas().add(c);
				        break;
				    default:
				        System.out.println("No se reconoce ese animal.");
				}

			        
			       
			}
		}
		
	}
	private void mostrarmascotascliente(String dni) {
	    for(Cliente c: this.getClientes()) {
	        if(c.getDni().equals(dni)) {
	            System.out.println("Cliente: "+c.getNombre());
	            System.out.println("Las mascotas de "+c.getNombre()+" son: ");
	            for(Animal m: c.getMascotas()) {
	                System.out.println(m.getNombre()); // Asumiendo que la clase Animal tiene un método toString() adecuado
	            }
	        }
	    }
	}

	private void dardealtacliente() {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		 System.out.println("Introduce los datos del nuevo cliente");
	        System.out.println("Introduce el nombre ");
	        String nombre = teclado.nextLine();
	        System.out.println("Introduce el dni ");
	        String dni = teclado.nextLine();
	        System.out.println("Introduce el dirrecion ");
	        String dirrecion = teclado.nextLine();
	        System.out.println("Introduce el email ");
	        String email = teclado.nextLine();
	        Cliente c = new Cliente(nombre,dni,dirrecion,email);
	        clientes.add(c);
	        System.out.println("Cliente creado: " + nombre);
		
	}
	private void atenderCliente(String dni) {
		double total=0;
		double vacunasTotal=0;
		for(Cliente c: this.getClientes()) {
			if(c.getDni().equals(dni)) {
				System.out.println("Cliente: "+c.getNombre());
				for(Animal m: c.getMascotas()) {
					//System.out.println(m.getNombre()+" "+m.libroVacunacion);
					total=0;
					for(Vacuna v: m.getLibroVacunacion()) {
						total=total+v.getPrecio();
					}//vacunas
					System.out.println(m.getNombre()+" "+total+"€");
					vacunasTotal=vacunasTotal+total;
				}
				
				
			}//cliente
			System.out.println("Total gastado en vacunas: "+vacunasTotal);
		}
	}
}
