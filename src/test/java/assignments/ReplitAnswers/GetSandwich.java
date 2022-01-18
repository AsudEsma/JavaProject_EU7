package assignments.ReplitAnswers;

import java.util.Scanner;

public class GetSandwich {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     String bread = "";
	     int countOfBread = 0;

	     for (int i=0; i<str.length()-4; i++) {
	    	 if(str.substring(i, i+5).equalsIgnoreCase("bread")) {
		    	countOfBread++;
	    	 }
	     }
	    	 
	    if(countOfBread>=2) {
	    	bread = str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
	    	System.out.println(bread);
	    } else {
	    	System.out.println("nothing");
	    }
	     
	 scan.close();    
	}
}
