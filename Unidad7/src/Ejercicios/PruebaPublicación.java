package Ejercicios;

public class PruebaPublicaci�n {

	public static void main(String[] args) {
		Publicaci�n pb = new Publicaci�n();
		Revista rv = new Revista();
		Libro lb = new Libro();
		
		pb.setEditor("Juanito");
		pb.setFecha("5/12/2014");
		rv.setN�mero(1);
		rv.setFecha("5/10/56");
		rv.setEditor("Anaya");
		lb.setEditor("Mc cane");
		lb.setFecha("12/11/1936");
		lb.setAutor("Juanito Guti�rrez");
		lb.setIsbn("1234567897");
		
		System.out.println("Publicacion" + pb);
		System.out.println("Revista" + rv);
		System.out.println("Libro" + lb);
		

	}

	
	

}
