package Metodos;

import java.util.Scanner;

public class Ejercicio6_19

{       

public static void main( String args[])

{      

int lado;
String caracter;

Scanner entrada = new Scanner(System.in);
Ejercicio6_19 miObjeto = new Ejercicio6_19();


System.out.println("\nPor favor introduzca un caracter: ");
caracter = entrada.nextLine();

System.out.println("\nPor favor introduzca un entero: ");
lado = entrada.nextInt();

miObjeto.Cuadrado(lado, caracter);

}  
public void Cuadrado( int n, String c)

{           

for ( int i = 1; i <= n; i++ )
{   
for ( int j = 1; j <= n; j++ )
System.out.printf("%s ", c);

System.out.println();
}   

}         

}       