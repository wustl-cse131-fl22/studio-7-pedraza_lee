package studio7;

public class Complex {
	private double real;
	private double imaginary;
	private String complex;
	private String sum;
	private String product;


public Complex(double initReal, double initImaginary) {
	real = initReal;
	imaginary = initImaginary;
	complex = real + " + " + imaginary + "i";
	sum = sum(real, real1, imaginary, imaginary1);
}
	
	private static String sum(double real1, double real2, double imaginary1, double imaginary2) {
		String sum = real1+real2 + " + " + imaginary1+imaginary2 + "i";
		return sum;
	}
	
	}
