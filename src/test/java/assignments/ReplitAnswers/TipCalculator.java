package assignments.ReplitAnswers;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		   //WRITE YOUR CODE HERE
	
		Scanner scan = new Scanner(System.in);
		
		String split = " ";
		int numberOfPeople = 0;
		double checkAmount = 0;
		String serviceQuality = " ";
		double totalPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		System.out.println("Split:");
		split = scan.nextLine();
		
		if ("Yes".equals(split)) {
		
			System.out.println("Number of people:");
			numberOfPeople = scan.nextInt();
				
			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			
			System.out.println("Service Quality:");
			serviceQuality = scan.next();
			scan.nextLine();

			System.out.print("Number of people entered: ");
			for (int i=1 ; i<=numberOfPeople ; i++) {
				System.out.print("&");
			} 
			
			System.out.println();
			
			if ("Poor".equals(serviceQuality)) {
				totalPay = checkAmount*1.05;
				totalTip = checkAmount*0.05;
				totalPerPerson = totalPay/numberOfPeople;
				tipPerPerson = totalTip/numberOfPeople;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
				
			} else if ("Fair".equals(serviceQuality)) {
				totalPay = checkAmount*1.10;
				totalTip = checkAmount*0.10;
				totalPerPerson = totalPay/numberOfPeople;
				tipPerPerson = totalTip/numberOfPeople;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
				
			} else if ("Good".equals(serviceQuality)) {
				totalPay = checkAmount*1.15;
				totalTip = checkAmount*0.15;
				totalPerPerson = totalPay/numberOfPeople;
				tipPerPerson = totalTip/numberOfPeople;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
				
			} else if ("Great".equals(serviceQuality)) {
				totalPay = checkAmount*1.20;
				totalTip = checkAmount*0.20;
				totalPerPerson = totalPay/numberOfPeople;
				tipPerPerson = totalTip/numberOfPeople;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
				
			} else if ("Excellent".equals(serviceQuality)) {
				totalPay = checkAmount*1.25;
				totalTip = checkAmount*0.25;
				totalPerPerson = totalPay/numberOfPeople;
				tipPerPerson = totalTip/numberOfPeople;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
				
			} else {
			System.out.println("Invalid entry.");
			}
		
		} else {
			
			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			
			System.out.println("Service Quality:");
			serviceQuality = scan.next();
			scan.nextLine();
			
			}
			
			if ("Poor".equals(serviceQuality)) {
				totalPay = checkAmount*1.05;
				totalTip = checkAmount*0.05;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				
			} else if ("Fair".equals(serviceQuality)) {
				totalPay = checkAmount*1.10;
				totalTip = checkAmount*0.10;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);

			} else if ("Good".equals(serviceQuality)) {
				totalPay = checkAmount*1.15;
				totalTip = checkAmount*0.15;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				
			} else if ("Great".equals(serviceQuality)) {
				totalPay = checkAmount*1.20;
				totalTip = checkAmount*0.20;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
				
			} else if ("Excellent".equals(serviceQuality)) {
				totalPay = checkAmount*1.25;
				totalTip = checkAmount*0.25;
				System.out.println("Total to pay: " + totalPay);
				System.out.println("Total tip: " + totalTip);
			} else {
				System.out.println("Invalid entry.");
			}

			scan.close();
		
	}
}
