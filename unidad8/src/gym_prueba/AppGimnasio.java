package gym_prueba;

import java.util.Scanner;

public class AppGimnasio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario (código de monitor): ");
        int usuario = scanner.nextInt();
        System.out.println("Ingrese su contraseña (código de monitor): ");
        int contraseña = scanner.nextInt();
        scanner.close();

        Monitor monitor = new Monitor(contraseña, "Nombre Monitor", "Apellidos Monitor", "monitor@example.com", "123456789");

        if (usuario == contraseña) {
            System.out.println("Bienvenido, " + monitor.getNombre() + " " + monitor.getApellidos());
            System.out.println("Actividades del día:");
            for (ActividadReservada actividad : monitor.getActividadesReservadas()) {
                if (actividad.getNúmeroParticipantes() < actividad.getNúmeroMáximoParticipantes()) {
                    System.out.println("Hay plazas disponibles en: " + actividad.toString());
                } else {
                    System.out.println("La actividad " + actividad.getNombreActividad() + " está llena.");
                }
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
