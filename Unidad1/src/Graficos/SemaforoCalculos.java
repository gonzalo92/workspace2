package Graficos;

import graphisc.Color;
import graphisc.Ellipse;
import graphisc.Rectangle;

public class SemaforoCalculos {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		
		double ancho, alto, centro_x, centro_y, diametro_disco;
		ancho=100;
		alto=300;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
	  
		caja = new Rectangle(centro_x-ancho/2, centro_y - alto/2,ancho,alto);
		caja.draw();
		caja.setColor(Color.BLACK);
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10, centro_y + alto/2,ancho/5,alto);
		palo.draw();
		palo.setColor(Color.BLACK);
		palo.fill();
		
		ambar = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/2,ancho/2,alto/5);
		ambar.draw();
		ambar.setColor(Color.YELLOW);
		ambar.fill();
		
		rojo = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*2,ancho/2,alto/5);
		rojo.draw();
		rojo.setColor(Color.RED);
		rojo.fill();
		
		verde = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*-1,ancho/2,alto/5);
		verde.draw();
		verde.setColor(Color.GREEN);
		verde.fill();
		
		
	}

}
