package classes.day07_controlFlowStatements;

public class task1_ifStatement {

	public static void main(String[] args) {

		int quantity;
		double price, revenue, disc;
		
		quantity = 120;
		price = 149.9;
		disc = 0;
		revenue = quantity * price;
				
		if (revenue > 5000) {
			disc = revenue * 0.1;
			revenue = revenue - disc;
		}
		
		System.out.println("Revenue = " + revenue);
		System.out.println("Discount = " + disc);

	}

}
