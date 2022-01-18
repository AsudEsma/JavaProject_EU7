package assignments.ReplitAnswers;

import java.util.Scanner;

public class WithoutX_x {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

	    if(word.contains("x") || word.contains("X")) {
	    	System.out.println(word.replace("x", "").replace("X", ""));
	    } else {
	    	System.out.println(word);
	    }
	    
	    scan.close();
	    
	}
}
