package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	private double fraction;
	private int lcm;
	private double sum;
	private double product;
	private double reciprocal;
	private double simple;
	
	public Fraction (int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
		fraction = numerator/denominator;
		lcm = numerator/denominator;
		sum = fraction+fraction;
		product = fraction*fraction;
		reciprocal = denominator/numerator;
	}

public static void main (String[] args) {
	Fraction f1 = new Fraction(2,8);
	System.out.print(f1.lcm);
}
}
