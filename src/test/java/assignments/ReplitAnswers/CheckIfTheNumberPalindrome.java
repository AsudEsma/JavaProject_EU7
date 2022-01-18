package assignments.ReplitAnswers;

import java.util.Scanner;

public class CheckIfTheNumberPalindrome {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		    scan.close();
		  }
		  
		  public static void isPalindrome(int num){
		    //WRITE YOUR CODE HERE
			  int remainder, sum=0, temp;    
			  boolean isPalindrome = false;
			  
			  temp=num;    
			  while(num>0){    
				  remainder=num%10; 
				  sum=(sum*10)+remainder;    
				  num=num/10;    
			  }    
			  if(temp==sum) {
				 isPalindrome=true;
			  } else {   
				 isPalindrome=false; 
			  }
			  System.out.println(isPalindrome);
			}  
		}  