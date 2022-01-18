package assignments.Assignment_StringMethods;

import java.util.Scanner;

public class Q1 {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Split or No split: ");
		boolean isSplit = scan.nextBoolean();
		System.out.print("Number of people entered: ");
		int numberPeople = scan.nextInt();
		scan.nextLine();
		System.out.print("Check amount: ");
		double checkAmount = scan.nextDouble();
		scan.nextLine();
		System.out.print("Service quality: ");
		String serviceQuality = scan.nextLine();
		scan.close();

		
		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);
		
	}
	
	public static void tipCalculator (boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		
		double totalPay = 0;
		double totalTip = 0;
		String numPepS = "";
		
		if (isSplit) {
			
			if(serviceQuality.equalsIgnoreCase("poor")) {
				totalPay = checkAmount * 1.05;
				totalTip = checkAmount * 0.05;
			} else if(serviceQuality.equalsIgnoreCase("fair")) {
				totalPay = checkAmount * 1.10; 
				totalTip = checkAmount * 0.10; 
			} else if(serviceQuality.equalsIgnoreCase("good")) {
				totalPay = checkAmount * 1.15; 
				totalTip = checkAmount * 0.15; 
			} else if(serviceQuality.equalsIgnoreCase("great")) {
				totalPay = checkAmount * 1.20; 
				totalTip = checkAmount * 0.20; 
			} else if(serviceQuality.equalsIgnoreCase("excellent")) {
				totalPay = checkAmount * 1.25; 
				totalTip = checkAmount * 0.25; 
			}
			
			for(int i=0; i<numberPeople; i++) {  // 3
				numPepS += "&"; // &&&
			}
			
			System.out.println("Number of people entered: " + numPepS); // &&&   3
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPay/numberPeople);
			System.out.println("Tip per person: " + totalTip/numberPeople);
	
		} else {
			
			if(serviceQuality.equalsIgnoreCase("poor")) {
				totalPay = checkAmount * 1.05;
				totalTip = checkAmount * 0.05;
			} else if(serviceQuality.equalsIgnoreCase("fair")) {
				totalPay = checkAmount * 1.10; 
				totalTip = checkAmount * 0.10; 
			} else if(serviceQuality.equalsIgnoreCase("good")) {
				totalPay = checkAmount * 1.15; 
				totalTip = checkAmount * 0.15; 
			} else if(serviceQuality.equalsIgnoreCase("great")) {
				totalPay = checkAmount * 1.20; 
				totalTip = checkAmount * 0.20; 
			} else if(serviceQuality.equalsIgnoreCase("excellent")) {
				totalPay = checkAmount * 1.25; 
				totalTip = checkAmount * 0.25; 
			}
			
			for(int i=0; i<numberPeople; i++) {  // 3
				numPepS += "&"; // &&&
			}
			
			System.out.println("Number of people entered: " + numPepS);
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
		}
		
	}
}
