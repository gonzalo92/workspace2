package Matrices;
import java.util.Arrays;
public class EjemploMatrices {

	public static void main(String[] args) {
		int[][] array1;
		
		array1 = new int[3][4];
		array1 [1][3]=7;
		System.out.println(Arrays.toString(array1[1]));
		
		for(int i = 0;i<3;i++){
			for(int j = 0;j<4; j++){
				System.out.print(array1[i][j]+ " ");
			}
			System.out.println();
		}
		
		char[][] caracteres = {{'a','b'},{'c','d','e'},{'f','g'}};
		for(int i = 0;i<caracteres.length;i++){
			for(int j = 0;j<caracteres.length; j++){
				System.out.print(caracteres[i][j]+ " ");
			}
			System.out.println();
		}
		
		char [][] caracteres2;
		caracteres2 = new char[3][];
		caracteres2[0] = new char[2];
		caracteres2[0][0] = 'a';
		caracteres2[0][1] = 'b';
		caracteres2[1] = new char[3];
		caracteres2[1][0] = 'c';
		caracteres2[1][1] = 'd';
		caracteres2[1][2] = 'e';
		caracteres2[2]= new char[2];
		caracteres2[2][0] = 'f';
		caracteres2[2][1] = 'g';

	}

}
