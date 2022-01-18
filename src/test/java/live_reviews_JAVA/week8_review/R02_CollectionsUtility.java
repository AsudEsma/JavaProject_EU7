package live_reviews_JAVA.week8_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R02_CollectionsUtility {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
		
		System.out.println("How many elements there are: " + list.size());
		System.out.println("The is: " + list);
		
		// Reversing the Array List:
		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
		
		// Frequency of the Array elements:
		int freqOfChar = Collections.frequency(list, 'a');
		System.out.println("Frequence of 'a' is: " + freqOfChar);
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.addAll(Arrays.asList(10,25,100,-23,1000,564));
		
		System.out.println("Max number: " + Collections.max(nums));
		System.out.println("Min number: " + Collections.min(nums));
		
		// MAX and MIN for Character List
		System.out.println("Max Char: " + Collections.max(list));
		System.out.println("Min Char: " + Collections.min(list));
		
		
	}
}
