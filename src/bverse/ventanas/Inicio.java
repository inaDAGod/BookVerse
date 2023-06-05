package bverse.ventanas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Inicio extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inicio frame = new Inicio();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Inicio() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //setBounds(100, 100, (int)screenSize.getWidth(), (int) screenSize.getHeight());
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnAra = new JMenu("Acceso Rapido");
        mnAra.setBackground(new Color(0, 139, 139));
        mnAra.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        menuBar.add(mnAra);
        
        JMenuItem mntmDeseados = new JMenuItem("Deseados");
        mntmDeseados.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        mnAra.add(mntmDeseados);
        
        JMenuItem mntmFavoritos = new JMenuItem("Favoritos");
        mntmFavoritos.setFont(new Font("Gujarati MT", Font.PLAIN, 14));
        mnAra.add(mntmFavoritos);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(245, 255, 250));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel lblTitulo = new JLabel("Book Verse");
        lblTitulo.setFont(new Font("Gujarati MT", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panelLibros = new JPanel();
        panelLibros.setBackground(new Color(248, 248, 255));
        panel.add(panelLibros);

        JPanel panelEstantes = new JPanel();
        panelEstantes.setBackground(new Color(248, 248, 255));
        panel.add(panelEstantes);

        ImageIcon imglibro = new ImageIcon(Inicio.class.getResource("/bverse/resources/libro.jpeg"));
        
        Image image = imglibro.getImage().getScaledInstance(255, 173, Image.SCALE_SMOOTH);
        ImageIcon imgLib = new ImageIcon(image);
        panelLibros.setLayout(null);
        JLabel lblImgLib = new JLabel(imgLib);
        lblImgLib.setBounds(19, 52, 255, 173);
        panelLibros.add(lblImgLib);
        
        JButton btnLibros = new JButton("Libros");
        btnLibros.setFont(new Font("Gujarati MT", Font.BOLD, 17));
        btnLibros.setBounds(87, 237, 120, 48);
        panelLibros.add(btnLibros);
        
        ImageIcon imgEst = new ImageIcon(Inicio.class.getResource("/bverse/resources/estan.jpeg"));
        
        Image image2 = imgEst.getImage().getScaledInstance(255, 173, Image.SCALE_SMOOTH);
        ImageIcon imgEs = new ImageIcon(image2);
        panelLibros.setLayout(null);
        JLabel lblImgEst = new JLabel(imgEs);
        lblImgEst.setBounds(21, 53, 255, 173);
        panelEstantes.setLayout(null);
        panelEstantes.add(lblImgEst);
        
        JButton btnEstantes = new JButton("Estantes");
        btnEstantes.setFont(new Font("Gujarati MT", Font.BOLD, 17));
        btnEstantes.setBounds(87, 237, 120, 48);
        panelEstantes.add(btnEstantes);
    }
}
