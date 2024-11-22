package ejercicios_repaso;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int factorial =calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado= resultado * i;
        }
        return resultado;
    }
}

