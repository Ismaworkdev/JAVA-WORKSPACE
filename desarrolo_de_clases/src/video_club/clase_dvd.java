package video_club;

public class clase_dvd {

	public static final int INFANTIL=2;
	public static final int NORMAL=0;
	public static final int NOVEDAD=1;
	private String titulo ;
	private int tipo;
	
	  public clase_dvd(String titulo, int tipo) {
	        this.titulo = titulo;
	        this.tipo = tipo;
	    }
	  public clase_dvd() {
	        this.titulo = "";
	        this.tipo = 0;
	    }
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	  
	  
}
