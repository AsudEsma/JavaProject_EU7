package live_reviews_JAVA.week7_review;

public class Products {

	String name;
	double price;
	
	public void setInfo(String n, double d) {
		name = n;
		price = d;
	}

	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}
	
	
}
