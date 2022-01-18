package assignments.ReplitAnswers;

import java.util.Scanner;

public class AddNumbers {
	
	  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE:

		    int num1, num2, num3, sum;
		    
		    
		    System.out.println("Enter 3 numbers:");
		    Scanner sc = new Scanner(System.in);
		    num1   = sc.nextInt();
		    num2 = sc.nextInt();
		    num3 = sc.nextInt();
		    sc.close();
		    
		    sum=num1+num2+num3;
		    System.out.println("Sum of numbers: "+ sum);


	  }

}