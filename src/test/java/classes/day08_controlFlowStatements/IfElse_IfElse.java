package classes.day08_controlFlowStatements;

public class IfElse_IfElse {

	public static void main(String[] args) {
		
		/* Program to display days
		 * 1- Monday
		 * 2- Tuesday
		 * 3- Wednesday
		 * 4- Thursday
		 * 5- Friday
		 * 6- Saturday
		 * 0- Sunday
		 */
		
		int day = 31;
			
		if (day%7 == 1) {
			System.out.println("Today is Monday.");
		} else if (day%7 == 2) {
			System.out.println("Today is Tuesday.");
		} else if (day%7 == 3) {
			System.out.println("Today is Wednesday.");
		} else if (day%7 == 4) {
			System.out.println("Today is Thursday.");
		} else if (day%7 == 5) {
			System.out.println("Today is Friday.");
		} else if (day%7 == 6) {
			System.out.println("Today is Saturday.");
		} else if (day%7 == 0) {
			System.out.println("Today is Sunday.");
		}
 
	}

}
