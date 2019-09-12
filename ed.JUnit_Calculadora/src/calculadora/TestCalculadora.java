package calculadora;
/*
 * ASSERT - AFIRMAR
 * 
 * assertTure - comprueba si es verdad
 * assertFalse - comprueba si no es verdad
 * assertNull - comprueba si es nulo
 * assertNotNull - comprueba si es nulo
 * assertSame - comprueba si dos objetos son el mismo
 * assertNotSame - comprueba si dos objetos no son el mismo
 * 
 * fail() - devuelve mensaje de error
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora {
	
	static Calculadora calcu; //Declaramos un objeto de clase Calculadora
	
	//indicamos que antes de hacer las pruebas
	//de test creamos una clase calcu
	@BeforeClass
	public static void inicializar() {
		 calcu = new Calculadora(20,10);// inicializamos el objeto calcu de clase calculadora
	}
	
	//@Before y @After se ejecutan antes y despues
	//de cada metodo/prueba de test
	@Before
	public void inicializar_metodo() {
		System.out.println("Probando metodo");
	}
	
	//Indicamos lo que haremos despues
	//de todas las pruebas de test
	@AfterClass
	public static void borrar() {
		calcu = null;
	}


	@Test //Anotación que identifica que es un metodo de prueva de test
	public void test_suma() {
		//Creamos la clase
//		Calculadora calcu = new Calculadora(20,10);
		//guardo una suma de la clase creada
		int resultado=calcu.suma();
		//indicamos que 30 ha de ser el resultado
		assertEquals("PRUEBA SUMA", 30, resultado);
		//Si el resultado no es el esperado dará un error
		
		//fail("Not yet implemented");
	}
	
	@Test //Anotación que identifica que es un metodo de prueva de test
	public void test_resta() {
		//Creamos la clase
//		Calculadora calcu = new Calculadora(20,10);
		//guardo una resta de la clase creada
		int resultado=calcu.resta();
		//indicamos que 10 ha de ser el resultado
		assertEquals(10, resultado);
		//Si el resultado no es el esperado dará un error
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void test_logica_valores_entrada() {
//		Calculadora calcu = new Calculadora(20,100);
		assertFalse("Num1 tiene que ser mayor", calcu.getNum1() < calcu.getNum2());
		
		//fail("Not yet implemented");
	}
	
	//Este test funciona cuando se lanta la excepción esperada
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivide0() {
		int resultado=calcu.divide0();
		assertEquals(2,resultado);
	}


}
