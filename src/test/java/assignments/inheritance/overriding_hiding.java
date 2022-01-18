package assignments.inheritance;

public class overriding_hiding {

	public static void main(String[] args) {
				
		Parent tom = new Parent();
		Parent sally = new Parent();
		Parent jim = new Child();

		System.out.println("***Method Hiding***");
		tom.sleep(); // This will call method in parent class
		sally.sleep(); // This will call method in parent class
		jim.sleep(); // This will call method in parent class

		Parent.sleep();		
		Child.sleep();
		
		/*
		  	Learn the difference between class and instance. They are not interchangeable.

			You call a static method like this: Class.staticMethod(...);
			You call an instance method like this: Class instance = new Class(...); instace.method();
			
			And when you call a static method CORRECTLY, you are always using the exact class you mentioned there.
			Whereas an instance variable can be any of the subclasses, the compiler does not care.
			
			Technically it is possible to do the following: instance.staticMethod();
			But the compiler will warn you that you are doing something stupid. Because you are.
			
	***		https://www.reddit.com/r/javahelp/comments/naq006/annotation_for_hiding_static_method/	***
		 */
		
		System.out.println("***Method overriding***");
		tom.food(); // This will call method in parent class
		sally.food(); // This will call method in parent class
		jim.food(); // This will call method in child class

		System.out.println("***super keyword***");
		Child aba = new Child();
		Child kala = new Child();
		
		aba.age(4);
		kala.age(8);
		
		/*
			Well, you now have super.age and age within the child context. They both exist.
			Are they the same thing or not? Confusing. Bad. Very bad, do not do!
			
			Oracle also says it: https://docs.oracle.com/javase/tutorial/java/IandI/hidevariables.html

			More or less, it's exactly that for static methods.
			If they have the same signature and name, they both exist at the same time, and it's confusing.
			
			EXM: https://docs.oracle.com/javase/tutorial/java/IandI/QandE/inherit-questions.html
 
		 */
	}
}