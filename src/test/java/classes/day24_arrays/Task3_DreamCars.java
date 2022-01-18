package classes.day24_arrays;

import java.util.*;

public class Task3_DreamCars {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please, select your car: ");
		int index = scan.nextInt();
		int price = 0;
		
		String[] cars = new String[7];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";
		
		if(index>=0 && index<3) {
			price = rn.nextInt((40000-20000)+1)+20000;
			System.out.println("Price for the selected car is: US$ " + price);
		} else if (index>=3 && index<5) {
			price = rn.nextInt((80000-50000)+1)+50000;
			System.out.println("Price for the selected car is: US$ " + price);
		} else if (index>=5 && index<7) {
			price = rn.nextInt((150000-100000)+1)+100000;
			System.out.println("Price for the selected car is: US$ " + price);
		} else {
			System.out.println("Invalid entry.");
		}

		scan.close();

	}

}
