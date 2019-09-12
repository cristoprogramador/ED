package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import catalogo.Catalogo;
import catalogo.Libro;


public class TestCatalogo {

	static Libro l1= new Libro("autor1", "ES1111", "libro1", 2011,2);
	static Libro l2= new Libro("autor2", "ES2322", "libro2", 2011,2);
	static Libro l3= new Libro("autor3", "ES2333", "libro3", 2011,2);
	static Libro l4= new Libro("autor4", "ES1144", "libro4", 2011,2);

	static Catalogo c;
	
	@BeforeClass
	public static void inicializar() {
		 c = new Catalogo();
		 c.insertar(l1);c.insertar(l2);c.insertar(l3);
	}
	
	@AfterClass
	public static void borrar() {
		c = null;
	}
	
	/**
	 * Insertamos un libro cuando no está lleno y devuelve true
	 * insertamos un libro cuando está lleno y devuelve false
	 */
	@Test
	public void test_insertar() {
		//fail("Not yet implemented");
		//Insertamos un libro cuando no está lleno y devuelve true
		assertTrue(c.insertar(l4));
		//insertamos un libro cuando está lleno y devuelve false
		Libro l5= new Libro("autor5", "ES1155", "libro5", 2011,2);
		assertFalse(c.insertar(l5));
	}
	
	/**
	 * Según orden por isbn buscamos el segundo, que stará
	 * en la posición 1 (del 0 al 3)
	 */
	@Test
	public void test_buscarLibro() {
		assertEquals(1, c.buscarLibro("ES1144"));
	}

}
