package ObjetosBucles;

import graphisc.Ellipse;
import graphisc.Rectangle;
import graphisc.Color;
public class Semaforo {

	public static void main(String[] args) {
		Rectangle palo ,caja;
		Ellipse rojo ,verde;
		
		caja = new Rectangle(10,50,60,100);
		caja.draw();
		caja.fill();
		caja.setColor(Color.BLACK);
		
		palo = new Rectangle(34,150,10,75);
		palo.draw();
		palo.fill();
		palo.setColor(Color.BLACK);
		
		while(true){
			rojo = new Ellipse(30, 50, 30, 30);
			rojo.fill();
			rojo.setColor(Color.RED);
		}

	}

}
