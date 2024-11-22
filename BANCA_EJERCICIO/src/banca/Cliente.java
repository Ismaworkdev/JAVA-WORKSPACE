package banca;

import java.util.ArrayList;

public class Cliente  {
private String codigoCliente;
private String dni;
private String nombre;
private String apellidos;
ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();




public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
	super();
	this.codigoCliente = codigoCliente;
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.cuentas = cuentas;
}

public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
	super();
	this.codigoCliente = codigoCliente;
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	
}


public String getCodigoCliente() {
	return codigoCliente;
}
public void setCodigoCliente(String codigoCliente) {
	this.codigoCliente = codigoCliente;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public ArrayList<Cuenta> getCuentas() {
	return cuentas;
}
public void setCuentas(ArrayList<Cuenta> cuentas) {
	this.cuentas = cuentas;
}


@Override
public String toString() {
	return "Cliente [codigoCliente=" + codigoCliente + ", dni=" + dni + ", nombre=" + nombre + ", apellidos="
			+ apellidos + ", cuentas=" + cuentas + "]";
}

public void mostrarcuenta() {
    for (Cuenta cuenta : cuentas) {
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
    }
}

public double calcularcuenta() {
    double total = 0;
    for (Cuenta cuenta : cuentas) {
        total += cuenta.getSaldo();
    }
    return total;
}

public String getDireccion() {
	// TODO Auto-generated method stub
	return null;
}
}





