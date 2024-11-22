package Examen2022_2ordinaria;

public class Pedido {
private int cod_pedido;
private String dni_cliente;
private double total;

public Pedido(int cod_pedido, String dni_cliente, double total) {
	super();
	this.cod_pedido = cod_pedido;
	this.dni_cliente = dni_cliente;
	this.total = total;
}

public Pedido() {
	super();
	this.cod_pedido = 0;
	this.dni_cliente = "";
	this.total = 0.0;
}

public int getCod_pedido() {
	return cod_pedido;
}

public void setCod_pedido(int cod_pedido) {
	this.cod_pedido = cod_pedido;
}

public String getDni_cliente() {
	return dni_cliente;
}

public void setDni_cliente(String dni_cliente) {
	this.dni_cliente = dni_cliente;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

@Override
public String toString() {
	return "Pedido [cod_pedido=" + cod_pedido + ", dni_cliente=" + dni_cliente + ", total=" + total + "]";
}


}
