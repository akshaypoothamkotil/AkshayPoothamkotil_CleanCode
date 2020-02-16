package constructionCostEstimation;

public class Estimator {
public static double estimateCost(int choice,double SquareFeet,boolean Automated) {
	switch(choice) {
	case 1:{
		if(!Automated) {
			return (StandardOption.estimate(SquareFeet));
		}
		else {
			return -1;
		}
	}
	case 2:
	{
		if(!Automated) {
			return (AboveStandardOption.estimate(SquareFeet));
		}
		else {
			return -1;
		}
	}
	case 3:{
		if(!Automated) {
			return (HighStandardOption.estimate(SquareFeet));
		}
		else {
			return (AutomatedHighStandardOption.estimate(SquareFeet));
		}
	}
	
	}
	return -1;
}

}
