package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintFirst_LastCharacter {

	public static void main(String[] args) {
		//DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//WRITE YOUR CODE HERE:
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(word.length()-1));
		
		System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		scan.close();
	}
}
