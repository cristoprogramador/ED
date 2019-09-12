package shopping;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParamAddItem {
	
	private Product p;

	/*Constructor de la prueba*/
	public TestParamAddItem(Product p){
		this.p = p;
	}
	
	/*paramatros para el constructor de la prueba*/
	@Parameters
	public static Collection<Object[]>shooping(){
		Product s1 =new Product("P2","producto2","PR2", 15.5);
		Product s2 =new Product("P1","producto1","PR1", 20.5);
		
		return Arrays.asList(new Object[][] {{s1},{s2}});
	}
	
	/*Test*/
	@Test
	public void TestItemAccount() {
		ArrayList<Product> sh = new ArrayList<>();
		ShoopingCart cart1 = new ShoopingCart(sh);
		assertTrue(cart1.addItem(p));
	}
}
