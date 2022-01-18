package classes.day14_methods;

public class task5 {

	public static void main(String[] args) {

		int score = calculateHighScorePosition(1500);
		displayHighScorePosition("Ali Teyfik",score);

		displayHighScorePosition("Mansur Yava�",calculateHighScorePosition(900));
		displayHighScorePosition("Hat�e Abla",calculateHighScorePosition(400));
		displayHighScorePosition("Bezgin Bekir",calculateHighScorePosition(50));

	}

	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position " + position + " on the high score table");

	}
	
	public static int calculateHighScorePosition(int score) {
		if (score>=1000) {
			return 1;
		} else if (score>=500 && score<1000) {
			return 2;
		} else if (score>=100 && score<500) {
			return 3;
		} else {
			return 4;
		}
	}

}
