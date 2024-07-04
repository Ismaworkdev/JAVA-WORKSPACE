package examen_clinica;

public class Entradas_user {
// método que comprueba si un string es o no un número entero. 
  
	public boolean esEntero(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}


}
