package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrefixAgain {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
		
	    String remaining = str.substring(n+1);
	    String letter = ""+str.charAt(n-1);
		if (remaining.contains(letter)) {
	   		System.out.println(true);
	    } else {
	   		System.out.println(false);
	    }
   
	 scan.close();   
	}
}
