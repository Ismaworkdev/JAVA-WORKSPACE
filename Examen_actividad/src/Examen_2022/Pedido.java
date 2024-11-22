package Examen_2022;

public class Pedido {
private String cod_pedido;
private String dni_cliente_delpedido;
private int descuento_pedido;
private int turno_pedido;

public Pedido() {

	this.cod_pedido = "";
	this.dni_cliente_delpedido = "";
	this.descuento_pedido = 0;
	this.turno_pedido = 0;
}






public Pedido(String cod_pedido, String dni_cliente_delpedido, int descuento_pedido, int turno_pedido) {
	super();
	this.cod_pedido = cod_pedido;
	this.dni_cliente_delpedido = dni_cliente_delpedido;
	this.descuento_pedido = descuento_pedido;
	this.turno_pedido = turno_pedido;
}
public String getCod_pedido() {
	return cod_pedido;
}
public void setCod_pedido(String cod_pedido) {
	this.cod_pedido = cod_pedido;
}
public String getDni_cliente_delpedido() {
	return dni_cliente_delpedido;
}
public void setDni_cliente_delpedido(String dni_cliente_delpedido) {
	this.dni_cliente_delpedido = dni_cliente_delpedido;
}
public int getDescuento_pedido() {
	return descuento_pedido;
}
public void setDescuento_pedido(int descuento_pedido) {
	this.descuento_pedido = descuento_pedido;
}
public int getTurno_pedido() {
	return turno_pedido;
}
public void setTurno_pedido(int turno_pedido) {
	this.turno_pedido = turno_pedido;
}




@Override
public String toString() {
	return "Pedido [cod_pedido=" + cod_pedido + ", dni_cliente_delpedido=" + dni_cliente_delpedido
			+ ", descuento_pedido=" + descuento_pedido + ", turno_pedido=" + turno_pedido + "]";
}



}
