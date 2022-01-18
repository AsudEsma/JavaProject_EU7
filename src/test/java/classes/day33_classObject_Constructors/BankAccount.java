package classes.day33_classObject_Constructors;

public class BankAccount {

	double balance;
	
	public BankAccount() {
		balance = 0.0;
	}
	
	public BankAccount(double startBalance) {
		 balance = startBalance;
	}
	
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
