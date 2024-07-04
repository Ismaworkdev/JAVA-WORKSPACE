package Gym_examen_pasado;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor {
    private String codigo;
    private String nombre;
    private String ape;
    private String email;
    private ArrayList<Actividad_reserva> actividadesReserva = new ArrayList<>();

    public Monitor(String codigo, String nombre, String ape, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ape = ape;
        this.email = email;
    }

    public void cargaActividades() {
        String splitBy = ";";
        try {
            Scanner scanner = new Scanner(new File("reservaPendientes.csv"));
            while (scanner.hasNextLine()) {
                String[] actividad = scanner.nextLine().split(splitBy);
                if (actividad[2].equals(this.codigo)) { // código del monitor
                    Actividad_reserva reserva = new Actividad_reserva(splitBy, 0, splitBy, 0, 0);
                    reserva.setNom_atributo(actividad[0]);
                    reserva.setHora_actividad(Double.parseDouble(actividad[1]));
                    reserva.setCod_monitor(actividad[2]);
                    reserva.setNum_max(Integer.parseInt(actividad[3]));
                    reserva.setNum_par(Integer.parseInt(actividad[4]));
                    actividadesReserva.add(reserva);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
		System.out.println(cargaActividades());
	}
}
