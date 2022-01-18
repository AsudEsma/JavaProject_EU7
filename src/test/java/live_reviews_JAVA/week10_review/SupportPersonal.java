package live_reviews_JAVA.week10_review;

public class SupportPersonal extends Employee {

	public SupportPersonal(String name, String jobTitle, int age, double salary, char gender) {
		super(name, jobTitle, age, salary, gender);
		// TODO Auto-generated constructor stub
	}

	@Override		// This will be done only with the parent-child relationships. (IS A relationship is required)
	public void work() {
		System.out.println(getName() + " is supporting everybody with their HARD work");
	}
}
