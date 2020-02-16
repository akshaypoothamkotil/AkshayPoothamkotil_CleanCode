package ConstructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimation.*;
public class HighStandardTest {

	@Test
	public void test() {
		Assert.assertEquals(18000,Estimator.estimateCost(3,10,false),0);
	}

}
