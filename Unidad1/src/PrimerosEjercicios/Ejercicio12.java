package PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// de bits a megabits
	 @SuppressWarnings("unused")
	double tama�o,velocidad,tiempo;
	 
	 @SuppressWarnings("resource")
	Scanner teclado= new Scanner(System.in);
	 
	 System.out.println("�Cual es el tama�o del archivo?");
	 tama�o= teclado.nextDouble();
	 System.out.println("�Cual es la velocidad de tu linea en (Mbps)?");
	 velocidad= teclado.nextDouble();
	 tama�o = tama�o * 1024 * 1024 * 8; // tama�o * Math.pow(2,20)*8;
	 velocidad= velocidad * 1000000;
	 
	 System.out.println("Datos: "+ tama�o +"bits");
	 System.out.println("\nVelocidad: " + velocidad+ "bps");
	 System.out.println("\nTiempo para transmitir: "+ tama�o/velocidad+ "s");
	 
	 
	 
	 
	 

	}

}
