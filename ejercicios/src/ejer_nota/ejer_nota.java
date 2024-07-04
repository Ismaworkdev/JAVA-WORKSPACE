package ejer_nota;

import java.util.Scanner;

public class ejer_nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Por favor, introduce tu nombre:");
	        String nombre = scanner.nextLine();

	        System.out.println("Hola, " + nombre + "!");
	        
	        System.out.println("año ?");
	        int ano=scanner.nextInt();
	        
	        
	        int anomm=2023;
	        int edad= ano-anomm;
	        System.out.println("tienes"+edad);
	        
	        
	        if (edad == 18) {
	            System.out.println("18");
	        } else if (edad > 18) {
	            System.out.println("Mayor");
	        } else {
	            System.out.println("Menor");
	        }
	                
	                
	                
	                System.out.println("Elige una opción del menú (1-4):");
                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Introduce un número del 1 al 7:");
                            int dia = scanner.nextInt();
                            String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
                            if (dia >= 1 && dia <= 7) {
                                System.out.println("El día de la semana es: " + dias[dia - 1]);
                            } else {
                                System.out.println("Número inválido. Debe ser entre 1 y 7.");
                            }
                            break;
                        case 2:
                            double suma = 0;
                            for (int i = 0; i < 6; i++) {
                                System.out.println("Introduce la nota " + (i + 1) + ":");
                                double nota = scanner.nextDouble();
                                suma += nota;
                            }
                            double media = suma / 6;
                            System.out.println("La media de las notas es: " + media);
                            break;
                        case 3:
                            System.out.println("Introduce un número:");
                            int num = scanner.nextInt();
                            System.out.println("Los números impares desde 1 hasta " + num + " son:");
                            for (int i = 1; i <= num; i += 2) {
                                System.out.println(i);
                            }
                            break;
                        case 4:
                            System.out.println("Introduce un número:");
                            int num2 = scanner.nextInt();
                            int sumaPares = 0;
                            for (int i = 2; i <= num2; i += 2) {
                                sumaPares += i;
                            }
                            System.out.println("La suma de los números pares desde 1 hasta " + num2 + " es: " + sumaPares);
                            break;
                        default:
                            System.out.println("Opción inválida. Debe ser entre 1 y 4.");
                    }
                }
            }

            
            
            
            
        





	
	
	
 
    
    


	                
	                
	             
	                      
	        
	        

	
