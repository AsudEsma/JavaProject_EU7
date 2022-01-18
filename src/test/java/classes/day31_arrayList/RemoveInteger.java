package classes.day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		System.out.println(nums.size());

		nums.remove(5);
		System.out.println(nums.toString());
		
//		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(4);
		
//		nums.remove(n1);
		nums.remove(n2);
//		nums.remove(new Integer(10));
		System.out.println(nums.toString());
		
		for(int each : nums) {
			System.out.println(each);
		}
		
	}

}
