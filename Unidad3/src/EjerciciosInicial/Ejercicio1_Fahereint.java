package EjerciciosInicial;

import java.util.Scanner;

public class Ejercicio1_Fahereint {

	public static void main(String[] args) {
		// Leer la temperatua en Fahrenheit
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime la temperatura en  Fahrenheit: ");
		double temperatura = teclado.nextDouble();
		// pasra a �c
		temperatura = (temperatura - 32) / 1.8;

		// si temperatura menor que 0

		if (temperatura <= 0) {
			System.out.println("Temperatura: " + temperatura + "�C");
			System.out.println("Estado de congelaci�n.");
		} else {
			System.out.println("No hay riesgo de congelaci�n: ");
		}

	}

}
