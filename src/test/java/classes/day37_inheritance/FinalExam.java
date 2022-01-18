package classes.day37_inheritance;

public class FinalExam extends GradeActicity {

	private int numQs;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQs, int numMissed) {
		double numericScore;
		this.numQs = numQs;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQs;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		setScore(numericScore);
	}
}
