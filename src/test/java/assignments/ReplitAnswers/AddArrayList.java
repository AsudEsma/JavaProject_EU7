package assignments.ReplitAnswers;

import java.util.ArrayList;

public class AddArrayList {

	public static ArrayList<String> test(){
		ArrayList<String> names = new ArrayList<String>();
		//write code below
		
		names.add("Ali");
		names.add("Asude");
		names.add("Ozan");
		
		//leave below code alone
		return names;
	}

	public static void main(String[] args) {
		System.out.println(test().size());
	}
	
}
