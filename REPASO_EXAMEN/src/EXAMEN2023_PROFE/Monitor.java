package EXAMEN2023_PROFE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Monitor extends Persona {
    private String codigoMonitor;
    private String clave;
    private ArrayList<Clase> clasesMonitor;
    private double extraClase;
    private double extraAlumnos;

    public Monitor(String dNI, String nombre, String apellidos, String direccion, String correo, String codigoMonitor,
            String clave) {
        super(dNI, nombre, apellidos, direccion, correo);
        this.codigoMonitor = codigoMonitor;
        this.clave = clave;
        this.clasesMonitor = new ArrayList<>();
    }

    public String getCodigoMonitor() {
        return codigoMonitor;
    }

    public void setCodigoMonitor(String codigoMonitor) {
        this.codigoMonitor = codigoMonitor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Clase> getClasesMonitor() {
        return clasesMonitor;
    }

    public void setActividades(ArrayList<Clase> clasesMonitor) {
        this.clasesMonitor = clasesMonitor;
    }

    @Override
    public String toString() {
        return "Monitor [codigoMonitor=" + codigoMonitor + ", clave=" + clave + ", clases=" + clasesMonitor
                + ", toString()=" + super.toString() + "]";
    }

    public void cargarClases(String mes, int year) {
        mes = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        try {
            Scanner entrada = new Scanner(new File("asistencia" + mes + year + ".csv"));
            String cadena;
            String[] linea;
            cadena = entrada.nextLine(); // primera línea
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                linea = cadena.split(";");
                if (this.getCodigoMonitor().equals(linea[5])) {
                    this.getClasesMonitor().add(new Clase(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]),
                            linea[3], Integer.parseInt(linea[4]), linea[5], Integer.parseInt(linea[6].trim())));
                }
            }

            // System.out.println(this.getClasesMonitor());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Fichero no existe");
        }
    }

    public double getExtraClase() {
        return extraClase;
    }

    public void setExtraClase(double extraClase) {
        this.extraClase = extraClase;
    }

    public double getExtraAlumnos() {
        return extraAlumnos;
    }

    public void setExtraAlumnos(double extraAlumnos) {
        this.extraAlumnos = extraAlumnos;
    }

    public void setClasesMonitor(ArrayList<Clase> clasesMonitor) {
        this.clasesMonitor = clasesMonitor;
    }

    public void clasesMonitor(String mes) throws FileNotFoundException {
        File f = new File("asistencia" + mes + "2023.csv");
        if (f.exists()) {
            // System.out.println("Existe el fichero "+f.getName());
            this.cargarClases(mes, 2023);
            this.calculaComplementoClases(mes);

        } else {
            System.out.println("No existe el fichero para " + mes);
        }

    }

    public void calculaComplementoClases(String mes) throws FileNotFoundException {
        int totalClases = 0;
        int totalAlumnos = 0;
        // Clases por día
        PrintWriter salida = new PrintWriter("Complemento" + mes + this.getNombre() + this.getApellidos() + ".txt");
        int[] clasesPorDia = new int[32];
        int[] numAlumnosPorDia = new int[32];
        for (Clase cl : this.getClasesMonitor()) {
            clasesPorDia[cl.getDia()]++;
        }
        System.out.println(Arrays.toString(clasesPorDia));
        for (Clase cl : this.getClasesMonitor()) {
            numAlumnosPorDia[cl.getDia()] += cl.getnParticipantes();
        }
        // Alumnos por clase
        System.out.println(Arrays.toString(numAlumnosPorDia));
        salida.println("**************************************************");
        salida.println("MES: " + mes);
        salida.println("Complementos nómima: " + this.getNombre() + " " + this.getApellidos());
        salida.println("**************************************************");
        for (int i = 1; i < clasesPorDia.length; i++) {
            salida.println("Día " + i + ": ");
            salida.println("\tNúmero de clases: " + clasesPorDia[i] + " a 5€/clase= " + clasesPorDia[i] * 5 + "€");
            totalClases += clasesPorDia[i] * 5;
            salida.println("\tNúmero total alumnos: " + numAlumnosPorDia[i] + " a 0,05€/alumno=" + (numAlumnosPorDia[i] * 0.05)
                    + "€");
            totalAlumnos += numAlumnosPorDia[i] * 0.05;
        }
        this.extraAlumnos = totalAlumnos;
        this.extraClase = totalClases;
        salida.println("Total por clases: " + totalClases + "€");
        salida.println("Total por alumnos: " + totalAlumnos + "€");
        salida.flush();
        salida.close();

    }

    public static ArrayList<Monitor> cargarMonitores() {
        ArrayList<Monitor> monitores = new ArrayList<>();
        BD bd = BD.getInstance();
        try {
            ResultSet rset = bd.consultaBD("SELECT * FROM MONITOR");
            while (rset.next()) {
                String dni = rset.getString("DNI");
                String nombre = rset.getString("NOMBRE");
                String apellidos = rset.getString("APELLIDOS");
                String direccion = rset.getString("DIRECCION");
                String correo = rset.getString("CORREO");
                String codigoMonitor = rset.getString("CODIGOMONITOR");
                String clave = rset.getString("CLAVE");
                Monitor monitor = new Monitor(dni, nombre, apellidos, direccion, correo, codigoMonitor, clave);
                monitores.add(monitor);
            }
            bd.cerrarConsulta();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return monitores;
    }

    public static void main(String[] args) throws FileNotFoundException {
        BD.getInstance().cargarParametrosConexion();

        ArrayList<Monitor> monitores = cargarMonitores();
        for (Monitor monitor : monitores) {
            System.out.println(monitor.getNombre());
        }

        Monitor m = new Monitor("", "María", "Perez", "", "", "101", "");
        m.clasesMonitor("Enero");
    }
}
