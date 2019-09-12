package ed.Practica1;

import java.util.Scanner;

public class Ordenar {

	/**
	 * Caminos a seguir
	 * 1) 1,2,4,5,7,8,12 
	 * Valores: nunca se realiza
	 * 2) 1,2,3,2,4,5,7,8,12
	 * Valores: Siempre se realiza
	 * 3) 1,2,4,5,6,5,7,8,12
	 * Valores: j=0 t[0]=1 num=11
	 * 4) 1,2,4,5,7,9,10,12
	 * Valores: j=0 t[0]=0 num=0
	 * 5) 1,2,4,5,7,9,11,12
	 * Valores: j=0 t[0]=0 num=-1
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int t[] = new int[10];
		int num, j;/*1*/

		for (int i = 0; i < 10; i++)/*2*/ {		
			System.out.print("Introduzca numero (orden creciente): ");
			// Modificar
			t[i] = tec.nextInt();/*3*/
		}
		
		System.out.println();
		System.out.println("Introduzca numero a buscar: ");
		
			// modificar
		num = tec.nextInt();
		j = 0;/*4*/

		while (j < 10 && t[j] < num)/*5*/ {
			j++;/*6*/
		}
		if (j == 10)/*7*/
			System.out.println("No encontrado");/*8*/
		else {
			if (t[j] == num)/*9*/
				System.out.println("Encontrado en la posición " + j);/*10*/
			else
				System.out.println("No encontrado");/*11*/
		}

	}/*12*/

}
