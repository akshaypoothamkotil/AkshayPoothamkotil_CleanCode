package constructionCostEstimation;

public class HighStandardOption{
	private static double costPerSquareFeet=1800;
	public static double estimate(double SquareFeet) {
		return (SquareFeet*costPerSquareFeet);
	}

}
