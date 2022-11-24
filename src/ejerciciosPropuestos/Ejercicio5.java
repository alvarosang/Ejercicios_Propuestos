package ejerciciosPropuestos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Introduce un número, con un 0 se acaba el programa:");
		
		//double a ;
		
		String a =JOptionPane.showInputDialog("Introduce un numero");
		
		double a1 = Double.parseDouble(a);
		
		do {
			
			 //System.out.println("Introduce un número, con un 0 se acaba el programa:");
			 //a = Double.parseDouble(sc.nextLine());
	
			 if(a1%2 == 0) {
				
				System.out.println("El número " + a1 + " es divisible por 2");
				break;
				
			}  else if(a1%2 != 0)  {
				
				System.out.println("El número " + a1 + "no es divisible por 2");
				break;
				
			} else { //Esto se pondria al principio
				
				System.out.println("El programa se finaliza");
				break;
			}
			
		
		} while (a1!=0);
		

	}

}
