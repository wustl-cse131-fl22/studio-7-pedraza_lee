package studio7;

public class Die {
	private int sides;
	private int min;
	private int max;
	private int land;
	
	//constructor
	public Die(int initSides) {
		sides = initSides;
		max = sides;
		min = 1;
		land = (int) (Math.random()*(max-min)+min);
	}
	
	//test
	
public static void main (String[] args) {
	Die d1 = new Die (6);
	System.out.print(d1.land);
}
	
}
