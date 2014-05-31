package Ejercicios_Iniciacion;

import java.util.Scanner;

public class Contacto {
    private String nombre;
    private String Apellido_1;
    private String Apellido_2;
    private String Dirección;
    private String telFijo;
    private String telMovil;
    private String mail;
    

	public String getNombre() {
		
		return nombre;
	}
	public void nombre() {
		Scanner sc = new Scanner(System.in);
		String nom = sc.next();
		System.out.print("Nombre" + nom);
		}

	

	public String getApellido_1() {
		return Apellido_1;
	}

	

	public String getTelMovil() {
		return telMovil;
	}

	

}
  