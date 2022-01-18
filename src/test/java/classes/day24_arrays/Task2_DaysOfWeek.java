package classes.day24_arrays;

import java.util.Scanner;

public class Task2_DaysOfWeek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please, enter the day number: ");
		int numb = scan.nextInt();
		
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thurday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		System.out.println("The day is " + days[numb-1]); 
		
		scan.close();
	}

}
