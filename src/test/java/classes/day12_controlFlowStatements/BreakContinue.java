package classes.day12_controlFlowStatements;

public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i<=5; i++) {
			
			if (i==4) {
				
				break;
			}
		
		System.out.println(i);
		
		}
		
		System.out.println();
		
		for (int i = 1; i<=5; i++) {
			
			if (i==4) {
				
				continue;
			}
		
		System.out.println(i);
		
		}

	}

}
