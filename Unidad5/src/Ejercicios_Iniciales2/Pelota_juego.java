package Ejercicios_Iniciales2;

import graphics2.Rectangle;

public class Pelota_juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelota p;
      
      p = new Pelota();
      
      p.setLimites(10,10,400,400);
      (new Rectangle(10,10,400,400)).draw();
      p.dibuja();
      
      while(true){
    	  p.mueve();
    	  Thread.sleep(50);
      }
	}

}
