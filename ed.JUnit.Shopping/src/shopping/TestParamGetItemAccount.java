package shopping;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TestParamGetItemAccount {
	private ArrayList<Product> sh;
	private Integer result;
	/*Constructor de la prueba*/
	public TestParamGetItemAccount(ArrayList<Product> p, Integer r){
		this.sh = p;
		this.result = r;
	}
	/*paramatros para el constructor de la prueba*/
	@Parameters
	public static Collection<Object[]>shooping(){
		ArrayList<Product> s1 = new ArrayList<Product>();
		s1.add(new Product("P1","producto1","PR1", 20.5));
		s1.add(new Product("P2","producto2","PR2", 15.5));

		ArrayList<Product> s2 = new ArrayList<Product>();
		s2.add(new Product("P1","producto1","PR1", 20.5));
		
		return Arrays.asList(new Object[][] {{s1,2},{s2,1}});
	}
	/*Test*/
	@Test
	public void TestItemAccount() {
		ShoopingCart cart1 = new ShoopingCart(sh);
		Integer res=cart1.getItemCount();
		assertEquals(result, res);
	}
}
