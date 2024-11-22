package json_profe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ejercicio21 {
	private ArrayList<Actor>actores;
	
	public Ejercicio21() {
		this.actores=new ArrayList<Actor>();
	}


	public ArrayList<Actor> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}

	public static void main(String[] args) {
		
		Ejercicio21 app=new Ejercicio21();
		
		JSONParser parser = new JSONParser();
		// 1)Parsear el archivo JSON
		try {
			Object obj = parser.parse(new FileReader("actores.json"));
			JSONArray actores = (JSONArray) obj;
			actores.forEach(act -> app.parsearActores((JSONObject) act));
			int cont=0;
			//Lista de nacionalidades
			List<String>paises=app.getActores().stream().map(a->a.getPais()).distinct().toList();
			//Set<String> conjunto = new HashSet<>(app.getActores().stream().map(a->a.getPais()).toList());
			System.out.println(paises);
			
			//app.getActores().stream().map(a->a.getNombre()).sorted().toList()
			//System.out.println(conjunto);
			for(String p: paises) {
				System.out.println("Actores de "+p);
				for(Actor a: app.getActores()) {
					if(a.getPais().equals(p)) {
						cont++;
						System.out.println("\t- "+a.getNombre()+" "+a.getApellido());
					}
						
				}
				System.out.println("Total  "+cont);
				cont=0;
			}
			
			
			
			
			
			//System.out.println(app.getActores());
//			int max=0,edad=0;
//			String nombreMayor="",apellidoMayor="";
//			for(Actor a: app.getActores()) {
//				if(a.getEdad()>max)
//				{
//					max=a.getEdad();
//					nombreMayor=a.getNombre();
//					apellidoMayor=a.getApellido();
//				}
//				
//			}
//			
//			System.out.println("El actor de más edad en recibir un oscar es: "+nombreMayor+ " "+apellidoMayor+" con "+max+" años");	
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

	public void parsearActores(JSONObject act) {
		String nombre=(String)act.get("first_name");
		String apellido=(String)act.get("last_name");
		String edad=(String)act.get("age");
		String peliculas=(String)act.get("movies");
		String pais=(String)act.get("country");
		this.getActores().add(new Actor(nombre, apellido, Integer.parseInt(edad), peliculas, pais));
		//System.out.println(nombre+" "+apellido+" "+edad);
		
	}

}
