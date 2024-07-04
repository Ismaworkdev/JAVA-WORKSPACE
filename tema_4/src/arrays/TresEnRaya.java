
package arrays;

import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        // Crear un tablero de juego de 3x3
        String [][]t=new String[3][3];
        // Inicializar el tablero con espacios vacíos
        crearTablero(t);
        // Mostrar el tablero inicial
        mostrarTablero(t);
        // Definir el jugador inicial como "X"
        String jugador="X";
        int x,y=0;
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc=new Scanner(System.in);
        
        // Iniciar el juego
        do {
            // Pedir al jugador que indique la fila donde quiere colocar su ficha
            System.out.println(jugador+" indica la fila (0-2)");
            x = sc.nextInt();
            // Pedir al jugador que indique la columna donde quiere colocar su ficha
            System.out.println(jugador+" indica la columna (0-2)");
            y = sc.nextInt();
            
            // Colocar la ficha del jugador en el tablero en la posición indicada
            colocaFicha(jugador, x, y, t);
            
            // Comprobar si el jugador ha ganado después de colocar su ficha
            if (gana(jugador, t)) {
                System.out.println(jugador+" ha ganado");
                break;
            }

            // Dejar que la PC juegue eligiendo una posición aleatoria
            juegaPC(t);

            // Comprobar si la PC ha ganado después de colocar su ficha
            if (gana("O", t)) {
                System.out.println("PC ha ganado");
                break;
            }
            // Comprobar si el tablero está lleno y si no hay ganador, entonces es un empate
            if (tableroLleno(t) && !gana(jugador, t) && !gana("PC", t)) {
                System.out.println("El juego ha terminado en empate.");
                break;
            }
        } while (!gana(jugador,t) && !gana("O",t));
        // Cerrar el objeto Scanner
        sc.close();
    }
    
    // Método para comprobar si el tablero está lleno
    private static boolean tableroLleno(String[][] t) {
        // Recorrer todas las celdas del tablero
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                // Si alguna celda está vacía, el tablero no está lleno
                if (t[i][j].equals(" ")) {
                    return false; 
                }
            }
        }
        // Si todas las celdas están ocupadas, el tablero está lleno
        return true;
    }

    // Métodos para comprobar si un jugador ha ganado
    private static boolean compruebaHorizontal(String jugador, String[][]t) {
        // Recorrer todas las filas del tablero
        for (int i = 0; i < t.length; i++) {
            // Si todas las celdas de una fila son iguales al jugador, el jugador ha ganado
            if (t[i][0].equals(jugador) && t[i][1].equals(jugador) && t[i][2].equals(jugador)) {
                return true;
            }
        }
        // Si ninguna fila cumple la condición, el jugador no ha ganado
        return false;
    }
    private static boolean compruebaVertical(String jugador, String[][]t) {
        // Recorrer todas las columnas del tablero
        for (int i = 0; i < t[0].length; i++) {
            // Si todas las celdas de una columna son iguales al jugador, el jugador ha ganado
            if (t[0][i].equals(jugador) && t[1][i].equals(jugador) && t[2][i].equals(jugador)) {
                return true; 
            }
        }
        // Si ninguna columna cumple la condición, el jugador no ha ganado
        return false;
    }
    private static boolean compruebaDiagonal(String jugador, String[][]t) {
        // Comprobar las dos diagonales del tablero
        // Si todas las celdas de una diagonal son iguales al jugador, el jugador ha ganado
        if ((t[0][0].equals(jugador) && t[1][1].equals(jugador) && t[2][2].equals(jugador)) ||
                (t[0][2].equals(jugador) && t[1][1].equals(jugador) && t[2][0].equals(jugador))) {
                return true;
            }
        // Si ninguna diagonal cumple la condición, el jugador no ha ganado
        return false;
    }
    
    // Método para que la PC juegue
    private static int juegaPC(String[][]t) {
        int x, y;
        // Elegir una posición aleatoria para colocar la ficha de la PC
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (!t[x][y].equals(" "));

        // Mostrar la posición elegida por la PC
        System.out.println("La PC ha colocado una ficha en la posicion " + x + ", " + y);
        // Colocar la ficha de la PC en el tablero
        colocaFicha("O", x, y, t);
        
        return 0;
    }
    
    // Método para colocar una ficha en el tablero
    private static int colocaFicha(String jugador, int x, int y, String[][] t) {
        // Comprobar si la posición indicada es válida
        if (x < 0 || x >= t.length || y < 0 || y >= t[0].length || !t[x][y].equals(" ")) {
            // Si la posición no es válida, mostrar un mensaje de error y terminar el turno
            System.out.println("Posicion invalida, perdiste el turno");
            return -1;
        }
        // Si la posición es válida, colocar la ficha del jugador en la posición indicada
        t[x][y] = jugador;
        // Mostrar el tablero después de colocar la ficha
        mostrarTablero(t);
        return 0;
    }

    // Método para comprobar si un jugador ha ganado
    private static boolean gana(String jugador, String[][] t) {
        // Un jugador gana si tiene una línea horizontal, vertical o diagonal completa
        return compruebaHorizontal(jugador,t) || compruebaVertical(jugador, t) || compruebaDiagonal(jugador, t);
    }

    // Método para inicializar el tablero
    public static void crearTablero(String[][] t) {
        // Rellenar todas las celdas del tablero con espacios vacíos
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = " ";
            }
        }
    }

    // Método para mostrar el tablero
    public static void mostrarTablero(String[][] t) {
        // Mostrar el tablero con un formato agradable
        System.out.println("****************");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(" | "+t[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println("****************");
    }
}

		