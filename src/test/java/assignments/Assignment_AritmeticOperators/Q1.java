package assignments.Assignment_AritmeticOperators;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Gallon into Liter
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the gallon converter. Please enter the amount:");
		int gallon = scan.nextInt();
		double liter = gallon/0.26417;
		
		System.out.println(gallon + " gallon is " + liter + " liter");
		
		scan.close();
	}

}
