package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private int direction;
	private int hand;
	private int goals;
	private int assists;
	private int games;
	private int points;
	
	public HockeyPlayer(String initName, int initNumber, int initDirection, int initHand, int initGoals, int initAssists, int initGames) {
		name = initName;
		number = initNumber;
		direction = initDirection;
		hand = initHand;
		goals= initGoals;
		assists = initAssists;
		games = initGames;
		points = goals+assists;
		
	}

public static void main (String[] args) {
	HockeyPlayer jade = new HockeyPlayer ("Jade", 23, 1, 2, 5, 6, 2);
	System.out.print(jade.points);
}
}
