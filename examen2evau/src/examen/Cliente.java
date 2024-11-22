package examen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Cliente {
	 private String codcliente;
	 private String nombre;
	 private String apellidos;
	 private String correos;
	 private int edad;
	 private int nPuntos;
	 protected ArrayList<Cliente>cc;




	 
	 
	 
	public Cliente(String codcliente, String nombre, String apellidos, String correos, int edad, int nPuntos,
			ArrayList<Cliente> cc) {
		super();
		this.codcliente = codcliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correos = correos;
		this.edad = edad;
		this.nPuntos = nPuntos;
		this.cc = cc;
	}


	 
		public Cliente() {
			super();
			this.codcliente = "";
			this.nombre = "";
			this.apellidos = "";
			this.correos = "";
			this.edad = 0;
			this.nPuntos = 0;
			this.cc = new ArrayList<Cliente>();
		}


	public String getCodcliente() {
		return codcliente;
	}




	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getCorreos() {
		return correos;
	}




	public void setCorreos(String correos) {
		this.correos = correos;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public int getnPuntos() {
		return nPuntos;
	}




	public void setnPuntos(int nPuntos) {
		this.nPuntos = nPuntos;
	}




	public ArrayList<Cliente> getCc() {
		return cc;
	}




	public void setCc(ArrayList<Cliente> cc) {
		this.cc = cc;
	}




	@Override
	public String toString() {
		final int maxLen = 10;
		return "Cliente [codcliente=" + codcliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correos="
				+ correos + ", edad=" + edad + ", nPuntos=" + nPuntos + ", cc="
				+ (cc != null ? cc.subList(0, Math.min(cc.size(), maxLen)) : null) + "]";
	}



	public void interesesCliente(String filename) {
		ArrayList<Oferta> p=new ArrayList<Oferta>();
		try {
			Scanner entrada =new Scanner(new File("interses.csv"));
			String cadena="";
			String []linea;
			while (entrada.hasNext()) {
				cadena=entrada.nextLine();
				System.out.println(cadena);
				linea =cadena.split(";");
				if (linea[0].equalsIgnoreCase(this.codcliente)) {
					p.add(new Oferta(linea[1], linea[2], linea[3],linea[4],Integer.parseInt(linea[5]), Integer.parseInt(linea[6])
							));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
