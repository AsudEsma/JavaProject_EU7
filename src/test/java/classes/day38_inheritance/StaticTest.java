package classes.day38_inheritance;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10;
		obj.print();
		System.out.println(StaticSub.num);
		
		StaticSub.m1();	// This method is static
		obj.m2();		// For non-statics you need to call through object
		
	}
	
}
