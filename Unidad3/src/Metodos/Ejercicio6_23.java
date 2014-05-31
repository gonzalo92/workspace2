package Metodos;

import java.util.Scanner;

public class Ejercicio6_23

{     

 public static void main(String args[])

 {         

 Scanner entrada = new Scanner(System.in);
 double a;
 double b;
 double c;
 double minimo;
 Ejercicio6_23 miObjeto = new Ejercicio6_23();


 

 System.out.print("\nIntroduzca tres numeros de punto flotante: \n");
 a = entrada.nextDouble();
 b = entrada.nextDouble();
 c = entrada.nextDouble();

 System.out.printf("\nEl menor de los numeros es: %.2f\n", miObjeto.Minimo(a,b,c)); 
 }  
 public double Minimo( double x, double y, double z )
 
 {      

 return Math.min( x, Math.min( y, z ) );

 }      
}        