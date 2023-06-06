package bverse.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrosVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrosVentana frame = new LibrosVentana();
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
	public LibrosVentana() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAñadir = new JMenu("Añadir");
		mnAñadir.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
		menuBar.add(mnAñadir);
		
		JMenuItem mntmAñadirLibro = new JMenuItem("Añadir libro");
		mntmAñadirLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormularioLibro v= new FormularioLibro();
				v.setVisible(true);
			}
		});
		mnAñadir.add(mntmAñadirLibro);
		
		JMenu mnGeneros = new JMenu("Generos");
		mnGeneros.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
		menuBar.add(mnGeneros);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Libros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Gujarati MT", Font.PLAIN, 27));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
