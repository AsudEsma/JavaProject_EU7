package classes.day09_controlFlowStatements;

public class task2_DaySelector {

	public static void main(String[] args) {

		int day = 8;  // Enter the day here.
		int dayRemaining = day%7;
		
		switch (dayRemaining) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("YEY! It's Sunday.");
		}

	}

}
