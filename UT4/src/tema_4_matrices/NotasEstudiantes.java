package tema_4_matrices;


public class NotasEstudiantes {
    // Declaramos un array para almacenar los nombres de los estudiantes
    static String[] nombres = {"Maria", "Juan", "Ana", "Carlos", "Lucia"};

    public static void main(String[] args) {
        // Declaramos una matriz 3D para almacenar las notas de 5 estudiantes en 5 asignaturas en 5 matrices
        double[][][] notas = generarNotas();

        // Imprimimos las notas y calculamos la media y la nota máxima
        for (int k = 0; k < notas.length; k++) {
            System.out.println("\nMatriz " + (k+1) + ":");
            imprimirNotas(notas[k]);
            calcularMedia(notas[k]);
            calcularNotaMaxima(notas[k]);
        }
    }

    // Método para generar notas aleatorias
    public static double[][][] generarNotas() {
        double[][][] notas = new double[5][5][5];
        for (int k = 0; k < notas.length; k++) {
            for (int i = 0; i < notas[k].length; i++) {
                for (int j = 0; j < notas[k][i].length; j++) {
                    notas[k][i][j] = Math.random() * 10;  // Genera una nota aleatoria entre 0 y 10
                }
            }
        }
        return notas;
    }

    // Método para imprimir las notas
    public static void imprimirNotas(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular la media de cada estudiante
    public static void calcularMedia(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            double sumaEstudiante = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaEstudiante += notas[i][j];
            }
            System.out.println("Media de " + nombres[i] + ": " + sumaEstudiante / notas[i].length);
        }
    }

    // Método para calcular la nota máxima en cada asignatura
    public static void calcularNotaMaxima(double[][] notas) {
        for (int j = 0; j < notas[0].length; j++) {
            double maxNota = 0;
            String estudianteMaxNota = "";
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] > maxNota) {
                    maxNota = notas[i][j];
                    estudianteMaxNota = nombres[i];
                }
            }
            System.out.println("La nota máxima en la asignatura " + (j+1) + " es: " + maxNota + ", obtenida por " + estudianteMaxNota);
        }
    }
}
