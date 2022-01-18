package classes.day09_controlFlowStatements;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		// Write a code to detirmine weither the student passed or failed.
		// A, B, C -> Passed
		// D, F -> Failed
		
		char grade = 'D';
		
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Congratilation. You passed!");
			break;
		case 'D':
		case 'F':
			System.out.println("You failed, useless peace of sh*t.");
			break;
		default:
			System.out.println("Invailed entry.");
		}

	}

}
