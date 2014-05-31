package Ejercicios;

public class PruebaPublicación {

	public static void main(String[] args) {
		Publicación pb = new Publicación();
		Revista rv = new Revista();
		Libro lb = new Libro();
		
		pb.setEditor("Juanito");
		pb.setFecha("5/12/2014");
		rv.setNúmero(1);
		rv.setFecha("5/10/56");
		rv.setEditor("Anaya");
		lb.setEditor("Mc cane");
		lb.setFecha("12/11/1936");
		lb.setAutor("Juanito Gutiérrez");
		lb.setIsbn("1234567897");
		
		System.out.println("Publicacion" + pb);
		System.out.println("Revista" + rv);
		System.out.println("Libro" + lb);
		

	}

	
	

}
