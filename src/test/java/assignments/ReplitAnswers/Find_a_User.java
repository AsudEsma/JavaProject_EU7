package assignments.ReplitAnswers;

import java.util.Scanner;

public class Find_a_User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//WRITE YOUR CODE HERE 
		System.out.println("Enter full name:");
		String name = scan.nextLine();
		
		if(name.equalsIgnoreCase("max payne") || name.equalsIgnoreCase("alan wake")) {
			System.out.println("User found!");
		} else {
			System.out.println("User not found!");
		}
		
		scan.close();
		
	}
}
