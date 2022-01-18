package assignments.ReplitAnswers;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE	
	    int midlength = word.length()/2;
	    if(word.length()%2!=0) {
		    if(word.length()>=5) {
		    	System.out.println(word.substring(midlength-1, midlength+2));
		    } else {
		    	System.out.println("invalid");
		    }
	    } else {
	    	System.out.println("invalid");
	    }
	    scan.close();
	}
}
