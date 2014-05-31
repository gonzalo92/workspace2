package EjerciciosParaPractica;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿De que tamaño quieres el arbol?");
		int tamaño = teclado.nextInt();
		

	
		for (int k = 0; k < tamaño -1; k++) {
		
			for (int i = 0; i < k + 2; i++) {
				System.out.print(' '); 
			}
			int i2=0;
			for (; i2 < tamaño; i2++) {
				System.out.print('O'); 
				System.out.print(' ');
			}
			
			System.out.print('\n');
			
		}
		

	}

}
