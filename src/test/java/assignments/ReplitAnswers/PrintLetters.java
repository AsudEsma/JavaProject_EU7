package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintLetters {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    scan.close();

	    for(int i=start; i<=end; i++) {
	    	
	    	System.out.print((char)i);
	    } 
	    
	}
}
