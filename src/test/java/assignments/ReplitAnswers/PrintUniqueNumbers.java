package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for(int i=0; i < size; i++){
			nums[i] = scan.nextInt();
			}
		scan.close();
		
		printUniqueNumbers(nums);
		}
		  
	public static void printUniqueNumbers(int[] nums){
		//WRITE YOUR CODE HERE
		
		for(int i=0; i<nums.length; i++) {
			int count = 0;
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(nums[i]);
			}
		}
		    	
		  
	}
}
