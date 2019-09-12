package shopping;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestShoopingCart {
	private static ArrayList<Product> array_productos;
	private static ShoopingCart lista_productos;
	private static Product p, p1;

	@BeforeClass
	public static void inicializar() {
		array_productos= new ArrayList<Product>();	
		//array_productos.add(p);
		//array_productos.add(p1);
		p = new Product("p","libreta","libreta cuadricuclada", 10.0);
		p1 = new Product("p1","libreta","libreta cuadricuclada", 4.0);
		lista_productos= new ShoopingCart(array_productos);

	}	
	
	@AfterClass
	public static void finalizar() {
		lista_productos=null;
		p=null;
	}
	
	@Test //Anotación que identifica que es un metodo de prueva de test
	public void test_add_item() {
		boolean resul=lista_productos.addItem(p);
		assertTrue("No ha añadido productos", resul);
	}

	@Test //Anotación que identifica que es un metodo de prueva de test
	public void test_remove_item() {
		Product p2 = new Product("p2","libreta","libreta cuadricuclada", 2.0);
		lista_productos.addItem(p2);
		lista_productos.removeItem(p2);
		assertEquals(0, lista_productos.getItemCount());
		
		/*Otra forma
		//llista_productos.addItem(p);
		//lista_productos.addItem(p1);
		Integer tot = lista_productos.getItemCount();
		//opcion 2 mostra tamaño array
		//Integer tot= array_productos.size();
		lista_productos.removeItem(p);
		tot=tot-1;
		assertEquals("no ha añaido productos", tot, lista_productos.getItemCount());
		*/
	}	
	
	
	@Test //Anotación que identifica que es un metodo de prueva de test
	public void test_get_item() {
		lista_productos.addItem(p);
		lista_productos.addItem(p1);
		Product p_i = lista_productos.getItem(0);
		assertSame("los productos distintos", p_i, p);
	}
	
	@Test
	public void getBalance() {
		lista_productos.addItem(p);
		lista_productos.addItem(p1);
		Double total_Precios= lista_productos.getBalance();
		assertEquals("el precio es incorrecto", (Double)14.0, total_Precios);
	}
}
