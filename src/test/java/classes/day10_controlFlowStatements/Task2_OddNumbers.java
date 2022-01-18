package classes.day10_controlFlowStatements;

public class Task2_OddNumbers {

	public static void main(String[] args) {

		for (int i=5; i<=140; i+=2) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		for (int i=5; i<=140; i++) {
			if (i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}

}
