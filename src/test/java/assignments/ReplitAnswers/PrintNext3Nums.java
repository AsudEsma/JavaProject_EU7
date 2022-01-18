package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintNext3Nums {

	  public static void main(String[] args) {
		     Scanner inp = new Scanner(System.in);
		     System.out.println("enter number");
		     int num = inp.nextInt();
		     
		     next3(num);
		     
		     inp.close();
		  
		  }

	public static void next3(int argument) {
	
		System.out.println("next 3 are:");
		System.out.println(++argument + " " + ++argument + " " + ++argument);
	
	}	 
		 
}
