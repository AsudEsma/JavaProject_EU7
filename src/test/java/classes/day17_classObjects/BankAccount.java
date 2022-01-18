package classes.day17_classObjects;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		balance+=amount;
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance-=amount;
		
		if (balance<0) {
			balance-=35;
		}
	}
	
	public void showBalance() {
		System.out.println("__________________________");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("__________________________");
	}
	
	public void charge(double price, String item) {
		if (balance>=price) {
			System.out.println("Purchasing " + item + " for $" + price + " from " + accountNumber);
			balance-=price;		
		} else {
			System.out.println("Insefficient funds to purchase " + item + " from " + accountNumber);
		}
		
		
		
		
	}
}
