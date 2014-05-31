package Graficos;

import graphisc.Canvas;
import graphisc.Rectangle;
import graphisc.Color;
import graphisc.Ellipse;
import graphisc.Text;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
		
		
		Rectangle box = new Rectangle(5, 10, 80, 200);
		box.draw();
		Ellipse egg = new Ellipse(10, 20, 30, 30);
		egg.setColor(Color.RED);
		egg.fill();
		Canvas.pause();
		@SuppressWarnings("unused")
		Ellipse egg2 =  new Ellipse(30, 40, 10, 10); 
		egg.setColor(Color.GREEN);
		egg.fill();
		Canvas.pause();
		@SuppressWarnings("unused")
		Ellipse egg3 = new Ellipse(50,60,10,10);
		egg.setColor(Color.ORANGE);
		egg.fill();
		Canvas.pause();
		Thread.sleep(1000);
		
		
	}
	
}
