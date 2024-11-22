package Json;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ejer_profe_json {
private ArrayList<class_actor>actor;


	public ejer_profe_json(ArrayList<class_actor> actor) {
	super();
	this.actor = actor;
}
	public ejer_profe_json() {
	super();
	this.actor = new ArrayList<>();
}


	public ArrayList<class_actor> getActor() {
		return actor;
	}
	public void setActor(ArrayList<class_actor> actor) {
		this.actor = actor;
	}
	public static void main(String[] args) {
		class_actor p = new class_actor(); 
		int fecha;
        JSONParser parser= new JSONParser();
        
        try {
            Object obj = parser.parse(new FileReader("loo.json"));
            
            if (obj instanceof JSONObject) {
                JSONArray actores = (JSONArray)obj;
                actores.forEach(act ->parseactores((JSONObject)act));
        System.out.println(p.getNombre());
      //acto
            

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
  
    
    private static void   parseactores(JSONObject act) {
		// TODO Auto-generated method stub
    	String nombre=(String)act.get("first_name");
    	String apellidos=(String)act.get("last_name");
    	String edad=(String)act.get("age");
    	String peli=(String)act.get("movies");
    	String pais=(String)act.get("country");
    	
    	
    	System.out.println(nombre +" "+apellidos+" "+edad);
		;
	}




	}


