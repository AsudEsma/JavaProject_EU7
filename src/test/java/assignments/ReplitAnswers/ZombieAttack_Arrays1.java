package assignments.ReplitAnswers;

import java.util.*;

public class ZombieAttack_Arrays1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

	    //TODO. Write you code below this line.
	    input.close();
	    
	    System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int length = inhabitants.length;
        int sum;
        int day = 0;
        do{
            day++;
            sum = 0;
            for (int j = 0; j < length; j++) {
            	inhabitants[j] =inhabitants[j] /2;
            }
            for (int city : inhabitants) {
                sum += city;
            }
            System.out.println("Day " + day + " " +Arrays.toString(inhabitants));
            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }while(sum != 0);
 
	}
}
