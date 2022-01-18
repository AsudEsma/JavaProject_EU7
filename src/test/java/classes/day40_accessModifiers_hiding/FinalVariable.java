package classes.day40_accessModifiers_hiding;

public class FinalVariable {

	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariable() {
		MODEL_3_MAXSPEED = 200;
/*		ADMIN_USERNAME = "OZZY";
*		You cannot assign the STATIC FINAL variable in constructor. Because static variables are assigned right away
*		but you only call for the constructor when you create a new OBJ with the "NEW" keyword.
*		that is why you cannot assign a STATIC FINAL variable in the constructor. 
*/		
	}
	
	// Instance block:
	{
		MODEL_X_PASSENGERS = 7;
	} 	// You cannot assign STATIC FINAL variable here. Because instance blocks will be executed whenever you create
		// an OBJ. If you dont create an OBJ the block will not be executed.
	
	// static block:
	static {
		ADMIN_USERNAME = "Asude";
	}	// Static block only run ONCE you load the class. It does not care about OBJ creation.
	
	public static void main(String[] args) {
		
		 final int SSN;
		 SSN = 66;
//		 SSN++;  	// You cannot change a FINAL variable.
		 
		 FinalVariable fin = new FinalVariable();
		 System.out.println(fin.ROADSTER_MAX_RANGE);
		 System.out.println(fin.MODEL_3_MAXSPEED);
		 System.out.println(fin.MODEL_X_PASSENGERS);
		 System.out.println(fin.ADMIN_USERNAME);
		 System.out.println(ADMIN_USERNAME);
	}
}
