package assignments.Assignment_Array;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    scan.close();
	    
	    int[] arr = new int[num];
	    for(int i=0; i<num; i++) {
	    	if(i==0 || i==1) {
	    		arr[i] = i; // 0 1
	    	} else {
	    		arr[i] = arr[i-2]+arr[i-1];
	    	}
	    }
	    
	    System.out.print("For n = " + num + ", Fibonacci series: "); 
	    
	    for (int i=0; i<num; i++) {
	    	if(i == 0) {
		    	int a = arr[i];
		    	System.out.print(a);
	    	} else {
	    		int a = arr[i];
		    	System.out.print(" " + a);
	    	}
	    }
	    
	}
}
