package live_reviews_JAVA.week2_review;

import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		
		System.out.println("Please, enter your grade.");
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt ();
		System.out.println("Please, enter your name.");
		String name = scan.next();
		
		if (grade>=0 && grade<=100) {
			if (grade>60 && grade<70) {
				System.out.println(name + "'s grade is D");
			} else if (grade>=70 && grade<80) {
				System.out.println(name + "'s grade is C");
			} else if (grade>=80 && grade<90) {
				System.out.println(name + "'s grade is B");
			} else if (grade>=90 && grade<=100) {
				System.out.println(name + "'s grade is A");
			} else {
				System.out.println(name + "'s grade is F");
			}
		} else {
			System.out.println("Your entery is invalid.");
		}
		
		scan.close();

	}

}
