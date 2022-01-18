package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_RemoveDuplicates {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.println(uniqueChars(in.nextLine()));
		in.close();
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your code
		  String uniques = "";
		  
		  for(int i=0; i<str.length(); i++) {
			  String letter = ""+str.charAt(i);
			  if(uniques.contains(letter)) {
			  } else {
				  uniques += letter;
			  }
		  }
		  
		  return uniques;
		  
	  }
}
