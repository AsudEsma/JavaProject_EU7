package live_reviews_JAVA.week4_review;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		
		acc1.accountHolder = "James Bond";
		acc1.pin=1007;
		acc1.balance=1_000_000;
		acc1.accountNum=1007007007;

		System.out.println(acc1.getBalance(0007));
		System.out.println(acc1.getBalance(1007));
	}

}
