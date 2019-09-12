import java.util.Scanner;
/**
 * Clase para calcular el mayor o el menor de 3 numeros.
 * @author Cristobal Salido
 *
 */

public class Operaciones {
/**
 * Metodo interface del programa.
 * 
 * @param args (int int int int)
 * Cuatro argumentos tipo int<br>
 * El primer argumento, indica la operación al calcular.<br>
 * (1) Calculará el mayor.<br>
 * (2) Calculará el menor.<br>
 * <br>
 * Los siguientes tres argumentos serán los numeros a comparar.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		int result;
		//Preguntamos la operación a realizar Mayor o Menor
		System.out.println("Que operación quieres hacer? ");
		System.out.println("1- Calcular mayor");
		System.out.println("2- Calcular menor");
		
		int op = tec.nextInt();
		//Preguntamos por los tres numeros enteros a hayar el Mayor o el Menor
		System.out.println("Introduce el num1");
		int num1 = tec.nextInt();
		System.out.println("Introduce el num2");
		int num2 = tec.nextInt();
		System.out.println("Introduce el num3");
		int num3 = tec.nextInt();
		//Llamamos a los metodos de calculo según la operación que
		//haya elegido el usuario Mayor o Menor
		if (op == 1)
			System.out.println(result = calcula_mayor(num1,num2,num3));
		else if (op==2)
			System.out.println(result = calcula_menor(num1,num2,num3));
		else 
			System.out.println("Opción incorrecta");
		
	}
	
	/**
	 * Metodo para calcular el numero Mayor.<br>
	 * Recibirá 3 numeros enteros y devolverá el mayor de ellos. 
	 * @param num1 numero entero a comparar.
	 * @param num2 numero entero a comparar.
	 * @param num3 numero entero a comparar.
	 * @return Devuelve el numero entero mayor de los tres recividos por el metodo.

	 */
	static int calcula_mayor (int num1, int num2, int num3) {
		int result = 0;
		
		//Si el numero 1 es mayor que el 2
		if (num1 > num2)
			//si el numero 1 es mayor que el 3
			if (num1 > num3)
				//el numero mayor es el 1
				result= num1;
			//si el numero 1 no es mayor que el 3 
			else 
				//el numero mayor es el 3
				result = num3;
		// si el numero 1 no es mayor que el 2
		// si el numero 2 es mayor que el numero 3
		else if (num2 > num3)
			// el numero mayor es el 2
			result = num2;
		//si el numero 2 no es mayor que el 3
		else
			//el numero mayor es el 3
			result = num3;
		//Devolvemos resultado
		return result;
	}
	
	/**
	 * Metodo para calcular el numero Menor.<br>
	 * Recibirá 3 numeros enteros y devolverá el menor de ellos.
	 * @param num1 numero entero a comparar.
	 * @param num2 numero entero a comparar.
	 * @param num3 numero entero a comparar.
	 * @return Devuelve el numero entero menor de los tres recividos por el metodo.
	 */
	static int calcula_menor (int num1, int num2, int num3) {
		int result = 0;
		
		//Si el numero 1 es menor que el 2
		if (num1 < num2)
			//si el numero 1 es menor que el 3
			if (num1 < num3)
				//el numero menor es el 1
				result= num1;
			//si el numero 1 no es menor que el 3 
			else 
				//el numero menor es el 3
				result = num3;
		// si el numero 1 no es menor que el 2
		// si el numero 2 es menor que el numero 3
		else if (num2 < num3)
			// el numero menor es el 2
			result = num2;
		// si el numero 1 no es menor que 2 ni 2 menor que 3
		else
			//el numero menor es el 3
			result = num3;
		
		return result;
	}

}
