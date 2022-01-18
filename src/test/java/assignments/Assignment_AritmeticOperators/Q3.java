package assignments.Assignment_AritmeticOperators;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to shakamatic!");
		System.out.println("Please, enter your first number:");
		int num1 = scan.nextInt();
		System.out.println("Please, enter your second number:");
		int num2 = scan.nextInt();
		
		int sum = num1+num2;
		num1 = sum-num1;
		num2 = sum-num2;
		
		System.out.println("************************************");
		System.out.println("The first number you entered is " + num1);
		System.out.println("The second number you entered is " + num2);
		System.out.println("************************************");
		
		scan.close();
	}

}
