package ConstructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimation.*;
public class AboveStandardTest {

	@Test
	public void test() {
		Assert.assertEquals(15000,Estimator.estimateCost(2,10,false),0);
	}

}
