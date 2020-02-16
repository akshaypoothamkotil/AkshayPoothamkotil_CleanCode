package intrestTest;

import org.junit.Assert;
import org.junit.Test;
import interestCalculator.*;
public class CompoundIntrestTest {

	@Test
	public void test() {
		Assert.assertEquals(979.6914166032102, CompoundInterest.compoundIntrest(2000, 5, .08, 12),0);

	}

}
