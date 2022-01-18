package classes.day16_classObjects;

public class Employee {

	String name;
	String jobTitle;
	int salary;
	
	public void work () {
		System.out.println(name + " is working as " + jobTitle);
	}
	
	public void attendMeeting () {
		System.out.println(name + " is attending a meeting...");
	}
	
	public void introduce () {
		System.out.println("Name: " + name + "Job title: " + jobTitle + "Salary: " + salary);
	}
	
}
