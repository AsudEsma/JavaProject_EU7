package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_WordCount {
	
	public static int wordCount(String words) {
	    // your code
		int counter = 1;
		for(int i=0; i<words.length(); i++) {
			words=words.trim();
			if(words.charAt(i) == ' ') {
				counter++;
			}
		}
		
		return counter;
	      
	  }


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(wordCount(in.nextLine()));
  
		in.close();  
	}
}
