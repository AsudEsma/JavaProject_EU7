package classes.day36_staticClassMembers;

public class Student {

	String name;
	int age;
	int idNumber;
	static String school="Cybertek";  // when you change one thing the rest will be changed, too.
	
	public Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
}
