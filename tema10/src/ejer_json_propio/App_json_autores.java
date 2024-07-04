package ejer_json_propio;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App_json_autores {
    private ArrayList<clase_autores> autor;

    public App_json_autores(ArrayList<clase_autores> autor) {
       
        this.autor = autor;
    }

    public App_json_autores() {
      
        this.autor = new ArrayList<>();
    }

    public ArrayList<clase_autores> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<clase_autores> autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        ArrayList<clase_autores> obras = new ArrayList<>(); 

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("copia.json"));
            JSONArray jsonObras = (JSONArray) obj;

           
            for (Object obraObj : jsonObras) {
                JSONObject jsonObra = (JSONObject) obraObj;

               
                String nombre = (String) jsonObra.get("name");
                String autor = (String) jsonObra.get("author");
                String año = (String) jsonObra.get("year");
                String review = String.valueOf(jsonObra.get("review"));

               
                clase_autores obra = new clase_autores(nombre, autor, año, review);
                obras.add(obra);
            }

            // Mostrar solo las obras con una revisión de 7 
            System.out.println("las obras mas populares son : ");
            for (clase_autores obra : obras) {
                int revision = Integer.parseInt(obra.getReview());
                if (revision > 7) {
                	
                    System.out.println( obra.getNombre()+ "  con una puntuacion de " + obra.getReview());
                    
                }
            }
            System.out.println();
            System.out.println("Y las obras  menos populares  son :  ");
            for (clase_autores obra : obras) {
                int revision = Integer.parseInt(obra.getReview());
                if (revision < 7) {
                	
                    System.out.println( obra.getNombre()+ "  con una puntuacion de " + obra.getReview());
                    
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
