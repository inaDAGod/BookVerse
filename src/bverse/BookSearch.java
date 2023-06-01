package bverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BookSearch {
    public static void main(String[] args) {
        String searchTerm = "Harry Potter"; // Término de búsqueda de ejemplo

        try {
        	String encodedSearchTerm = URLEncoder.encode(searchTerm, "UTF-8");
        	String urlString = "https://www.googleapis.com/books/v1/volumes?q=" + encodedSearchTerm;
            URL url = new URL(urlString);

           
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

        
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Procesar la respuesta JSON
            System.out.println(response.toString());
            

            // Aquí puedes parsear y extraer la información relevante de los libros encontrados
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
