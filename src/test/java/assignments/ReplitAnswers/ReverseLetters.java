package assignments.ReplitAnswers;

import java.util.Scanner;

public class ReverseLetters {
	
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
		System.out.println(reverseNoSpec(in.next()));
		in.close();
		
	  }

	  public static String reverseNoSpec(String str) {

		  // your code here

		  char[] rev = str.toCharArray();
		  int lR = 0, rL = str.length()-1;
		  String nonAlphabetic = str.replaceAll("[a-zA-Z0-9]", "");

		  for( ; lR<rL ;){

			  if(nonAlphabetic.contains(""+rev[lR])){
				  lR++;
				  continue;
			  }
			  
			  if(nonAlphabetic.contains(""+rev[rL])){
				  rL--;
				  continue;
			  }
			  char dummy = rev[rL];
			  rev[rL] = rev[lR];
			  rev[lR] = dummy;
			  lR++;
			  rL--;
	        }
	        
	        return String.valueOf(rev);

	  }

}
