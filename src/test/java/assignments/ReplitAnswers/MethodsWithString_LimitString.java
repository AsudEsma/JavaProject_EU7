package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_LimitString {
	
	public static String limit(String text, int maxLength){
	    // your code
		String cut = text.substring(0,maxLength);

		return cut;


	  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(limit(in.nextLine(), in.nextInt()));
	
		in.close();	
	}
}
