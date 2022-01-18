package classes.day10_controlFlowStatements;

import java.util.Scanner;

public class Task6_LargestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1, num2, repeatNum;
		
		System.out.println("Please, enter the first number.");
		num1=scan.nextInt();
		
		System.out.println("Please, enter the second number.");
		num2=scan.nextInt();
		
		System.out.println("Please, enter how many times you would like it to repeat.");
		repeatNum=scan.nextInt();
	
		for (int repeat=0; repeat<repeatNum; repeat++) {
			
			if (num1>num2) {
				System.out.println("The greater number is " + num1);
			} else if (num2>num1) {
				System.out.println("The greater number is " + num2);
			} else {
				System.out.println("The numbers are equal.");
			}
		}
		
		scan.close();
	}

}
