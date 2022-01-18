package assignments.ReplitAnswers;

import java.util.Scanner;

public class CarInsuranceQuote {
	
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE

		System.out.println("Enter your name");
		name = scan.nextLine();
		
		System.out.println("Do you have a US driver license?");
		String answer1 = scan.nextLine();
		if(answer1.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		System.out.println("Enter your zip code");
		int zipCode = scan.nextInt();
		scan.nextLine();
		if(zipCode==20910 || zipCode==20740) {
			premium+=60;
		} else if(zipCode==22102 || zipCode==22103) {
			premium+=30;
		} else {
			premium+=50;
		}
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.nextLine();
		if(vehicleOwnership.equalsIgnoreCase("owned")) {
			premium+=10;
		} else {
			premium+=20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.nextLine();
		if(vehicleUsage.equalsIgnoreCase("business")) {
			premium+=50;
		} else if(vehicleUsage.equalsIgnoreCase("pleasure")) {
			premium+=10;
		} else if(vehicleUsage.equalsIgnoreCase("commute")) {
			premium+=20;
			
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			scan.nextLine();
			premium+=daysDrivenToWorkOrSchool*5;
			
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			scan.nextLine();
			premium+=milesToWorkOrSchool*1;
		}

		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		scan.nextLine();
		if(age<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if(age>=16 && age<18) {
			premium*=20;
		} else if(age>=18 && age<=21) {
			premium*=6;
		} else if(age>21 && age<25) {
			premium*=2;
		}
		
		System.out.println("How many years you've been driving?");
		int experience = scan.nextInt();
		scan.nextLine();
		if(experience<=0) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else {
			premium-=experience*5;
		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String accident = scan.nextLine();
		
		if(accident.equalsIgnoreCase("yes")) {
		
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			scan.nextLine();
			premium+=premium*0.2*accidentsAmount;
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.nextLine();
		if(continuousInsurance.equalsIgnoreCase("no")) {
			premium*=2;
		}
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		if(education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters") || education.equalsIgnoreCase("bachelors")) {
			premium*=0.95;
		} else if(education.equalsIgnoreCase("doctors")) {
			premium*=0.9;
		} else {
			premium*=1.05;
		}
		
		referenceNumber = name.substring(0, 2)+age+name.substring(name.length()-2)+zipCode+education.replace(" ", "");
		referenceNumber = referenceNumber.toUpperCase();
		
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: " + referenceNumber);
		
		scan.close();
	
	}
}
