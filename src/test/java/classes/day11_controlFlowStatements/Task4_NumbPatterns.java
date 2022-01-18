package classes.day11_controlFlowStatements;

public class Task4_NumbPatterns {

	public static void main(String[] args) {

		int row = 5;
		
		for (int i=1; i<=row; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
