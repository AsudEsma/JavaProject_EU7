package assignments.ReplitAnswers;

import java.util.*;

public class ArrayList_2Times {
	
	
	//create your method below

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrList) {
		
		ArrayList<Integer> twoTimes = new ArrayList<>();
		
		for(Integer each : arrList) {
			
			twoTimes.add(each);
			twoTimes.add(each);
		}
	
		return twoTimes;
		
	}

	// Do not touch below

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	    	list.add(in.nextInt());
	    }
	    
	    in.close();
	    
	    System.out.println(twoTimes(list));

		}
		
}


