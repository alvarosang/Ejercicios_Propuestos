package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//double e;
		
		//Scanner sc;
		
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Introduce el valor del radio");
		
		Double e = Double.parseDouble(sc.nextLine());
		double PI = Math.PI;
		
		System.out.println("El area del círculo es "+ (PI *Math.pow(e, 2)));
		
		
		// En el ejemplo de abajo utiliza JOption pane para introducir el imput y despues lo pasa a double con el parseo
		
//		public static void main(String[] args) {
//			 
//	        String texto=JOptionPane.showInputDialog("Introduce un radio");
//	        //Pasamos el String a double
//	        double radio=Double.parseDouble(texto);
//	 
//	        //Formula area circulo, usamos algunos de los metodos de Math
//	        double area=Math.PI*Math.pow(radio, 2);
//	 
//	        System.out.println("El area del circulo es "+area);
//	    }
		

	}

}
