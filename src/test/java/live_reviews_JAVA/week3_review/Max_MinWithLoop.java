package live_reviews_JAVA.week3_review;

import java.util.Scanner;

public class Max_MinWithLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a number");
		int num1 = scan.nextInt();

		int max = num1;
		int min = num1;
		
		for (int i=1; i<=4; i++) {
			System.out.println("Enter another number");
			int num = scan.nextInt();
			if (num>max) {
				max=num;
			} if (num<min) {
				min=num;
			}
		}

		System.out.println("Max number is " + max);
		System.out.println("Min number is " + min);
		
		scan.close();

	}

}
