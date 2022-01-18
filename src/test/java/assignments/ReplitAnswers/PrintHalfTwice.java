package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintHalfTwice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//WRITE YOUR CODE HERE
		String half = word.substring(0, word.length()/2);
		System.out.println(half.concat(half));
		scan.close();
	}
}
