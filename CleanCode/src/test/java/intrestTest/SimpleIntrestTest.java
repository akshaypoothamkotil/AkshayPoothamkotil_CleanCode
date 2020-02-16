package intrestTest;


import org.junit.Assert;
import org.junit.Test;
import interestCalculator.*;
public class SimpleIntrestTest {

	@Test
	public void test() {
		Assert.assertEquals(360, SimpleInterest.simpleIntrest(2000.0, 3.0, 6.0),0);
	}

}
