package classes.day18_scannerClass;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = 12;
		System.out.print("Guess what number i picked between 1-20: ");
		int guess = scan.nextInt();
	
		while (num!=guess) {
			if (num<guess) {
				System.out.println("You guessed too high.");
				System.out.print("Please, try again: ");
				guess = scan.nextInt();
			} else {
				System.out.println("You guessed too low.");
				System.out.print("Please, try again: ");
				guess = scan.nextInt();
			}
		} System.out.println("Congrats! You got it.");
	
		scan.close();
	}

}
