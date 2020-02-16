package interestCalculator;

public class CompoundInterest {

public static double compoundIntrest(double principle,double time,double rate, int coumpoundedAt) {
    return (principle * Math.pow(1 + (rate / coumpoundedAt), coumpoundedAt * time))-principle;
}
	
}
