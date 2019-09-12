package dam.PR1_Doc;

public class obtener_circulo {

	public static void main(String[] args) {
		Circulo c = new Circulo(5, 3, 6);
		c.mueve(3, 3);
		System.out.println("nuevo centro: " + c.getCentroX());
		c.escala(4);
		System.out.println("circunferencia: " + c.getCircunferencia());
	}
	/**
	 * a) Realiza una traza del programa comprobando si la ejecución es correcta,
	 * averigua en qué punto se calcula la circunferencia, si el cálculo es
	 * correcto. 
	 * En la linea 10 del main, entra a la 50 del metodo circulo, donde está 
	 * el metodo getCircunferencia, que calcula la circunferencia, 
	 * obteniendo el valor de 150.796 y sacandolo por pantalla
	 * 
	 * NOTA: Crea una clase main() que devuelva el centro del círculo, el
	 * nuevo radio si se escala y la longitud de la circunferencia b
	 * 
	 * I) Cuales son los valores de centroX y de centroy
	 * Tras la ejecución cntroX vale 8 y centroY 6
	 */
}
