package classes.day09_controlFlowStatements;

public class task1_ComputerBrands {

	public static void main(String[] args) {

		String compBrand = "apple";
		
		switch (compBrand) {
		
		case "apple":
		case "Apple":
			System.out.println("Apple-no virus. Sleek design. Good choice.");
			break;
		case "monster":
			System.out.println("Nice choice. You are gonna be deaf tho. Those fans... Oh, good luck.");
			break;
		case "dell":
			System.out.println("Though one, goog luck.");
			break;
		case "acer":
			System.out.println("Not recommended. But it's your choice after all.");
			break;
		default:
			System.out.println("What are you doing, put your sh*ts together. This is an unknown brand. You cannot do this to yourself.");
		}

	}

}
