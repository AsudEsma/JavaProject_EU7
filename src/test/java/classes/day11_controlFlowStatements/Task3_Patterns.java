package classes.day11_controlFlowStatements;

public class Task3_Patterns {

	public static void main(String[] args) {

		int row = 6;
		
		for (int i=1; i<=row; i++) {
			
			System.out.println("#");
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(" ");
			}
		}
	}

}
