package Metodos;


import java.util.Scanner;

public class Ejercicio6_14

{      
public static void main(String args[])
{  
int base;
int exponente;
int potencia;
Scanner entrada = new Scanner(System.in);

Ejercicio6_14  miObjeto = new Ejercicio6_14();


base = entrada.nextInt();

System.out.print("\nPor favor introduzca el exponente entero: ");
exponente = entrada.nextInt();

potencia = miObjeto.Potencia( base, exponente);

System.out.printf("\nEl numero %d elevado a %d es: %d\n", base, exponente, potencia);
}  
public int Potencia( int x, int y )
{       
 
int potencia = 1;

for ( int i = 1; i <= y; i++ )
{      
potencia *= x; 
}     

return potencia;
}       
}      