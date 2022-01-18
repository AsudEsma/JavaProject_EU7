package classes.day15_methods;

import java.util.Scanner;

public class Assignment1_SwapValues {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter two numbers.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("First number: " + n1);
		System.out.println("Second number: "+ n2);

		System.out.println();
		System.out.println("*********THE SECOND WAY*********");
		System.out.println();
		
		System.out.println("Please, enter two numbers.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("First number: " + num1);
		System.out.println("Second number: "+ num2);
		
		scan.close();
	}
	
	

}
