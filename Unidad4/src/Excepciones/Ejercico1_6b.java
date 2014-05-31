package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercico1_6b {
	/*
	 * Haciendo uso de un metodo que pida un numero entero, hacer un programa
	 * que pida numeros enteros y visualice el resultado de sumar dichos numero.
	 * Se pediras numeros hasta que se inserte una letra o se inserten seis
	 * numeros.
	 */

	static Scanner teclado;

	public static int pideNumero() throws InputMismatchException {

		int resultado;
		
		resultado= teclado.nextInt();
				
		return resultado;
	}

	public static void main(String[] args) {
		int n2;
		int acumulador;
		
		teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero para sumarlo: ");
		acumulador = 0;

		boolean continuarCiclo = true;
		int intentos = 0;
		do {
			
			try {
				System.out.println("Introduzca otro número entero: (numeros a introducir restantes = " + (6-intentos) + ")" );
				n2 = pideNumero();
				acumulador+=n2;
				intentos++;
				continuarCiclo=true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Se ha insertado una letra en lugar de un numero entero.");
				continuarCiclo=false;
			}

		} while (continuarCiclo == true && intentos != 6);
		
		System.out.printf("Se han introducido %d numeros que suman: %d\n",intentos,acumulador);
		System.out.println("--FIN DEL PROGRAMA--");

		teclado.close();
	}
}
