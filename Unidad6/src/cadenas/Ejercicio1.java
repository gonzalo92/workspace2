package cadenas;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		String miArray[] = new String[3];		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
		System.out.println("Ingrese el " + (i + 1) + "ª nombre: ");
		miArray[i] = entrada.nextLine();
		}
		String nombre = miArray[0];
		for (int i = 1; i < 3; i++) {
		if (nombre.length() < miArray[i].length()) {
		nombre = miArray[i];
		      }
		  }
		System.out.println("El nombre más largo es: " + nombre);
		}
	}
