package classes.day09_controlFlowStatements;

import java.util.Scanner;

public class task1_ComputerBrandsScanner_IF {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please, enter the computer brand you are thinking of buying.");
		String compBrand = scan.nextLine();
		
		if (compBrand.equals ("apple") || compBrand.equals ("Apple")) {
			System.out.println("Apple-no virus. Sleek design. Good choice.");
		} else if (compBrand.equals ("monster") || compBrand.equals ("Monster")) {
			System.out.println("Nice choice. You are gonna be deaf tho. Those fans... Oh, good luck.");
		} else if (compBrand.equals ("dell") || compBrand.equals ("Dell")) {
			System.out.println("Though one, goog luck.");
		} else if (compBrand.equals ("acer") || compBrand.equals ("Acer")) {
			System.out.println("Not recommended. But it's your choice after all.");
		} else {
			System.out.println("What are you doing, put yourself together. This is an unknown brand. You cannot do this to yourself.");
		}
		
		scan.close();
	}

}
