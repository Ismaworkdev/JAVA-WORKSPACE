package gym_prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import gympendientes.ActividadesReserva;

import java.util.ArrayList;

class Monitor extends Persona {
    private List<ActividadReservada> actividadesReservadas;

    public Monitor(int código, String nombre, String apellidos, String email, String teléfono) {
        super(código, nombre, apellidos, email, teléfono);
        this.actividadesReservadas = new ArrayList<>();
        cargaActividades();
    }
    
    
    

   
    public void cargaActividades() {
        try {
            File file = new File("reservaPendientes.csv");
            Scanner scanner = new Scanner(file);
            
            // Ignorar la primera línea que contiene los encabezados
            scanner.nextLine();
            
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(";");
                // Verificar si el código del monitor coincide
                if (data[2].equals(String.valueOf(this.getCódigo()))) {
                    this.getActividadesReservadas().add(new ActividadReservada(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            e.printStackTrace();
        }
    }


    // Getters y setters

    public List<ActividadReservada> getActividadesReservadas() {
        return actividadesReservadas;
    }

    public void setActividadesReservadas(List<ActividadReservada> actividadesReservadas) {
        this.actividadesReservadas = actividadesReservadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor: ").append(super.getNombre()).append(" ").append(super.getApellidos()).append("\n");
        for (ActividadReservada actividad : actividadesReservadas) {
            sb.append(actividad.toString()).append("\n");
        }
        return sb.toString();
    }
}

