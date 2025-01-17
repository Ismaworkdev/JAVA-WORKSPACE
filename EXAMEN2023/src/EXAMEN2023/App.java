package EXAMEN2023;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        try {
            BD.getInstance().cargarParametrosconexion();

           ArrayList<Monitor> monitores = BD.getInstance().cargarMonitor();
            
          //  ArrayList<String> monitores = new ArrayList<>(Arrays.asList("Iván", "María","Carmen","Jose"));

            for (Monitor monitor : monitores) {
                Gerente gerente = new Gerente(monitor.getNombre(), monitor.getApellido());
                ArrayList<String> meses = new ArrayList<>(Arrays.asList("Mayo", "Marzo","Febrero","Enero", "Abril"));

                for (String mes : meses) {

                 //    Descomentar si necesario
                  //   monitor.ClasesMonitor(mes);
                   //  monitor.CalculaComplementoClase(mes);

                    gerente.pagoMonitor(monitor, mes, 2023);

                    System.out.println("Pago realizado para " + monitor.getNombre() + " en el mes de " + mes);
                }
            }
         //   System.out.println(monitores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
