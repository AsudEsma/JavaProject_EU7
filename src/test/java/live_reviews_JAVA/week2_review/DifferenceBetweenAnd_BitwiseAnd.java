package live_reviews_JAVA.week2_review;

public class DifferenceBetweenAnd_BitwiseAnd {

	public static void main(String[] args) {

		char ch1 = 'A';
	    char ch2 = 65;
	    int i1 = 5;
	    int i2 = 10;
	    
	    System.out.println(ch1==ch2 & i1!=i2);
	    System.out.println(ch1!=ch2 & i1!=i2);
	    System.out.println(true || ++i1==i2); // Does not look at the second one.
	    System.out.println(i1);
	    System.out.println();
	    
	    System.out.println(false && ++i1==i2); // Does not look at the second one.
	    System.out.println(i1);
	    
	    System.out.println(false && ++ch1==ch2); // Does not look at the second one.
	    System.out.println(ch1);
	    
	    System.out.println(true & ++ch1==ch2); // Does look at the second one!
	    System.out.println(ch1);
	}

}
