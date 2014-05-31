package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo_frases {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime 5 frases: ");
		
		
		    Object frase;
		    frase = new String[5];
		
		    for(int i = 1 ; i <=5 ;i++){
			System.out.println(frase);
			frase = teclado.nextLine();
			System.out.print(Arrays.deepToString((Object[]) frase));
			
			
		}

	}

}
