package Metodos;

import java.util.Scanner;

public class Edad {
	public static int a�osEntre(int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final){
		
		int dif_a�os;
		
		dif_a�os=a�o_final-a�o;
		if(mes_final>mes || (mes_final==mes && dia_final>=dia)){
		 dif_a�os++;	
		}
		return dif_a�os;
	}

	public static void main(String[] args) {
		
		
		System.out.println(a�osEntre(1,1,2013,1,1,2014));
		System.out.println(a�osEntre(11,1,2013,1,1,2014));
		System.out.println(a�osEntre(10,1,2006,10,1,2014));
		System.out.println(a�osEntre(1,7,2013,10,1,2014));
		System.out.println(a�osEntre(5,12,1992,10,1,2014));
		

		Scanner teclado = new Scanner(System.in);
		while(true){
			System.out.print("FECHA DE NACIMIENTO");
			
		}

	}

}
