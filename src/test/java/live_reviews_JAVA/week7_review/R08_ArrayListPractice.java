package live_reviews_JAVA.week7_review;

import java.util.ArrayList;

public class R08_ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(250);
		nums.add(250);
		nums.add(400);
		
		System.out.println(nums);
		System.out.println(nums.size());
		System.out.println(nums.get(2));
		
		nums.add(2,250);
		System.out.println(nums);
		
		nums.remove(nums.size()-1);  // removing based on index
		nums.remove(nums.get(nums.size()-1));  // removing based on value
		System.out.println(nums);
		
		nums.remove(Integer.valueOf(300));
		System.out.println(nums);
		
		nums.remove(Integer.valueOf(250));  // it will remove the first value it finds
		System.out.println(nums);
		
		boolean b1 = nums.contains(250);
		System.out.println(b1);
		
		
		
	}
}
