package classes.day09_controlFlowStatements;

import java.util.Scanner;

public class task1_ComputerBrandsScanner_Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please, enter the computer brand you are thinking of buying.");
		String compBrand = scan.nextLine();
		
		switch (compBrand) {
		case "apple":
		case "Apple":
			System.out.println("Apple-no virus. Sleek design. Good choice.");
			break;
		case "monster":
		case "Monster":
			System.out.println("Nice choice. You are gonna be deaf tho. Those fans... Oh, good luck.");
			break;
		case "dell":
		case "Dell":
			System.out.println("Though one, goog luck.");
			break;
		case "acer":
		case "Acer":
			System.out.println("Not recommended. But it's your choice after all.");
			break;
		default:
			System.out.println("What are you doing, put your sh*ts together. This is an unknown brand. You cannot do this to yourself.");	
					
		scan.close();
		}

	}
}
