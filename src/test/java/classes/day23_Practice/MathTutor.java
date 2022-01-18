package classes.day23_Practice;

import java.util.*;

public class MathTutor {

	public static void main(String[] args) {

		int num1, num2, sum, userAnswer;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		num1 = r.nextInt(100);
		num2 = r.nextInt(100);
		
		System.out.println("What is the answer for the following problem?");
		System.out.println(num1 + " + " + num2 + " = ?");
		sum = num1 + num2;
		userAnswer = sc.nextInt();
		sc.nextLine();
		
		if (sum == userAnswer) {
			System.out.println("Congrats! You answered correctly.");
		} else {
			System.out.println("Sorry, wrong aswer. The correct answer is: " + sum);
		}
		
		sc.close();
	}

}
