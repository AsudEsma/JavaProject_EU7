package assignments.Assignment_StringMethods;

import java.util.Scanner;

public class Q13_ErdemOre {

	public static void main(String[] args) {
		//If you are lost, just use this app I write for you!
		
		Scanner input = new Scanner(System.in);
		
		printMap();
		
		System.out.print("Please enter your start point: ");
		String location = input.next();
		
		System.out.print("Please enter your end point: ");
		String target = input.next();
		input.close();
		
		
		
		while(! location.equals(target)) {
			
			location = move(location);    // move to the next way point
			
			if(! location.equals(target)) {
				System.out.print("> "); // keep giving directions
			}else {
				System.out.print(":");   // we're almost there just put :
			}
			
		}
		
		
		
		if (location.equals(target)) {
			System.out.println(target + " found");  //finally
		}
		
		
	}

	private static void printMap() {
		System.out.println("A---------B");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("D---------C");
		
	}

	private static String move(String location) {
		
		switch (location) {
		case "A":
			System.out.print("right ");
			location = "B";
			break;
		case "B":
			System.out.print("down ");
			location = "C";
			break;
		case "C":
			System.out.print("left ");
			location = "D";
			break;
		case "D":
			System.out.print("up ");
			location = "A";
			break;

		default:
			System.out.println("You don't know where you are going!");
			break;
		}
		
		return location;
	}
	
}
