package live_reviews_JAVA.week2_review;

import java.util.Scanner;

public class AssignmentOperatorsReview {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please, enter your hourly rate.");
		int hourlyRate = scan.nextInt();
		
		System.out.println("Please, enter your live_reviews_JAVA.weekly hours.");
		int weeklyHours = scan.nextInt();
		
		System.out.println("Please, enter the monthly tax rate.");
		double monthlyTax = scan.nextDouble();
		
		int monthlyPayCheck = hourlyRate*weeklyHours*4;
		monthlyTax = monthlyPayCheck * scan.nextDouble();
		
		System.out.println("Monthly salary is $" + monthlyPayCheck);
		System.out.println("Your monthly tax is $" + monthlyTax);
		System.out.println("Monthly salary after taxes is $" + (monthlyPayCheck-monthlyTax));
	
		scan.close();
		
	}

}
