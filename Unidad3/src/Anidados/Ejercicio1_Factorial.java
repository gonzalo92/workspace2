package Anidados;

import java.util.Scanner;

public class Ejercicio1_Factorial {

	public static void main(String[] args) {
		/*Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
		 * Hay que validar que el número insertado sea positivo (incluido el 0).
		 *  Si no es así, se volverá a pedir dicho número. 
		 *  Posteriormente, el programa le preguntará al usuario si quiere insertar otro número,
		 *   con un mensaje como este: "¿Quiere insetar otro número [s/n]?". Debes validar también esta respuesta. 
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
