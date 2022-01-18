package classes.day25_arrays;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {

		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		int[] hours = new int[EMPLOYEES];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please, enter the hourly rate: ");
		payRate = scan.nextDouble();
		
		System.out.println("Please, enter the working hours for 5 employees:");
		for(int i=0; i<EMPLOYEES; i++) {
			hours[i]=scan.nextInt();
		}
		
		for(int i=0; i<EMPLOYEES; i++) {
			grossPay = hours[i]*payRate;
			System.out.println("Employee #" +(i+1) + ": US$ " + grossPay);
		}
		
		for(int val : hours) {
			System.out.println(val);
		}
		
		scan.close();
	}

}
