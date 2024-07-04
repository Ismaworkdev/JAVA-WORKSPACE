package herencia_animales;

public class Conejo extends Animal {
private String tipOreja;

public Conejo(String nombre, String id, int edad, double peso, String raza, String tipOreja) {
	super(nombre, id, edad, peso, raza);
	this.tipOreja = tipOreja;
}

public Conejo() {
	super();
	this.tipOreja = "";
}

public String getTipOreja() {
	return tipOreja;
}

public void setTipOreja(String tipOreja) {
	this.tipOreja = tipOreja;
}

@Override
public String toString() {
	return "Conejo [tipOreja=" + tipOreja + "]";
}

public String emitesonido() {
	return " oinc oinc    ";
	
}
}
