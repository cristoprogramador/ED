package dam.PR1_Doc;

public class NumsReales {
	public static void main(String[] args) {
		float f = 1; // Usando float: float f=1.0f;
		int cont = 0;
		
		
		while (f != 0) {
			f = (f / 2); // Usando float: f = f /2.0f;
			System.out.println(f);
			cont++;		
		}
		int cont_final = cont;
		System.out.println(cont);
	}
	/**
	 * a) ¿Es cierto que hay un bucle infinito? ¿Puedes explicar por qué hay o no un 
	 * buble infinito?
	 * No, porque llega un momento en que es tan pequeño el numero que lo considera 0
	 * 
	 * b) Si el tipo de dato es float ¿cuantas iteraciones tiene el bucle?
	 * 150 
	 * 
	 * c) Si el tipo de dato es doublé ¿Cuántas iteraciones tiene el bucle?
	 * 1075
	 * 
	 * d) ¿Qué valor tiene f en la iteración 100 del bucle en el caso del dato en tipo 
	 * float?
	 * 7.888609E-31
	 * 
	 * e) ¿Qué valor tiene f en la iteración 100 del bucle en el caso del que el dato sea
	 * de tipo doublé?
	 * 7.888609052210118E-31
	 * 
	 * f) ¿Cuál es el número positivo más pequeño que parece admitir el tipo float en 
	 * este ejemplo? ¿Y el double en este ejemplo?
	 * 
	 */
}

