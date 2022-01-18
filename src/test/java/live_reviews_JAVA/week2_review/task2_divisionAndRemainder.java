package live_reviews_JAVA.week2_review;

import java.util.Scanner;

public class task2_divisionAndRemainder {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter second.");

		int seconds = scan.nextInt();
		
		int sec = seconds%60;
		int min = seconds/60%60;
		int h = seconds/60/60; 
		
		System.out.println(h + " hours " + min + " minutes " + sec + " seconds");
		
		scan.close();
	}

}
