package classes.day32_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println("\n" + Math.round(sum));
		
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
		
	}

	public static void printList(ArrayList<Integer> nums) {

		for(Integer each : nums) {
			System.out.print(each + " ");
		}	
	}
	

	public static double sumList(ArrayList<Double> dList) {
		
		double sum = 0;
		for(Double each : dList) {
			sum += each;
		}
		return sum;
	}

	private static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> count = new ArrayList<>();
		for(int i=1; i<=size; i++) {
			count.add(i);
		}
		
		return count;
	}
	
	public static ArrayList<Integer> getRandomList (int size) {
		Random r = new Random();
		ArrayList<Integer> randomNums = new ArrayList<>();
		for(int i=1; i<size; i++) {
			randomNums.add(r.nextInt(101));
		}
		
		return randomNums;
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList) {
		ArrayList<Integer> converted = new ArrayList<>();
		
		for(String str : strList) {
			converted.add(Integer.parseInt(str));
		}
		
		return converted;
	}
}
