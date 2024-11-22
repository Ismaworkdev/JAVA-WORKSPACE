package json_profe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int masAntiguo=2024;
		int fecha=2024;
		JSONParser parser=new JSONParser();
		//1)Parsear el archivo JSON
		try {
			Object obj=parser.parse(new FileReader("lenguajes.json"));
			JSONArray lenguajes=(JSONArray)obj;
			System.out.println(lenguajes);
			//lenguajes.forEach(l->parsearLenguajes((JSONObject)l));
			for (Object object : lenguajes) {
				fecha=Integer.parseInt(parsearLenguajes((JSONObject)object));
				if(fecha<masAntiguo)
					masAntiguo=fecha;
				
			}
			System.out.println("El lenguaje más antiguo es de: "+masAntiguo);
			
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

	public static String parsearLenguajes(JSONObject l) {
		String nombre=(String)l.get("name");
		String fecha=(String)l.get("publish_date");
		System.out.println(nombre+" "+fecha);
		return fecha;
	}
	
	
}
