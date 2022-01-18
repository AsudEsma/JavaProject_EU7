package live_reviews_JAVA.week2_review;

public class UnaryReview {

	public static void main(String[] args) {
	
		int a=20;
        a=a++; // This is not the way we assign it.
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        System.out.println("***************");
		
        int b=20;
        b++; // We assign like this.
        System.out.println("b = " + b++);
        System.out.println("b = " + b);
        System.out.println("***************");
        
        int c=20;
        ++c; // We assign like this.
        System.out.println("c = " + ++c);
        System.out.println("c = " + c);
        System.out.println("***************");
        
        int d=20;
        d=++d; // This will also do.
        System.out.println("d = " + ++d);
        System.out.println("d = " + d);
        System.out.println("***************");
	}

}
