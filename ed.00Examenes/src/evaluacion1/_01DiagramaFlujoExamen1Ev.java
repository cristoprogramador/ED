package evaluacion1;
import java.util.Scanner;

public class _01DiagramaFlujoExamen1Ev {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		double gastos = 0;
		double ingresos = 0;

		System.out.println("Desea introducir otro dato? ");
		String respuesta = tec.next();

		while (respuesta.compareTo("si") == 0) {
			System.out.println("Introduzca dato: ");
			double dato = tec.nextDouble();

			if (dato < 0)
				gastos = gastos + dato;
			else if (dato > 0)
				ingresos = ingresos + dato;
			
			System.out.println("Desea introducir otro dato? ");	
			respuesta = tec.next();
		}
		
		System.out.println("Gastos: " + gastos + "euros \n");
		System.out.println("Ingresos: " + ingresos + "euros \n");
		System.out.println("Ganancias: " + (ingresos + gastos) + "euros");

	}

}
