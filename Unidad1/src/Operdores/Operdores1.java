package Operdores;

public class Operdores1 {

	public static void main(String[] args) {
		//Operadores
		
		boolean a,b;
		 
		
		System.out.println("a\tb\ta and b\ta or b\tnot a\tnot b");
		a= (3>5) ;
		b=(12!=8) ;
		
		
		
		System.out.print("(3>5)\t(12!=8)\t" + (a&&b) );
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		a=(5>=6);
		b=(3!=3);
		
		System.out.print("(5>=6)\t(3!=3)\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
		
		a=(-7!=8);
		//b=(22);//da error.
				
		System.out.print("(-7!=8)\t(22)\t" + ("error") );
		System.out.print("\t");
		System.out.print("error" );
		System.out.print("\t");
		System.out.print("error");
		System.out.print("\t");
		System.out.println("error");
		
		a=(4!=2);
		b=( 7>=-9);
	
		System.out.print("(4!=2)\t(7>=-9)\t" + (a&&b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.println(!b);
				
		
		
		

	}

}
