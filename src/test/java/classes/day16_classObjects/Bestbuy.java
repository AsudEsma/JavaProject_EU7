package classes.day16_classObjects;

public class Bestbuy {

	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Blue";
		cell1.price = 76.16;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		
		cell1.color = "Black";
		System.out.println(cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell1.brand = "Siemens";
		cell1.screenSize = 3.5;
		cell1.color = "Red";
		cell1.price = 39.22;

		System.out.println("***Calling Methods***");
		cell1.call();
		cell1.message();
		cell1.takeAphoto();
		
		System.out.println("***** CELL 2 VALUES *****");
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen size: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Price: " + cell1.price); 

		System.out.println("***Calling Methods***");
		cell1.call();
		cell1.message();
		cell1.takeAphoto();
		
	}

}
