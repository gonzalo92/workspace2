package Graficos;

import graphisc.Rectangle;
import graphisc.Ellipse;
import graphisc.Color;

public class Coche {

	public static void main(String[] args) {
		//Coche
		
		Rectangle caja;
		Ellipse rueda;
		
		caja= new Rectangle(50,80,300,100);
		caja.draw();
		caja.setColor(Color.RED);
		caja.fill();
		
		rueda = new Ellipse(130,40,200,100);
		rueda.draw();
		rueda.setColor(Color.RED);
		rueda.fill();
		
		

	}

}
