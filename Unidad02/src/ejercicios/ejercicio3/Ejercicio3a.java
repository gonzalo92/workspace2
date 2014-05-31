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

public class Ejercicio3a {

	public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducci�n de datos
        
        double base,
                altura,
                perimetro,
                area; //declaraci�n de variables enteras
        
        System.out.print( "-- C�culo de per�metro y �rea (en cm) --");
        System.out.print( "Introduzca la BASE del rect�ngulo (n�mero positivo): "); //petici�n de base
        
        base = teclado.nextDouble(); //asignaci�n de lectura de teclado a base
        
        System.out.print( "Introduzca la ALTURA del rect�ngulo (n�mero positivo): "); //petici�n de altura
        
        altura = teclado.nextDouble(); //asignaci�n de lectura de teclado a altura
        
        teclado.close(); //cerramos entradas por teclado.
        
        perimetro = 2 * base + 2 * altura; //asignaci�n del resultado de la operaci�n a per�metro
        area = base * altura; //asignamos el resultado de la operaci�n a area
        
        System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
        
        System.out.println( "Per�metro: " + perimetro + " cm"); //imprime perimetro
        System.out.println( "�rea: " + area + " cm2"); //imprime area
	
	}

}
