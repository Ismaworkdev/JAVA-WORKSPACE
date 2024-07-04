package examen2023_;

public class Clase {
	private String dia;
	private String mes ;
	private String codigo_clase;
	private int hora;
	private String codigo_monitor;
	private int numero_participantes;
	
	
	public Clase(String dia, String mes, String codigo_clase, int hora, String codigo_monitor,
			int numero_participantes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.codigo_clase = codigo_clase;
		this.hora = hora;
		this.codigo_monitor = codigo_monitor;
		this.numero_participantes = numero_participantes;
	}
	
	

	public Clase() {
		super();
		this.dia = "";
		this.mes = "";
		this.codigo_clase = "";
		this.hora = 0;
		this.codigo_monitor = "";
		this.numero_participantes = 0;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getCodigo_clase() {
		return codigo_clase;
	}

	public void setCodigo_clase(String codigo_clase) {
		this.codigo_clase = codigo_clase;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getCodigo_monitor() {
		return codigo_monitor;
	}

	public void setCodigo_monitor(String codigo_monitor) {
		this.codigo_monitor = codigo_monitor;
	}

	public int getNumero_participantes() {
		return numero_participantes;
	}

	public void setNumero_participantes(int numero_participantes) {
		this.numero_participantes = numero_participantes;
	}

	@Override
	public String toString() {
		return "Clase [dia=" + dia + ", mes=" + mes + ", codigo_clase=" + codigo_clase + ", hora=" + hora
				+ ", codigo_monitor=" + codigo_monitor + ", numero_participantes=" + numero_participantes + "]";
	}
	
	
	

}
