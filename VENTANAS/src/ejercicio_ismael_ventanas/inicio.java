package ejercicio_ismael_ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class inicio extends JFrame {

    private JPanel contentPane;
    private JTextField user;
    private JTextField password;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    inicio frame = new inicio();
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
    public inicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setForeground(Color.BLACK);
        lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblUsuario.setBounds(20, 72, 111, 28);
        contentPane.add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setForeground(Color.BLACK);
        lblContrasena.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblContrasena.setBounds(20, 124, 98, 28);
        contentPane.add(lblContrasena);

        user = new JTextField();
        user.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        user.setBounds(149, 66, 175, 41);
        contentPane.add(user);
        user.setColumns(10);

        password = new JTextField();
        password.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        password.setBounds(149, 118, 175, 41);
        contentPane.add(password);
        password.setColumns(10);

        JButton botonIngresar = new JButton("Acceder ");
        botonIngresar.setForeground(new Color(192, 192, 192));
        botonIngresar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        botonIngresar.setBackground(new Color(0, 0, 0));
        botonIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = user.getText();
                String contrasena = password.getText();
                
                // Verificar usuario y contraseña
                if (usuario.equalsIgnoreCase("admin") && contrasena.equalsIgnoreCase("admin")) {
                    // Abrir ventana2 si las credenciales son correctas
                    Ventana ventana = new Ventana();
                    ventana.setVisible(true);
                    dispose(); // Cerrar la ventana actual
                } else {JOptionPane.showMessageDialog(
                	    null,
                	    "Usuario o contraseña incorrectos",
                	    "Error",
                	    JOptionPane.ERROR_MESSAGE
                	);
   }
            }
        });
        botonIngresar.setBounds(149, 170, 175, 35);
        contentPane.add(botonIngresar);
    }
}

