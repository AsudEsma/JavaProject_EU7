package classes.day10_controlFlowStatements;

import java.util.Scanner;

public class Task7_MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the multiplication table app.");
		System.out.println("Please, enter the number you wish to see the multiplication table.");
		int num = scan.nextInt();

		System.out.println("Multiplication Table for " + num);
		System.out.println("---------------------------");
		
		for (int mt=1; mt<=10; mt++) {
			System.out.println(num + "*" + mt + "=" + (num*mt));
		}
		
		scan.close();
	}

}
