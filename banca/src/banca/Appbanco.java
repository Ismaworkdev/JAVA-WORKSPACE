package banca;


import java.util.ArrayList;
import java.util.Scanner;

public class Appbanco {

    private ArrayList<Cliente> clientes;

    public Appbanco() {
        super();
        this.clientes = new ArrayList<>();
    }

    public Appbanco(ArrayList<Cliente> clientes) {
        super();
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public static void main(String[] args) {
    	// Creación de las cuentas
    	Scanner teclado=new Scanner(System.in);
    	Cuenta cuentaClienteMaria = new Cuenta("ES234211", "Nomina", "B123", "A123", 1000000);
    	Cuenta cuentaClienteDavid = new Cuenta("ES203484", "Ahorro", "B823", "A234", 100000);
    	Cuenta cuentaClienteLuisa = new Cuenta("ES299231", "Nomina", "B943", "A567", 10000);
    	Cuenta cuentaClienteLuis = new Cuenta("ES234211", "Ahorro Boda", "B923", "A934", 14200);
    	Cuenta cuentaClienteGabriel = new Cuenta("ES234212", "Compartida", "B999", "A238", 17000);

    	// Creación de los clientes
    	Cliente clienteMaria = new Cliente("B123", "123H", "Maria", "Gonzalez");
    	Cliente clienteDavid = new Cliente("B823", "11111J", "David", "Lopez");
    	Cliente clienteLuisa = new Cliente("B943", "22222K", "Luisa", "Martinez");
    	Cliente clienteLuis = new Cliente("B923", "33333L", "Luis", "Rodriguez");
    	Cliente clienteGabriel = new Cliente("B999", "44444M", "Gabriel", "Perez");

    	// Vinculación de las cuentas con los clientes
    	clienteMaria.getCuentas().add(cuentaClienteMaria);
    	clienteDavid.getCuentas().add(cuentaClienteDavid);
    	clienteLuisa.getCuentas().add(cuentaClienteLuisa);
    	clienteLuis.getCuentas().add(cuentaClienteLuis);
    	clienteGabriel.getCuentas().add(cuentaClienteGabriel);

    	// Añadir los clientes a la app del banco
    	Appbanco appBanco = new Appbanco();
    	appBanco.getClientes().add(clienteMaria);
    	appBanco.getClientes().add(clienteDavid);
    	appBanco.getClientes().add(clienteLuisa);
    	appBanco.getClientes().add(clienteLuis);
    	appBanco.getClientes().add(clienteGabriel);

        // Menu
        

        int opcion = 0;

        do {
            appBanco.menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    appBanco.nuevoCliente();
                    break;
                case 2:
                    appBanco.mostrarClientes();
                    break;
                case 3:
                    System.out.println("Codigo Cliente: ");
                    String codigoCliente = teclado.next();
                    appBanco.accesoCliente(codigoCliente);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 4);

        teclado.close();
    }

    private void accesoCliente(String codigoCliente) {
        for(Cliente cliente1 : clientes) {
            if(cliente1.getCodigoCliente().equalsIgnoreCase(codigoCliente)) {
                System.out.println("Cliente encontrado: " + ":" +cliente1.getNombre()+  ":" +cliente1.getApellidos());
               cliente1.mostrarcuenta();
               System.out.println("el importe total es :"+cliente1.calcularcuenta());
               
            } 
            }
        }
    


    private void nuevoCliente() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los datos del nuevo cliente");
        System.out.println("Introduce el nombre ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el apellido ");
        String apellido = teclado.nextLine();
        System.out.println("Introduce el codigo ");
        String codigo = teclado.nextLine();
        System.out.println("Introduce el DNI ");
        String dni = teclado.nextLine();
        Cliente c = new Cliente(codigo, dni, nombre, apellido);
        clientes.add(c);
        System.out.println("Cliente creado: " + nombre);
    }

    private void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("NOMBRE : " + cliente.getNombre());
                System.out.println("DNI : " + cliente.getDni());
                System.out.println("DIRRECION : " + cliente.getDireccion());
                System.out.println("EMAIL : " + cliente.getDni());
                System.out.println("-----------------------------");
            }
        }
    }


    private void menu() {
        System.out.println("1. Alta Cliente ");
        System.out.println("2. Mostrar Cliente");
        System.out.println("3. Acceso Cliente ");
        System.out.println("4. Salir");
    }
}

