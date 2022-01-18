package assignments.ReplitAnswers;

import java.util.Scanner;

public class Email_2 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	
	    int underscore = email.indexOf("_");
    	int at = email.indexOf("@");
    	int dot = email.indexOf(".");
    	String firstName = email.substring(0, 1);
    	firstName = firstName.toUpperCase()+email.substring(1, underscore);
    	String lastName = email.substring(underscore+1, underscore+2);
    	lastName = lastName.toUpperCase() + email.substring(underscore+2, at);
    	String domain = email.substring(at+1, dot);
    	
    	System.out.println("First name: " + firstName);
    	System.out.println("Last name: " + lastName);
    	System.out.println("Domain: " + domain);
    	scan.close();
	}
}
