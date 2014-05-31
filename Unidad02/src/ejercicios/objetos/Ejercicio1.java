package ejercicios.objetos;

import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {

                Alumno alumno1 = new Alumno ();//Creaci�n objeto alumno1 de la clase Alumno
                Alumno alumno2 = new Alumno ();//Creaci�n objeto alumno2 de la clase Alumno
                Alumno alumno3 = new Alumno ();//Creaci�n objeto alumno3 de la clase Alumno
                
                Scanner teclado = new Scanner (System.in);
                
                System.out.println( "Introduzca el NOMBRE de tres Alumnos: ");
                 //Utilizamos el m�todo setNombre para "establecer" el par�metro nombre,
                //cogiendo dicho par�metro a traves del teclado
                
                System.out.println( "Primer alumno: ");
                alumno1.setNombre(teclado.nextLine());
                                
                System.out.println( "Segundo alumno: ");
                alumno2.setNombre(teclado.nextLine ());
                
                System.out.println( "Tercer alumno: ");
                alumno3.setNombre(teclado.nextLine ());
                
                System.out.println( "A continuaci�n introduzca la EDAD de los tres Alumnos: ");
                //Utilizamos el m�todo setEdad para "establecer" el par�metro edad,
                //cogiendo dicho par�metro a traves del teclado
                
                int edad=teclado.nextInt();
                
                alumno1.setEdad(edad);
                alumno2.setEdad(edad);
                alumno3.setEdad(edad);
                
                teclado.close();
                
                System.out.println("------Los datos de los ALUMNOS son: -------");
                System.out.println(alumno1.getNombre() + " " + alumno1.getEdad() + " a�os" );
                System.out.println(alumno2.getNombre() + " " + alumno2.getEdad() + " a�os" );
                System.out.println(alumno3.getNombre() + " " + alumno3.getEdad() + " a�os" );                     
        }
}
