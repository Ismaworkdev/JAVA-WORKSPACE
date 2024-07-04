package tema_4_matrices;

public class Matrizejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Declaramos e inicializamos una matriz 2D
		        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		        
		        // Imprimimos la matriz original
		        System.out.println("Matriz original:");
		        imprimirMatriz(matriz);
		        
		        // Transponemos la matriz
		        int[][] matrizTranspuesta = transponerMatriz(matriz);
		        
		        // Imprimimos la matriz transpuesta
		        System.out.println("\nMatriz transpuesta:");
		        imprimirMatriz(matrizTranspuesta);
		    }
		    
		    // Método para imprimir una matriz
		    public static void imprimirMatriz(int[][] matriz) {
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.print(matriz[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		    
		    // Método para transponer una matriz
		    public static int[][] transponerMatriz(int[][] matriz) {
		        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                matrizTranspuesta[j][i] = matriz[i][j];
		            }
		        }
		        return matrizTranspuesta;
		    }
		


	}


