package Metodos;

import java.util.Scanner;

 public class Ejercicio6_15

 {   
    
 public static void main(String args[])
 {          

 Scanner entrada = new Scanner(System.in);
 double cateto1;
 double cateto2;
 double hipotenusa;
 
 Ejercicio6_15 miObjeto = new Ejercicio6_15();



 System.out.println("Por favor introduzca el cateto 1: ");
 cateto1 = entrada.nextInt();

 System.out.println("Por favor introduzca el cateto 2: ");
 cateto2 = entrada.nextInt();

 hipotenusa = miObjeto.Hipotenusa( cateto1, cateto2 );

 System.out.printf("\nLa hipotenusa es: %f \n", hipotenusa );

 }       
 public double Hipotenusa( double a, double b)
 {    
 return Math.sqrt(a*a + b*b);
 }    

 }   