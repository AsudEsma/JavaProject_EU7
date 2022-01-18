package assignments.ReplitAnswers;

import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		
		do {
		
		System.out.println("Enter Item" + count++ + " and its price:");
		item = scan.nextLine();
		price = scan.nextDouble();
		scan.nextLine();

		totalPrice+=price;
		if (count-1==1) {
			shoppingListReport += "Item" + (count-1) + ": " + item + " Price: " + price;
		} else {
			shoppingListReport += ", " + "Item" + (count-1) + ": " + item + " Price: " + price;
		}
		
		System.out.println("Add one more item?");
		countinue = scan.nextLine();
		
		
		if ("yes".equals(countinue)) {
			
		} else {
			
			count=11;
		}
			
		} while (count<=10);
		
		System.out.println(shoppingListReport);
		System.out.println("Total price is: " + totalPrice);
	
	    scan.close();
	}

}
