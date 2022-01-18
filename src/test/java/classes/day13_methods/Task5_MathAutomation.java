package classes.day13_methods;

import java.util.Scanner;

public class Task5_MathAutomation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter 2 numbers.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please, enter the operator.");
		String operator = scan.next();
		scan.nextLine();
		
		math(num1,num2,operator);

		scan.close();
	}
	
	
	
	public static void math(double num1, double num2, String operator) {
		
		double sum=0;
		
		if ("+".equals(operator)) {
			sum = num1 + num2;
		} else if ("*".equals(operator)) {
			sum = num1 * num2;
		} else if ("/".equals(operator)) {
			sum = num1 / num2;
		} else if ("-".equals(operator)) {
			sum = num1 - num2;
		} else if ("%".equals(operator)) {
			sum = num1%num2;
		} else {
			System.out.println("Invalid entry.");
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + sum);
	}
	

}
