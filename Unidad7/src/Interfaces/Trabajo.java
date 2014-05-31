package Interfaces;

public class Trabajo implements Precio {
	private String tipo;
	private double horas;
	private double precioporhora;
	
	public Trabajo(String tipo, double horas, double precioporhora) {
		super();
		this.tipo = tipo;
		this.horas = horas;
		this.precioporhora = precioporhora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getPrecioporhora() {
		return precioporhora;
	}
	public void setPrecioporhora(double precioporhora) {
		this.precioporhora = precioporhora;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return horas* precioporhora*recargo;
	}
	@Override
	public String toString() {
		return "Trabajo [tipo=" + tipo + ", horas=" + horas
				+ ", precioporhora=" + precioporhora + "]";
	}
	

}
