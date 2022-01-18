package live_reviews_JAVA.week6_review;

import java.util.Arrays;

public class A05_MallShoppingAppTest {

	public static void main(String[] args) {
		
		String[] items = {"Shoes","Jacket","Gloves","AirPods","iPad","iPhone 12 Case"};
		double[] prices = { 99.90,  150.0,   9.99,    179.99,  249.90,   39.99};
		int[] itemIDs = {  12345,   12346,  12347,     12348,  12349,   12350};
		
		System.out.println("Find the index of gloves in the shopping");
 		Arrays.binarySearch(items, "gloves");
 		System.out.println("Index of the item is " + Arrays.binarySearch(items, "Gloves"));
 		
 		int j=0;
 		for(String item : items) {
 			if(item.equals("Gloves")) {
 			System.out.println("Index of the item is " + j++);	
 			break;
 			}
 			j++;
 		}
 		
 		for(int i=0; i<items.length; i++) {
 			if(items[i].equals("Gloves")) {
 	 			System.out.println("Index of the item is " + i);
 			}
 		}
 		
 		System.out.println("-----Set a boolean variable true if 'iPad' is found-----");
 		boolean flag = false;
 		for(int i=0; i<items.length; i++) {
 			if(items[i].equals("iPad")) {
 				flag = true;
 				break;
 			}
 		}
 		
 		System.out.println(flag);
 		
 		for(String item : items) {
 			if(item.equals("iPad")) {
 			flag=true;	
 			break;
 			}
 		}
 		
 		System.out.println(flag);
 		
 		System.out.println(Arrays.toString(items).contains("iPad"));
 		System.out.println(Arrays.toString(items).toLowerCase().contains("ipad".toLowerCase()));
 		
 		System.out.println("---print a report of each shopping item ------");
 		for(int i=0; i<items.length; i++) {
 			System.out.println(items[i] + " - " + prices[i] + " � - #" + itemIDs[i]);
 		}
 		
 		
 		
 		for(int i=0; i<items.length; i++) {
 			if(items[i].equalsIgnoreCase("jacket")) 
 			System.out.println(items[i] + " - " + prices[i] + " � - #" + itemIDs[i]);
 		}
	}
}
