package Metodos;

public class Eratostenes {

	public static void imprimeErastotenes(int n){
		if (n<=1)return;
		boolean [] A;
		
		A= new boolean [n + 1];
		for(int i=0; i<n;i++) A[i]=true;
		for(int i = 2; i<Math.sqrt(n);i++){
			if(A[i]){
				for(int j= i*i;j<=n;j+=i)
					A[j]=false;
			}
		}
		for(int i=2;i<=n;i++){
			if(!A[i])
			System.out.print(i +  " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imprimeErastotenes(100);

	}

}
