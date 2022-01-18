package classes.day27_arrays;

public class Teams {

	public static void main(String[] args) {

		String[][] teams = new String[2][4];
		
		teams[0][0] = "Mike";
		teams[0][1] = "Tonny";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";
		teams[1][1] = "Emmy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";

		System.out.print("First player of the first team is ");
		System.out.println(teams[0][0]);
		
		System.out.println("Number of teams: " + teams.length);
		System.out.println("# of people in first team: " + teams[0].length);
		System.out.println("# of people in second team: " + teams[1].length);
		
		
		
	}

}
