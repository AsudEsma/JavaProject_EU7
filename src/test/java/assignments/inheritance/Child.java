package assignments.inheritance;

class Child extends Parent {

	public int age;

	public void age(int kid) {
		System.out.println("Parent's age: " + super.age);
		System.out.println("Child's age: " + kid);
	}

	// Hiding
	public static void sleep() {
		System.out.println("Sleeps at 9 PM");
	}

	// Overriding
	public void food() {
		System.out.println("Breast feeds");
	}
}
