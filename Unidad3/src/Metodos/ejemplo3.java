package Metodos;

public class ejemplo3 {

	public static int fib(int n){
		if(n<2)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(fib(40));
	}
	
}