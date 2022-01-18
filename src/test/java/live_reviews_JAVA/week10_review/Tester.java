package live_reviews_JAVA.week10_review;

public class Tester extends Employee {
	
	public Tester(String name, String jobTitle, int age, double salary, char gender) {
		super(name, jobTitle, age, salary, gender);		// Only parameterized constructor inside super class, have to explicitly call
		// TODO Auto-generated constructor stub
	}

	@Override		// This will be done only with the parent-child relationships. (IS A relationship is required)
	public void work() {
		System.out.println(getName() + " is testing.");
	}
	
	public void findBugs() {
		System.out.println(getName() + " found a bug");
	}
}
