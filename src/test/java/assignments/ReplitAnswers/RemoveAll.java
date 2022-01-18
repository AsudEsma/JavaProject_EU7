package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAll {

	public static ArrayList<String> removeAll (ArrayList<String> wordList, String target) {

		//create your method below

			for(int i=0; i<wordList.size(); i++) {
				wordList.remove(target);
			}

			return wordList;

		  // Do not touch below
		}


	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    String target = in.next();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    } in.close();

	    System.out.println(removeAll(list, target));

	  }
}
