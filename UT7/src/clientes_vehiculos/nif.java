package clientes_vehiculos;

public class nif {
	public static final int DIMENSION_MAX=9;
	public static final int DIVISOR=23;
	private String dni;
	 private char[] Letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	 
	 public void Ciudadano(String dni) {
	        this.dni = dni;
	    }
	 public boolean esCorrecto(String dni) {
		    // Comprobar la longitud del dni
		    if (dni.length() != DIMENSION_MAX) {
		        return false;
		    }

		    // Extraer el último carácter del dni
		    char letra = dni.charAt(8);

		    // Convertir el resto del dni en un número entero
		    int numero = Integer.parseInt(dni.substring(0, 8));

		    // Calcular el resto de dividir el número por 23
		    int resto = DIVISOR % 23;

		    // Comparar el resto con el valor del carácter según el arreglo Letras
		    if (letra == Letras[resto]) {
		        return true;
		    } else {
		        return false;
		    }
		}
    
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		  if (esCorrecto(dni)) {
	            this.dni = dni;
	        } else {
	            throw new IllegalArgumentException("NIF no válido");
	        }
	}
	
	  
	  
}
