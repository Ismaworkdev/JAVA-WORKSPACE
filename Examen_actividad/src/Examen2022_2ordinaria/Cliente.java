
 package Examen2022_2ordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Cliente extends Persona {

	private String metodo_pago;
	private ArrayList<Pedido> historicoPedidos;
	private ArrayList<Cliente> c;
	


	public Cliente(String dni, String nombre, String apellidos, String dirr) {
		super(dni, nombre, apellidos, dirr);
		
		  historicoPedidos = new ArrayList<>();
	}
	public Cliente(String dni, String nombre, String apellidos, String dirr, String metodo_pago,
			ArrayList<Pedido> historicoPedidos, ArrayList<Cliente> c) {
		super(dni, nombre, apellidos, dirr);
		this.metodo_pago = metodo_pago;
		
		        historicoPedidos = new ArrayList<>();
		this.c = c;
	}
	
	public Cliente(String dni ){
		super(dni);
		this.historicoPedidos = new ArrayList<>();
		this.historicoPedidos =  new ArrayList<>();
		this.c = new ArrayList<>();
	}
	

	
	

	public Cliente() {
		this.historicoPedidos =  new ArrayList<>();
		this.metodo_pago = "";
		this.historicoPedidos = new ArrayList<>();
		this.c = new ArrayList<>();
	}



	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public ArrayList<Pedido> getHistoricoPedidos() {
		return historicoPedidos;
	}

	public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
		this.historicoPedidos = historicoPedidos;
	}

	public ArrayList<Cliente> getC() {
		return c;
	}

	public void setC(ArrayList<Cliente> c) {
		this.c = c;
	}
	
	
	



	
	@Override
	public String toString() {
		return "Cliente [metodo_pago=" + metodo_pago + ", historicoPedidos=" + historicoPedidos + ", c=" + c
				+ ", getMetodo_pago()=" + getMetodo_pago() + ", getHistoricoPedidos()=" + getHistoricoPedidos()
				+ ", getC()=" + getC() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getDirr()=" + getDirr() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void asignarMetodoPago() {
		
	
			Scanner entrada;
			try {
				entrada = new Scanner(new File("metodoPagoCliente.csv"));
				
				String linea[];
				String cadena;
				entrada.nextLine();
				while(entrada.hasNext()) {
					cadena=entrada.nextLine();
					linea=cadena.split(";");
					if (linea[0].equalsIgnoreCase(this.getDni())) {
						this.metodo_pago = linea[1];
					}
					
					
				}} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
				
			}
			
			
			public void cargarHistorico() {
				
				Scanner entrada;
				try {
					entrada = new Scanner(new File("Pedidos2022.csv"));
					
					String linea[];
					String cadena;
					entrada.nextLine();
					while(entrada.hasNext()) {
						cadena=entrada.nextLine();
						linea=cadena.split(";");
						if (linea[1].equalsIgnoreCase(this.getDni())) {
							this.getHistoricoPedidos().add( new Pedido(Integer.parseInt(linea[0]), linea[1], Double.parseDouble(linea[2])));

						}
						
					}} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			
				
			}
		
	
	public static void main(String[] args) {
		Cliente ll= new Cliente("11111111H");
		ll.asignarMetodoPago();
		ll.cargarHistorico();
		System.out.println(ll.getMetodo_pago());
		System.out.println(ll.getHistoricoPedidos());
	}
	
}
