package assignments.ReplitAnswers;

import java.util.Scanner;

public class BlackjackKeepHand {

	public static void main(String[] args) {
	    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
	    // Variables are already declared and given
	    Scanner s = new Scanner(System.in);
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    //Write your code here:
	    if (player>21) {
	    	System.out.println("player burst");
	    } else {
	    	if (house>player) {
	    	System.out.println("player loss ");
	    	} else if (house<player) {
	    	System.out.println("player win");
	    	} else {
	    	System.out.println("its a tie");
	    	}
	    }
	    
	    s.close();
	}

}
