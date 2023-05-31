package bverse.clases.hijas;

import bverse.categorizaciones.Tipo;
import bverse.clases.madres.*;

public class Revista extends Publicacion{

	public Revista(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio, String descripcion,
			Autor autor, int paginas, int estado, int genero, String calificacion, String resenia) {
		super(iSBM, titulo, precio, portadaUrl, calpromedio, descripcion, autor, paginas, estado, genero, Tipo.revista, calificacion,
				resenia);
		// TODO Auto-generated constructor stub
	}
	

}
