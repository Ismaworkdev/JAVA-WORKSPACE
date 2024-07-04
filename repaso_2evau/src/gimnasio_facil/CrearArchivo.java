package gimnasio_facil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CrearArchivo {

    public static void generarArchivo(ArrayList<Monitor> monitores) {
        try {
            FileWriter writer = new FileWriter("informacion_monitores.txt");
            
            for (Monitor monitor : monitores) {
                writer.write("Monitor código: " + monitor.getCodigo() + "\n");
                writer.write("Nombre: " + monitor.getNombre() + "\n");
                writer.write("Actividades:\n");
                
                for (actividad_reserva actividad : monitor.getList()) {
                    writer.write("- " + actividad.getNombreactividad() + " - Plazas disponibles: " + (actividad.getMax_participantes() - actividad.getNum_participantes()) + "\n");
                }
                
                writer.write("\n");
            }
            
            writer.close();
            System.out.println("Se ha creado el archivo informacion_monitores.txt exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
