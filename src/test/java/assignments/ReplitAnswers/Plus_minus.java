package assignments.ReplitAnswers;

import java.util.Scanner;

public class Plus_minus {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++) {
	      arr[i]=inp.nextInt();
	    } inp.close();
	    
	    plus_minus(arr);
	    
	  }
	
	public static void plus_minus(int[] r) {
		
		int counter0 = 0;
		int counter1 = 0;
		int counter2 = 0;
		for(int i=0; i<r.length; i++) {
			if(r[i]==0) {
				counter0++;
			} else if (r[i]<0) {
				counter1++;
			} else {
				counter2++;
			}
		}
		
		System.out.println("positives:"+counter2+", negatives:"+counter1+", zeros:"+counter0);
	}
}
