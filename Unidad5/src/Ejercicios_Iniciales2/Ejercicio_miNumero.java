package Ejercicios_Iniciales2;

import java.util.Scanner;

public class Ejercicio_miNumero {

	public static void main(String[] args) {
		/*
		 *   Realiza una clase MiNumero que proporcione el doble, triple y cuádruple de un número
		 *   proporcionado en su constructor (realiza un método para doble, otro para triple y otro para cuádruple). 
		 *   En este caso haz que la clase tenga un método main y comprueba los distintos métodos, 
		 *   sin necesidad de crear un método de prueba.
		 */
		
		int dob = doble();
		int tri = triple();
		int cuad = cuadruple();
		
		System.out.println("El doble es :  " + dob);

	}
	
	public static int doble(){
		
		int num = 4;
		int dob = 0;
		
		dob = num * 2;
		return dob;
	}
	
	public static int triple(){
		int num = 0;
		int trip = 0;
		
		trip = num * 3;
		return trip;
		
	}
	public static int cuadruple(){
		int num = 0;
		int cuad = 0;
		
		cuad = num * 2;
		return cuad;
		
	}

}
