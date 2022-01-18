package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveArrayList {

	public static ArrayList<Double> test (ArrayList<Double> dubs){
		//write code here
		
		dubs.remove(0);
		dubs.remove(0);

		return dubs;

	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		ArrayList<Double> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextDouble());
	    }
	    in.close();
	
	    System.out.println(test(list));

  }
}
