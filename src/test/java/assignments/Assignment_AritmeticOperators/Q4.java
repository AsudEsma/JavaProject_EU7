package assignments.Assignment_AritmeticOperators;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Price in cents: ");
		int price = scan.nextInt();
		int cent = 100-price;
		int quarter = cent/25;
		int dime = cent%25/10;
		int nickle = ((cent%25)%10)/5;
						
		if (price>0 && price<=100) {
			System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, " + nickle + " nickels");
			
		} else {
			System.out.println("Invalid price.");
		}
		
		scan.close();
	}

}

