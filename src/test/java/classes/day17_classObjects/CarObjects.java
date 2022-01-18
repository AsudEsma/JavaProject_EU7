package classes.day17_classObjects;

public class CarObjects {

	public static void main(String[] args) {

		BMW b1 = new BMW();
		BMW b2 = new BMW ();
		System.out.println(b1.make);
		System.out.println(b1.model);
		
		System.out.println(b2.make);
		b2.make="BMW2020";
		System.out.println(b2.make);
		System.out.println(b2.model);
		
		b1.model="m3";
		b1.showPrice();
		
		b1.model="M3";
		b1.showPrice();
		
		b2.model="X3";
		b2.showPrice();

	}

}
