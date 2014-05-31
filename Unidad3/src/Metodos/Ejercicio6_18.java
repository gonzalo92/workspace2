package Metodos;

import java.util.Scanner;

public class Ejercicio6_18

{       

public static void main( String args[])
{      

int lado;
Scanner entrada = new Scanner(System.in);
Ejercicio6_18 miObjeto = new Ejercicio6_18();

System.out.println("\nPor favor introduzca un entero: ");
lado = entrada.nextInt();

miObjeto.Cuadrado(lado);
  
}      
public void Cuadrado( int n)

{           
 
for ( int i = 1; i <= n; i++ )
{   
for ( int j = 1; j <= n; j++ )
System.out.print("*");
 System.out.println();
}
}           
}       