package Ejercicios;

import java.util.Scanner;

public class EmpleadoAsalariado extends Empleado {
    private static double precio;
    private static int horas;
    
   public  double calculaSalarioSemanal(int horas,double precio){
	   Scanner sc = new Scanner(System.in);
	     int hor =sc.nextInt();
	     double prec = sc.nextDouble();
	     double cal = 0;
	     cal = prec* hor;
	 return cal;
   }  
   public static void main(String[] args) {
	   System.out.println("Introduce las horas y el precio");
	   Scanner sc = new Scanner(System.in);
	   Empleado em= new Empleado();
	   EmpleadoAsalariado ea = new EmpleadoAsalariado();
	   EmpleadoPorHoras eh = new EmpleadoPorHoras();
	   System.out.println("El salario del empleado asalariado es: " + ea.calculaSalarioSemanal(horas, precio));
   }
}
