package classes.day13_methods;

import java.util.Scanner;

public class Task2_NumSum {

	public static void main(String[] args) {

		sumNum();

	}

	public static void sumNum() {

		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Plese, enter 3 numbers.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("The sum of these three numbers are: " + (num1+num2+num3));
		
		scan.close();
	}

}
