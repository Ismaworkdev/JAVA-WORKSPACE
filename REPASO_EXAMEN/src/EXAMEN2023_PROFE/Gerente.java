package EXAMEN2023_PROFE;

import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Gerente extends Persona implements Impuestos{
	private String telefono;

	public Gerente(String dNI, String nombre, String apellidos, String direccion, String correo, String telefono) {
		super(dNI, nombre, apellidos, direccion, correo);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Gerente [telefono=" + telefono + ", toString()=" + super.toString() + "]";
	}
	
	public String generaPass() {
		String[] abc = new String[52];

        // Llenar el array con las letras mayúsculas
        int index = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            abc[index] = String.valueOf(c);
            index++;
        }

        // Llenar el array con las letras minúsculas
        for (char c = 'a'; c <= 'z'; c++) {
            abc[index] = String.valueOf(c);
            index++;
        }

        // Imprimir el array
        for (String letra : abc) {
            System.out.println(letra);
        }
        System.out.println(abc.length);
        String pass=new String();
        int num=0;
        for(int i=0;i<8; i++) {
        	num=(int)(Math.random()*abc.length);
        	pass+=abc[num];
        }
       return pass;

	}
	
	
//	public void altaMonitor(Monitor m) throws SQLException {
//		//BD.getInstance().cargarParametrosConexion();
//	//	this.generaPass();
//		BD.getInstance().setUsuario("examenM");
//		BD.getInstance().setPassword("examenM");
//		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
////		
////		ResultSet rset=BD.getInstance().consultaBD("select * from monitor");
////		while(rset.next()) {
////			System.out.println(rset.getString(1));
////		}
//		//System.out.println("INSERT INTO MONITOR VALUES('"+m.getDNI()+"','"+m.getNombre()+"','"+m.getApellidos()+"','"+m.getDireccion()+"','"+m.getCorreo()+"','"+m.getCodigoMonitor()+"','"+this.generaPass()+"')");
//		BD.getInstance().consultaBD("DELETE MONITOR WHERE CODIGOMONITOR='105'");
//		//BD.getInstance().consultaBD("INSERT INTO MONITOR VALUES('"+m.getDNI()+"','"+m.getNombre()+"','"+m.getApellidos()+"','"+m.getDireccion()+"','"+m.getCorreo()+"','"+m.getCodigoMonitor()+"','"+this.generaPass()+"')");
//		BD.getInstance().cerrarConsulta();
//	}
	
	public void pagoMonitor(Monitor m, String mes, int year) throws FileNotFoundException {
		
		m.cargarClases(mes, year);
		m.calculaComplementoClases(mes);
		
		
		BD.getInstance().setUsuario("examenM");
		BD.getInstance().setPassword("examenM");
		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		
		double nomina=1200+m.getExtraAlumnos()+m.getExtraClase();
		double retencion=this.IRPF(nomina);
//		System.out.println(m.getExtraAlumnos());
//		System.out.println(m.getExtraClase());
//		System.out.println(retencion);
//		
//		System.out.println(nomina-retencion);
//		
//		
//		System.out.println("INSERT INTO PAGOS VALUES('"+m.getCodigoMonitor()+"','"+mes+"',"+year+","+(nomina-retencion)+",'PAGADO')");
//		
	   	try {
			BD.getInstance().consultaBD("INSERT INTO PAGOS VALUES('"+m.getCodigoMonitor()+"','"+mes+"',"+year+","+(nomina-retencion)+",'PAGADO')");
			System.out.println("Monitor "+m.getNombre()+" "+m.getApellidos()+" pagado "+(nomina-retencion)+"€ en "+mes);
			BD.getInstance().cerrarConsulta();
	   	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
//		
	
	
	}
	
	public void informeMonitores(int dia, String mes, int year) {
		//Busca el fichero asistenciaMesYear.csv
		
		//Dependiendo de los valores de dia y mes muestra 
		
		
	}
	public static void main(String[] args) throws SQLException, FileNotFoundException {
	//	Monitor m=new Monitor("232432", "Lucas", "Muñoz", "", "lucas@ribera", "105", "");
		Monitor m=new Monitor("", "Maria", "Perez", "", "", "100", "");
		Gerente g=new Gerente("", "", "", "", "", "");
		g.pagoMonitor(m, "Enero", 2023);
	}

	@Override
	public double IRPF(double sueldo) {
		
		return sueldo*0.24;
	}
}
