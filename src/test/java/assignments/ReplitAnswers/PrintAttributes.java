package assignments.ReplitAnswers;

import java.util.Scanner;

public class PrintAttributes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Atts a = new Atts();
		a.name = in.nextLine();
		a.color = in.nextLine();
		a.amount = in.nextInt();
		   
		System.out.println(a.asString());
		in.close();
	 }
}
	 
	class Atts {
			
		String name, color;
		int amount;
		
		public String asString() {
			String info = "name: " + name + " color: " + color + " amount: " + amount;
			return info;
		}
	}

