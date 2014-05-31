package Ejercicios;

public class Libro  extends Publicación{
	
	private String autor;
	private String isbn;
	
	@Override
	public String toString() {
		return this.isbn + " : " + super.toString() + " "+ this.autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
