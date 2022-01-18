package assignments.ReplitAnswers;

import java.util.Scanner;

public class Party {
	
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);

	    
	    // your code 
	    // ------------------------------------------
	    
	    String guestList = " ";
	    String answer = "yes";
	    int count = 0;
	    
	    do {
	    	
	    	System.out.println("Please enter guest name:");
	    	String name = input.nextLine();
	    	count++;
	    	
	    	System.out.println("Do you want to enter new guest name:");
	    	answer = input.nextLine();
	    	
	    	if (count==1) {
	    	guestList = name;
	    	} else {
	    		guestList += ", " + name;
	    	}
	    	
	    } while ("yes".equals(answer));
	    
	    System.out.print("Guest\'s list: ");
	    System.out.println(guestList);

	    input.close();
	}
}
