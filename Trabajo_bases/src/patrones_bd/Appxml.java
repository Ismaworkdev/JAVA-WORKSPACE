package patrones_bd;

public class Appxml {

	public static void main(String[] args) {
		// config lere la info de config 
		BD.getInstance().cargarparamerosconexionesxml("config.xml");

	}

}
