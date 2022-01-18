package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
	
	//create your method below
	public static ArrayList<Integer> multiply2(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<>();
		for(Integer each : list) {
				newList.add(each*2);

		}
		
		return newList;
	}

	  // Do not touch below

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    } in.close();

	    System.out.println(multiply2(list));

	  }

}
