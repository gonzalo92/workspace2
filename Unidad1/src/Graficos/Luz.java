package Graficos;
//Constructor para poder crear el objeto bombilla

public class Luz {
	
	private int cantidad;
	private int tamaño;
public Luz(int cantidad, int tamaño){
	
	this.cantidad = cantidad;
	this.tamaño = tamaño;
   }
public void encender(){
	System.out.println("La luz esta encendida");
	
	
}
public void apagar(){
	System.out.println("La luz esta apagada");
	
	
}

public void aumentarLuz(int cantidad ){
	this.cantidad = this.cantidad + cantidad; 
}
public void obtenerCantidad(){
	
	 System.out.println(this.cantidad);
}
}



