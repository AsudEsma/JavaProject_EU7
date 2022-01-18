package assignments.ReplitAnswers;

import java.util.*;

public class CombineArrays {

	public static ArrayList<String> combineRs(String[] r1,String[] r2){

	  // your code here
	  
		ArrayList<String> combined = new ArrayList<>();
		for(String each : r1) {
			combined.add(each);
		}

		for(String each : r2) {
			combined.add(each);
		}

		return combined;

	   
	  }

	  public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      String [] strs = new String[in.nextInt()];
	      String [] strs2 = new String[in.nextInt()];
	      for(int i=0; i < strs.length; i++) {
	        strs[i] = in.next();
	      }
	      for(int i=0; i < strs2.length; i++) {
	        strs2[i] = in.next();
	      } in.close();

	    System.out.println(combineRs(strs,strs2));

	  }
	
}
