package Ejemplos;

public class EjemploEnum {

	public static final int ROJO = 1;
	public static final int VERDE = 2;
	
	public static final int lunes = 1;
	public static final int martes = 2;
	public static final int miercoles = 3;
	public static final int jueves = 4;
	public static final int viernes = 5;
	public static final int savado = 6;
	public static final int domingo = 7;
	
	public enum diaSem{lunes,martes,miercoles,jueves,viernes,sabado,domingo}
	
	public static void main(String[] args) {
		int color;
		int dia;
		 
		color = ROJO;
         dia = jueves;
          
          switch(dia){
          case jueves:
        	  System.out.println("que dia es hoy");
          }
          
          diaSem midia;
          midia = diaSem.lunes;
          
	}

}
