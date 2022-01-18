package assignments.ReplitAnswers;

import java.util.Scanner;

public class VehicleRecall_2 {

	public static void main(String[] args) {
		// DO NOT CHANGE:
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter vehicle's year:");
	    int vehicleYear = input.nextInt();

	    //WRITE YOUR CODE HERE:
	    
	    if (vehicleYear>1994 && vehicleYear<1999) {
	    	System.out.println("Your vehicle needs to be recalled!");
	    } else if (vehicleYear>2000 && vehicleYear<2003) {
	    	System.out.println("Your vehicle needs to be recalled!");
	    } else if (vehicleYear>2003 && vehicleYear<2007) {
	    	System.out.println("Your vehicle needs to be recalled!");
	    } else if (vehicleYear>2014 && vehicleYear<2018) {
	    	System.out.println("Your vehicle needs to be recalled!");
	    } else {
	    	System.out.println("Your vehicle is fine, enjoy!");
	    }
	    
	    input.close();
	}

}
