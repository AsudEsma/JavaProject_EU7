package classes.day07_controlFlowStatements;

public class SmallTasks {

	public static void main(String[] args) {

		int x, y;
		x=2;
		y = 20;
		
		if(y == 20) {
			x = 5;
			System.out.println("x equals to " + x);
		}
				
		System.out.println("****************");
		
		double salary, payRate;
		int hours;
		
		salary = 1000;
		payRate = 1.5;
		hours = 42;
		
		if (hours>40) {
			
			salary = salary * payRate;
			System.out.println("Salary: " + salary);
		}
				
		System.out.println("****************");
		
		int fee;
		boolean max;
		
		fee = 15;
		max = false;
		
		if (max == true) {
			fee = 50;
			System.out.println("Fees are " + fee);
		}
		
		System.out.println("****************");
		
		int a, b, c;
		a = 0;
		b = 65;
		c = 100;
		
		if (b == 50 || c > 100) {
			a = 20;
			System.out.println("a is " + a);
		}
				
		System.out.println("****************");
		
		int temp;
				
		temp = 75;
				
		if (temp > 70 && temp < 80) {
			System.out.println("The temprature is ideal.");
		}
		
		System.out.println("****************");
		
		int age = 35;
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		
		System.out.println("****************");
		
		int num1, num2, num3;
		num1 = 5;
		num2 = 89;
		num3 = 1247;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest number is " + num1);
		}
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("The greatest number is " + num2);
		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("The greatest number is " + num3);
		}
		
		System.out.println("****************");
		
		int numb1, numb2;
		numb1 = 25;
		numb2 = 36;
		
		if (numb1 == numb2) {
			System.out.println("The numbers are equal.");
		}
		
		if (numb1 != numb2) {
			System.out.println("The numbers are \'not\' equal.");
		}
		
		System.out.println("****************");
		
		int hour;
		hour = 15;
		
		if (hour < 12) {
			System.out.println("Good Morning!");
		}
		
		if (hour >= 12 && hour < 15) {
			System.out.println("Good Afternoon!");
		}
		
		if (hour >= 15) {
			System.out.println("Good Evening!");
		}
		
		System.out.println("****************");
	}
	

}
