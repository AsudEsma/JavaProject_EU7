package assignments.ReplitAnswers;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter cents:");
		int cent = scan.nextInt();
		int quarter = cent/25;
		int dime = cent%25/10;
		int nickle = ((cent%25)%10)/5;
		int penny = cent%5;
						
		if (cent>0 && cent<100) {
			System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, " + nickle + " nickels, and " + penny + " pennies");
			
		} else {
			System.out.println("Invalid cents amount");
		}
		
		scan.close();
	}

}
