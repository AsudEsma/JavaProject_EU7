package assignments.ReplitAnswers;

import java.util.*;

public class PopulateArray {
	
	public static int[] populate(int[] r) {
		
		int[] brandNew = new int[r.length];
		for(int i=0; i<r.length; i++) {
			brandNew[i] = i+1;
		}
		
		return brandNew;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) 	{
	    int [] i= new int[new Scanner(System.in).nextInt()]; 
	    i = populate(i) ;
	    System.out.println(Arrays.toString(i));
	    
		
	}

}
