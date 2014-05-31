package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ejemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] numero;
		
		numero = new int[10];
		
		for(int i = 0 ; i < 10; i++)
		numero[i]=sc.nextInt();	
		
		System.out.print(Arrays.toString(numero));
		
		for(int i = 9;i>=0;i--)

		System.out.print(" " + numero [i]);
		
	}

}
