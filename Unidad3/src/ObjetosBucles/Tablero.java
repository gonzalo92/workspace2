package ObjetosBucles;

import graphisc.Color;
import graphisc.Rectangle;

public class Tablero {//MIRAR EN CASA MAS DETENIDAMENTE.

	public static void main(String[] args) {
		Rectangle tablero;
		int tama�o = 40;
		tablero = new Rectangle(0, 0, 8*tama�o, 8*tama�o);
		tablero.draw();
		int i;
		int m;
		for(i = 0;i <8;i++){
			for(m=0;m<8;m++){
				if(i%2==0 && m%2==0 || i%2!=0 && m%2 !=0){
					Rectangle casilla;
					casilla = new Rectangle (m*tama�o,i*tama�o,tama�o,tama�o);
					casilla.draw();
					casilla.setColor(Color.BLACK);
				}
				
			}
		}
		

	}

}
