package json_dentro_json;



import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import ejer_json_propio.clase_autores;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class app {
    private ArrayList<cliente> clientes;

    public app(ArrayList<cliente> clientes) {
        this.clientes = clientes;
    }

    public app() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<cliente> clientes) {
        this.clientes = clientes;
    }

    public static void main(String[] args) {
        ArrayList<cliente> cli = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("cliente.json"));
            JSONArray jsonClientes = (JSONArray) obj;

            for (Object objCliente : jsonClientes) {
                JSONObject jsonCliente = (JSONObject) objCliente;

                String nombre = (String) jsonCliente.get("nombre");
                Long edad = (Long) jsonCliente.get("edad");
                String ciudad = (String) jsonCliente.get("ciudad");

                JSONArray jsonProductos = (JSONArray) jsonCliente.get("compras");
                ArrayList<producto> productos = new ArrayList<>();

                for (Object objProducto : jsonProductos) {
                    JSONObject jsonProducto = (JSONObject) objProducto;

                    String nombreProducto = (String) jsonProducto.get("nombreP");
                    double precio = (double) jsonProducto.get("precio");
                    long cantidad = (long) jsonProducto.get("cantidad");

                    productos.add(new producto(nombreProducto, precio, cantidad));
                }

                cliente cc = new cliente(nombre, edad.intValue(), ciudad, productos);
                cli.add(cc);
            }

            for (cliente clii : cli) {
                System.out.println(clii.getNombre());
                for (producto prod : clii.getCompra_producto()) {
                    System.out.println(prod.getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
