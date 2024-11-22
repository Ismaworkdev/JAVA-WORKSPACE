package banca;

public class Cuenta {

private String IBAN;

private String CuentaNomina;

private String codigoTitular;

private String codigoAutorizado;

private double saldo;



//Constructor por defecto

public Cuenta() {

	super();

	IBAN = " ";

	CuentaNomina = " ";

	this.codigoTitular = " ";

	this.codigoAutorizado =" ";

	this.saldo = 0;

}



//Constructor con Fields

public Cuenta(String iBAN, String cuentaNomina, String codigoTitular, String codigoAutorizado, double saldo) {

	super();

	IBAN = iBAN;

	CuentaNomina = cuentaNomina;

	this.codigoTitular = codigoTitular;

	this.codigoAutorizado = codigoAutorizado;

	this.saldo = saldo;

}

//Getter y Setter

public String getIBAN() {

	return IBAN;

}

public void setIBAN(String iBAN) {

	IBAN = iBAN;

}

public String getCuentaNomina() {

	return CuentaNomina;

}

public void setCuentaNomina(String cuentaNomina) {

	CuentaNomina = cuentaNomina;

}

public String getCodigoTitular() {

	return codigoTitular;

}

public void setCodigoTitular(String codigoTitular) {

	this.codigoTitular = codigoTitular;

}

public String getCodigoAutorizado() {

	return codigoAutorizado;

}

public void setCodigoAutorizado(String codigoAutorizado) {

	this.codigoAutorizado = codigoAutorizado;

}

public double getSaldo() {

	return saldo;

}

public void setSaldo(double saldo) {

	this.saldo = saldo;

}



// double retirarSaldo(double cantidad): Si la cantidad es mayor que el saldo no se podrá

//retirar nada. Utiliza los setters y los getters para actualizar el valor del saldo

public double retirarSaldo(double retirar) {



	if (retirar > this.saldo) {



		System.out.println("No se puede extraer mas dinero del que tienes");

 // devuelve 0 como si fuera un error

		return 0; 



	} else 

		this.saldo= this.saldo-retirar;

         double retirado = this.saldo;

          return retirado;



}





//void ingresar(double cantidad). Utiliza los setters y los getters para actualizar el valor del saldo

public void ingresar(double ingresar) {



	this.saldo = this.saldo + ingresar;



}







//ToString

@Override

public String toString() {

	return "Cuenta [IBAN=" + IBAN + ", CuentaNomina=" + CuentaNomina + ", codigoTitular=" + codigoTitular

			+ ", codigoAutorizado=" + codigoAutorizado + ", saldo=" + saldo + "]";

}


}