package PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// de bits a megabits
	 @SuppressWarnings("unused")
	double tamaño,velocidad,tiempo;
	 
	 @SuppressWarnings("resource")
	Scanner teclado= new Scanner(System.in);
	 
	 System.out.println("¿Cual es el tamaño del archivo?");
	 tamaño= teclado.nextDouble();
	 System.out.println("¿Cual es la velocidad de tu linea en (Mbps)?");
	 velocidad= teclado.nextDouble();
	 tamaño = tamaño * 1024 * 1024 * 8; // tamaño * Math.pow(2,20)*8;
	 velocidad= velocidad * 1000000;
	 
	 System.out.println("Datos: "+ tamaño +"bits");
	 System.out.println("\nVelocidad: " + velocidad+ "bps");
	 System.out.println("\nTiempo para transmitir: "+ tamaño/velocidad+ "s");
	 
	 
	 
	 
	 

	}

}
