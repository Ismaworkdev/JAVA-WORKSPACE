package Examen_2022;

public class App {

    public static void main(String[] args) {
        // Cargar empleados desde la base de datos
        BD.getInstance();
        BD.getInstance().cargarParametrosConexion("configTienda.txt");
        BD.getInstance().cargarEmpleado();

        // Recorrer cada empleado
        for (Empleado empleado : BD.getInstance().cargarEmpleado()) {
            System.out.println("El Empleado : " + empleado.getNombre() + ", DNI: " + empleado.getDni());
            System.out.println("tiene los pedidos : ");

            // Asignar pedidos al empleado desde el archivo CSV
            empleado.AsignarpedidosEmpleado("Pedidos.csv");

            // Recorrer cada pedido asignado al empleado actual
            for (Pedido pedido : empleado.getPedidosAsignados()) {
            	 if (empleado.getTurno() == pedido.getTurno_pedido()) {
                System.out.println(pedido.getCod_pedido()); // Imprimir el código del pedido
                
                empleado.generarFactura(pedido);
              
            	 
            	 }
        }
    }
    }}
