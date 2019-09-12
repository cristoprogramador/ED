package test;

import static org.junit.Assert.assertSame;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import catalogo.Catalogo;
import catalogo.Libro;

@RunWith(Parameterized.class)

public class TestParamCatalogo {
	 /*Valores necesarios para un caso de prueba*/
		
		private String isbn;
		private Libro l;
		static Catalogo c;
		/*Constructor de la prueba*/
		
		public TestParamCatalogo(String isbn, Libro l){
			this.isbn = isbn;
			this.l = l;
		}
		
		/*paramatros para el constructor de la prueba*/
		@Parameters
		public static Collection<Object[]>catalogos(){
			Libro l1= new Libro("autor1", "ES1111", "libro1", 2011,2);
			Libro l3= new Libro("autor3", "ES2333", "libro3", 2011,2);
			return Arrays.asList(new Object[][] {{"ES1111", l1},{"ES2333", l3}});
		}
		
		/*Test*/
		@Test
		public void TestGetBalance() {
			Catalogo c = new Catalogo();
			c.insertar(l);
			Libro res=c.buscarPorIsbn(isbn);
			assertSame(l, res);
		}

}
