package Arrays;

public class Ejemplo1 {

	public static void main(String[] args) {
          //Declaraci�n
		int[] enteros;
		int[] enteros2;
		String[] cadenas;
		//Creaci�n
		
		enteros = new int[40];
		cadenas = new String[40];
		
		//Inicializaci�n
		int[] enteros3={1,2,3,4,5};
		String[] cadenas2={"uno", "dos" , "tres"};
		String[] cadenas3 = {new String("uno"),
				             new String("dos")};
		
		for(int i= 0;i < enteros.length;i++) enteros[i]=i;
		for(int i= 0;i < cadenas.length;i++) cadenas[i]= new String(Integer.toString(i));
		
	    //Recorrido
		for(int i= 0;i < cadenas.length;i++) {
			System.out.println(cadenas[i]);
		}
		for(String c: cadenas){
			System.out.println(c);
		}
		
		
		//Array bidimensional
		int[][] enteros4;
		int[][] enteros5= {{1,2},{3,4}};
		
		System.out.println(enteros5[0][1]);
		System.out.println(enteros5[1][0]);
		
		enteros4= new int [3][3];
		enteros4[1][1] = 1;
		enteros4[2][2] = 2;
		enteros4[1][2] = 3;
		
		

	}

}
