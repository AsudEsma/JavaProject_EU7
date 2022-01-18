package live_reviews_JAVA.week5_review;

public class S04_IndexOfExmps {

	public static void main(String[] args) {

		String str = "Java is Awesome!";
		
		int i = str.indexOf("A");
		System.out.println(i);
		
		int beginning = str.indexOf("Awe");
		int ending = str.indexOf("me!")+2;
		
		System.out.println(str.substring(beginning,ending));
		System.out.println(str.substring(str.indexOf("A"),str.length()-1));
		
		
		
	}

}
