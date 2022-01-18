package assignments.ReplitAnswers;

import java.util.Scanner;

public class CountHI {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    scan.close();
	    
	    int counter = 0;
	    for(int i=0; i<str.length()-1;i++) {
	    	if(str.substring(i, i+2).equals("hi")) {
	    		counter++;
	    	}
	    }
	    
	    System.out.println(counter);
	    
	  }

}
