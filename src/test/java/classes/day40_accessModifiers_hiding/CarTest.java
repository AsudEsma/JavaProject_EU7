package classes.day40_accessModifiers_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.model = "M3";
		c1.year = 2021;
//		c1.door = 4;
		c1.engine = 4.8;
		
		System.out.println(c1.toString());
	}
}
