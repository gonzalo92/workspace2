package EjemplosGraphisc2;

import java.awt.Point;

import graphics2.*;
public class Ejemplo1 {

	public static void main(String[] args) {
		Rectangle cuadrado;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(6.5f);
		cuadrado.setColor(Color.DARK_GRAY);
		cuadrado.draw();
		
		Ellipse circulo;
		
		circulo = new Ellipse(150, 150, 30, 30);
		
		circulo.setThickness(6.5f);
		circulo.setColor(Color.BLUE);
		circulo.fill();
		
		Canvas c;
		c=Canvas.getInstance();
		c.getMousePosition();
		circulo.undraw();
       
		
		Text coordenadas = new Text(46, 40, "-");
		coordenadas.draw();
		
		circulo.fill();
		while(true){
			
		Point pulsacion = c.waitMouseClick();
		coordenadas.setText(pulsacion.x+"-"+pulsacion.y);
		
		circulo.translate(pulsacion.x-circulo.getX()-circulo.getWidth()/2, pulsacion.y-circulo.getY()-circulo.getWidth()/2);
		System.out.println("Has pulsado en: " + pulsacion.x +"-" + pulsacion.y);
		
		}
		
		
		
	}

}
