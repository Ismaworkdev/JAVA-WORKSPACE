package examen_año_pasado;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Crear un array de palabras
		        String[] palabras = {"PLATO","PISAR","PLANO","MAREO","LISTA","LISTO",
		                             "SUCIO","PERRO","MIXTO","BULTO","CASTO","PRADO",
		                             "MOSCA","PISTO", "TURCO","BRAVO","VISTO","QUESO","GUISO","USADO"};
		        // Número de intentos que tiene el usuario para adivinar la palabra
		        int intentos = 6;
		        // Generar un número aleatorio entre 0 y 19 usando Math.random()
		        int posicion = (int) (Math.random() * 20);
		        // Seleccionar la palabra que corresponda con esa posición del array
		        String palabraSecreta = palabras[posicion];
		        // Inicializar la palabra adivinada con guiones bajos
		        String adivina = "_____";
		        // Crear un objeto Scanner para leer la entrada del usuario
		        Scanner scanner = new Scanner(System.in);

		        // Mientras el usuario tenga intentos y no haya adivinado la palabra
		        while (intentos > 0 && !adivina.equals(palabraSecreta)) {
		            // Pedir al usuario que introduzca una palabra de 5 letras mayúsculas
		            System.out.println("Introduce una palabra de 5 letras en mayúsculas:");
		            String palabraUsuario = scanner.nextLine();
		            // Comprobar que la palabra del usuario cumple con el formato requerido
		            while (!palabraUsuario.matches("[A-Z]{5}")) {
		                System.out.println("Por favor, introduce una palabra de 5 letras en mayúsculas:");
		                palabraUsuario = scanner.nextLine();
		            }
		            // Inicializar la nueva palabra adivinada con guiones bajos
		            String nuevaAdivina = "";
		            // Comprobar cada letra de la palabra del usuario
		            for (int i = 0; i < 5; i++) {
		                // Si la letra está en la misma posición en la palabra secreta,
		                // añadirla a la nueva palabra adivinada
		                if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
		                    nuevaAdivina += palabraUsuario.charAt(i);
		                } else {
		                    // Si no, añadir un guión bajo a la nueva palabra adivinada
		                    nuevaAdivina += "_";
		                }
		            }
		            // Actualizar la palabra adivinada
		            adivina = nuevaAdivina;
		            // Mostrar la palabra adivinada
		            System.out.println("Palabra adivinada: " + adivina);
		            // Reducir el número de intentos
		            intentos--;
		        }
		        // Comprobar si el usuario ha adivinado la palabra
		        if (adivina.equals(palabraSecreta)) {
		            System.out.println("¡Felicidades! Has adivinado la palabra.");
		        } else {
		            System.out.println("Lo siento, no has adivinado la palabra. La palabra era " + palabraSecreta + ".");
		        }
		    

	}

}
