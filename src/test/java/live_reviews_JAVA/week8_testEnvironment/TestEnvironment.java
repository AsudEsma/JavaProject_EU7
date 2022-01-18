package live_reviews_JAVA.week8_testEnvironment;

public class TestEnvironment {

	Browser browser;
	OS os;
	
	public String toString() {
		return browser.getBrowserType() + " | " + os.getOs();
	}
}
