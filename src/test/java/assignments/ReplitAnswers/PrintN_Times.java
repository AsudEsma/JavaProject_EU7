package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintN_Times {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    //WRITE YOUR CODE HERE
		    
		    for (int i=1; i<=n; i++) {
		    	System.out.print("*");
		    }
		    
		    scan.close();
		    
		  }
		}
