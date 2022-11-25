package ejerciciosPropuestos;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	// Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

	public static void main(String[] args) {
		
		//Introducimos el valor por dialogo
		String a = JOptionPane.showInputDialog("Introduce un número");
		
		//Parseamos la cadena a double
		double a1 = Double.parseDouble(a);
		
		//Pasamos el número a carácter
		char caracter=(char)a1;
		
		System.out.println(caracter);
		

	}

}
