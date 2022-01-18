package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_CountAppearance {

	public static int countAppearance(String[] arr,String t){
		  int count = 0;
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i].equals(t)) {
				  count++;
			  }
		  }
		  return count;

	  } //end  count_appearance

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String [] strs = new String[in.nextInt()];
	    String word = in.next();
	    for(int i=0; i < strs.length; i++) {
	      strs[i] = in.next();
	    }
	    in.close();
	    System.out.println(countAppearance(strs,word));

	   }
}
