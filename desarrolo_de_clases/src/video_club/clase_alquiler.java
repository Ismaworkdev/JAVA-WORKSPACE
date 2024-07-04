package video_club;

public class clase_alquiler {
private String DVD ;
private int tiempo;

public clase_alquiler(String DVD, int tiempo) {
	super();
	DVD = DVD;
	this.tiempo = tiempo;
}

public clase_alquiler() {
	super();
	DVD = "";
	this.tiempo = 0;
}

public String getDVD() {
	return DVD;
}



public int getTiempo() {
	return tiempo;
}



}
