package evaluacion2;

public class ejer3_listar_numeros {
	static void lista(int b,int a){
		int max, menor;
		
		if(a>b){ 
			max=a;
			menor=b;
		}
		else{ 
			max=b;
			menor=a;
		}
		imprimir(max, menor);
		System.out.println();
	}
	private static void imprimir(int max, int menor) {
		for (int i=menor;i<=max;i++)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		int a,b;
		System.out.print("Introduzca primer numero: ");
		a=6;
		System.out.print("Introduzca segundo numero: ");
		b=15;
		lista(b,a);
	}
}