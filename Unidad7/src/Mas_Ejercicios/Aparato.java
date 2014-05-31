package Mas_Ejercicios;

public class Aparato {
    private String numeroProducto;
    private String numeroSerie;
    private String nombre;
    private String so;
    private double precio;
    
	public String getNumeroProducto() {
		return numeroProducto;
	}
	public void setNumeroProducto(String numeroProducto) {
		this.numeroProducto = numeroProducto;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Aparato [numeroProducto=" + numeroProducto + ", numeroSerie="
				+ numeroSerie + ", nombre=" + nombre + ", so=" + so
				+ ", precio=" + precio + "]";
	}
}
