package Condicionales;

import java.util.Scanner;

public class Ejercicio10_Descuento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir el importe del descuento");

		double precio = teclado.nextDouble();
		double descuento;

		if (precio <= 20) {
			descuento = 0.1;
		} else if (precio > 20 && precio <= 50) {
			descuento = 0.2;
		} else {
			descuento = 0.25;
		}
		System.out.print("El precio del producto rebajado es de "
				+ (precio - precio * descuento) + "€ (" + descuento * 100
				+ "% de descuento)");

		teclado.close();
	}

}
