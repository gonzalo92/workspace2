package EjerciciosParaPractica;

import java.util.Scanner;

public class Ejercicio3_Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		String triangulo = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un n�mero: ");
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			triangulo = triangulo + "*";
			System.out.println(triangulo);
		}
		/*
		 * int tri=4; for(int i = 0; i < tri; i++){ for(int j = i+tri; j <
		 * tri;j++){
		 * }System.out.print("*"); }int i= 4; for(int k = 0; k < i;k++){
		 * System.out.print("*"); } System.out.println();
		 */
		// triangulo segundo
		int tama�o = 4;
		for (int i = 1; i <= tama�o; i++) {
			int i2;
			for (i2 = 0; i2 < tama�o - i; i2++) {
				System.out.print(' '); // imprime los espacios
			}
			for (; i2 < tama�o; i2++) {
				System.out.print('*'); // imprime los asteriscos
			}
			System.out.print('\n'); // cambio de linea
		}
		// piramide
		int tama�o1 = 4;
		for (int i = 0; i <= tama�o1; i++) {
			int i2;
			for (i2 = 0; i2 < tama�o1 - i; i2++) {
				System.out.print(' '); 
			}
			for (; i2 < tama�o1; i2++) {
				System.out.print('@'); 
				
			}
			System.out.print('\n');
			
		}
	}

}
