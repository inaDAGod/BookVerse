package bverse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bverse.clases.hijas.*;
import bverse.clases.madres.*;

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

            // Analizar la respuesta JSON y extraer los datos
            try {
                // Crear un objeto JSON a partir de la respuesta
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Obtener el array de libros desde el objeto JSON
                JSONArray itemsArray = jsonResponse.getJSONArray("items");

                // Recorrer cada libro en el array
                for (int i = 0; i < itemsArray.length(); i++) {
                    JSONObject bookObject = itemsArray.getJSONObject(i);

                    // Obtener el objeto de información del libro
                    JSONObject volumeInfo = bookObject.getJSONObject("volumeInfo");

                    // Obtener el título del libro
                    String title = volumeInfo.getString("title");
                    System.out.println("Título: " + title);

                    // Obtener los autores del libro
                    if (volumeInfo.has("authors")) {
                        JSONArray authorsArray = volumeInfo.getJSONArray("authors");
                        System.out.print("Autores: ");
                        for (int j = 0; j < authorsArray.length(); j++) {
                            String author = authorsArray.getString(j);
                            System.out.print(author + ", ");
                        }
                        System.out.println();
                    }
                    

                    // Obtener los géneros del libro
                    if (volumeInfo.has("categories")) {
                        JSONArray categoriesArray = volumeInfo.getJSONArray("categories");
                        System.out.print("Géneros: ");
                        for (int j = 0; j < categoriesArray.length(); j++) {
                            String category = categoriesArray.getString(j);
                            System.out.print(category + ", ");
                        }
                        System.out.println();
                    }

                    // Obtener el número de páginas del libro
                    if (volumeInfo.has("pageCount")) {
                        int pageCount = volumeInfo.getInt("pageCount");
                        System.out.println("Número de páginas: " + pageCount);
                    }

                    // Obtener el precio del libro (si está disponible)
                    if (volumeInfo.has("saleInfo")) {
                        JSONObject saleInfo = volumeInfo.getJSONObject("saleInfo");
                        if (saleInfo.has("listPrice")) {
                            JSONObject listPrice = saleInfo.getJSONObject("listPrice");
                            double price = listPrice.getDouble("amount");
                            String currency = listPrice.getString("currencyCode");
                            System.out.println("Precio: " + price + " " + currency);
                        }
                    }

                    // Obtener la URL de la portada del libro
                    if (volumeInfo.has("imageLinks")) {
                        JSONObject imageLinks = volumeInfo.getJSONObject("imageLinks");
                        String thumbnailUrl = imageLinks.getString("thumbnail");
                        System.out.println("URL de la portada: " + thumbnailUrl);
                    }

                    // Obtener la calificación promedio del libro (si está disponible)
                    if (volumeInfo.has("averageRating")) {
                        double averageRating = volumeInfo.getDouble("averageRating");
                        System.out.println("Calificación promedio: " + averageRating);
                    }

                    // Obtener el ISBN del libro
                    if (volumeInfo.has("industryIdentifiers")) {
                        JSONArray identifiersArray = volumeInfo.getJSONArray("industryIdentifiers");
                        for (int j = 0; j < identifiersArray.length(); j++) {
                            JSONObject identifierObject = identifiersArray.getJSONObject(j);
                            String type = identifierObject.getString("type");
                            String identifier = identifierObject.getString("identifier");
                            System.out.println("ISBN (" + type + "): " + identifier);
                        }
                    }

                    System.out.println("----------------------------------");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static Libro buscar (String searchTerm) {
    	
    	String ISBM = "";
    	String precio = "";
    	String titulo = "";
    	String genero = "";
    	String portada = "";
    	String cal ="";
    	String descripcion="";
    	int paginas = 0;
    	Autor autor = new Autor();
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


            // Analizar la respuesta JSON y extraer los datos
            try {
                // Crear un objeto JSON a partir de la respuesta
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Obtener el array de libros desde el objeto JSON
                JSONArray itemsArray = jsonResponse.getJSONArray("items");

                // Recorrer cada libro en el array
                for (int i = 0; i < itemsArray.length()+1 -itemsArray.length(); i++) {
                    JSONObject bookObject = itemsArray.getJSONObject(i);

                    // Obtener el objeto de información del libro
                    JSONObject volumeInfo = bookObject.getJSONObject("volumeInfo");

                    // Obtener el título del libro
                    titulo = volumeInfo.getString("title");

                    // Obtener los autores del libro
                    if (volumeInfo.has("authors")) {
                        JSONArray authorsArray = volumeInfo.getJSONArray("authors");
                        
                        for (int j = 0; j < 1; j++) {
                            String author = authorsArray.getString(j);
                            Autor au = new Autor(author);
                            autor =au;
                        }
                        
                    }
                    if (volumeInfo.has("description")) {
                        descripcion= volumeInfo.getString("description");
                    }

                    // Obtener los géneros del libro
                    if (volumeInfo.has("categories")) {
                        JSONArray categoriesArray = volumeInfo.getJSONArray("categories");
                        for (int j = 0; j < 1; j++) {
                            genero = categoriesArray.getString(j);
                        }
                       
                    }

                    // Obtener el número de páginas del libro
                    if (volumeInfo.has("pageCount")) {
                        paginas = volumeInfo.getInt("pageCount");
                       
                    }

                    // Obtener el precio del libro (si está disponible)
                    if (volumeInfo.has("saleInfo")) {
                        JSONObject saleInfo = volumeInfo.getJSONObject("saleInfo");
                        if (saleInfo.has("listPrice")) {
                            JSONObject listPrice = saleInfo.getJSONObject("listPrice");
                            double price = listPrice.getDouble("amount");
                            precio = Double.toString(price); 
                            
                        }
                    }

                    // Obtener la URL de la portada del libro
                    if (volumeInfo.has("imageLinks")) {
                        JSONObject imageLinks = volumeInfo.getJSONObject("imageLinks");
                        portada = imageLinks.getString("thumbnail");
                    }

                    // Obtener la calificación promedio del libro (si está disponible)
                    if (volumeInfo.has("averageRating")) {
                        double averageRating = volumeInfo.getDouble("averageRating");
                       cal = Double.toString(averageRating ); 
                    }

                    // Obtener el ISBN del libro
                    if (volumeInfo.has("industryIdentifiers")) {
                        JSONArray identifiersArray = volumeInfo.getJSONArray("industryIdentifiers");
                        for (int j = 0; j < identifiersArray.length(); j++) {
                            JSONObject identifierObject = identifiersArray.getJSONObject(j);
                            String type = identifierObject.getString("type");
                            ISBM = identifierObject.getString("identifier");
                           
                        }
                    }

                   
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Libro li = new Libro(ISBM, titulo, precio, portada, cal, descripcion, autor, paginas, genero);
        return li;
    }
}
