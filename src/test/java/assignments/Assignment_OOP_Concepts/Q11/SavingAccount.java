package assignments.Assignment_OOP_Concepts.Q11;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
