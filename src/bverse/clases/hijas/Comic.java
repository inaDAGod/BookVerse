package bverse.clases.hijas;

import bverse.categorizaciones.Tipo;
import bverse.clases.madres.Publicacion;

public class Comic extends Publicacion{

	public Comic(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio, String descripcion,
			Autor autor, int paginas, int estado, int genero, String calificacion, String resenia) {
		super(iSBM, titulo, precio, portadaUrl, calpromedio, descripcion, autor, paginas, estado, genero, Tipo.comic, calificacion,
				resenia);
		// TODO Auto-generated constructor stub
	}

}
