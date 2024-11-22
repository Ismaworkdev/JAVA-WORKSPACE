 package proveedor_piezas;
import java.util.ArrayList;
import java.io.*;
public class Programa {

private ArrayList<Pieza>piezas;
private ArrayList<Proveedor>prov;


public Programa() {

this.piezas = new ArrayList<Pieza>();
this.prov = new ArrayList<Proveedor>();
}

public ArrayList<Pieza> getPiezas() {
return piezas;
}


public void setPiezas(ArrayList<Pieza> piezas) {
this.piezas = piezas;
}


public ArrayList<Proveedor> getProv() {
return prov;
}


public void setProv(ArrayList<Proveedor> prov) {
this.prov = prov;
}


public void generarFichero(String filename) {
try {
PrintWriter salida= new PrintWriter(new File(filename));
for(Proveedor prov: this.getProv()) {
salida.println("El proveedor"+prov.getNombreProveedor()+ "de" +prov.getLocalidad()+ "suministra: ");

for(Pieza p : this.getPiezas()) {
if(prov.getCodProveedor()==p.getProveedor())
salida.println("\t" +p.getNombrePieza().substring(0,1).toUpperCase()+p.getNombrePieza().substring(1));
}


}

salida.flush();
salida.close();





} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
public static void main(String[] args) {
	Programa app=new Programa();
Utilidades u=new Utilidades();
app.setPiezas(u.leerPiezas("pie.csv"));
app.setProv(u.leerProveedor("pro.csv"));
app.generarFichero("provedoresPiezas.txt");
//for(Pieza p: app.getPiezas())
//System.out.println(p);

//for(Proveedor prov: app.getProv())
//System.out.println(prov);


}

}

