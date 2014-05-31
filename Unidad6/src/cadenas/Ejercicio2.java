package cadenas;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		String miArray[] = new String[1];
		String subArray[]=new String[5];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 1; i++) {		
		System.out.println("Ingresa una cadena " + (i + 1));		
		miArray[i] = entrada.nextLine();
		}
		for (int i = 0; i < 5; i++) {		
			System.out.println("Ingresa cinco subcadenas " + (i + 1));		
			subArray[i] = entrada.nextLine();
			}
		String sub = miArray[0];
		for (int i = 1; i < 5; i++){
		if (sub.compareTo(sub) == subArray[i].length()){
		sub = subArray[i]; 
		}
		    }
		System.out.println("\nLa cadena empieza por: " + sub + subArray);
	}
}