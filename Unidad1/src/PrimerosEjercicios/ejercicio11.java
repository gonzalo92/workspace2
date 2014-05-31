package PrimerosEjercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// Calculen el volumen de una esfera dado su radio.
		double volumen;
		@SuppressWarnings("unused")
		double area;
		double radio = 0;
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
		radio= teclado.nextDouble();
		volumen= 4/3 *Math.PI * radio;
		System.out.println("Dame el radio: ");
		System.out.println("el volumen es: "+volumen);
		
		

	}

}
