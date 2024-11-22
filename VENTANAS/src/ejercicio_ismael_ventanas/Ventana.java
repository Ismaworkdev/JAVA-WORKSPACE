package ejercicio_ismael_ventanas;

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
	
	//reservar memoria ..crear arrays de canciones y grupos 
	
	
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
				
				//ver los grupos sin mas 
				
			
				 Ventana v=new Ventana();
				textArea.setText("");
				Arraygrupos.clear(); //limpiar antes de nada 
				    try {
				        Scanner entrada = new Scanner(new File("grupos.csv"));
				        String cadena;
				        String linea[];
				        int contador=0;
				        cadena = entrada.nextLine();
				        while (entrada.hasNext() ) {
				            cadena = entrada.nextLine();
				            linea = cadena.split(";");
				           String titulo=" --- El Grupo con codigo  "+linea[0]+" se  llama "+linea[1]  +"\n";
				           v.getArraygrupos().add(new grupos(linea[0], linea[1], linea[2], linea[3]));
				               
				           if(contador==0) {
				        	   textArea.append(titulo); //repone texto cada vez que le del archivo 
							}else{
								textArea.append("\n"+titulo);
							}
							
							contador++;
				        }
				        entrada.close(); 
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
			    Ventana v1 = new Ventana();
			    canciones c = new canciones();
			    grupos g = new grupos();
			    
			    //dentro del if leo los csv de grupos y canciones para que canciones tiene que grupos basicamnente comparando lo que hay en el textfield con 
			    //las variables linea y linea1 y si no hay nada leer el fichero canciones csv sin mas 

			    textArea.setText("");
			    Arraygrupos.clear();

			    // Ver si hay algo en el text field 
			    String codigoIngresado = textField.getText().trim();
			    if (!codigoIngresado.isEmpty()) { // Si el campo de texto no está vacío comprueba el numero 
			    	try {
			    	    Scanner entrada1 = new Scanner(new File("canciones.csv"));
			    	    Scanner entrada = new Scanner(new File("grupos.csv"));
			    	    String cadena;
			    	    String linea[];
			    	    String cabecera = "";  //inicializar aqui porque dentro del while da error 
			    	    cadena = entrada.nextLine();
			    	    while (entrada.hasNext()) {
			    	        cadena = entrada.nextLine();
			    	        linea = cadena.split(";");
			    	        if (codigoIngresado.equalsIgnoreCase(linea[0])) {
			    	        	 cabecera = "El grupo llamado " + linea[1] + " tiene las siguientes canciones: "+"\n";  //solo nombre grupos 
			    	        	
			    	        	 
			    	        
							}
			    	       
			    	    }

			    	    String cadena1;
			    	    String linea1[];

			    	    int contador = 0;
			    	    cadena1 = entrada1.nextLine();
			    	    while (entrada1.hasNext()) {
			    	        cadena1 = entrada1.nextLine();
			    	        linea1 = cadena1.split(";");

			    	        if (codigoIngresado.equalsIgnoreCase(linea1[0])) {
			    	            String titulo = " --- La canción " + linea1[2] + " del Disco " + linea1[1] + " dura " + linea1[3] + " minutos "
			    	            		+"\n"	; //canciones 
			    	           
			    	            v1.getArraycanciones().add(new canciones(linea1[0], linea1[1], linea1[2], linea1[3]));
			    	            if (contador == 0) {
			    	                textArea.append(cabecera);
			    	            } else {
			    	                textArea.append("\n" + titulo);
			    	            }
			    	            contador++;
			    	        }
			    	    }

			    	    entrada1.close(); // cerrar el scanner
			    	} catch (FileNotFoundException r) {
			    	    r.printStackTrace();
			    	}

			    } else { // Si el campo de texto está vacío, mostrar todas las canciones
			        try {
			            Scanner entrada1 = new Scanner(new File("canciones.csv"));
			            String cadena1;
			            String linea1[];
			            int contador = 0;
			            cadena1 = entrada1.nextLine();
			            while (entrada1.hasNext()) {
			                cadena1 = entrada1.nextLine();
			                linea1 = cadena1.split(";");
			                String titulo = " --- La canción   " + linea1[2] + " del Disco " + linea1[1] + " dura " + linea1[3] + " minutos " +"\n";
			                v1.getArraycanciones().add(new canciones(linea1[0], linea1[1], linea1[2], linea1[3]));
			                if (contador == 0) {
			                    textArea.append(titulo);
			                } else {
			                    textArea.append("\n" + titulo);
			                }
			                contador++;
			            }
			            entrada1.close(); 
			        } catch (FileNotFoundException pp) {
			            pp.printStackTrace();
			        }
			    }
			}

		});
		btnNewButton_1.setBounds(10, 323, 167, 46);
		contentPane.add(btnNewButton_1);
		
	
		contentPane.add(textArea);
	}
}