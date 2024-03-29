package bverse.ventanas;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bverse.BookSearch;
import bverse.categorizaciones.Estado;
import bverse.clases.hijas.Autor;
import bverse.clases.hijas.Biblioteca;
import bverse.clases.hijas.Favoritos;
import bverse.clases.hijas.Libro;
import bverse.clases.hijas.WishList;
import bverse.clases.madres.Estante;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FormularioActualiLibro extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtPrecio;
	private JTextField txtAutor;
	private JTextField txtGenero;
	private JTextField txtPaginas;
	private JTextField txtSearchTitle;
	private JTextField txtUrl;
	private JTextField txtISBM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioActualiLibro frame = new FormularioActualiLibro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioActualiLibro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Book Verse - Libro Form Actualizar Datos");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(100, 100, 1000, 600);
		
		JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnIr = new JMenu("Ir a");
        mnIr.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        menuBar.add(mnIr);
        
        JMenuItem mntmHome = new JMenuItem("Home");
        mntmHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Inicio i = new Inicio();
        		i.setVisible(true);
        	}
        });
        mntmHome.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        mnIr.add(mntmHome);
        JMenuItem mntmPubli = new JMenuItem("Publicacciones");
        mntmPubli.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LibrosVentana i = new LibrosVentana();
        		i.setVisible(true);
        	}
        });
        mntmPubli.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        mnIr.add(mntmPubli);
        //setBounds(100, 100, (int)screenSize.getWidth(), (int) screenSize.getHeight());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelFormulario = new JPanel();
		contentPane.add(panelFormulario, BorderLayout.CENTER);
		panelFormulario.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelIzquierda = new JPanel();
		panelFormulario.add(panelIzquierda);
		panelIzquierda.setLayout(null);
		
		JLabel lblTitulbus = new JLabel("Titulo a buscar:");
		lblTitulbus.setBounds(25, 29, 165, 16);
		panelIzquierda.add(lblTitulbus);
		
		txtSearchTitle = new JTextField();
		txtSearchTitle.setBounds(21, 65, 280, 34);
		panelIzquierda.add(txtSearchTitle);
		txtSearchTitle.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		JTextArea txtRecomendacion = new JTextArea();
		txtRecomendacion.setBackground(new Color(255, 245, 238));
		txtRecomendacion.setText("Es recomendable que pongas el titulo exacto,\nsi vien busca el que contenga lo que ingresas\nes muy sensible a mayusculas, etc.");
		txtRecomendacion.setEditable(false);
		txtRecomendacion.setBounds(29, 131, 416, 69);
		panelIzquierda.add(txtRecomendacion);
		btnBuscar.setBounds(328, 69, 117, 29);
		panelIzquierda.add(btnBuscar);
		
		JLabel lblImage = new JLabel("Portada Url del libro:");
		lblImage.setBounds(25, 235, 165, 16);
		panelIzquierda.add(lblImage);
		
		txtUrl = new JTextField();
		txtUrl.setBounds(25, 263, 420, 34);
		panelIzquierda.add(txtUrl);
		txtUrl.setColumns(10);
		
		JButton btnVistaPrevia = new JButton("Vista previa");
		
		btnVistaPrevia.setBounds(328, 230, 117, 29);
		panelIzquierda.add(btnVistaPrevia);
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setBackground(new Color(255, 240, 245));
		panelFormulario.add(panelDerecha);
		panelDerecha.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo del libro:");
		lblTitulo.setBounds(6, 42, 97, 16);
		panelDerecha.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(110, 27, 231, 37);
		panelDerecha.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion del libro:");
		lblDescripcion.setBounds(6, 97, 135, 16);
		panelDerecha.add(lblDescripcion);
		
		JTextArea txtarDescrip = new JTextArea();
		txtarDescrip.setBounds(16, 125, 460, 97);
		panelDerecha.add(txtarDescrip);
		
		JLabel lblPrecio = new JLabel("Precio del libro:");
		lblPrecio.setBounds(6, 246, 143, 16);
		panelDerecha.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(179, 237, 162, 34);
		panelDerecha.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblBs = new JLabel("Bs");
		lblBs.setBounds(347, 246, 61, 16);
		panelDerecha.add(lblBs);
		
		JLabel lblAutor = new JLabel("Nombre del autor/autora:");
		lblAutor.setBounds(6, 290, 231, 16);
		panelDerecha.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(179, 283, 162, 34);
		panelDerecha.add(txtAutor);
		
		JLabel lblGenero = new JLabel("Genero principal:");
		lblGenero.setBounds(6, 341, 161, 16);
		panelDerecha.add(lblGenero);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(130, 329, 130, 34);
		panelDerecha.add(txtGenero);
		
		JLabel lblPaginas = new JLabel("Num paginas:");
		lblPaginas.setBounds(285, 341, 113, 16);
		panelDerecha.add(lblPaginas);
		
		txtPaginas = new JTextField();
		txtPaginas.setColumns(10);
		txtPaginas.setBounds(373, 332, 103, 34);
		panelDerecha.add(txtPaginas);
		
		JLabel lblEstanteria = new JLabel("Selecciona una estanteria:");
		lblEstanteria.setBounds(6, 386, 231, 16);
		panelDerecha.add(lblEstanteria);
		
		JButton btnEliminar = new JButton("Actualizar");
		
		btnEliminar.setBackground(new Color(255, 204, 255));
		btnEliminar.setBounds(196, 448, 133, 50);
		panelDerecha.add(btnEliminar);
		
		JLabel lblISBM = new JLabel("ISBM");
		lblISBM.setBounds(403, 6, 61, 16);
		panelDerecha.add(lblISBM);
		
		txtISBM = new JTextField();
		txtISBM.setEditable(false);
		txtISBM.setBounds(359, 28, 130, 34);
		panelDerecha.add(txtISBM);
		txtISBM.setColumns(10);
		
		JComboBox comboBoxEstanterias = new JComboBox();
		comboBoxEstanterias.setModel(new DefaultComboBoxModel(new String[] {"Biblioteca", "Wish List", "Favoritos"}));
		comboBoxEstanterias.setBounds(196, 382, 133, 27);
		panelDerecha.add(comboBoxEstanterias);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Libro l = Libro.BuscarLibro(txtSearchTitle.getText());
					System.out.println(l.toString());
					
					txtTitulo.setText(l.getTitulo());
					txtarDescrip.setText(l.getDescripcion());
					txtAutor.setText(l.getAutor().getNombre());
					txtPrecio.setText(l.getPrecio());
					txtPaginas.setText(Integer.toString(l.getPaginas()));
					txtGenero.setText(l.getGenero());
					txtUrl.setText(l.getPortadaUrl());
					txtISBM.setText(l.getISBM());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		btnVistaPrevia.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        String urlImagen = txtUrl.getText();
		        ImageIcon imglibro = null;
		        try {
		            imglibro = new ImageIcon(new URL(urlImagen));
		        } catch (MalformedURLException ei) {
		            ei.printStackTrace();
		        }

		        if (imglibro != null) {
		            Image image = imglibro.getImage();
		            ImageIcon imgLib = new ImageIcon(image);
		            JLabel lblImgLib = new JLabel(imgLib);
		            lblImgLib.setBounds(6, 300, 255, 173);
		            panelIzquierda.add(lblImgLib);
		            
		            panelIzquierda.revalidate(); // Actualizar el panel
		            panelIzquierda.repaint();    // Repintar los componentes en el panel
		        }
		    }
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libro l = new Libro(txtISBM.getText(), txtTitulo.getText(), txtPrecio.getText(),txtUrl.getText(),
						"", txtarDescrip.getText(), new Autor(txtAutor.getText()), Integer.parseInt(txtPaginas.getText()), txtGenero.getText());
				
				try {
					Libro.actualizar(l);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(comboBoxEstanterias.getSelectedIndex()==0) {//biblioteca
					try {
						
						Estante.cambiarEstante(0, l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(comboBoxEstanterias.getSelectedIndex()==1) {//wishlist
					try {
						
						Estante.cambiarEstante(1, l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(comboBoxEstanterias.getSelectedIndex()==2) {//favoritos
					try {
						Estante.cambiarEstante(2, l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	        
		
	}
}
