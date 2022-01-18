package assignments.ReplitAnswers;

import java.util.Scanner;

public class BurgerOrChicken {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String in = s.next();
	    
	    //your code here
	    double price = 0.0;
	    
	    if ("burger".equals(in) || "chicken".equals(in)) {
	    	price = 10.0;
	    	System.out.println(price);
	    } else if ("soda".equals(in)) {
	    	price = 2.0;
	    	System.out.println(price);
	    } else if ("fries".equals(in)) {
	    	price=3.5;
	    	System.out.println(price);
	    } else {
	    	System.out.println("Invalid entry.");
	    }
	
	    s.close();
	}
	
}
