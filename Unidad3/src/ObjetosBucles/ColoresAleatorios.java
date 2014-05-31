package ObjetosBucles;

import graphisc.Color;
import graphisc.Ellipse;

public class ColoresAleatorios {

	public static void main(String[] args) throws InterruptedException {
		
		//Color[]colores ={ new Color(255,0,0),.... };tambien se puede hacer entre llaves 
		Color[]colores;
		colores = new Color[5];
		
		colores [0] = new Color(255,0,0);
	    colores [1] =  Color.BLACK;
	    colores [2] =  Color.CYAN;
	    colores [3] =  Color.GREEN;
	    colores [4] =  Color.GRAY;
	    
	    Ellipse circulo = new Ellipse(100,100,300,300);
	    
	    while(true){
	    	circulo.setColor(colores[(int)(Math.random()*5)]);
	    	circulo.fill();
	    	Thread.sleep(15);
	    }
		
	    

	}

}
