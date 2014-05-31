package EjerciciosInicial;

import java.util.Scanner;

public class Ejercicio4_Pequeño {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame 3 numeros");
		System.out.println("Dame el primero:");
		double numero1 = teclado.nextDouble();
		System.out.println("Dame el segundo:");
		double numero2 = teclado.nextDouble();
		System.out.println("Dame el tercero:");
		double numero3 = teclado.nextDouble();

		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.print("El pequeño es el 1: " + numero1);
		} else if (numero2 < numero3) {
			System.out.print("numero peqeño 2: " + numero2);

		} else {
			System.out.println("numero pequeño 3:1" + numero3);

		}

	}

}
