package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Crea una colecci�n con los primeros X n�meros de la serie de Fibonacci, donde X es un n�mero que pedir�s al usuario. 
	 * Despu�s pregunta n�meros y di si est� o no en la colecci�n. El programa terminar� cuando el usuario introduzca un 0. 
	 */
	public static void main(String[] args) {
		Collection <Integer> colec = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		//int vec =sc.nextInt(); 
		int num = 1, n2, cantidad;
		int n1= num-1;
		
		for (cantidad= 0;cantidad < 20; cantidad++){
			n2= num+1;System.out.println("\nNumero"+ cantidad + 1 + " : "+n2 );
			n1=num;num=n2;
		}
		//for(int i = 0;i < vec; i++){
		//}
	}
}