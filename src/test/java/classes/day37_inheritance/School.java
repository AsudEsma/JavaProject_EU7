package classes.day37_inheritance;

public class School {

	public static void main(String[] args) {

		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'M';
		
		student.name = "Asude";
		student.age = 28;
		student.gender = 'F';
		student.studentID = 123401;
		
		person.eat("Steak");
		student.eat("Pizza");
		
//		person.code("Java");	// This is from Student class. You cannot use it under MAIN class.
		
		
		
	}

}
