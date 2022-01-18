package assignments.ReplitAnswers;

import java.util.*;

public class MethodsWithArrays_MergedArrays {

	public static int[] mergR(int[] a,int[] b) {
	    
		int[] mergedR = new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			mergedR[i] = a[i];
		}

		for(int i=0; i<b.length; i++) {
			mergedR[a.length+i] = b[i];
		}

		return mergedR;
	    
	  }//end mergR

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int [] nums = new int[in.nextInt()];
	    int [] nums2 = new int[in.nextInt()];
	    for(int i=0; i < nums.length; i++) {
	      nums[i] = in.nextInt();
	    }
	    for(int i=0; i < nums2.length; i++) {
	      nums2[i] = in.nextInt();
	    }
	    in.close();
	    System.out.println(Arrays.toString(mergR(nums, nums2)));
	  }
	
}
