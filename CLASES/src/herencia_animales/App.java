package herencia_animales;



import herencia.Consultor;

public class App {
	public static void main(String[] args) {
		  Animal[]misanimales=new Animal[6];
		  
		  misanimales[0]=new Conejo("Mimi ","lol", 7, 45.6,"mimi", "obulada");
		  misanimales[1]=new Perro("Luna ", "23423", 4, 44, "chiguagua", true);
		  misanimales[4]=new Gato(" ROBINSON", "2424", 33, 234, "SIAMES", 4);	  
		  
		  
		  
		  for (int i = 0; i < misanimales.length; i++) {
			  if(misanimales[i] instanceof Conejo)
					System.out.println ("el Conejo llamado  : " +  misanimales[i].getNombre()+" hace  : "+misanimales[i].emitesonido());
		}
		  
		  for (int i = 0; i < misanimales.length; i++) {
			  if(misanimales[i] instanceof Perro)
					System.out.println ("el Perro  llamado  : " +  misanimales[i].getNombre()+" hace  : "+misanimales[i].emitesonido());
		}
		  for (int i = 0; i < misanimales.length; i++) {
			  if(misanimales[i] instanceof Gato)
					System.out.println ("el Gato llamado  : " +  misanimales[i].getNombre()+" hace   : "+misanimales[i].emitesonido());
		} 
		  
	}
		
}
