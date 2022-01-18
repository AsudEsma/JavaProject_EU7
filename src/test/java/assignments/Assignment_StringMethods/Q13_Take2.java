package assignments.Assignment_StringMethods;

import java.util.Scanner;

public class Q13_Take2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String start = input.next();
		String finish = input.next();
		input.close();
		
		routeInstructions(start, finish);
	}

	public static void routeInstructions(String s, String f) {

		String start = s.toUpperCase();
		String finish = f.toUpperCase();
		
		if(start.equalsIgnoreCase(finish)) {
			System.out.println(finish + " found!");
			
		} else if(start.equalsIgnoreCase("a")) {
			switch (finish) {
			case "B":
				System.out.println("right >: " + finish + " found!");
			break;
			case "C":
				System.out.println("right > down >:" + finish + " found!");
			break;
			case "D":
				System.out.println("right > down > left >: " + finish + " found!");
			break;
			}
			
		} else if(start.equalsIgnoreCase("b")) {
			switch (finish) {
			case "C":
				System.out.println("down >: " + finish + " found!");
			break;
			case "D":
				System.out.println("down > left >: " + finish + " found!");
			break;
			case "A":
				System.out.println("down > left > up >: " + finish + " found!");
			break;
			}
			
		} else if(start.equalsIgnoreCase("c")) {
			switch (finish) {
			case "D":
				System.out.println("left >: " + finish + " found!");
			break;
			case "A":
				System.out.println("left > up >: " + finish + " found!");
			break;
			case "B":
				System.out.println("left > up > right >: " + finish + " found!");
			break;
			
			}
		} else if(start.equalsIgnoreCase("d")) {
			switch (finish) {
			case "A":
				System.out.println("up >: " + finish + " found!");
			break;
			case "B":
				System.out.println("up > right >: " + finish + " found!");
			break;
			case "C":
				System.out.println("up > right > down >: " + finish + " found!");
			break;
			
			}
		}
		
	}
	
	

}
