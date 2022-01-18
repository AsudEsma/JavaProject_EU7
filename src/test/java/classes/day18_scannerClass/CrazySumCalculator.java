package classes.day18_scannerClass;

import java.util.Scanner;

public class CrazySumCalculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("Please, enter your number: ");
			num = sc.nextInt();

			if (num<0) {
				break;
			} else {
				sum+=num;
			}
			
		} while(true);
		
		System.out.println("Total is: " + sum);
		sc.close();
	}

}
