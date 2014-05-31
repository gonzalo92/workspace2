package Interfaces;

public class Producto implements Precio {
	private String nombre;
	private double preciounitario;
	private double iva;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Producto(String nombre, double preciounitario, double iva) {
		super();
		this.nombre = nombre;
		this.preciounitario = preciounitario;
		this.iva = iva;
	}

	@Override
	public double getPrecio() {

		return this.preciounitario * (1 + iva / 100)*recargo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", preciounitario="
				+ preciounitario + ", iva=" + iva + "]";
	}
}
