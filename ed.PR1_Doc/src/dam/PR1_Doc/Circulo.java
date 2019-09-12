package dam.PR1_Doc;

/**
 * Clase Circulo con metodos para tratar los objetos circulo creados
 * 
 * @version 17/01/2018
 * @author Cristobal Salido
 *
 */
public class Circulo {
	private double centroX;
	private double centroY;
	private double radio;

	/**
	 * Metodo constructor de objetos circulos que recive los valores del centro del
	 * ciruclo en los ejes X e Y así como el tamaño de su radio, para su
	 * construcción.
	 * 
	 * @param cx
	 *            Valor tipo double en el eje X del centro del circulo
	 * @param cy
	 *            Valor tipo double en el eje y del centro del circulo
	 * @param r
	 *            Valor tipo double del radio del circulo
	 */
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}

	/**
	 * Metodo que devuelve el valor tipo double de la posición en el eje X del
	 * centro del circulo
	 * 
	 * @return Valor tipo double en el eje X del centro del circulo
	 */
	public double getCentroX() {
		return centroX;
	}

	/**
	 * Metodo que devuelve el valor tipo double de la longitud de la circunferencia
	 * del circulo
	 * 
	 * @return Valor tipo dobule de la longitud de la circunferencia del circulo
	 */
	public double getCircunferencia() {
		return 2 * Math.PI * radio;
	}

	/**
	 * Metodo para desplazar el círculo de acuerdo a los valores dados para el eje X
	 * y al Y
	 * 
	 * @param deltaX
	 *            Valor tipo double de desplazamiento en el eje X del centro del
	 *            circulo
	 * @param deltaY
	 *            Valor tipo double de desplazamiento en el eje Y del centro del
	 *            circulo
	 */
	public void mueve(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
	}

	/**
	 * Metodo para redimensional el tamaño del ciruclo el numero de veces indicado
	 * 
	 * @param s
	 *            Valor tipo double multiplicador del tamaño del radio del ciruclo
	 */
	public void escala(double s) {
		radio = radio * s;
	}

}
