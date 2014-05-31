package EjerciciosInicial;

import java.util.Scanner;

public class Ejercicio2_Par {

	public static void main(String[] args) {
		int par;
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.printf("El numero %d es par", numero);
		} else {
			System.out.println("El numero no es par");
		}

	}

}
