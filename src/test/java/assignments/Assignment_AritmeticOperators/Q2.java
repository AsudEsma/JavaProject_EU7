package assignments.Assignment_AritmeticOperators;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the width:");
		double width = scan.nextDouble();
		System.out.println("Please, enter the height:");
		double height = scan.nextDouble();
		double area = width * height;
		System.out.println("Area is " + area);
		
		scan.close();
	}

}
