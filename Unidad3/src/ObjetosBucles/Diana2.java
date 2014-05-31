package ObjetosBucles;

import graphisc.Color;
import graphisc.Ellipse;

public class Diana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color[]colores;
		int centro_x,centro_y;
		int distancia;
		
		
		colores = new Color[10];
		
		colores [0] = new Color(255,0,0);
	    colores [1] =  Color.BLACK;
	    colores [2] =  Color.CYAN;
	    colores [3] =  Color.GREEN;
	    colores [4] =  Color.GRAY;
	    colores [5] =  Color.ORANGE;
	    colores [6] =  Color.WHITE;
	    colores [7] =  Color.MAGENTA;
	    colores [8] =  Color.BLUE;
	    colores [9] =  Color.WHITE;
	    
	    centro_x=200;
	    centro_y=200;
	    distancia=15;
	    int distancia_2 = 10;
	    for( int i =10;i >0; i--){
	    	Ellipse circulo;	
	    	circulo= new Ellipse(centro_x-i*distancia,centro_y-i*distancia,distancia*i*2,distancia*i*2);
	    	circulo.setColor(colores[(int)(Math.random()*10)]);
	    	circulo.fill();	    	
	    }
	    

	}

}
