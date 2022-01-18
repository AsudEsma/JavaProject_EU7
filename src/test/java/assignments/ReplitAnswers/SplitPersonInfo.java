package assignments.ReplitAnswers;

import java.util.Scanner;

public class SplitPersonInfo {
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    inp.close();
	    person(s) ;
	}
	  
	public static void person(String info) {
		//your code here
		String[] values = info.split(",");
		System.out.println("person name: " + values[0]);
		System.out.println("last name: " + values[1]);
		System.out.println("age: " + values[2]);

	}

}
