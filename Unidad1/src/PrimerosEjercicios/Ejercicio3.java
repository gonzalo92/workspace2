package PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	
	public static void main(String[] args) {
		// Escribir un programa que pregunte al usuario dos números y luego muestre la suma, el producto y la media de los dos números.
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
		
		float numero1;
		float numero2;
		float suma;
		float producto;
		float media;
		System.out.println("Escribe el primer numero:");
		numero1= teclado.nextFloat();
		System.out.println("Escribe el segundo numero:");
		numero2= teclado.nextFloat();
		suma= numero1 + numero2;
		System.out.println("La suma es:");
		System.out.println(suma);
		producto= numero1 * numero2;
		System.out.println("El producto es:");
		System.out.println(producto);
		media=(numero1 + numero2)/2;
		System.out.println("La media es:");
		System.out.println(media);
		
		

	}

}
