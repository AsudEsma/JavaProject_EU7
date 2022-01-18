package classes.day27_arrays;

public class Task1_ScoreCalculations {

	public static void main(String[] args) {

		int[][] scores = {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
		};
		
		// Avg. score of Student 1 is:
		double avgS1 = 0;
		for(int i=0; i<scores[0].length; i++) {
			avgS1 += scores[0][i];
		}
		
		System.out.println("Average score of Student1 is " + avgS1/4);

		// Total Math scores is:
		int totalMath = 0;
		for(int i=0; i<scores.length; i++) {
			totalMath += scores[i][0];
		}
		
		System.out.println("Total math score is " + totalMath);
	}

}
