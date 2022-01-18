package classes.day33_classObject_Constructors;

public class Students {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek";
	
	public Students(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	public void attendLecture() {
		System.out.println(name + " is attending lecture.");
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submitting assignment.");
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab.");
	}
}
