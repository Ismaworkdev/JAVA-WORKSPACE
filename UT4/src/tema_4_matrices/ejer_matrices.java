package tema_4_matrices;
import java.util.Random;
public class ejer_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. Crea un programa Java que tenga un método public static void totales( int [][]m) que
//		recibe como parámetro una matriz formada por 4 filas y 5 columnas que debes rellenar
//		con números aleatorios en el programa principal. El método mostrará las sumas parciales
//		de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe
//		aparecer en la esquina inferior derecha.
		
	


		        int[][] matriz = new int[4][5];
		        Random rand = new Random();

		        // Rellenar la matriz con números aleatorios
		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 5; j++) {
		                matriz[i][j] = rand.nextInt(100);
		            }
		        }

		        // Llamar al método totales
		        totales(matriz);
		    }

		    public static void totales(int[][] m) {
		        int total = 0;

		        // Imprimir la matriz y calcular la suma total
		        for (int i = 0; i < 4; i++) {
		            int sumaFila = 0;
		            for (int j = 0; j < 5; j++) {
		                System.out.print(m[i][j] + " ");
		                sumaFila += m[i][j];
		                total += m[i][j];
		            }
		            System.out.println("| " + sumaFila);
		        }

		        // Imprimir las sumas de las columnas
		        for (int j = 0; j < 5; j++) {
		            int sumaColumna = 0;
		            for (int i = 0; i < 4; i++) {
		                sumaColumna += m[i][j];
		            }
		            System.out.print(sumaColumna + " ");
		         }   

		        // Imprimir la suma total
		        System.out.println("| " + total);
		    }
		}

	
