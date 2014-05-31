package Anidados;

import java.util.Scanner;

public class Ejercicio1_Factorial {

	public static void main(String[] args) {
		/*Escribe un programa que pida un n�mero con el fin de calcular el factorial de dicho n�mero. 
		 * Hay que validar que el n�mero insertado sea positivo (incluido el 0).
		 *  Si no es as�, se volver� a pedir dicho n�mero. 
		 *  Posteriormente, el programa le preguntar� al usuario si quiere insertar otro n�mero,
		 *   con un mensaje como este: "�Quiere insetar otro n�mero [s/n]?". Debes validar tambi�n esta respuesta. 
		 */
		  Scanner leer = new Scanner(System.in); // Crear objeto de la clase Scanner para
          // poder leer los datos

System.out.print("Numero: ");
int numero = leer.nextInt(); // Leer dato
double factorial = 1; // declarar e inicializar factorial en 1

while(numero != 0)
{
factorial *= numero;
numero--;

}

System.out.print("Factorial: " + factorial); // Imprimir factorial
	}

}
