package classes.day23_Practice;

import java.util.*;

public class Task1_RollTheDice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		int a, b;
		String userInput;
		
		do {
		System.out.println("rolling the dice...");
		a = rn.nextInt(6)+1;
		b = rn.nextInt(6)+1;
		System.out.println("Their values are: " + a + " " + b);
		System.out.println("Roll them again? (y=yes)");
		userInput = scan.next();
		}
		
		while (userInput.equalsIgnoreCase("y"));
		scan.close();
	}

}
