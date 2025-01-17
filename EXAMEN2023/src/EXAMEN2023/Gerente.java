package EXAMEN2023;

import java.text.ParseException;

public class Gerente extends Persona implements Impuestos {

    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double IRPF(double sueldo) {
        return sueldo * 0.24;
    }
    
    public void pagoMonitor(Monitor m, String mes, int year) {
     m.CalculaComplementoClase(mes);
     //   m.ClasesMonitor(mes);
        double total = m.BASE + m.getExtraAlumno() + m.getExtraClase();
        total = total - IRPF(total); // Resta el IRPF del total

      
        try {
            BD bd = BD.getInstance();
            bd.cargarParametrosconexion();
        
            bd.insertarPago(m.getCod_monitor(), mes, year, total, "PAGADO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {
    	
      Monitor bm = new Monitor("100", "Maria", "Perez");
      Gerente g = new Gerente("Maria", "Perez");
       g.pagoMonitor(bm, "Mayo", 2023);
    }
}
