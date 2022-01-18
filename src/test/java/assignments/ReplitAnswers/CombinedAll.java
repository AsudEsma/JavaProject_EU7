package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinedAll {

	public static ArrayList<Integer> CombinedAll (ArrayList<Integer> l1, ArrayList<Integer> l2) {

	//create your method below
		ArrayList<Integer> combined = new ArrayList<>();
		l1.addAll(l2);
		
		for(Integer each : l1) {
			combined.add(each);
		}

		return combined;



	  // Do not touch below
	}
	  
	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int size2 = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    ArrayList<Integer> list2 = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }
	    for(int i=0; i < size2; i++) {
	      list2.add(in.nextInt());
	    }

	    System.out.println(combineAL(list, list2));

	  }

	private static char[] combineAL(ArrayList<Integer> list, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		return null;
	} 
}
