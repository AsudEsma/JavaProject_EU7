package live_reviews_JAVA.week7_review;

import java.util.ArrayList;
import java.util.Arrays;

public class R10_ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> codes = new ArrayList<>(Arrays.asList("OK","Created","OK","Forbidden","OK","Unauthorized",
				"Created"));
		
		System.out.println(removeDublicates(codes));
	}
	
	public static ArrayList<String> removeDublicates(ArrayList<String> list) {
		
		ArrayList<String> removeDublicates = new ArrayList<>();
		
		for(String each : list) {
			if(!removeDublicates.contains(each)) {
				removeDublicates.add(each);
			}
		}
		
		return removeDublicates;
		
	}

}
