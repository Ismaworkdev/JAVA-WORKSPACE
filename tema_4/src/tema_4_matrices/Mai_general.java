package tema_4_matrices;


		// TODO Auto-generated method stub
		public class Mai_general {
		    public static void main(String[] args) {
		        // Crear una matriz de 5x5
		        int[][] matriz = new int[5][5];

		        // Llenar la matriz con números aleatorios del 0 al 9
		        llenarMatriz(matriz);

		        // Imprimir la matriz
		        imprimirMatriz(matriz);
		    }

		    // Método para llenar la matriz con números aleatorios
		    public static void llenarMatriz(int[][] matriz) {
		        int fila, columna;
		        do {
		            // Generar índices de fila y columna aleatorios
		            fila = (int) (Math.random() * 5);
		            columna = (int) (Math.random() * 5);

		            // Generar un valor aleatorio del 0 al 9
		            int valor = (int) (Math.random() * 10);

		            // Asignar el valor aleatorio a la posición correspondiente en la matriz
		            matriz[fila][columna] = valor;
		        } while (fila != 4 || columna != 4);  // Continuar hasta que se llene el último elemento de la matriz
		    }

		    // Método para imprimir la matriz
		    public static void imprimirMatriz(int[][] matriz) {
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                // Utilizar switch-case para determinar qué número imprimir
		                switch (matriz[i][j]) {
		                    case 0:
		                        System.out.print("0 ");
		                        break;
		                    case 1:
		                        System.out.print("1 ");
		                        break;
		                    case 2:
		                        System.out.print("2 ");
		                        break;
		                    case 3:
		                        System.out.print("3 ");
		                        break;
		                    case 4:
		                        System.out.print("4 ");
		                        break;
		                    case 5:
		                        System.out.print("5 ");
		                        break;
		                    case 6:
		                        System.out.print("6 ");
		                        break;
		                    case 7:
		                        System.out.print("7 ");
		                        break;
		                    case 8:
		                        System.out.print("8 ");
		                        break;
		                    case 9:
		                        System.out.print("9 ");
		                        break;
		                    default:
		                        System.out.print("X ");
		                        break;
		                }
		            }
		            System.out.println();  // Pasar a la siguiente línea después de imprimir cada fila
		        }
		    }
		}

	