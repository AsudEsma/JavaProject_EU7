package classes.day08_controlFlowStatements;

public class task6_ifElse_ifElse {

	public static void main(String[] args) {

		int marks = 85;
		
		if (marks<60) {
			System.out.println("Fail");
		} else if (marks>=60 && marks<90) {
			System.out.println("Pass");
		} else {
			System.out.println("Passed with Distinction");
		}
	}

}
