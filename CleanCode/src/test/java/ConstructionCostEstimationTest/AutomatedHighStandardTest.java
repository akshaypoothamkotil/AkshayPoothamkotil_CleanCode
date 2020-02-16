package ConstructionCostEstimationTest;

import org.junit.Assert;

import org.junit.Test;

import constructionCostEstimation.Estimator;

public class AutomatedHighStandardTest {

	@Test
	public void test() {
		Assert.assertEquals(25000,Estimator.estimateCost(3,10,true),0);

	}

}
