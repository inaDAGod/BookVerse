package bverse.clases.hijas;

import bverse.categorizaciones.*;
import bverse.clases.madres.*;

public class Libro extends Publicacion{

	public Libro(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio, String descripcion,
			Autor autor, int paginas, int estado, int genero, String calificacion, String resenia) {
		super(iSBM, titulo, precio, portadaUrl, calpromedio, descripcion, autor, paginas, estado, genero, Tipo.libro, calificacion,
				resenia);
		// TODO Auto-generated constructor stub
	}

}
