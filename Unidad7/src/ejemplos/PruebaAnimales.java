package ejemplos;

public class PruebaAnimales {

	public static void main(String[] args) {
		Animal mimascota = new Animal();
		
		mimascota.comer();
		
		Perro miperro = new Perro();
		
		miperro.comer();
		miperro.ladrar();
		
		Husky perro = new  Husky();
		perro.ladrar();
		perro.cerrarVentana();
	}

}
