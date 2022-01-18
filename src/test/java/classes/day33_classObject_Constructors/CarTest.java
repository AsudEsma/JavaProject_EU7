package classes.day33_classObject_Constructors;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car("Tesla", "Model S", 2021, 0, "Navi Blue");
		Car c4 = new Car("BMW", "320", 2017, 30000, "Red");
		
		System.out.println(c1.make);
		System.out.println(c2.make);
		System.out.println(c3.make);
		System.out.println(c4.make);
		
	}
	
}
