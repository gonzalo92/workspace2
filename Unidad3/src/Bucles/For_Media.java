package Bucles;

import java.util.Scanner;

public class For_Media {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.print("Dame tres numeros: ");
		int suma =0;
		for(int i = 0;i<=2 ;i++ ){
			suma += teclado.nextInt();
			System.out.println();
		}
		System.out.println("la media = "+ suma/3);

	}

}
