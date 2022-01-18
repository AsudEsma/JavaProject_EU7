package classes.day35_encapsulation;

import java.util.Scanner;

public class RouletteGame {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Please, enter a number: ");
		int num = inp.nextInt();
		inp.close();
		
		RoulettePocket p1 = new RoulettePocket();
		p1.getPocketColor(num);

	}

}
