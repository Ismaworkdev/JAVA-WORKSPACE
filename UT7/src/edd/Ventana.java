package edd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.HeadlessException;

public class Ventana extends JFrame {

	private JPanel contentPane;
	static Ventana frame2;
	private JTextField textField;
	

	
	
	private ArrayList<grupos>Arraygrupos;
	private ArrayList<canciones>Arraycanciones;
	
	
	

	public Ventana(ArrayList<grupos> arraygrupos, ArrayList<canciones> arraycanciones) throws HeadlessException {
		super();
		Arraygrupos = arraygrupos;
		Arraycanciones = arraycanciones;
	}
	
	
	
	
	
	
	
	

	public ArrayList<grupos> getArraygrupos() {
		return Arraygrupos;
	}









	public void setArraygrupos(ArrayList<grupos> arraygrupos) {
		Arraygrupos = arraygrupos;
	}









	public ArrayList<canciones> getArraycanciones() {
		return Arraycanciones;
	}









	public void setArraycanciones(ArrayList<canciones> arraycanciones) {
		Arraycanciones = arraycanciones;
	}









	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new Ventana();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		Arraygrupos = new ArrayList<>();
		Arraycanciones =  new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Grupos y Canciones");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel.setBounds(112, 26, 348, 46);
		contentPane.add(lblNewLabel);
		
		
		//text area 
		
		TextArea textArea = new TextArea();
		textArea.setBounds(183, 98, 348, 271);
		
		JButton btnNewButton = new JButton("Mostrar Grupo ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    // Limpiar antes de nada 
			    textArea.setText("");
			    Arraygrupos.clear();
			    try {
			        Scanner entrada = new Scanner(new File("grupos.csv"));
			        String cadena;
			        String linea[];
			        StringBuilder canciones = new StringBuilder(); // Acumulador de canciones

			        cadena = entrada.nextLine(); // Omitir la primera línea (cabecera)
			        while (entrada.hasNext()) {
			            cadena = entrada.nextLine();
			            linea = cadena.split(";");
			            String titulo = "-- Grupo con codigo " + linea[0] + " se llama " + linea[1] + "\n";
			            canciones.append(titulo); 
			            Arraygrupos.add(new grupos(linea[0], linea[1], linea[2], linea[3]));
			        }
			        entrada.close();
			        
			       
			        textArea.setText(grupos.toString());
			    } catch (FileNotFoundException g) {
			        g.printStackTrace();
			    }
			}

			
			
			
			
			
		});
		btnNewButton.setBounds(10, 98, 167, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del grupo ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 172, 167, 32);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(10, 237, 167, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Ver Canciones ");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    textArea.setText(""); // Limpiar el área de texto
			    Arraygrupos.clear(); // Limpiar el array de grupos
			    Ventana v1 = new Ventana();
			    canciones c = new canciones();
			    grupos g = new grupos();

			    String codigoIngresado = textField.getText().trim(); // Obtener el código ingresado del textField

			    // Verificar si se ha ingresado un código
			    if (!codigoIngresado.isEmpty()) {
			        try {
			            // Leer el archivo de grupos
			            Scanner entrada = new Scanner(new File("grupos.csv"));
			            String cabecera = ""; // Inicializar la cadena de la cabecera
			            while (entrada.hasNext()) {
			                String[] linea = entrada.nextLine().split(";");
			                // Verificar si el código coincide con el de algún grupo
			                if (codigoIngresado.equalsIgnoreCase(linea[0])) {
			                    cabecera = "El grupo llamado " + linea[1] + " tiene las siguientes canciones: ";
			                    break; // Salir del bucle una vez que se encuentre el grupo
			                }
			            }
			            entrada.close(); // Cerrar el scanner del archivo de grupos

			            // Si se encontró la cabecera, buscar las canciones asociadas al grupo
			            if (!cabecera.isEmpty()) {
			                entrada = new Scanner(new File("canciones.csv"));
			                while (entrada.hasNext()) {
			                    String[] linea = entrada.nextLine().split(";");
			                    // Verificar si la canción pertenece al grupo
			                    if (codigoIngresado.equalsIgnoreCase(linea[0])) {
			                        String titulo = " --- La canción " + linea[2] + " del Disco " + linea[1] + " dura " + linea[3] + " minutos ";
			                        v1.getArraycanciones().add(new canciones(linea[0], linea[1], linea[2], linea[3]));
			                        textArea.append("\n" + titulo);
			                    }
			                }
			                entrada.close(); // Cerrar el scanner del archivo de canciones
			            
			            }
			        } catch (FileNotFoundException ex) {
			            ex.printStackTrace();
			        }
			    } else {
			        // Si no se ingresó ningún código, mostrar todas las canciones
			        try {
			            Scanner entrada = new Scanner(new File("canciones.csv"));
			            while (entrada.hasNext()) {
			                String[] linea = entrada.nextLine().split(";");
			                String titulo = " --- La canción " + linea[2] + " del Disco " + linea[1] + " dura " + linea[3] + " minutos ";
			                v1.getArraycanciones().add(new canciones(linea[0], linea[1], linea[2], linea[3]));
			                textArea.append("\n" + titulo);
			                textArea.setText(canciones.toString());
			            }
			            entrada.close(); // Cerrar el scanner del archivo de canciones
			        } catch (FileNotFoundException ex) {
			            ex.printStackTrace();
			        }
			    }
			}


		});
		btnNewButton_1.setBounds(10, 323, 167, 46);
		contentPane.add(btnNewButton_1);
		
	
		contentPane.add(textArea);
	}
}