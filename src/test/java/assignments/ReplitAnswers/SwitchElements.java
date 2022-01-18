package assignments.ReplitAnswers;

import java.util.*;

public class SwitchElements {

	public static void main(String [] args) {
	    Scanner in = new Scanner(System.in);
	    int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
	    System.out.println(Arrays.toString(do_switch(arr)));
	    in.close();
	    String a=Arrays.toString(do_switch(arr));
		System.out.println(a.replace(" ",""));
	}
	
	public static int[] do_switch(int[] i) {

		int[] switched = Arrays.copyOf(i, i.length);
		switched[switched.length-1] = i[0];
		switched[0] = i[i.length-1];
		return switched;
		
	}
}
