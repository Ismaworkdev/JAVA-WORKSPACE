package video_club;

import java.util.ArrayList;

public class clase_cliente {
    private String nombre;
    private ArrayList<clase_alquiler> alquileres;

    // Constructor de la clase_cliente
    public clase_cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    // Getter para el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar un nuevo alquiler a la lista de alquileres
    public void nuevoAlquiler(clase_alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    // Método para generar un informe del cliente
    public void informe() {
        double total = 0; // Variable para almacenar el importe total de los alquileres
        int puntos = 0;   // Variable para acumular puntos según ciertas condiciones
        String informe = "Informe para " + nombre + "\n"; // Encabezado del informe

        // Recorre la lista de alquileres del cliente
        for (clase_alquiler alquiler : alquileres) {
            double importe = 0; // Variable para calcular el importe de cada alquiler

            // Calcula el importe según el tipo de DVD y su duración
            switch (alquiler.getTiempo()) {
                case clase_dvd.NORMAL:
                    importe = 2 * alquiler.getTiempo();
                    break;
                case clase_dvd.NOVEDAD:
                    importe = 3 * alquiler.getTiempo();
                    break;
                case clase_dvd.INFANTIL:
                    importe = 1.5 * alquiler.getTiempo();
                    break;
            }

            // Acumula el importe en la variable total
            total += importe;

            // Incrementa los puntos por cada alquiler
            puntos++;

            //este verifica los puntos adicionales del alquiler 
            if (alquiler.getTiempo() == clase_dvd.NOVEDAD && alquiler.getTiempo() > 1) {
                puntos++;
            }

            // Agrega información del alquiler te da el informe 
            informe += "DVD: " + alquiler.getTiempo() + ", Importe: " + importe + "\n";
        }

        // Agrega información total y de puntos al informe
        informe += "Importe total: " + total + "\n";
        informe += "Puntos: " + puntos + "\n";

        // Imprime el informe en la consola
        System.out.println(informe);
    }

    // Método main para probar el código
    public static void main(String[] args) {
        // Creo mi cliente
        clase_cliente c1 = new clase_cliente("Juan López Sánchez");
        clase_cliente c2 = new clase_cliente("ismaaa");

        // Creo los 3 DVD
        clase_dvd casablanca = new clase_dvd("Casablanca", clase_dvd.NORMAL);
        clase_dvd indy = new clase_dvd("Indiana Jones XIII", clase_dvd.NOVEDAD);
        clase_dvd shrek = new clase_dvd("Shrek", clase_dvd.INFANTIL);
        
        //se crea cosas de la clase dvd 
        clase_dvd lol = new clase_dvd("loll", clase_dvd.NOVEDAD);

        // Creo los alquileres y se los asigno a mi cliente
        clase_alquiler a1 = new clase_alquiler(casablanca.getTitulo(), 2);
        clase_alquiler a2 = new clase_alquiler(indy.getTitulo(), 3);
        clase_alquiler a3 = new clase_alquiler(shrek.getTitulo(), 1);
        clase_alquiler be =new clase_alquiler(lol.getTitulo(),2);

        c1.nuevoAlquiler(a1);
        c1.nuevoAlquiler(a2);
        c1.nuevoAlquiler(a3);
        c2.nuevoAlquiler(be);

        // Genero el informe
        c1.informe();
        c2.informe();
    }
}

