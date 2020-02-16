package constructionCostEstimation;

public class AboveStandardOption{
	private static double costPerSquareFeet=1500;
	public static double estimate(double SquareFeet) {
		return (SquareFeet*costPerSquareFeet);
	}

}
