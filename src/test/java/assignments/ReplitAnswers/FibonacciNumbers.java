package assignments.ReplitAnswers;

import java.util.Scanner;

public class FibonacciNumbers {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		    System.out.println(fib(num));
		    scan.close();
			
		  }
		  
		  public static int fib(int num){
		    //WRITE YOUR CODE HERE
			  if (num <= 1) {
		            return num;
		        }
		 
		        return fib(num - 1) + fib(num - 2);
		    }

		}




