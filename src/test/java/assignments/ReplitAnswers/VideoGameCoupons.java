package assignments.ReplitAnswers;

import java.util.Scanner;

public class VideoGameCoupons {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of coupons:"); 
		int coupons = scan.nextInt();
		int candies = coupons/10;
		int gumballs = (coupons-(candies*10))/3;
		
		if (coupons>=3) {
			System.out.println("Number of Candies: " + candies);
			System.out.println("Number of Gumballs: " + gumballs);
		} else {
			System.out.println("Not enough coupons");
		}
		
		scan.close();
	}
	
}
