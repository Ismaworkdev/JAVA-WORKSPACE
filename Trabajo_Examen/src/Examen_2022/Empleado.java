package Examen_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  class Empleado extends Persona {
private int turno;
private ArrayList<Pedido> pedidosAsignados = new ArrayList<>();

public Empleado() {
	super();
	this.turno = 0;
	this.pedidosAsignados = new ArrayList<>();
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	this.pedidosAsignados = new ArrayList<>();
}

public Empleado(String dni, String nombre, String apellidos, String dirr, int turno,
		ArrayList<Pedido> pedidosAsignados) {
	super(dni, nombre, apellidos, dirr);
	this.turno = turno;
	this.pedidosAsignados = new ArrayList<>();
}
public int getTurno() {
	return turno;
}
public void setTurno(int turno) {
	this.turno = turno;
}
public ArrayList<Pedido> getPedidosAsignados() {
	return pedidosAsignados;
}
public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
	this.pedidosAsignados = pedidosAsignados;
}

@Override
public String toString() {
	return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + "]";
}
 
public void AsignarpedidosEmpleado(String fichero) {
    Scanner entrada;

    try {
        entrada = new Scanner(new File(fichero));
        String linea[];
        String cadena = "";
        cadena = entrada.nextLine();
        while (entrada.hasNext()) {
            cadena = entrada.nextLine();
            linea = cadena.split(";");

           
                this.getPedidosAsignados().add(new Pedido(linea[0], linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));

			
            
        }
        
//        BD.getInstance();
//        BD.getInstance().cargarParametrosConexion("configTienda.txt");
//        BD.getInstance().cargarEmpleado();
//
//        for (Empleado empleado : BD.getInstance().cargarEmpleado()) {
//            System.out.println("El Empleado : " + empleado.getNombre() + ", DNI: " + empleado.getDni());
//            System.out.println("tiene los pedidos : ");
//           
//            for (Pedido pp : pedidosAsignados) {
//            	 if (empleado.getTurno() == pp.getTurno_pedido()) {
//   		System.out.println(		pp.getCod_pedido());
//   		
//   			}
//            }
//        }

       
    } catch (FileNotFoundException e) {
    	
    	
        e.printStackTrace();
    }
}


public void generarFactura(Pedido p) {
    try {
        FileWriter archivo = new FileWriter("Factura" + p.getDni_cliente_delpedido() + ".txt", true);
        PrintWriter escritor = new PrintWriter(archivo);

        // Escribir la información de la factura en el archivo
        escritor.println("Detalle de la factura:");
        escritor.println("Factura : " + p.getCod_pedido() + p.getDni_cliente_delpedido());
        escritor.println("Cliente: " + p.getDni_cliente_delpedido());
        escritor.println("***********************Productos*******************************");
 

       
        Factura ff = new Factura(p.getCod_pedido(), Integer.parseInt(p.getCod_pedido()), p.getDni_cliente_delpedido(), 0);

   
        ff.cargarProductosPedidos("ProductosPedidos.csv");
       
        for (Producto_pedido pp : ff.getProductos_pedidos()) {
            escritor.println(pp.getNombre_producto());
        }

        escritor.println("Total sin IVA: " + ff.totalsiniva());
        escritor.println("IVA reducido: " + ff.ivaReducido());
   
        double Importe_total = ff.totalsiniva() + ff.ivaReducido();
        escritor.println("Importe total : " + Importe_total);

        escritor.println();
        // Cierra el flujo de escritura
        escritor.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}




	public static void main(String[] args) {
		Empleado e= new Empleado();
		e.AsignarpedidosEmpleado("Pedidos.csv");
	}
	
	
}