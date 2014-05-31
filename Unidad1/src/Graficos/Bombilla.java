package Graficos;
//para poder crear bombilla hay que crear el constructor luz
public class Bombilla {

	public static void main(String[] args) {
		Luz bombilla1= new Luz(300,10);
		Luz bombilla2= new Luz(500,10);
		
		bombilla1.encender();
		bombilla2.encender();
		
		bombilla1.aumentarLuz(10);
		bombilla2.aumentarLuz(50);
		
		bombilla1.obtenerCantidad();
		bombilla2.obtenerCantidad();
		
		
	}

}
