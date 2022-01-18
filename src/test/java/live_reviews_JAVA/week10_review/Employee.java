package live_reviews_JAVA.week10_review;

public class Employee {

	private String name, jobTitle;
	private int age;
	private double salary;
	private final char gender;
	
	public Employee(String name, String jobTitle, int age, double salary, char gender) {
		super();
		setName(name);
		setJobTitle(jobTitle);
		setAge(age);
		setSalary(salary);
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
				
		if(age<=0) {
			System.err.println("Age can not be negative number");
			return;
		}
		
		if(age>18 && age<65) {
			System.err.println("Age is not in between legal permit.");
			return;
		}
		
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<12000) {
			System.err.println("Salary is not in between legal permit.");
			return;
		}
		
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}
	
	public void work() {
		System.out.println(name + " is working");
	}
	
}
