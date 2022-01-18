package classes.day36_staticClassMembers;

public class Countable {

	static int instanceCount;  //instance variable
	int instanceCount2;
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
}
