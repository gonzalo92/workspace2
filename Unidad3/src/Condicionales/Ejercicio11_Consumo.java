package Condicionales;

import java.util.Scanner;

public class Ejercicio11_Consumo {

	public static void main(String[] args) {
		System.out.println("Introduce un a�o");
		Scanner teclado = new Scanner(System.in);
		int a�o = teclado.nextInt();
		
		if((a�o%4 == 0 && a�o%100 !=0) || a�o%400==0){
			System.out.printf("el a�o %d es bisiesto " , a�o);
		}else{
			System.out.printf("El a�o %d no es bisiseto:",a�o);
		}

	}

}
