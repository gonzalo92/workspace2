package Ejercicios_Iniciales2;

import java.util.Scanner;

public class Ejercicio_Finanzas {

	public static void main(String[] args) {
		/*
		 * Realiza una clase Finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros y eurosToDolares. 
		 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener:
               *Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
               *Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.

		 */
		System.out.println("--Conversor de divisas--");
		System.out.print("Dame los dolares que quieres convertir ");
		Scanner sc = new Scanner(System.in);
		double euro= 1.36;
		double dol = sc.nextDouble();
		double conver= dol * euro;
		System.out.print( dol );
		System.out.print("La cantidad convertida es " + conver );

	}

}
