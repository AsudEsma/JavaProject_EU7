package classes.day22_stringManipulation;

public class String_isEmpty {

	public static void main(String[] args) {

		String userName = "";
		String password = "";
		
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty.");
		}
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password fields cannot be empty.");
		}

	}

}
