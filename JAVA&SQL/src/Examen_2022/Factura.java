package Examen_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Impuestos { 
private String factura;
private int cod_pedido_enfactura;
private String dni_cliente_enfactura;
private int total;
private ArrayList<Producto_pedido> Productos_pedidos ;





public Factura() {
	super();
	this.factura = "";
	this.cod_pedido_enfactura = 0;
	this.dni_cliente_enfactura = "";
	this.total = 0;
	this.Productos_pedidos = new ArrayList<>();
}

	

	
public Factura(String factura, int cod_pedido_enfactura, String dni_cliente_enfactura, int total,
        ArrayList<Producto_pedido> Productos_pedidos) {
    super();
    this.factura = factura;
    this.cod_pedido_enfactura = cod_pedido_enfactura;
    this.dni_cliente_enfactura = dni_cliente_enfactura;
    this.total = total;
    this.Productos_pedidos = new ArrayList<>();// Initialize with provided ArrayList
}
public Factura(String factura, int cod_pedido_enfactura, String dni_cliente_enfactura, int total) {
    this.factura = factura;
    this.cod_pedido_enfactura = cod_pedido_enfactura;
    this.dni_cliente_enfactura = dni_cliente_enfactura;
    this.total = total;
    this.Productos_pedidos = new ArrayList<>(); // Initialize the ArrayList
}


	
	

//	public void cargarPedidosClientes(String fichero) {
//	  
//	    Scanner entrada_cli;
//	    try {
//	        entrada_cli = new Scanner(new File(fichero));
//	        String cadena_cli="";
//	        String linea1[];
//	        cadena_cli=entrada_cli.nextLine();
//	        while (entrada_cli.hasNext()) {
//	            cadena_cli=entrada_cli.nextLine();
//	            linea1=cadena_cli.split(";");
//	            Pedido pedido_cliente = new Pedido( linea1[0], linea1[1], Integer.parseInt(linea1[2]), Integer.parseInt(linea1[3]));
//	            this.pedido_clientess.add(pedido_cliente);
//	         // Imprimir el pedido recién agregado
//	        }
//	       
//	        System.out.println( this.pedido_clientess);
//	      
//	        entrada_cli.close();
//	    } catch (FileNotFoundException e) {
//	        e.printStackTrace();
//	    }
//	}
	
	public String getFactura() {
		return factura;
	}


	public void setFactura(String factura) {
		this.factura = factura;
	}


	public int getCod_pedido_enfactura() {
		return cod_pedido_enfactura;
	}


	public void setCod_pedido_enfactura(int cod_pedido_enfactura) {
		this.cod_pedido_enfactura = cod_pedido_enfactura;
	}


	public String getDni_cliente_enfactura() {
		return dni_cliente_enfactura;
	}


	public void setDni_cliente_enfactura(String dni_cliente_enfactura) {
		this.dni_cliente_enfactura = dni_cliente_enfactura;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public ArrayList<Producto_pedido> getProductos_pedidos() {
		return Productos_pedidos;
	}


	public void setProductos_pedidos(ArrayList<Producto_pedido> productos_pedidos) {
		this.Productos_pedidos = productos_pedidos;
	}


	@Override
	public String toString() {
		return "Factura [factura=" + factura + ", cod_pedido_enfactura=" + cod_pedido_enfactura
				+ ", dni_cliente_enfactura=" + dni_cliente_enfactura + ", total=" + total + "]";
	}


	public void cargarProductosPedidos(String fichero) {
	  
		Scanner entrada;
		

	    try {
	    	 entrada = new Scanner(new File(fichero));
	    	String linea[];
			String cadena ="";
			cadena =entrada.nextLine();
	        while (entrada.hasNext()) {
	        	cadena=entrada.nextLine();
				linea=cadena.split(";");
				
				    if (this.cod_pedido_enfactura == Integer.parseInt(linea[0]) ) {

					    this.getProductos_pedidos().add(new Producto_pedido(
					    		   Integer.parseInt(linea[0])
					    		   ,Integer.parseInt(linea[1])
					    		   ,linea[2]
					    		   ,linea[3],linea[4],Double.parseDouble(linea[5]),Double.parseDouble(linea[6])));
					    				;
	         
				
	        
                           
	            
	        }
	    
	     
	    }} catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    System.out.println(this.getProductos_pedidos());
	}
	
	
	@Override
	public double totalsiniva() {
	    double totalsiniva = 0.0; // Inicializa la variable totalsiniva
	    for (Producto_pedido producto_pedido : Productos_pedidos) {
	        totalsiniva = totalsiniva + producto_pedido.getPrecio_el_kilo() * producto_pedido.getKilogramo(); // Suma el costo de cada producto
	    }
	    return totalsiniva;
	}

	@Override
	public double ivaReducido() {
	    double ivaReducido = totalsiniva() * 0.04; // Utiliza el método totalsiniva() para obtener el total sin IVA
	    return ivaReducido;
	}

	
	


	
	public static void main(String[] args) {
	   
		Factura fp = new Factura("1000", 1000, "dni_lol", 999);

fp.cargarProductosPedidos("ProductosPedidos.csv");
System.out.println(" el  ha comprado esto : ");

for (Producto_pedido pp: fp.getProductos_pedidos()) {
    System.out.println(pp.getNombre_producto());
    
}
System.out.println("Total sin IVA: " + fp.totalsiniva());
System.out.println("IVA reducido: " + fp.ivaReducido());

	

}

}
