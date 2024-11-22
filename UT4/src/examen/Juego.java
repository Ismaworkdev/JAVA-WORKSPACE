package examen;
import java.util.Scanner;
import java.util.Random;



public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parte 1: Selección de jugadores
        String[] participantes = {"X123", "Z3423", "J111_Ma", "X322", "J222_IV", "J123_Ca", "J341_Ja", "Zdsfa", "Xdfa", "zeree", "X111_Lu", "X222_Mi", "X256_PP", "X299_An", "Juan999", "LuisaCC2", "XX1234", "Z23", "X_3234", "Z876_Mi", "Z100_TN", "Z987_He", "Z299_Rw", "JJJ22"};
        
        System.out.println("Selecciona la letra de comienzo del nick (J, Z o X): ");
        String letraSeleccionada = scanner.nextLine().toUpperCase();
        
        if (!(letraSeleccionada.equals("J") || letraSeleccionada.equals("Z") || letraSeleccionada.equals("X"))) {
            System.out.println("Letra no válida. El programa terminará.");
            return;
        }
        
        String[] jugadores = seleccionarJugadores(participantes, letraSeleccionada);
        int[] apuestas = {500, 500, 500, 500};
        
        // Parte 2: Juego
        double totalApostado = 0;
        int[][] resultados = new int[4][10];
        int[] gana = new int[4];
        
        while (true) {
            realizarApuestas(jugadores, apuestas);
            lanzarDados(resultados);
            
            System.out.println("Menú de opciones:");
            System.out.println("A) Dos números suman el siguiente");
            System.out.println("B) Tirada impar suma par");
            System.out.println("C) Salir");
            
            String opcion = scanner.nextLine().toUpperCase();
            
            if (opcion.equals("C")) {
                break;
            }
            
            verificarGanador(resultados, gana, totalApostado, apuestas, opcion);
            reparto(gana, totalApostado, apuestas);
        }
        
        // Parte 3: Visualización de resultados
        mostrarResultados(jugadores, apuestas);
    }

    private static void mostrarResultados(String[] jugadores, int[] apuestas) {
        System.out.println("Resultados finales:");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(jugadores[i] + ": " + apuestas[i] + "€");
        }
    }

	private static String[] seleccionarJugadores(String[] participantes, String letra) {
        String[] jugadores = new String[4];
        int contador = 0;

        for (String participante : participantes) {
            if (participante.startsWith(letra) && contador < 4) {
                jugadores[contador] = participante;
                contador++;
            }
        }

        return jugadores;
    }

    private static void realizarApuestas(String[] jugadores, int[] apuestas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(jugadores[i] + ", realiza tu apuesta (entre 1 y 100€): ");
            int apuesta = scanner.nextInt();

            while (apuesta < 1 || apuesta > 100) {
                System.out.println("Apuesta no válida. Debe estar entre 1 y 100€. Intenta nuevamente: ");
                apuesta = scanner.nextInt();
            }

            apuestas[i] = apuesta;
        }
    }

    private static void lanzarDados(int[][] resultados) {
        Random random = new Random();

        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                resultados[i][j] = random.nextInt(6) + 1; // Números aleatorios del 1 al 6
            }
        }
    }

    private static void verificarGanador(int[][] resultados, int[] gana, double totalApostado, int[] apuestas, String opcion) {
        for (int i = 0; i < resultados.length; i++) {
            switch (opcion) {
                case "A":
                    if (dosNumerosConsecutivos(resultados[i])) {
                        gana[i] = 1;
                    }
                    break;
                case "B":
                    if (sumaImparesPar(resultados[i])) {
                        gana[i] = 1;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static boolean dosNumerosConsecutivos(int[] resultados) {
        for (int i = 0; i < resultados.length - 1; i++) {
            if (resultados[i] + 1 == resultados[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean sumaImparesPar(int[] resultados) {
        int sumaImpares = 0;
        for (int i = 0; i < resultados.length; i += 2) {
            sumaImpares += resultados[i];
        }
        return sumaImpares % 2 == 0;
    }

    private static void reparto(int[] gana, double totalApostado, int[] apuestas) {
        int cantidadGanadores = contarGanadores(gana);
        
        if (cantidadGanadores == 0) {
            System.out.println("Nadie ha ganado. El dinero se lo queda la banca.");
        } else {
            double dineroPorGanador = totalApostado / cantidadGanadores;
            
            for (int i = 0; i < gana.length; i++) {
                if (gana[i] == 1) {
                    apuestas[i] += dineroPorGanador;
                }
            }
            
            System.out.println("Reparto realizado. Cada ganador recibe " + dineroPorGanador + "€.");
        }
    }

    private static int contarGanadores(int[] gana) {
        int contador = 0;
        for (int i : gana) {
            if (i == 1) {
                contador++;
            }
        }
        return contador;
    }

}
      