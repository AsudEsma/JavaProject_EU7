package live_reviews_JAVA.week7_review;

import java.util.ArrayList;
import java.util.Arrays;

public class R09_ArrayListExamples {
	
	public static void main(String[] args) {
		
		String[] arr = {"Java","C#","C++","Python"};
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list);
		list.addAll(Arrays.asList(arr));
		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("C#","C++"));
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(list3);
		
		list.addAll(list2);
		list.addAll(list3);
		System.out.println(list);
		
		list.removeAll(list2); // removes all the elements that list2 have
		System.out.println(list);
		
		
		
		
	}

}
