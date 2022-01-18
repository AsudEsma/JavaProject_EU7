package classes.day40_accessModifiers_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		
		
	}
	
}

class Bear {
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {	// if the child method is STATIC, the parent class needs to be STATIC, too (vice versa!)
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
	
}

class Panda extends Bear {
	
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	public static void sneeze() {	// this needed to be STATIC because the parent class is already STATIC (vice versa!)
		System.out.println("Panda is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
	
}
