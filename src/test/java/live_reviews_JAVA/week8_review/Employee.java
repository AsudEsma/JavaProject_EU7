package live_reviews_JAVA.week8_review;

public class Employee {

	private String name, jobTitle;
	private int ID;
	private double salary;
	
	public Employee(String name, String jobTitle, int iD, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		ID = iD;
		this.salary = salary;
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
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}
	
}
