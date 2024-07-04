package frame_ut9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class isma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JLabel lblNewLabel;
	private JButton salir;
	

	public JTextField getTexto1() {
		return texto1;
	}

	public void setTexto1(JTextField texto1) {
		this.texto1 = texto1;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					isma frame1 = new isma();
					frame1.setVisible(true);
					
					isma2.frame2=new isma2();
					isma2.frame2.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public isma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.setBounds(219, 37, 86, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JLabel etiqueta1 = new JLabel("Usuario : ");
		etiqueta1.setBounds(31, 40, 106, 14);
		contentPane.add(etiqueta1);
		
		JButton entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texto1.getText().equalsIgnoreCase("pepe") && texto1.getText().equals("1234")) {
					JOptionPane.showInputDialog( contentPane ,"lol" );
					
				}else {
					
				}
				
			
				}
		});
		entrar.setBounds(59, 164, 89, 23);
		contentPane.add(entrar);
		
		texto2 = new JTextField();
		texto2.setBounds(219, 89, 86, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		lblNewLabel = new JLabel("Contraseña : ");
		lblNewLabel.setBounds(31, 92, 77, 14);
		contentPane.add(lblNewLabel);
		
		salir = new JButton("salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		salir.setBounds(219, 164, 89, 23);
		contentPane.add(salir);
	}
}
