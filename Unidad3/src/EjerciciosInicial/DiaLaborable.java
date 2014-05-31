package EjerciciosInicial;

import java.util.Scanner;

public class DiaLaborable {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//string dia;
		int numero_dia;
		
		System.out.println("Dame el dia de la semana (en numero): ");
		numero_dia= teclado.nextInt();
		switch ( numero_dia){
		case 1://lunes
		case 2://martes
		case 3:
		case 4:
		case 5:
			System.out.println("Dia laborable. ");
			break;
		case 6:
		case 7:
			System.out.println("Dia festivo");
			break;
			
		}
	}

}
