package dam.PR1_Doc;

public class Mayor2Nums {
	public static void main(String[] args) {
		int a = 0, b = 0; /* esto es un comentario */
		// Inicializamos las variables y le damos el mismo valor
		// Añadimos un breakpoint en la condición if, para que el programa pare antes
		// de que llegue a ejecutarse.
		
		// Ejecutamos en debug y cuando el programa se para al llegar a la condición
		// pulsamos Step into para ver cual es la siguiente instruccion que se ejecuta
		// comprovamos que el puntero de la instrucción actual salta al comando
		// System.out.println("El mayor es " + b); contenido en el else.
	
		// Dado que nuestro programa devuelve el mayor, en el caso de ser iguales,
		// nos es indistinto que muestre a o b, por lo que el programa podemos afirmar que 
		// funciona correctamente
		if (a > b)
			System.out.println("El mayor es " + a);
		else
			System.out.println("El mayor es " + b);
	}
}