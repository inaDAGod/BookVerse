package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

public class WishList extends Estante{

	public WishList( String descripccion, ArrayList<Publicacion> publicaciones) {
		super("Wish List", descripccion, publicaciones);
		// TODO Auto-generated constructor stub
	}
	
	public WishList( ArrayList<Publicacion> publicaciones) {
		super("Wish List", "", publicaciones);
		// TODO Auto-generated constructor stub
	}
	
	public WishList( String descripccion) {
		super("Wish List", descripccion, null);
		// TODO Auto-generated constructor stub
	}
	public WishList() {
		super("Wish List", "", null);
		// TODO Auto-generated constructor stub
	}

	

	

	

}
