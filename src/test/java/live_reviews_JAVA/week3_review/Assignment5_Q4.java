package live_reviews_JAVA.week3_review;

import java.util.Scanner;

public class Assignment5_Q4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int product = 0;
		
		while (product<100) {
			System.out.println("Enter a number");
			int num = scan.nextInt();
			
			if (num*10>100) {
				System.out.println("Invalid number.");
				continue;
			}
			
			product+=num*10;
			System.out.println("Product value is " + product);
		}
		scan.close();
		System.out.println("The End");

	}

}
