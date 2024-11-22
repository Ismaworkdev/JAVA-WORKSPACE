package json_profe;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJson {

	public static void main(String[] args) {
	
		JSONParser parser=new JSONParser();
		
		try {
			//1)Parsear el archivo JSON
			Object obj=parser.parse(new FileReader("data.json"));
			
			//2) Convertir a un  JSONObject
			JSONObject json=(JSONObject)obj;
			
			//3)Extraemos los valores del objeto json
			String nombre= (String)json.get("nombre");
			long edad=(long)json.get("edad");
			String ciudad=(String)json.get("ciudad");
			
			System.out.println(nombre+" "+edad+" "+ciudad);
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

}
