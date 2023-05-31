package bverse.clases.hijas;

import bverse.categorizaciones.*;
import bverse.clases.madres.*;

public class NovelaGrafica extends Publicacion{

	public NovelaGrafica(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio,
			String descripcion, Autor autor, int paginas, int estado, int genero, String calificacion,
			String resenia) {
		super(iSBM, titulo, precio, portadaUrl, calpromedio, descripcion, autor, paginas, estado, genero, Tipo.novela_grafica, calificacion,
				resenia);
		// TODO Auto-generated constructor stub
	}
	
	

}
