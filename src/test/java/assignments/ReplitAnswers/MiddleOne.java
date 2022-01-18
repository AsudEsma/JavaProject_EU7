package assignments.ReplitAnswers;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//YOUR CODE HERE
		
		if (word.length()%2!=0) {
			if(word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
			} else {
				System.out.println(word.concat(word).concat(word));
			}
		} else {
			if(word.length()>=4) {
				System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
			} else {
				System.out.println(word.concat(word));
			}
		}
		 
		scan.close();		    
		    
	}
}
