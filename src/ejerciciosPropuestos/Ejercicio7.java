package ejerciciosPropuestos;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
				//Introducimos el valor por dialogo
				String a = JOptionPane.showInputDialog("Introduce un carácter");
				
				//Creamos una variable char y la convertimos con el método charAt
				char caracter = a.charAt(0);
				
				//Pasamos el caracter a codico poniendo (int) delante
				int codigo = (int)caracter;
		

				System.out.println(codigo);

	}

}
