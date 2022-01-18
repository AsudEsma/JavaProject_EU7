package assignments.ReplitAnswers;

import java.util.*;

public class SecondConverter {

	  public static void main(String[] args) {
	    //YOUR CODE HERE:
	    
	    int inputSeconds, hours, minutes, seconds;
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter seconds:");
	    inputSeconds = scan.nextInt();
	    
	    hours=inputSeconds/60/60;
	    minutes=(inputSeconds/60)%60;
	    seconds=inputSeconds%60;    

	    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	   
	    scan.close();
	    
	  }
	}
	

