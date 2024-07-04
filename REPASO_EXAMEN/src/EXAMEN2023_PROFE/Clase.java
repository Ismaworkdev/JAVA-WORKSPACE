package EXAMEN2023_PROFE;

public class Clase {
	
	private int dia;
	private String mes;
	private int year;
	private String codigoClase;
	private int hora;
	private String codigoMonitor;
	private int nParticipantes;
	
		
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Clase(int dia, String mes, int year, String codigoCla, int hora, String codigoMonitor,
			int nParticipantes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.year = year;
		this.codigoClase = codigoCla;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nParticipantes = nParticipantes;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getCodigoClase() {
		return codigoClase;
	}
	public void setCodigoClase(String codigoAct) {
		this.codigoClase = codigoAct;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getCodigoMonitor() {
		return codigoMonitor;
	}
	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	public int getnParticipantes() {
		return nParticipantes;
	}
	public void setnParticipantes(int nParticipantes) {
		this.nParticipantes = nParticipantes;
	}
	@Override
	public String toString() {
		return "Clase [dia=" + dia + ", mes=" + mes + ", year=" + year + ", codigoClase=" + codigoClase + ", hora="
				+ hora + ", codigoMonitor=" + codigoMonitor + ", nParticipantes=" + nParticipantes + "]";
	}
	
	
	
	
	
	
}
