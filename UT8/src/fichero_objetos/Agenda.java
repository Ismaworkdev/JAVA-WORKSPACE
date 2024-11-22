package fichero_objetos;

import java.awt.Menu;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
private ArrayList<Contacto>agenda;
public Agenda() {
	this.agenda=new ArrayList<Contacto>();
}
public ArrayList<Contacto> getAgenda() {
	return agenda;
}
public void setAgenda(ArrayList<Contacto> agenda) {
	this.agenda = agenda;
}

public void listarAgenda() {
	for (Contacto cc : agenda) {
		System.out.println(cc.getNombre()+" "+cc.getTel());
	}
}

public void eliminarContacto(String nombre) {
	for (int i = 0; i < this.getAgenda().size(); i++) {
		if (this.getAgenda().get(i).getNombre().equalsIgnoreCase(nombre)) {
			this.getAgenda().remove(i);
		}
	}
}

public void addContacto(Contacto c) {
	this.getAgenda().add(c);
}
public void cargarAgenda(String filename) throws IOException {
	FileInputStream fi;
    ObjectInputStream entrada = null;
    try {
        fi = new FileInputStream(filename);
        entrada = new ObjectInputStream(fi);
        Contacto c;
        while ((c = (Contacto) entrada.readObject()) != null) {
            this.getAgenda().add(c);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (EOFException e) {
        // EOFException is expected when end of the file is reached
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        if (entrada != null) {
            entrada.close();
        }
    }
}

public void guardarAgenda(String filename) throws IOException {
	
	try {
		FileOutputStream fo=new  FileOutputStream(filename);
		
		ObjectOutputStream salida=new ObjectOutputStream(fo);
		for (Contacto co : agenda) {
			salida.writeObject(co);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}

public static void main(String[] args) throws IOException {
	Agenda aa=new Agenda();
	aa.addContacto(new Contacto("mimo", "546742372", "@isma", "carpio"));
	aa.addContacto(new Contacto("mim", "546742372", "@morta", "toledo"));
	aa.addContacto(new Contacto("mimuiio", "548990042372", "@mott", "toledo"));
	
	aa.listarAgenda();
	aa.eliminarContacto("mim");
	System.out.println();
	aa.listarAgenda();
	aa.guardarAgenda("agenda.bin");
	
	
}
}
