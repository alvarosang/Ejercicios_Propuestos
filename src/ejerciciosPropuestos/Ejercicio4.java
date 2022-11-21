package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//double e;
		
		//Scanner sc;
		
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Introduce el valor del radio");
		
		double e = Double.parseDouble(sc.nextLine());
		double PI = Math.PI;
		
		System.out.println("El area del círculo es "+ (PI *Math.pow(e, 2)));
		

	}

}
