package classes.day10_controlFlowStatements;

public class Task3_TotalOdEvenAndOddNumbers {

	public static void main(String[] args) {

		int totalEven = 0;
		int totalOdd = 0;
		for (int i=1; i<100; i++) {
			if (i%2==0) {
				totalEven += i;
			} else {
				totalOdd += i;
			}
			
		}
		
		System.out.println("Total of even numbers is " + totalEven);
		System.out.println("Total of odd numbers is " + totalOdd);
		System.out.println("Final total is " + (totalEven + totalOdd));
	}

}
