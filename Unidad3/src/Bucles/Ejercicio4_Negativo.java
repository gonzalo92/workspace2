package Bucles;

import java.util.Scanner;

public class Ejercicio4_Negativo {

	public static void main(String[] args) {
		//Escribir un programa que lea tantos n�meros como el usuario quiera (hasta que se inserte un n�mero negativo).
		//El primer n�mero hay que visualizarlo en la pantalla.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame los numeros: ");
		int numero= teclado.nextInt();
		do{
			System.out.println(numero);
			
		}while(numero >= 0);
	}

}
