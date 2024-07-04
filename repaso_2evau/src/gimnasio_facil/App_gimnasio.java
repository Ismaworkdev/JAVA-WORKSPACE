package gimnasio_facil;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class App_gimnasio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario:");
        String usuario = teclado.next();

        System.out.println("Contraseña:");
        String contraseña = teclado.next();

        Monitor monitor = new Monitor(usuario);
        monitor.cargaActividades();

        if (monitor.getCodigo().equalsIgnoreCase(contraseña)) {
            System.out.println("¡Hola Monitor " + usuario + "!");
            System.out.println("Actividades:");
            for (actividad_reserva actividad : monitor.getList()) {
                if (actividad.getNum_participantes() < actividad.getMax_participantes()) {
                    System.out.println(actividad.getNombreactividad() + " - Plazas disponibles: " + (actividad.getMax_participantes() - actividad.getNum_participantes()));
                } else {
                    System.out.println(actividad.getNombreactividad() + " - Plazas llenas");
                }
            }

            // Crear un ArrayList de monitores y agregar el monitor actual
            ArrayList<Monitor> monitores = new ArrayList<>();
            monitores.add(monitor);

            // Llamar al método para crear el archivo con la información de todos los monitores
            CrearArchivo.generarArchivo(monitores);
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        teclado.close();
    }
}
