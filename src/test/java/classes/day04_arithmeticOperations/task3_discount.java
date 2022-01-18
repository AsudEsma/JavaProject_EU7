package classes.day04_arithmeticOperations;

public class task3_discount {

	public static void main(String[] args) {

		/*This program calculates the sales price of an item
		 * that is regularly priced at $59, with a 20% discount*/

		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		
		System.out.println("Regular Price:\t\t$" + regularPrice);
		System.out.println("Discount Amount:\t$" + discount);
		System.out.println("Discounted Price:\t$" + salesPrice);
		
		
		
	}

}
