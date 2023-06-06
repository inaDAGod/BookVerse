package bverse.clases.hijas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import bverse.baseDatos.Conexion;
import bverse.clases.madres.*;

public class Favoritos extends Estante{
	
	private ArrayList <String> frases; //frases favoritas de cada libro
	
	

	public Favoritos(String nombre, String descripccion, ArrayList<Publicacion> publicaciones,
			ArrayList<String> frases) {
		super(nombre, descripccion, publicaciones);
		this.frases = frases;
	}
	public Favoritos(String descripccion, ArrayList<Publicacion> publicaciones,ArrayList<String> frases) {
		super("Favoritos", descripccion, publicaciones);
		this.frases = frases;
		// TODO Auto-generated constructor stub
	}
	public Favoritos( ArrayList<Publicacion> publicaciones,ArrayList<String> frases) {
		super("Favoritos", "", publicaciones);
		this.frases = frases;

		// TODO Auto-generated constructor stub
	}
	public Favoritos(String descripccion) {
		super("Favoritos", descripccion, new ArrayList<>());
		this.frases=new ArrayList<>();// TODO Auto-generated constructor stub
	}
	public Favoritos() {
		super("Favoritos", "", new ArrayList<>());
		this.frases=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> getFrases() {
		return frases;
	}
	public void setFrases(ArrayList<String> frases) {
		this.frases = frases;
	}
	
	public void agregarLibro(Publicacion publi,String frase) { //añade libro con frase
		ArrayList <Publicacion> p= super.getPublicaciones();
		p.add(publi);
		this.frases.add(frase);
	}
	public void agregarLibro(Publicacion publi) { //añade libro sin frase
		ArrayList <Publicacion> p= super.getPublicaciones();
		p.add(publi);
		this.frases.add("");
	}
	
	public void eliminarLibro(String titulo) {
		ArrayList <Publicacion> pub = new ArrayList<Publicacion>();
		int num=0;
		for(int i = 0; i<pub.size();i++) {
			if(pub.get(i).getTitulo() == titulo) {
				num = i;
				break;
			}
		}
		pub.remove(num);
		this.frases.remove(num);
	}
	
	public static void insertarLibro(String ISBM)throws SQLException{
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionPostgres();
		PreparedStatement s;
		String query="insert into estanteria_publicacion"
				+ "(idEstanteria, isbm) values "
				+ "(?,?)";
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			s.setInt(1, 2);
			s.setString(2, ISBM);
			s.executeUpdate();
			System.out.println("Datos ingresados correctamente");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		conexion.close();
		System.out.println("Datos ingresados correctamente");
	}
	
	public void vaciarEstante() {
		ArrayList <Publicacion> pub = new ArrayList<Publicacion>();
		ArrayList <String> f = new ArrayList<String>();
		super.setPublicaciones(pub);
		this.frases = f;
	}
	

	
	


}
