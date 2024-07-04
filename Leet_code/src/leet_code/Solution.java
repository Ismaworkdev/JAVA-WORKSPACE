package leet_code;


		public class Solution {
		    
		    public int hammingWeight(int n) {
		        int count = 0;
		        
		     
		        while (n != 0) {
		           
		            count += n & 1;
		            
		           
		            n >>>= 1;
		        }
		        
		        return count;
		    }

		    public static void main(String[] args) {
		        // Se crea una instancia de la clase Solution
		        Solution solution = new Solution();

		        // Ejemplo de uso: Se convierte la cadena binaria "110101" a entero
		        int binaryRepresentation1 = Integer.parseInt("110101", 2);

		        // Se imprime el resultado del método hammingWeight para binaryRepresentation1
		        System.out.println(solution.hammingWeight(binaryRepresentation1)); 
		    }


}
