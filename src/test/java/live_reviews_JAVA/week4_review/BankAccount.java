package live_reviews_JAVA.week4_review;

public class BankAccount {

	String accountHolder;
	int pin;
	double balance;
	long accountNum;
	
	public double getBalance(int inputPin) {
		if (pin==inputPin) {
			return balance;
		}
			return -1;
	}
}
