package constructionCostEstimation;

public class StandardOption{
	final static double costPerSquareFeet=1200;
	public static double estimate(double SquareFeet) {
		
		return (SquareFeet*costPerSquareFeet);
	}

}
