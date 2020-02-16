package ConstructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimation.*;
public class StandardTest {

	@Test
	public void test() {
		Assert.assertEquals(12000,Estimator.estimateCost(1,10,false),0);

		}

}
