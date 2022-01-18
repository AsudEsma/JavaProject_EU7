package classes.day34_constructor;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);
		System.out.println("Returning from no-argument constructor no.1");
	}
	
	public Light(int watt, boolean ind) {
		this(watt,ind,"Ankara");
		System.out.println("Retruning from constructor no.2");
	}
	
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Retruning from constructor no.3");
	}
}
