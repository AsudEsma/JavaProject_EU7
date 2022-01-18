package assignments.ReplitAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {

	public static void add_to_r(int[] r,int n) {
		//create new array with one more position.
		int[] newList = new int[r.length+1];
		
		for (int i=0; i<r.length; i++) {
			newList[i] = r[i];
		}
		
		newList[newList.length-1] = n; 
		System.out.println(Arrays.toString(newList));
	}
  
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt(), n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ; i <=size-1; i++){
	        arr[i]=inp.nextInt();
	    } inp.close();
	    
	     add_to_r(arr, n);
   
	}
}
