package Matrices;
//Declara y crea un tipo de variable que sea capaz de contener el número de alumnos matriculados en 4 institutos en 5 niveles de estudios: 
//ESO, BACHILLERATO, CGM, CGS, PCPI.
public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] alumnos = {{700,400,500,900,1000}};
		String[][] centros={{"a","b","c","d","e"},{"ESO", "BACHILLERATO", "CGM", "CGS", "PCPI"}};
		/*char[][] centros = {{'a','b','c','d','e'}};
		for(int i = 0;i<centros.length;i++){
			for(int j = 0;j<centros.length; j++){
				System.out.print(centros[i][j]+" ");
			}
			System.out.println();
			}
			*/
		System.out.println(centros);
		
	}
}