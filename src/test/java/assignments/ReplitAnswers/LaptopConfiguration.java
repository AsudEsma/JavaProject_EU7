package assignments.ReplitAnswers;

import java.util.Scanner;

public class LaptopConfiguration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double price = 0.0;
		
		//Screen Sizes:
		
		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		
		if (screenSize == 13.3) {
			price = 200;
		} else if (screenSize == 15.0) {
			price = 300;
		} else if (screenSize == 17.3) {
			price =400;
		} else {
			System.out.println("Invalid entry.");
		}
		
		//CPU Types:
		
		System.out.println("Select CPU type:");
		String cpu = scan.next();
		scan.nextLine();
		
		if ("i3".equals(cpu)) {
			price += 150;
		} else if ("i5".equals(cpu)) {
			price += 250;
		} else if ("i7".equals(cpu)) {
			price += 350;
		} else {
			System.out.println("Invalid entry.");
		}
		
		//RAM Sizes:
		
		System.out.println("Select RAM size:");
		int ram = scan.nextInt();
		
		price += ram/4*50;
		
		//Storage Types:
		
		System.out.println("Select storage type:");
		String storage = scan.next();
		scan.nextLine();
				
		System.out.println("Enter memory size:");
		int memory = scan.nextInt();
		
		if ("HDD".equals(storage)) {
			price = price + memory/500*50;
		} else if ("SSD".equals(storage)) {
			price = price + memory/500*100;
		} else {
			System.out.println("Invalid entry.");
		}
		
		//Screen Resolution:
		
		System.out.println("Enter screen resolution:");
		String resolution = scan.next();
		scan.nextLine();
		
		if ("FULLHD".equals(resolution) || "fullHD".equals(resolution) || "FullHD".equals(resolution) || "Full HD".equals(resolution)) {
			price += 100;
		} else if ("4K".equals(resolution) || "4k".equals(resolution)) {
			price += 200;
		}
		
		System.out.println("Laptop price is: $" + price);
		
		scan.close();
	}
	
}
