package ejercicios;

import java.io.File;
import java.util.Date;

/**
 * 
 * @author alumno
 *
 */
public class suma {

	static int tot_op;

	static void suma_operacion(int n1, int n2, int n3) {

		tot_op = n1 + n2 + n3;
		System.out.println("suma: " + tot_op);

	}

	
	private static void operacion_resta(int num1, int num2) {
		int total_resta;
		if (num1 < num2) {
			boolean op_rest = false;
			System.out.println("no se puede realizar la resta");
			op_rest = true;

		} else {
			boolean op_rest = true;
			total_resta = num1 - num2;
			tot_op = total_resta;
			System.out.println("resta: " + tot_op);//No estaba puesta y no salia por patalla
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 8;
		int num3 = 6;
		int total_resta = 0;
		double div=0;
		tot_op = 0;
		
		// No suma los tres numeros bien porque 
		// como tercer parametro hemos puesto 0 y no num3
		suma_operacion(num1, num2, num3);
		operacion_resta(num2, num1);
		
		div=num2/num1;
		System.out.println("division " + div);

	}

}
