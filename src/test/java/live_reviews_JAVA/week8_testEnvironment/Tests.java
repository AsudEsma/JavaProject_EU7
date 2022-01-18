package live_reviews_JAVA.week8_testEnvironment;

public class Tests {
	
	public static void main(String[] args) {
		
		TestEnvironment testOne = new TestEnvironment();
		testOne.browser = new Browser("Opera GX");
		testOne.os = new OS("Windows");
		
		System.out.println("My test environment for test one is: " + testOne.toString());
		
		TestEnvironment testTwo = new TestEnvironment();
		testTwo.browser = new Browser("Safari");
		testTwo.os = new OS("MacOs");
		
		System.out.println("My test environment for test one is: " + testTwo.toString());

	}

}
