package assignments.ReplitAnswers;

import java.util.Scanner;

public class SimpleCalculator {

	  public static void main(String[] args) {
	      plus();
	  }
	  
	  public static void plus(){
	     
	    //your code here
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter first number:");
		  int num1 = scan.nextInt();
		  scan.nextLine();
		  
		  System.out.println("enter second number:");
		  int num2 = scan.nextInt();
		  scan.nextLine();

		  int result = num1+num2;
		  System.out.println("result: " + result);
	    
	   scan.close(); 
	  }
	  
	}
