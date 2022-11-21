package ejerciciosPropuestos;


//TODO por que el import de abajo no funciona
//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio3 {

//	public static void main(String[] args) {
//		
//		String nombre = "Alvaro" ;
//		
//
//		
//		System.out.println(" Bienvenido " + nombre);
//		
//
//	}
//	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre = sc.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		
		
	}
	
//	Otra forma de realizar el mismo programa 
	
	
//	
//	public class Ejercicio3 {
//	 
//	    public static void main(String[] args) {
//	 
//	                //Nos aparece un cuadro de dialogo
//	    	
//	        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
//	 
//	        System.out.println("Bienvenido "+nombre);
//	    }
//	}

}
