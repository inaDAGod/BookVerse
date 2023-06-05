package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

public class WishList extends Estante{
	
	private ArrayList<String> preferencias; //tapa dura etc, detalles para las personas que desean comprartte
	
	
	public WishList(String nombre, String descripccion, ArrayList<Publicacion> publicaciones,
			ArrayList<String> preferencias) {
		super(nombre, descripccion, publicaciones);
		this.preferencias = preferencias;
	}

	public WishList( String descripccion, ArrayList<Publicacion> publicaciones,ArrayList<String> preferencias) {
		super("Wish List", descripccion, publicaciones);
		this.preferencias = preferencias;
		// TODO Auto-generated constructor stub
	}
	
	public WishList( ArrayList<Publicacion> publicaciones,ArrayList<String> preferencias) {
		super("Wish List", "", publicaciones);
		this.preferencias = preferencias;
		// TODO Auto-generated constructor stub
	}
	
	public WishList( String descripccion) {
		super("Wish List", descripccion,  new ArrayList<>());
		this.preferencias = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public WishList() {
		super("Wish List", "",  new ArrayList<>());
		this.preferencias = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(ArrayList<String> preferencias) {
		this.preferencias = preferencias;
	}
	
	public void agregarLibro(Publicacion publi,String pre) { //añade libro con frase
		ArrayList <Publicacion> p= super.getPublicaciones();
		p.add(publi);
		this.preferencias.add(pre);
	}
	public void agregarLibro(Publicacion publi) { //añade libro sin frase
		ArrayList <Publicacion> p= super.getPublicaciones();
		p.add(publi);
		this.preferencias.add("");
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
		this.preferencias.remove(num);
	}
	
	public void vaciarEstante() {
		ArrayList <Publicacion> pub = new ArrayList<Publicacion>();
		ArrayList <String> f = new ArrayList<String>();
		super.setPublicaciones(pub);
		this.preferencias = f;
	}

	

	

}
