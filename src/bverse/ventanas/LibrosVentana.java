package bverse.ventanas;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import bverse.clases.madres.Publicacion;

public class LibrosVentana extends JFrame {

    private JPanel contentPane;

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

    public LibrosVentana() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Publicaciones");
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
        
        

        JMenu mnAñadir = new JMenu("Opciones");
        mnAñadir.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        menuBar.add(mnAñadir);

        JMenuItem mntmAñadirLibro = new JMenuItem("Añadir libro");
        mntmAñadirLibro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FormularioLibro v = new FormularioLibro();
                v.setVisible(true);
            }
        });
        mnAñadir.add(mntmAñadirLibro);
        
        JMenuItem mntmEliminarLibro = new JMenuItem("Eliminar libro");
        mntmEliminarLibro.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FormularioEliminarLibro v = new FormularioEliminarLibro();
                v.setVisible(true);
        	}
        });
        
        mnAñadir.add(mntmEliminarLibro);

        JMenu mnGeneros = new JMenu("Generos");
        mnGeneros.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        menuBar.add(mnGeneros);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel lblTitulo = new JLabel("Publicaciones");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Gujarati MT", Font.PLAIN, 27));
        contentPane.add(lblTitulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();
        contentPane.add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        ArrayList<Publicacion> pu = new ArrayList<>();

        try {
            pu = Publicacion.lecturaMostrado();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        for (Publicacion p : pu) {
        	JButton btnNombre = new JButton(p.getTitulo());
            

            ImageIcon imagen = null;
            try {
                URL urlImagen = new URL(p.getPortadaUrl());
                imagen = new ImageIcon(urlImagen);

                // Ajustar el tamaño de la imagen
                Image img = imagen.getImage();
                Image newImg = img.getScaledInstance(128, 204, java.awt.Image.SCALE_SMOOTH);
                imagen = new ImageIcon(newImg);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            JLabel lblFoto = new JLabel();
            lblFoto.setIcon(imagen);
            lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
            btnNombre.setHorizontalAlignment(SwingConstants.CENTER);
            JPanel panelPublicacion = new JPanel();
            panelPublicacion.setLayout(new BorderLayout());
            panelPublicacion.add(lblFoto, BorderLayout.CENTER);
            panelPublicacion.add(btnNombre, BorderLayout.SOUTH);

            panelCentral.add(panelPublicacion);
        }

        //pack();
    }
}
