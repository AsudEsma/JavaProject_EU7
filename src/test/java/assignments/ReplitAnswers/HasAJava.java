package assignments.ReplitAnswers;

import java.util.Scanner;

public class HasAJava {
	
	public static void main(String[] args) {
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

	    if(word.length()>=4) {
	    
		    if(word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java")) {
		    	exists=true;
		    	System.out.println(exists);
		    } else {
		    	System.out.println(exists);
		    }
	    } else {
	    	System.out.println(exists);
	    }
	    
	    scan.close();
	}
}
