package Graficos;

import graphisc.Canvas;
import graphisc.Line;
import graphisc.Text;
import graphisc.Color;

public class Grafico1 {

	public static void main(String[] args) {
		// Grafico del euribor
		
		{
			
		
	Line x1= new Line(200,200, 200, 30);
	x1.draw();
	Line y1= new Line( 200,200,500,200);
	y1.draw();
	y1.setColor(Color.BLACK);
	x1.setColor(Color.BLACK);
		}
		{
		 Line x= new Line(200,200,230,190);
		 x.draw();
		 x.setColor(Color.RED);
		}
		{
			Line x= new Line(230,190,250,190);
			 x.draw();
			 x.setColor(Color.RED);			
		}
		{					
		Text x= new Text(225, 200, "0.575");
		x.draw();
		x.setColor(Color.GREEN);
		}
		{
			Text x= new Text(200, 200, "0.0");
			x.draw();
			x.setColor(Color.GREEN);
		}
	
	
		

	}

}
