package assignments.ReplitAnswers;

import java.util.Scanner;

public class FindTheLength {

	public static void main(String[] args) {
	//WRITER YOU CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text:");
		String text = sc.nextLine();
		System.out.println("Length is: " + text.length());
		
		sc.close();
	}
}
