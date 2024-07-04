package Json;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class leer_mucho_json {

    public static void main(String[] args) {
    	
    	int masantiguo;
    	int fecha;
        JSONParser parser= new JSONParser();
        
        try {
            Object obj = parser.parse(new FileReader("jsarray.json"));
            
            if (obj instanceof JSONObject) {
                JSONObject jsonObject = (JSONObject)obj;
                JSONArray estudiantes = (JSONArray)jsonObject.get("estudiantes");
                System.out.println(estudiantes);
                estudiantes.forEach(estudiante -> parsearEstudiante((JSONObject) estudiante));
                estudiantes.forEach(estudiante -> parsearedad((JSONObject) estudiante));
            

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void parsearEstudiante(JSONObject estudiante) {
       String nombre =(String)estudiante.get("nombre");
       System.out.println(nombre);
    }
    
    public static void parsearedad(JSONObject estudiante) {
        long edad =(long)estudiante.get("edad");
        System.out.println(edad);
     }
}
