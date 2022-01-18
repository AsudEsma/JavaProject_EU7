package assignments.ReplitAnswers;

import java.util.Scanner;

public class isPos {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++){
	    arr[i]=inp.nextInt();
	    } inp.close();
	    //#2 Your code here

	  for(int i=0; i<size; i++) {
		  isPositive(arr[i]);
	  }
	    
	  
	  }
	  
	  public static void isPositive(int num){
	    //#1 your code here
	    if(num==0) {
	    	System.out.println("zero");
	    } else if(num<0) {
	    	System.out.println("negative");
	    } else {
	    	System.out.println("positive");
	    }
	    
	   
	  }
}
