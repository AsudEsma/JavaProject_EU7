package classes.day13_methods;

import java.util.Scanner;

public class Task3_GreaterNum {

	public static void main(String[] args) {

		greaterNum();
	}
	
	public static void greaterNum() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter two numbers.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println("The greater number is " + num1);
		} else if (num2>num1) {
			System.out.println("The greater number is " + num2);
		} else {
			System.out.println("The numbers are equal");
		}
		
		scan.close();
	}

}
