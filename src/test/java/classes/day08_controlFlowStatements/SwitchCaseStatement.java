package classes.day08_controlFlowStatements;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String weather = "cold";
		// For exact matches, use switch.
		
		switch(weather) {
		case "sunny":
			System.out.println("Go to park.");
			System.out.println("Sunbath.");
			break; // It will print all the other sections if there is no "break"
		case "hot":
			System.out.println("Go swimming.");
			System.out.println("Buy yourself a nice cup of iced coffee.");
			break; // It will print all the other sections if there is no "break"
		case "windy":
			System.out.println("Fly a kite.");
			System.out.println("Go surfing.");
			break; // It will print all the other sections if there is no "break"
		case "snowy":
			System.out.println("Build a snowman.");
			System.out.println("Drink hot chocolate while watching a movie.");
			System.out.println("Code Java.");
			break; // It will print all the other sections if there is no "break"
		default:
			System.out.println("Code Java in any other weather.");
					
		}

	}

}
