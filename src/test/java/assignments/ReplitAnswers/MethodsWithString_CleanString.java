package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_CleanString {
	
	public static String clean (String text ,String badWord) {

		String cleanS = text.replace(badWord, "").replace("  ", " ").trim();
		return cleanS;
   
	  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(clean(in.nextLine(), in.nextLine()));
		in.close();
	
	}
}
