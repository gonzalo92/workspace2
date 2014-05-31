package Interfaces;

public class Facturar {
	
	public static double sumarprecios(Precio[] elemento){
		double suma = 0;
		for (Precio precio : elemento) {
			suma+=precio.getPrecio();
			
		}
		return suma;
	}
	public static void main(String[] args) {
		Precio[] lineas = new Precio[3];
		
		lineas[0]=new Producto("tomate",0.40,10.0);
		lineas[1]=new Producto("Patriot",400000,0.0);
		lineas[2]=new Trabajo("Configurar patriot",0.25,400);
		
		for (Precio objeto : lineas) {
			System.out.println(objeto);
		}
		System.out.print("Total: " + sumarprecios(lineas));

	}

}
