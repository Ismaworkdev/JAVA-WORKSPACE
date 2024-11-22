package json_profe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
	ArrayList<Cliente> clientes;

	public App() {
		this.clientes = new ArrayList<Cliente>();
	}

	public void leerClientes(String json) {

		JSONParser jsonParser = new JSONParser();

		try {
			FileReader reader = new FileReader(json);

			Object obj = jsonParser.parse(reader);

			JSONArray listaClientes = (JSONArray) obj;
			// System.out.println(listaClientes);

			// Iterar en el array
			// listaClientes.forEach(cli->System.out.println(cli));

			listaClientes.forEach(cli -> parseClienteObject((JSONObject) cli));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private void parseClienteObject(JSONObject cliente) {
		String nombre = (String) cliente.get("nombre");
		// System.out.println("Nombre "+nombre);
		long edad = (long) cliente.get("edad");
		// System.out.println("edad "+edad);
		String ciudad = (String) cliente.get("ciudad");
		// System.out.println("Ciudad "+ciudad);

		// Obtener el array de compras del cliente
		JSONArray compras = (JSONArray) cliente.get("compras");
		ArrayList<Producto> c = new ArrayList<Producto>();
		// Iterar sobre cada compra
		for (Object compraObj : compras) {
			JSONObject compra = (JSONObject) compraObj;

			// Obtener los detalles de la compra
			String nombreProducto = (String) compra.get("nombreP");
			double precio = (double) compra.get("precio");
			long cantidad = (long) compra.get("cantidad");

			// Imprimir los detalles de la compra
//            System.out.println("Producto: " + nombreProducto);
//            System.out.println("Precio: " + precio);
//            System.out.println("Cantidad: " + cantidad);
			c.add(new Producto(nombreProducto, precio, cantidad));
		}
		//Creo el cliente con sus compras
		this.getClientes().add(new Cliente(nombre, edad, ciudad, c));
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static void main(String[] args) {

		App app = new App();
		app.leerClientes("clientes.json");
		double total = 0;
		for (Cliente c : app.getClientes()) {
			System.out.println("Cliente: " + c.getNombre());
			for (Producto p : c.getCompras()) {
				System.out
						.println("\t-" + p.getNombre() + " " + p.getPrecio() + "€ (" + p.getCantidad() + " unidad/es)");
				total = total + p.getPrecio() * p.getCantidad();
			}
			System.out.println("Total: " + total + "€");
			System.out.println();
			total = 0;
		}

	}

}
