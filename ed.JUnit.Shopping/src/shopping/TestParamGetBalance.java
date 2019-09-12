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

public class TestParamGetBalance {
 /*Valores necesarios para un caso de prueba*/
	private ArrayList<Product> sh;
	private Double result;
	/*Constructor de la prueba*/
	
	public TestParamGetBalance(ArrayList<Product> p, Double r){
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
		
		return Arrays.asList(new Object[][] {{s1,36.0},{s2,20.0}});
	}
	/*Test*/
	@Test
	public void TestGetBalance() {
		ShoopingCart cart1 = new ShoopingCart(sh);
		Double res=cart1.getBalance();
		assertEquals(result, res);
	}
}
