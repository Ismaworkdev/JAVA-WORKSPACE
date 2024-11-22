package streams;

import java.util.*;
import java.util.stream.*;

public class Producto {
    private String nombre;
    private double peso;
    private double precio;

    public Producto(String nombre, double peso, double precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }



    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
            new Producto("Producto1", 0.4, 1200),
            new Producto("Producto2", 0.6, 800),
            new Producto("HProducto3", 0.5, 500),
            new Producto("Producto4", 0.3, 100),
            new Producto("HProducto5", 0.2, 50)
        );

        System.out.println("Nombres de los productos vendidos:");
        productos.stream()
            .map(Producto::getNombre)
            .forEach(System.out::println);

        long count = productos.stream()
            .filter(p -> p.getNombre().startsWith("H"))
            .count();
        System.out.println("Número de productos cuyo nombre empieza por H: " + count);

        System.out.println("Nombres de los productos vendidos de más de 1000€:");
        productos.stream()
            .filter(p -> p.getPrecio() > 1000)
            .map(Producto::getNombre)
            .forEach(System.out::println);

        System.out.println("Nombre, peso y precio de productos con el peso menor que 0.5Kg:");
        productos.stream()
            .filter(p -> p.getPeso() < 0.5)
            .forEach(System.out::println);

        double total = productos.stream()
            .mapToDouble(Producto::getPrecio)
            .sum();
        System.out.println("Total obtenido con la venta de los productos: " + total);

        // Suponiendo que los teléfonos vendidos son aquellos cuyo nombre contiene la palabra "teléfono"
        List<Producto> telefonosVendidos = productos.stream()
            .filter(p -> p.getNombre().contains("teléfono"))
            .collect(Collectors.toList());
        System.out.println("Lista de teléfonos vendidos: " + telefonosVendidos);

        List<Double> preciosAltos = productos.stream()
            .filter(p -> p.getPrecio() > 500)
            .map(Producto::getPrecio)
            .collect(Collectors.toList());
        System.out.println("Lista de los precios de los productos que superan los 500€: " + preciosAltos);

        OptionalDouble max = productos.stream()
            .mapToDouble(Producto::getPrecio)
            .max();
        if (max.isPresent()) {
            System.out.println("Precio del producto vendido más caro: " + max.getAsDouble());
        }

        OptionalDouble min = productos.stream()
            .mapToDouble(Producto::getPrecio)
            .min();
        if (min.isPresent()) {
            System.out.println("Precio del producto vendido más barato: " + min.getAsDouble());
        }

        System.out.println("Nombres de los productos de menos de 100€ y peso < 0.5kg en mayúscula:");
        productos.stream()
            .filter(p -> p.getPrecio() < 100 && p.getPeso() < 0.5)
            .map(p -> p.getNombre().toUpperCase())
            .forEach(System.out::println);
        
        //precio del producto vendido mas caro 
        
      
			//numero de productos en mayuscula de menos de 100 y menos de 0.5 kilos
        	
		}
        
        
    }

