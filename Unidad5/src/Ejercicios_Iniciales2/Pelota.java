package Ejercicios_Iniciales2;

import graphisc.Color;
import graphisc.Ellipse;
import graphisc.Rectangle;



public class Pelota {
	// Hacer una pelota que rebote 
   
   public int radio;
   public int color;
   public int limites;

public int getLimites() {
	
	return limites;
}

public void setLimites(int limites) {
	this.limites = limites;
}

public void radio(){
	Ellipse pelota;
	pelota = new Ellipse(25,82,30,30);
	pelota.draw();
	pelota.fill();
}
public void setLimites(int i, int j, int k, int l) {
	Rectangle limite;
	limite = new Rectangle(10,10,400,400);
	limite.draw();
	limite.setColor(Color.BLACK);
	
	
}
public void dibuja() {
	Ellipse e;
	e = new Ellipse(40, 50, 30, 30);
	
}




}
