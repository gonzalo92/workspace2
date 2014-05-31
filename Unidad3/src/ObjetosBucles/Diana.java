package ObjetosBucles;

import graphisc.Ellipse;
import graphisc.Color;
import graphisc.Line;
import graphisc.Rectangle;
public class Diana {

	public static void main(String[] args) throws InterruptedException {
		Ellipse circulo;
		Color color;
		Rectangle marco;
		int movimiento_x;
		int movimiento_y;
		
		marco = new Rectangle(0,0,400,400);
		marco.draw();
		
		color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		circulo = new Ellipse(250, 250, 50, 50);
		circulo.draw();
		circulo.fill();
		circulo.setColor(color);
		//(int)(Math.random()* (max-min+1)) + min;
		movimiento_x=(int)(Math.random()*10)-2;
		movimiento_y=(int)(Math.random()*10)-2;
		if(movimiento_x==0)movimiento_x++;
		if(movimiento_x==0)movimiento_x++;
		while(true){
			circulo.translate(movimiento_x, movimiento_y);
			if(circulo.getX()>349 || circulo.getX() <0) movimiento_x= -movimiento_x;  
			if(circulo.getY()>349 || circulo.getY() <0) movimiento_y=- movimiento_y;
			
			Thread.sleep(50);
		}
		
		

	}

}
