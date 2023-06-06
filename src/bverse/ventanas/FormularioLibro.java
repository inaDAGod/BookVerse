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

public class FormularioLibro extends JFrame {

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
					FormularioLibro frame = new FormularioLibro();
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
	public FormularioLibro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Book Verse - Libro Form");
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
		
		btnBuscar.setBounds(328, 69, 117, 29);
		panelIzquierda.add(btnBuscar);
		
		JTextArea txtRecomendacion = new JTextArea();
		txtRecomendacion.setBackground(new Color(255, 245, 238));
		txtRecomendacion.setText("Se usa un sistema de busqueda para que sea mas facil\nllenar los campos del libro\nEs mas que nada una guia que puedes editar\na gusto los campos.");
		txtRecomendacion.setEditable(false);
		txtRecomendacion.setBounds(29, 131, 416, 69);
		panelIzquierda.add(txtRecomendacion);
		
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
		
		JComboBox comboBoxEstanterias = new JComboBox();
		comboBoxEstanterias.setModel(new DefaultComboBoxModel(new String[] {"Biblioteca", "Wish List", "Favoritos"}));
		comboBoxEstanterias.setBounds(185, 382, 156, 27);
		panelDerecha.add(comboBoxEstanterias);
		
		JButton btnGuardar = new JButton("Guardar");
		
		btnGuardar.setBackground(new Color(255, 204, 255));
		btnGuardar.setBounds(196, 448, 133, 50);
		panelDerecha.add(btnGuardar);
		
		JLabel lblISBM = new JLabel("ISBM");
		lblISBM.setBounds(403, 6, 61, 16);
		panelDerecha.add(lblISBM);
		
		txtISBM = new JTextField();
		txtISBM.setBounds(359, 28, 130, 34);
		panelDerecha.add(txtISBM);
		txtISBM.setColumns(10);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libro l = BookSearch.buscar(txtSearchTitle.getText());
				txtTitulo.setText(l.getTitulo());
				txtarDescrip.setText(l.getDescripcion());
				txtAutor.setText(l.getAutor().getNombre());
				txtPrecio.setText(l.getPrecio());
				txtPaginas.setText(Integer.toString(l.getPaginas()));
				txtGenero.setText(l.getGenero());
				txtUrl.setText(l.getPortadaUrl());
				txtISBM.setText(l.getISBM());
			}
		});
		
		
		btnVistaPrevia.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Libro l = BookSearch.buscar(txtSearchTitle.getText());
		        String urlImagen = l.getPortadaUrl();
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
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libro librito = BookSearch.buscar(txtSearchTitle.getText());
				
				
				
				Libro l = new Libro(txtISBM.getText(), txtTitulo.getText(), txtPrecio.getText(),txtUrl.getText(), Estado.limbo, "",
						"", librito.getCalpromedio() , txtarDescrip.getText(), new Autor(txtAutor.getText()), Integer.parseInt(txtPaginas.getText()), txtGenero.getText());
				try {
					l.insertar();
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ocurrio un error");
				}
				
				if(comboBoxEstanterias.getSelectedIndex()==0) {//biblioteca
					try {
						Biblioteca.insertarLibro(l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(comboBoxEstanterias.getSelectedIndex()==1) {//wishlist
					try {
						WishList.insertarLibro(l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(comboBoxEstanterias.getSelectedIndex()==2) {//favoritos
					try {
						Favoritos.insertarLibro(l.getISBM());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	        
		
	}
}
