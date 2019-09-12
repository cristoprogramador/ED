package dam.PR1_Doc;

public class Ejercicio02 {
	// escribimos main y pulsamos al mismo tiempo espacio mas control
	// nos aparecerá un recuaro con las distintas plantilla que responden al
	// llamamiento main
	// la primera será la del metodo main. Pulsamos enter y nos generará el codigo
	// correspondientes

	public static void main(String[] args) {
		// El numero elegido para el factorial es el 30

		// nos señala error en "Double numero = 30;" porque Double no es un declarador
		// valido de varible, nos da
		// la opcion de hacer un cast o cambiar a int
		// como el programa no requiere que numero sea una variable de tipo dobule
		// aceptamos la sugerencia de cambiar a tipo int

		// mediante refactor/rename, cambiamos el nombre de la variable numero a
		// dato_entrada
		// con esto conseguimos que en todas las partes del codigo cambie su nombre
		// automaticamente
		// y no tener que hacerla una por una de forma manual.
		int dato_entrada = 30;

		// Utilizamos la plantilla para general un bucle while
		// escribiremos while y pulsaremos control y espacio a la vez
		// nos saldrá un recuadro con las distintas plantillas del bucle while,
		// escojeremos la de loop
		// saliendo lo siguiente:
		/*
		 * while (condition) {
		 * 
		 * }
		 */
		while (dato_entrada != 0) {
			// nos señala un erro en "factorial = factorial * numero;" por no estar creada
			// la variable
			// elegimos la opción que nos da de crear varible, pero nos la trasnforma a tipo
			// Objet
			// "Object factorial = factorial * numero;"
			// desacemos la declaración de factorial como Objet y la pasamos a int
			// puesto que el programa no requiere otro tipo de varible "int factorial =
			// factorial * numero;"
			// dado que el valor de la variable factorial depende del valor de la misma
			// variable, nos dá otro error
			// de iniciación de la misma, hecho por el cual se entiende que eclipse no
			// asignase el ipo int a factorial
			// y si el Objet.
			// En este caso no nos da mas opción por la ayuda del programa por lo que
			// tiramos de experiencia
			// y declaramos e inicilizamos la variable en otra linea de codigo previa.
			int factorial = 0;
			factorial = factorial * dato_entrada;
			dato_entrada--;
			// con plantilla, ya sea con syso o sout y pulsando control+espacio
			// sacamos el comando System.out.println();
			System.out.println(factorial);

		}
		// En este caso al ser metodo main, no podemos cambiar el nombe del metodo o
		// dejaría de ser ejecutable
		// en el caso de querer hacerlo con un metodo utilizaríamos la opción
		// refactor/rename.

		// Tampoco nos es necesario añadir imports en este caso, si hubiera que hacerlo
		// en algún caso, podemos hacerlo
		// uno a uno situandonos encima y aplicando la opción de ayuda que nos ofrece
		// eclipse, o todos a la vez mediante
		// source/organize imports
	}

}
