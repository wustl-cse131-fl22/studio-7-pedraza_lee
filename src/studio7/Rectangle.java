package studio7;


public class Rectangle {

	private double width;
	private double length;
	private double area;
	private double perimeter;
	private boolean isSmaller;
	private boolean isSquare;
	
	//constructor
	public Rectangle(double initWidth, double initLength) {
		width = initWidth;
		length = initLength;
		area = width*length;
		perimeter = (2.0*width)+(2.0*length);
	
	}

public static void main(String[] args) {
	Rectangle rectangle1 = new Rectangle(3.0, 4.0);
	System.out.print(rectangle1.area);
}
}