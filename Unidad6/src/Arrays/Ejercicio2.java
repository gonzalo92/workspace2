package Arrays;
import java.util.Scanner;
// Crea un programa que almacene los meses del año (los nombres de cada mes).
//Se pedirá al usuario el número de mes y se visualizará su nombre.
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dime un umero del 1-12: ");
		int[] n1 =  {0,1,2,3,4,5,6,7,8,9,10,11};
		String [] l= {new String("Enero"),new String("Febrero"),new String("Marzo"),new String("Abríl"),new String("Mayo"),
				new String("Junio"),new String("Julio"),new String("Agosto"),new String("Septiembre"),new String("Octubre"),
				new String("Noviembre"),new String("Diciembre"),};
		for(int i = 0 ; i < 11; i++){
			n1[i]=sc.nextInt();	
		    switch (i) {
		    case 0:
				System.out.print("");
				break;
			case 1:
				System.out.print("Enero");
				break;
			case 2:
				System.out.print("Febrero");
				break;
			case 3:
				System.out.print("Marzo");
				break;
			case 4:
				System.out.print("Abril");
				break;
			case 5:
				System.out.print("Mayo");
				break;
			case 6:
				System.out.print("Junio");
				break;
			case 7:
				System.out.print("Julio");
				break;
			case 8:
				System.out.print("Agosto");
				break;
			case 9:
				System.out.print("Septiembre");
				break;
			case 10:
				System.out.print("Octubre");
				break;
			case 11:
				System.out.print("Noviembre");
				break;
			case 12:
				System.out.print("Diciembre");
				break;
			}
		}
		System.out.print(n1);

	}

}
