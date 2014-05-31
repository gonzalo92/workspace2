package Condicionales;

import java.util.Scanner;

public class Ejercicio11_Consumo {

	public static void main(String[] args) {
		System.out.println("Introduce un año");
		Scanner teclado = new Scanner(System.in);
		int año = teclado.nextInt();
		
		if((año%4 == 0 && año%100 !=0) || año%400==0){
			System.out.printf("el año %d es bisiesto " , año);
		}else{
			System.out.printf("El año %d no es bisiseto:",año);
		}

	}

}
