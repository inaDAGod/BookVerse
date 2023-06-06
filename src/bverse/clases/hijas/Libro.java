package bverse.clases.hijas;

import bverse.categorizaciones.*;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import bverse.baseDatos.*;

import bverse.clases.madres.*;

public class Libro extends Publicacion{
	private String calpromedio;
	private String descripcion;
	private Autor autor;
	private int paginas;
	private String genero;
	
	public Libro(String iSBM, String titulo, String precio, String portadaUrl, int estado, String calificacion,
			String resenia, String calpromedio, String descripcion, Autor autor, int paginas, String genero) {
		super(iSBM,titulo, precio, portadaUrl, estado, Tipo.libro, calificacion, resenia);
		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.autor = autor;
		this.paginas = paginas;
		this.genero = genero;
	}
	
	public Libro(String titulo) {
		super("",titulo, "", "", Estado.limbo, Tipo.libro, "", "");
		this.calpromedio = "";
		this.descripcion = "";
		this.autor = new Autor();
		this.paginas = 0;
		this.genero = "";
	}
	public Libro() {
		super("","", "", "", Estado.limbo, Tipo.libro, "", "");
		this.calpromedio = "";
		this.descripcion = "";
		this.autor = new Autor();
		this.paginas = 0;
		this.genero = "";
	}
	


	

	public Libro(String iSBM, String titulo, String precio, String portadaUrl, String calpromedio, String descripcion, Autor autor, int paginas,
			String genero) {
		super(iSBM, titulo, precio, portadaUrl, Estado.limbo, Tipo.libro, "", "");
		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.autor = autor;
		this.paginas = paginas;
		this.genero = genero;
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
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [calpromedio=" + calpromedio + ", descripcion=" + descripcion + ", autor=" + autor + ", paginas="
				+ paginas + ", genero=" + genero +"]";
	}
	
	public void insertar()throws SQLException{
		this.autor.insertar();
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionPostgres();
		PreparedStatement s;
		String query="insert into publicaciones"
				+ "(isbm, titulo, precio, portadaurl, calificacionpromedio, descripcion, escritor, ilustrador, editorial, paginas, idestado, idtipo_publicacion, genero, calificacion, resenia, frase, preferencia) values "
				+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			s.setString(1, super.getISBM());
			s.setString(2, super.getTitulo());
			s.setString(3, super.getPrecio());
			s.setString(4, super.getPortadaUrl());
			s.setString(5, this.calpromedio);
			s.setString(6, this.descripcion);
			s.setString(7, this.autor.getNombre());
			s.setString(8, "no");
			s.setString(9, "no");
			s.setInt(10, this.paginas);
			s.setInt(11, super.getEstado());
			s.setInt(12, Tipo.libro);
			s.setString(13, this.genero);
			s.setString(14, "");
			s.setString(15, "");
			s.setString(16, "");
			s.setString(17, "");
			s.executeUpdate();
			System.out.println("Datos ingresados correctamente");
			JOptionPane.showMessageDialog(null, "Se guardo correctamente el libro");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		conexion.close();
		System.out.println("Datos ingresados correctamente");
	}
	
	

	

}
