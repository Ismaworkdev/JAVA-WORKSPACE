package Json;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LeerJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JSONParser parser= new JSONParser();
        
        try {
         
        	Object obj = parser.parse(new FileReader("jsono.json"));
        	
        	JSONObject json= (JSONObject)obj;
        	String nombre =(String)json.get("nombre");
        	long edad=(long)json.get("edad");
        	System.out.println(nombre + " "+edad);
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

        
        
	}

	

}
