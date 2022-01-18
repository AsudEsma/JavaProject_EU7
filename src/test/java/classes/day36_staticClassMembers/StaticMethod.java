package classes.day36_staticClassMembers;

public class StaticMethod {

	static String name = "Apple";
	int age = 10;
	public String wish = "Wealthy";
	
	public static void show1() {
//		show2();					// You cannot call instance method/variable from a static method
		show4(); 					// You can call static methods/variables from a static method
//		System.out.println(age);	// You cannot call instance method/variable from a static method
		System.out.println(name);	// You can call static methods/variables from a static method
//		System.out.println(wish); 	// You cannot call public variable from a static method
	}
	
	public void show2() {
		show1(); 					// You can call static methods/variables from instance method
		show3();					// You can call instance methods/variables from instance method
		System.out.println(name);	// You can call static methods/variables from instance method
		System.out.println(age);	// You can call instance methods/variables from instance method
	}

	public void show3() {
		show2();
		show1();
	}

	public static void show4() {
	
	}
}
