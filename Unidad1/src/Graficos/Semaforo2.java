package Graficos;

import graphisc.Color;
import graphisc.Ellipse;
import graphisc.Rectangle;

public class Semaforo2 {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde, ambar, rojo;
		
		
		caja = new Rectangle(10,50,60,100);
		caja.draw();
		caja.setColor(Color.BLACK);
		caja.fill();
		
		palo = new Rectangle(30,115,25,150);
		palo.draw();
		palo.setColor(Color.BLACK);
		palo.fill();
		
		verde = new Ellipse(25,115,30,30);
		verde.draw();
		verde.setColor(Color.GREEN);
		verde.fill();
		
		ambar = new Ellipse(25,82,30,30);
		ambar.draw();
		ambar.setColor(Color.YELLOW);
		ambar.fill();
		
		rojo = new Ellipse(25,50,30,30);
		rojo.draw();
		rojo.setColor(Color.RED);
		rojo.fill();
		
		

	}

}
