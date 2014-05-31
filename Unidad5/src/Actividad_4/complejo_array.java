package Actividad_4;

public class complejo_array {
      private static double aleatorio10(){
    	  return Math.random() *(11);
      }
	public static void main(String[] args) {
		
		
	   complejo[] numeros = new complejo[40];
		for(int i = 0;i < numeros.length; i++ ){
	        numeros[i]= new complejo( aleatorio10(),aleatorio10());
		}
		
		complejo sumatorio = new complejo();
		for(int i=0; i< numeros.length;i++)sumatorio.suma(numeros[i]);
			
		
		System.out.println("Sumatorios" + sumatorio);
     
	}

}
