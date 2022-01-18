package classes.day19_stringClass;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please, enter your first name: ");
		String firstName = scan.next();
		
		System.out.print("Please, enter your last name: ");
		String lastName = scan.next();
		
		System.out.println("Total characters in your first and last names are " + ((firstName.length()+lastName.length())));
	
		scan.close();
	}

}
