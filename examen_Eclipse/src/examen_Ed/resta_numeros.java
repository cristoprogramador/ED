package examen_Ed;

public class resta_numeros {
	/* 
	 * 
	 */

	public static void main(String[] args) {
		String serie = "";
		int suma = 0;
		int resta = 100;
		boolean resta2 = true;
		while (resta <= 50) {
			if (resta2) {
				resta = resta - 2;
				resta2 = false;
			} else {
				suma = suma + 3;
			}
			boolean suma2 = true;
		}
		serie = serie + "," + resta;
		System.out.println(serie);
	}

}
