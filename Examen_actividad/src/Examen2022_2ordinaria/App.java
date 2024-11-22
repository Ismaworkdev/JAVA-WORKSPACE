package Examen2022_2ordinaria;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;

public class App implements Informe{
	@Override
	public void informeVentas() {
		  try {
			BD.getInstance();
		    BD.getInstance().cargarParametrosconexion();
			BD.getInstance().Cargar_clientes();
			// TODO Auto-generated method stub
			for (Cliente clicli : BD.getInstance().Cargar_clientes()) {
				 FileWriter archivo = new FileWriter("Factura" + clicli.getDni() + ".txt", true);
			        PrintWriter escritor = new PrintWriter(archivo);
					Cliente cc= new Cliente(clicli.getDni(),clicli.getNombre(), clicli.getApellidos(), clicli.getDirr());
					cc.asignarMetodoPago();
					cc.cargarHistorico();
					
					 escritor.println("Cliente : " +cc.getNombre() );
					
					 escritor.println("metodo de pago : "+cc.getMetodo_pago());
					
					 escritor.println("**************************pedidos realizados en 2022 ********************* ");
					for (Pedido pp : cc.getHistoricoPedidos()) {
						
						 escritor.println(pp.getCod_pedido());
					}
					escritor.close(); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Cargar empleados desde la base de datos
     App a= new App();
     a.informeVentas();
        try {
        	
        	  BD.getInstance();
              BD.getInstance().cargarParametrosconexion();
			BD.getInstance().Cargar_clientes();
			
			
			for (Cliente cli : BD.getInstance().Cargar_clientes()) {
				Cliente cc= new Cliente(cli.getDni(),cli.getNombre(), cli.getApellidos(), cli.getDirr());
					
					cc.asignarMetodoPago();
			cc.cargarHistorico();
				
				System.out.println("Cliente : " +cc.getNombre() );
				
				System.out.println("metodo de pago : "+cc.getMetodo_pago());
				
				System.out.println("pedidos realizados en 2022 : ");
				for (Pedido pp : cc.getHistoricoPedidos()) {
					
					System.out.println(pp.getCod_pedido());
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
