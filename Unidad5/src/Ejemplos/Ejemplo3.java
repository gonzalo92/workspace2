package Ejemplos;
import java.util.*;
public class Ejemplo3 {

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Introduce la cuenta");
	int num = sc.nextInt();
	System.out.println(num);
Cuenta mi_cuenta;

mi_cuenta= new Cuenta();



System.out.println("Saldo inicial: " + mi_cuenta.getSaldo());

mi_cuenta.sacar(sc.nextDouble());

mi_cuenta.ingresar(sc.nextDouble());


System.out.println("Saldo actual: " + mi_cuenta.getSaldo());
System.out.println("Número de movimientos: " + mi_cuenta.getTransacciones());
sc.close();
   //mejora a la cuenta: no admite descubiertos
   //Guardar tambien su numero de cuenta, un numero de 10 cifras
   //Menu para gestionar una cuenta (pide al usuario cuentas y ingresa/saca
   //constructores de la cuenta (nº cuenta, saldo inicial)

     }



}