package live_reviews_JAVA.week4_review;

public class CircleTest {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		
		c1.radius = 15;
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		System.out.println(c1.toString());

		Circle c2 = new Circle();
		c2.radius = 10.0;
		System.out.println(c2.area());
		System.out.println(c2.perimeter());
		System.out.println(c2.toString());
		
	}

}
