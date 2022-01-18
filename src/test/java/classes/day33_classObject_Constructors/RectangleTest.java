package classes.day33_classObject_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(12.45, 41.26);
		System.out.println(R1.length);
		System.out.println(R1.width);
		R1.length = 5.4;
		R1.width = 3.2;
		
		R1.getArea();
		
		Rectangle R2 = new Rectangle(1.4, 4.8);
		System.out.println(R2.length);
		System.out.println(R2.width);
		
		R2.length = 2.7;
		R2.width = 12.5;
		
		R2.getArea();
	}
}
