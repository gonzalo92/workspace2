package EjerciciosInicial;

import java.util.Scanner;

public class Ejercicio3_visualice {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame dos numeros ");
		System.out.println("Dame el primer numero: ");
		double numero1 = teclado.nextDouble();
		System.out.println("Dame el segundo numero: ");
		double numero2 = teclado.nextDouble();

		if (numero1 > numero2) {
			System.out.println("Este es el mayor" + numero1);
		}
		if (numero1 < numero2) {
			System.out.print("Este es el mayor" + numero2);
		}
		if (numero1 == numero2) {
			System.out.print("los dos son iguales:" + numero2);
		}

	}

}
