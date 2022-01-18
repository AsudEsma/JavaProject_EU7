package assignments.ReplitAnswers;

import java.util.Scanner;

public class ReverseIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//WRITE YOUR CODE HERE
		String reversed = "";
		if(word.length()==5) {
			for (int i=4; i>=0; i--) {
				reversed+=""+word.charAt(i);
			}
			
			System.out.println(reversed);
		} else if (word.length()<5) {
			System.out.println("Too short!");
		} else {
			System.out.println("Too long!");
		}
		
		scan.close();
	}
}
