package ejercicios.ejercicio3;

import java.util.Scanner;


/*
 * Ejercicio 3.
    Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
    Calculen el per�metro y �rea de un c�rculo dado su radio.
    Calculen el volumen de una esfera dado su radio.
    Calculen el �rea de un rect�ngulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
    Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.

 * 
 */

public class Ejercicio3b {

	public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
        
        int radio; //declaraci�n de variable entera;
        final double PI = Math.PI; //declaraci�n y asignaci�n de valor de constante PI
        double perimetro,
                 area; //declaraci�n de variables reales;
                        
        System.out.print( "Introduzca el RADIO del c�rculo (n�mero entero positivo): ");        //petici�n de radio
        
        radio = teclado.nextInt(); //asignaci�n de lectura de teclado a radio
        
        teclado.close(); //cerramos introducci�n de datos por teclado
        
        perimetro = 2 * PI * radio; //asignamos resultado de la operaci�n a perimetro
        area = PI * Math.pow(radio, 2); //asignamos resultado de la operaci�n a area
        
        System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
        
        System.out.println( "Per�metro: " + perimetro ); //imprime perimetro
        System.out.println( "�rea: " + area ); //imprime area
	
	}

}
