package Bucles;

import java.util.Scanner;

public class Ejercicio3_par {

	public static void main(String[] args) {
		// Escribir un programa que pida varios números hasta que el usuario inserte un número par.
		//Hay que ir mostrando cada uno de los números insertados (excepto el par).
		Scanner teclado =new Scanner(System.in);
		System.out.println("Dame unos numeros: ");
		int numero = teclado.nextInt();
		int par;
		
		do{
			
		if (!(numero % 2 == 0)) 
			System.out.print( numero);
		} while(numero % 2 == 0);
		{
			System.out.println();
		}
			
		
		
	}

}
