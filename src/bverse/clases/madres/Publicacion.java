package bverse.clases.madres;

import bverse.clases.hijas.*;

public class Publicacion {
	private String ISBM;
	private String titulo;
	private String precio;
	private String portadaUrl;
	private String calpromedio;
	private String descripcion;
	private Autor autor; //jala de la clase Autor
	private int paginas;
	private int estado;
	private int genero;
	private int tipo;
	private String calificacion;
	private String resenia;
	
	public Publicacion(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio,
			String descripcion, Autor autor, int paginas, int estado, int genero, int tipo, String calificacion,
			String resenia) {
		super();
		ISBM = iSBM;
		this.titulo = titulo;
		this.precio = precio;
		this.portadaUrl = portadaUrl;
		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.autor = autor;
		this.paginas = paginas;
		this.estado = estado;
		this.genero = genero;
		this.tipo = tipo;
		this.calificacion = calificacion;
		this.resenia = resenia;
	}

	public String getISBM() {
		return ISBM;
	}

	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPortadaUrl() {
		return portadaUrl;
	}

	public void setPortadaUrl(String portadaUrl) {
		this.portadaUrl = portadaUrl;
	}

	public String getCalpromedio() {
		return calpromedio;
	}

	public void setCalpromedio(String calpromedio) {
		this.calpromedio = calpromedio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}
	
	public void cambiarEstado() {
		
	}
	public void calificar() {
		
	}
	public void reseñar() {
		
	}
	static void añadir() {
		
	}
	public void cambiarEstante() {
		
	}
	
	
}
