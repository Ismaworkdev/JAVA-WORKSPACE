package examen;
public class App {
    public static void main(String[] args) {
        Publicista publicista = new Publicista();
        Cliente cliente = new Cliente();
        // Llamar al método CargarListaCliente
        publicista.CargarListaCliente("Personas.csv");  // Asegúrate de que el archivo "Personas.csv" esté en el directorio correcto

        // Llamar al método interesesCliente
        cliente.interesesCliente("intereses.csv");  // Asegúrate de que el archivo "interses.csv" esté en el directorio correcto
    }
}

