package FICHEROS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LEERNOTAS {


public static void main(String[] args) {
try {
Scanner entrada=new Scanner(new File("notas.txt"));
String cadena;
String[]linea;
double sumaNotas=0;
while(entrada.hasNext()) {
cadena=entrada.nextLine();
linea=cadena.split(";");
System.out.print(linea[0]);
sumaNotas=0;
for(int i=1; i sumaNotas+=Integer.parseInt(linea[i].trim());
System.out.println("-->"+(sumaNotas/(linea.length-1)));

}
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}