package classes.day24_arrays;

import java.util.Scanner;

public class Task1_Months {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month number.");
		int month = scan.nextInt();

		String[] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		System.out.println("The month is " + months[month-1]);
		
		scan.close();
		

	}

}
