package Metodos;

import java.util.Scanner;

public class Edad {
	public static int añosEntre(int dia, int mes, int año, int dia_final, int mes_final, int año_final){
		
		int dif_años;
		
		dif_años=año_final-año;
		if(mes_final>mes || (mes_final==mes && dia_final>=dia)){
		 dif_años++;	
		}
		return dif_años;
	}

	public static void main(String[] args) {
		
		
		System.out.println(añosEntre(1,1,2013,1,1,2014));
		System.out.println(añosEntre(11,1,2013,1,1,2014));
		System.out.println(añosEntre(10,1,2006,10,1,2014));
		System.out.println(añosEntre(1,7,2013,10,1,2014));
		System.out.println(añosEntre(5,12,1992,10,1,2014));
		

		Scanner teclado = new Scanner(System.in);
		while(true){
			System.out.print("FECHA DE NACIMIENTO");
			
		}

	}

}
