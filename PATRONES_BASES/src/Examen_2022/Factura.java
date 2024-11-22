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




	public Factura(String factura, int cod_pedido_enfactura, String dni_cliente_enfactura, int total,
		ArrayList<Producto_pedido> Productos_pedidos) {
	super();
	this.factura = factura;
	this.cod_pedido_enfactura = cod_pedido_enfactura;
	this.dni_cliente_enfactura = dni_cliente_enfactura;
	this.total = total;
	this.Productos_pedidos = Productos_pedidos;
}
	
	public Factura(String factura, int cod_pedido_enfactura, String dni_cliente_enfactura, int total) {
		super();
		this.factura = factura;
		this.cod_pedido_enfactura = cod_pedido_enfactura;
		this.dni_cliente_enfactura = dni_cliente_enfactura;
		this.total = total;

	}
		
	

	public Factura() {
	
	this.factura = "";
	this.cod_pedido_enfactura = 0;
	this.dni_cliente_enfactura = "";
	this.total = 0;
	this.Productos_pedidos = new ArrayList<>();
}

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
	final int maxLen = 10;
	return "Factura [factura=" + factura + ", cod_pedido_enfactura=" + cod_pedido_enfactura + ", dni_cliente_enfactura="
			+ dni_cliente_enfactura + ", total=" + total + ", productos_pedidos="
			+ (Productos_pedidos != null ? Productos_pedidos.subList(0, Math.min(Productos_pedidos.size(), maxLen))
					: null)
			+ "]";
}

	public void cargarProductos(String fichero) {
		this.Productos_pedidos.clear();
	    Scanner entrada;
	    try {
	        entrada = new Scanner(new File("ProductosPedidos.csv"));
	        String cadena="";
	        String linea[];
	        cadena=entrada.nextLine();
	        while (entrada.hasNext()) {
	            cadena=entrada.nextLine();
	            linea=cadena.split(";");

	            // Crear un nuevo Producto_pedido a partir de partes[1]
	            Producto_pedido producto = new Producto_pedido(
	            	    Integer.parseInt(linea[0]),
	            	    Integer.parseInt(linea[1]),
	            	    linea[2],
	            	    linea[3],
	            	    linea[4],
	            	    Double.parseDouble(linea[5]),
	            	    Double.parseDouble(linea[6])
	            	);

	            // Añadir el producto a la lista de productos_pedidos
	            Productos_pedidos.add(producto);
	            System.out.println(producto);
	        }
	        entrada.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public double ivaReducido() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalsiniva() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		Factura f= new Factura();
		f.cargarProductos("ProductosPedidos.csv");
	}
}
