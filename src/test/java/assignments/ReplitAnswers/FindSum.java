package assignments.ReplitAnswers;

import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    input.close();
	    // DO NOT TOUCH ABOVE
	    //TODO: Write your code below
	    
	    int total = 0;
	    for(int each : nums) {
	    	total += each;
	    }

	    System.out.println(total);
	}

}
