package herencia;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Trabajador[]mistrabajadores=new Trabajador[3];
  
  mistrabajadores[0]=new Consultor("lucia", "isma", "23233", "dfd", 10, 110);
  mistrabajadores[1]=new Empleado("lucia", "isma", "23233", "dfd", 10);
  mistrabajadores[2]=new Trabajador("lucia", "isma", "23233", "dfd");
  
for (int i = 0; i < mistrabajadores.length; i++) {
	if(mistrabajadores[i] instanceof Consultor)
		System.out.println(mistrabajadores[i].getNombre()+"   es el consultor ");
	System.out.println(mistrabajadores[i].getNombre()+" "+mistrabajadores[i].calcularpaga());
	
}
	}}


