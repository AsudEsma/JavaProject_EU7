package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_MergeThem {
	
	public static String mergeStrings(String one, String two) {
	    String merged = "";
	    int word1 = one.length();
	    int word2 = two.length();
	    
		if(word1<word2) {
			for(int i=0; i<word1; i++) {
				merged += ""+one.charAt(i)+(two.charAt(i));
			}
			merged+=two.substring(word1);
			return merged;
		} else if (word1==word2) {
			for(int i=0; i<word1; i++) {
				merged += ""+one.charAt(i)+(two.charAt(i));
			}
			return merged;
		} else {
			for(int i=0; i<word2; i++) {
				merged += ""+one.charAt(i)+(two.charAt(i));
			}
			merged+=one.substring(word2);
			return merged;
		}
	  }

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.println(mergeStrings(in.next(), in.next()));
			
		in.close();	
			
			
	  }
}
