package classes.day33_classObject_Constructors;

public class StudentsTest {

	public static void main(String[] args) {
		Students s1 = new Students("Mike", 17, 'M', 2017, "Java");
		Students s2 = new Students("Tom", 28, 'M', 1999, "TS");
		
		s1.attendLecture();
		s2.attendLab();
	}
}
