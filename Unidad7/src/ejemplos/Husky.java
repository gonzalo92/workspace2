package ejemplos;

public class Husky extends Perro {
    boolean blanco;
	public void cerrarVentana(){
		System.out.println("Znnn");
	}
	
	public void ladrar(){
		super.ladrar();
		System.out.println("Auuu");
	}
}
