package calculadora;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AllTests {
	/*los valores que necesito para un caso de prueva*/
	private int num1;
	private int num2;
	private double resul;
	
	public AllTests(int num1, int num2, double resul) {
		this.num1=num1;
		this.num2=num2;
		this.resul=resul; //resultado operación
	}
	
	//Asignamos valores a los atributos de mi clase
	//de prueva AllTest, se definen los casos de prueva
	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][]
				{{20,2,10.0},{100,10,10.0},{45,9,2.0}});
	}
	
	//Pruebo el método divide de la laces Calculadora
	//división para los casos de prueba definidos
	@Test
	public void testDivide() {
		Calculadora calc = new Calculadora(num1,num2);
		double resultado_op = calc.divide();
		assertEquals((Double)resul, (Double)resultado_op);
	}
	
	//Pruebo el método suma de la laces Calculadora
	//suma para los casos de prueba definidos
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora(num1,num2);
		double resultado_op = calc.divide();
		assertEquals((Double)resul, (Double)resultado_op);
	}
}
