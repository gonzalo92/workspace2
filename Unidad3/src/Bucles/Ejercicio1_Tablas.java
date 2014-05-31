package Bucles;

import java.util.Scanner;

public class Ejercicio1_Tablas {

	public static void main(String[] args) {
		//Tablas de multiplicar
		Scanner teclado = new Scanner(System.in);
		System.out.print("Tabla del :");
		int numero = teclado.nextInt();
		int linea,multiplicacion;
		
		
	/*	System.out.println(numero + " x 1 = " +(numero*1));
		System.out.println(numero + " x 2 = " +(numero*2));
		System.out.println(numero + " x 3 = " +(numero*3));
		System.out.println(numero + " x 4 = " +(numero*4));
		System.out.println(numero + " x 5 = " +(numero*5));
		System.out.println(numero + " x 6 = " +(numero*6));
		System.out.println(numero + " x 7 = " +(numero*7));
		System.out.println(numero + " x 8 = " +(numero*8));
		System.out.println(numero + " x 9 = " +(numero*9));
		System.out.println(numero + " x 10 = " +(numero*10));
		*///sin bucle
		//con bucle
		linea=1;
		
	    while(linea<=10){
	    	System.out.println(numero + " x  " + linea + " = " + (numero*linea));
	    	linea++;
	       }
	    
	} 

}
