package Gym_examen_pasado;

public class Actividad_reserva {
private String nom_atributo;
private double hora_actividad;
private String cod_monitor;
private int num_max;
private int num_par;
public Actividad_reserva(String nom_atributo, double hora_actividad, String cod_monitor, int num_max, int num_par) {
	super();
	this.nom_atributo = nom_atributo;
	this.hora_actividad = hora_actividad;
	this.cod_monitor = cod_monitor;
	this.num_max = num_max;
	this.num_par = this.calcularParticipantes();
}
private int calcularParticipantes() {
	// TODO Auto-generated method stub
	
	return 0;
}
public String getNom_atributo() {
	return nom_atributo;
}
public void setNom_atributo(String nom_atributo) {
	this.nom_atributo = nom_atributo;
}
public double getHora_actividad() {
	return hora_actividad;
}
public void setHora_actividad(double hora_actividad) {
	this.hora_actividad = hora_actividad;
}
public String getCod_monitor() {
	return cod_monitor;
}
public void setCod_monitor(String cod_monitor) {
	this.cod_monitor = cod_monitor;
}
public int getNum_max() {
	return num_max;
}
public void setNum_max(int num_max) {
	this.num_max = num_max;
}
public int getNum_par() {
	return num_par;
}
public void setNum_par(int num_par) {
	this.num_par = num_par;
}
@Override
public String toString() {
	return "Actividad_reserva [nom_atributo=" + nom_atributo + ", hora_actividad=" + hora_actividad + ", cod_monitor="
			+ cod_monitor + ", num_max=" + num_max + ", num_par=" + num_par + "]";
}

}
