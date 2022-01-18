package live_reviews_JAVA.week2_review;

import java.util.Scanner;

public class MonthCalculater {

	public static void main(String[] args) {
		// if I give you;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the month number you would like to know the numbers of days of.");
		int month = scan.nextInt(); //how many days in that month
		
		/*January � 31 days
		 *February � 28 days in a common year and 29 days in leap years
		 *March � 31 days
		 *April � 30 days
		 *May � 31 days
		 *June � 30 days
		 *July � 31 days
		 *August � 31 days
		 *September � 30 days
		 *October � 31 days
		 *November � 30 days
		 *December � 31 days
		*/
		 
		if (month>=1 & month<=12) {
			if (month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12) {
			System.out.println("It has 31 days");
			} else if (month==2) {
			System.out.println("It has 28 days");
			} else
			System.out.println("It has 30 days");
			}
		else {
			System.out.println("Invalid entry.");
		}
	}
}
