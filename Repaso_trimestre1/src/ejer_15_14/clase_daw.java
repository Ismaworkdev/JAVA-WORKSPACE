package ejer_15_14;

import java.util.Arrays;

public class clase_daw {


//		16. Crea una clase llamada Clase1DAMW que tenga como atributos:
//			a. Un string que indica el nombre
//			b. Un Array de n alumnos
//			Sus métodos son:
//			 Constructor por defecto
//			 Constructor con todos los parámetros
//			 toString()
		private alumno[]alumno;
		private String nombre;
		
		
		public clase_daw() {
			super();
			this.alumno = new alumno[10];
			this.nombre = "";
		}
		
		public clase_daw(ejer_15_14.alumno[] alumno, String nombre) {
			super();
			this.alumno = alumno;
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "clase_daw [alumno=" + Arrays.toString(alumno) + ", nombre=" + nombre + "]";
		}
		

}
